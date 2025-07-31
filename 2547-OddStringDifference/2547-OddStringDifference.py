# Last updated: 31/07/2025, 21:08:03
class Solution:
    def oddString(self, words: List[str]) -> str:
        char_to_value = {'a': 0, 'b': 1, 'c': 2, 'd': 3, 'e': 4, 'f': 5, 'g': 6, 'h': 7, 'i': 8, 'j': 9,
                 'k': 10, 'l': 11, 'm': 12, 'n': 13, 'o': 14, 'p': 15, 'q': 16, 'r': 17, 's': 18,
                 't': 19, 'u': 20, 'v': 21, 'w': 22, 'x': 23, 'y': 24, 'z': 25}
        def transform_string(s, mapping):
            return [mapping[char] for char in s]
        transformed_arr = [transform_string(s, char_to_value) for s in words]
        diff = []
        for arr in transformed_arr:
            diff.append([j - i for i, j in zip(arr, arr[1:])])
        unique_diffs = set(map(tuple, diff))
        odd_diff = None
        for sublist in diff:
            if diff.count(sublist) == 1:
                odd_diff = sublist
                break
        if odd_diff is not None:
            odd_index = diff.index(odd_diff)
            return words[odd_index]        