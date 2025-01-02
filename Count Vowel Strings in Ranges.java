class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n = words.length;
        int[] prefixSum = new int[n + 1];
        int[] result = new int[queries.length];
        String vowels = "aeiou";

        // Calculate prefix sum for strings starting and ending with vowels
        for (int i = 0; i < n; i++) {
            String word = words[i];
            if (vowels.indexOf(word.charAt(0)) != -1 && vowels.indexOf(word.charAt(word.length() - 1)) != -1) {
                prefixSum[i + 1] = prefixSum[i] + 1;
            } else {
                prefixSum[i + 1] = prefixSum[i];
            }
        }

        // Process each query using the prefix sum
        for (int i = 0; i < queries.length; i++) {
            int li = queries[i][0];
            int ri = queries[i][1];
            result[i] = prefixSum[ri + 1] - prefixSum[li];
        }

        return result;
    }
}
