
# Multilingual Rule-Based Generation

## Overview
The `multilingual_rule_based_generator` folder contains the main codebase and resources for generating sentences from input data in USR (Universal Semantic Representation) format. The system uses rule-based approaches to generate natural language output in **Hindi (`hi`) or English (`en`)**, based on the specified language flag.

This multilingual generator processes linguistic data using morphological analysis, rule-based transformations, and inflectional forms generated via Apertium dictionaries (for Hindi) and custom English generation rules.

---

## Folder Structure

```txt
multilingual_rule_based_generator/
├── hindi_gen.py # Main script to run the generator (supports hi/en)
├── output.txt # Example input file (optional)
├── repository/ # Contains all supporting scripts and resources
│ ├── USR_to_JSON.py # Converts USR format to JSON
│ ├── apertium_hn_LC.dix # Apertium dictionary for Hindi morphological generation
│ ├── common_v4.py # Common utility functions used across scripts
│ ├── morph_gen.py # Morphological generation script for Hindi
│ ├── tam_mapping_new.dat # TAM (Tense-Aspect-Modality) mapping rules
│ ├── eng_generation_rules.json # Rule-based mappings for English generation
│ ├── auxillary_mapping.txt # Auxiliary verb mappings
│ ├── causative_mapping.txt # Causative construction rules
│ ├── coref_discourse.py # Coreference resolution and discourse-level processing
│ ├── run_morph-analyser.sh # Runs morphological analysis for Hindi
│ ├── run_morph-generator.sh # Runs morphological generation for Hindi
│ └── ... # Other supporting scripts and files
```

---

## Usage

### 1. Running the Main Code
To generate sentences in **Hindi** or **English**, run the `hindi_gen.py` script with the appropriate language flag:

#### Option 1: Provide Input as a File
Place your input data in `output.txt` (or any other file) in this format:
```txt
<sent_id=Geo_ncert_6stnd_1ch_0112>
#ग्रह और तारे में क्या अंतर है ?
graha_1 1 - - - - - - 6:op1
wArA_1 2 - pl - - - - 6:op2
$kim 3 - - 5:k1 - - - -
aMwara_1 4 - - 5:k1s - - - -
hE_1-pres 5 - - 0:main - - - -
[conj_1] 6 - - 5:k7 - - - -
%interrogative
</sent_id>
```
Run the script with desired language:
```bash
python3 hindi_gen.py --lang hi
# or
python3 hindi_gen.py --lang en
```

#### Option 2: Provide Input Directly in Code
You can also hard-code the input data directly into the `hindi_gen.py` script:
```python
input_data = '''<sent_id=Geo_ncert_6stnd_1ch_0112>
#ग्रह और तारे में क्या अंतर है ?
graha_1 1 - - - - - - 6:op1
wArA_1 2 - pl - - - - 6:op2
$kim 3 - - 5:k1 - - - -
aMwara_1 4 - - 5:k1s - - - -
hE_1-pres 5 - - 0:main - - - -
[conj_1] 6 - - 5:k7 - - - -
%interrogative
</sent_id>'''
```
Then run:
```bash
python3 hindi_gen.py --lang hi
```

---

## Supporting Scripts and Resources

The `repository/` folder contains various essential components:

- **USR_to_JSON.py**: Converts USR input format into structured JSON.
- **apertium_hn_LC.dix**: Apertium dictionary for Hindi morphological generation.
- **morph_gen.py**: Handles Hindi morph generation using Apertium.
- **eng_generation_rules.json**: Rule-based mappings for English sentence generation.
- **common_v4.py**: Shared utilities (e.g., USR parsing, token management).
- **run_morph-analyser.sh / run_morph-generator.sh**: Shell scripts to interface with Apertium.
- **tam_mapping_new.dat**: TAM feature mappings for Hindi verbs.
- **auxillary_mapping.txt & causative_mapping.txt**: Grammar rule definitions.
- **coref_discourse.py**: Manages discourse-level coherence and coreferences.

---

## Dependencies

Ensure the following dependencies are installed before running the code:

### 1. Python Libraries
Install required libraries:
```bash
pip install -r repository/requirements.txt
```

### 2. Apertium Tools (Only for Hindi)
Install Apertium and Hindi tools:
```bash
sudo apt-get install apertium apertium-hin
```
Compile the Hindi dictionary if needed:
```bash
bash repository/compile_dict.sh
```

### 3. Permissions for Shell Scripts
Ensure execution permissions:
```bash
chmod +x repository/run_morph-analyser.sh
chmod +x repository/run_morph-generator.sh
```

---

## Example Workflow

1. Prepare your input in USR format (file or inline).
2. Choose target language (`--lang hi` or `--lang en`).
3. Run the generator:
```bash
python3 hindi_gen.py --lang hi
# or
python3 hindi_gen.py --lang en
```

---
