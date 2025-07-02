// Last updated: 7/3/2025, 12:03:36 AM
class Solution {
    private static final int MOD = 1_000_000_007;

    public int possibleStringCount(String word, int k) {
        List<Integer> groups = new ArrayList<>();
        int count = 1;
        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) == word.charAt(i - 1)) count++;
            else {
                groups.add(count);
                count = 1;
            }
        }
        groups.add(count);

        long total = 1;
        for (int g : groups) total = total * g % MOD;

        if (k <= groups.size()) return (int) total;

        int[] dp = new int[k];
        dp[0] = 1;

        for (int g : groups) {
            int[] newDp = new int[k];
            long window = 0;
            for (int j = 1; j < k; j++) {
                window = (window + dp[j - 1]) % MOD;
                if (j - g - 1 >= 0) window = (window - dp[j - g - 1] + MOD) % MOD;
                newDp[j] = (int) window;
            }
            dp = newDp;
        }

        long invalid = 0;
        for (int j = 0; j < k; j++) invalid = (invalid + dp[j]) % MOD;

        return (int) ((total - invalid + MOD) % MOD);
    }
}
