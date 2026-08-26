

# AutocompleteRequest

Object containing the data for performing an autocomplete search.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**table** | **String** | The table to perform the search on |  |
|**query** | **String** | The beginning of the string to autocomplete |  |
|**options** | **Object** | Autocomplete options   - layouts: A comma-separated string of keyboard layout codes to validate and check for spell correction. Available options - us, ru, ua, se, pt, no, it, gr, uk, fr, es, dk, de, ch, br, bg, be. By default, all are enabled.   - fuzziness: (0,1 or 2) Maximum Levenshtein distance for finding typos. Set to 0 to disable fuzzy matching. Default is 2   - prepend: true/false If true, adds an asterisk before the last word for prefix expansion (e.g., *word )   - append:  true/false If true, adds an asterisk after the last word for prefix expansion (e.g., word* )   - expansion_len: Number of characters to expand in the last word. Default is 10.  |  [optional] |


