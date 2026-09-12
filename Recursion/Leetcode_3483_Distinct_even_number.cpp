class Solution {
public:
    int totalNumbers(vector<int>& digits) {
        int n = digits.size();
        int ans = 0;
        bool visit[1000] = {};

        // Outer Loop
        for (int i = 0; i < n; i++) {
            if (digits[i] == 0)
                continue;
            // Inner Loop
            for (int j = 0; j < n; j++) {
                if (j == i)
                    continue;
                // Inner Loop
                for (int k = 0; k < n; k++) {
                    if (k == i || k == j || digits[k] % 2 != 0) {
                        continue;
                    }
                    int value = digits[i] * 100 + digits[j] * 10 + digits[k];

                    if (!visit[value]) {
                        visit[value] = true;
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
};