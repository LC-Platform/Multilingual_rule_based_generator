import json
import os

def convert_sentences(input_file, output_file):
    try:
        sentences = []
        project_id = 1  # Fixed project_id as 1

        with open(input_file, 'r', encoding='utf-8') as f:
            for line in f:
                line = line.strip()
                if line:  # Skip empty lines
                    # Split the line into sentence_id and actual sentence
                    parts = line.split('.', 1)  # Split only at the first period
                    if len(parts) == 2:
                        sentence_id = parts[0].strip()  # Extract sentence_id (e.g., 1a, 2b)
                        sentence = parts[1].strip().strip('"')  # Remove surrounding quotes
                        sentences.append({
                            "project_id": project_id,
                            "sentence_id": sentence_id,
                            "sentence": sentence
                        })

        # Write to output file
        with open(output_file, 'w', encoding='utf-8') as f:
            json.dump({"sentences": sentences}, f, ensure_ascii=False, indent=4)
            f.flush()  # Ensure data is written to the disk
            os.fsync(f.fileno())  # Force write to disk
    except Exception as e:
        raise Exception(f"Error in convert_sentences: {e}")

if __name__ == '__main__':
    input_file = 'input.txt'
    output_file = 'output.json'
    convert_sentences(input_file, output_file)
