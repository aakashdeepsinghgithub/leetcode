// Last updated: 7/7/2025, 9:56:54 PM
class Solution {
    int mod = 1000000007;
    int dp[1001][51];

    int f(int i, int tar, vector<vector<int>> &types) {
        if (tar == 0) return 1;
        if (i >= types.size() || tar < 0) return 0;
        if (dp[tar][i] != -1) return dp[tar][i];

        int ways = 0;
        int count = types[i][0];
        int points = types[i][1];

        for (int k = 0; k <= count; ++k) {
            int newTarget = tar - k * points;
            if (newTarget >= 0) {
                ways = (ways + f(i + 1, newTarget, types)) % mod;
            } else break;
        }

        return dp[tar][i] = ways;
    }

public:
    int waysToReachTarget(int target, vector<vector<int>>& types) {
        memset(dp, -1, sizeof(dp));
        return f(0, target, types);
    }
};
