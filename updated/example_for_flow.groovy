usr input = 
'''<sent_id= gold_data_009>
#राम 10th अगस्त को आयेगा।
rAma 1 per/male - 4:k1 - - - -
10 2 dom - - - - - 5:component_of
agaswa_1 3 moy - - - - - 5:component_of
A_1-gA_1 4 - - 0:main - - - -
[calender_1] 5 - - 4:k7t - - - -
%affirmative
</sent_id>'''

csv format =
'#राम 10th अगस्त को आयेगा।',
'rAma,10,agaswa_1,A_1-gA_1,[calender_1]',
'1,2,3,4,5',
'per/male,dom,moy,,',
',,,,',
'4:k1,,,0:main,4:k7t',
',,,,',
',,,,',
',,,,',
',5:component_of,5:component_of,,',
'%affirmative'

rules_info
src_sentence: #राम 10th अगस्त को आयेगा।
root_words: ['rAma', '10', 'agaswa_1', 'A_1-gA_1', '[calender_1]']
index_data: [1, 2, 3, 4, 5]
seman_data: ['per/male', 'dom', 'moy', '', '']
gnp_data: ['', '', '', '', '']
depend_data: ['4:k1', '', '', '0:main', '4:k7t']
discourse_data: ['', '', '', '', '']
spkview_data: ['', '', '', '', '']
scope_data: ['', '', '', '', '']
construction_data: ['', '5:component_of', '5:component_of', '', '']
sentence_type: %affirmative

words_info

[(1, 'rAma', 'per/male', '', '4:k1', '', '', '', ''), (2, '10', 'dom', '', '4:k7t', '', '', '', '5:component_of'), (3, 'agaswa_1', 'moy', '', '4:k7t', '', '', '', '5:component_of'), (4, 'A_1-gA_1', '', '', '0:main', '', '', '', ''), (5, '[calender_1]', '', '', '4:k7t', '', '', '', '')]

identify cat

[] foreign_words_data
[] indeclinables_data
[] pronouns_data
[(1, 'rAma', 'per/male', '', '4:k1', '', '', '', ''), (2, '10', 'dom', '', '4:k7t', '', '', '', '5:component_of'), (3, 'agaswa_1', 'moy', '', '4:k7t', '', '', '', '5:component_of'), (5, '[calender_1]', '', '', '4:k7t', '', '', '', '')] nouns_data
[] verbal_adjectives
[] adjectives_data
[(4, 'A_1-gA_1', '', '', '0:main', '', '', '', '')] verbs_data
[] adverbs_data
[] others_data
[] nominal_forms_data

processed_foreign_words: []
processed_indeclinables: []
processed_nouns: [(1, 'rAma', 'n', 'd', 'm', 's', 'a', 'proper', None), (2, '10', 'n', 'd', 'm', 's', 'a', 'digit', None), (3, 'agaswa', 'n', 'o', 'm', 's', 'a', 'common', '<>'), (5, 'calender', 'n', 'o', 'm', 's', 'a', 'common', None)]
processed_pronouns: []
processed_others: []
process_nominal_form: []
processed_verbs: [(4, 'A', 'v', 'm', 's', 'a', 'gA', 'o', 'main')]
processed_auxverbs: []
processed_adjectives: []
adverbs_data: []

collect_processed_data: [(1, 'rAma', 'n', 'd', 'm', 's', 'a', 'proper', None), (2, '10', 'n', 'd', 'm', 's', 'a', 'digit', None), (3, 'agaswa', 'n', 'o', 'm', 's', 'a', 'common', '<>'), (4, 'A', 'v', 'm', 's', 'a', 'gA', 'o', 'main'), (5, 'calender', 'n', 'o', 'm', 's', 'a', 'common', None)]

morph_input: ['^rAma<cat:n><case:d><gen:m><num:s>', '10', '^agaswa<cat:n><case:o><gen:m><num:s>$', '^A<cat:v><gen:m><num:s><per:a><tam:gA>$', '^calender<cat:n><case:o><gen:m><num:s>$'] 

generate_morph: rAma 10 agaswa AegA #calender

analyse_output_data: [(1, 'rAma', 'n', 'd', 'm', 's', 'a', 'proper', None), (2, '10', 'n', 'd', 'm', 's', 'a', 'digit', None), (3, 'agaswa', 'n', 'o', 'm', 's', 'a', 'common', '<>'), (4, 'AegA', 'v', 'm', 's', 'a', 'gA', 'o', 'main'), (5, 'calender', 'n', 'o', 'm', 's', 'a', 'common', None)]

join_compounds: [(1, 'rAma', 'n', 'd', 'm', 's', 'a', 'proper', None), (2, '10', 'n', 'd', 'm', 's', 'a', 'digit', None), (3, 'agaswa', 'n', 'o', 'm', 's', 'a', 'common', '<>'), (4, 'AegA', 'v', 'm', 's', 'a', 'gA', 'o', 'main'), (5, 'calender', 'n', 'o', 'm', 's', 'a', 'common', None)]

add_postposition: [(1, 'rAma', 'n', 'd', 'm', 's', 'a', 'proper', None), (2, '10', 'n', 'd', 'm', 's', 'a', 'digit', None), (3, 'agaswa <>', 'n', 'o', 'm', 's', 'a', 'common', '<>'), (4, 'AegA', 'v', 'm', 's', 'a', 'gA', 'o', 'main'), (5, 'calender', 'n', 'o', 'm', 's', 'a', 'common', None)]

add_construction: [(1, 'rAma', 'n', 'd', 'm', 's', 'a', 'proper', None), (2, '10', 'n', 'd', 'm', 's', 'a', 'digit', None), (3, 'agaswa <>', 'n', 'o', 'm', 's', 'a', 'common', '<>'), (4, 'AegA', 'v', 'm', 's', 'a', 'gA', 'o', 'main'), (5, 'calender', 'n', 'o', 'm', 's', 'a', 'common', None)]

POST_PROCESS_OUTPUT: rAma 10 agaswa <> AegA calender

has_ques_mark: rAma 10 agaswa <> AegA।

extract_spkview_values: rAma 10 agaswa <> AegA।

hindi_data: राम 10 अगस्त <> आएगा।

mask model output: राम 10 अगस्त को आएगा।

final output : gold_data_009	राम 10 अगस्त <> आएगा।
