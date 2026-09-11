#include <bits/stdc++.h>
using namespace std;
// Fibonacci function

int f(int n, vector<int> &dp)
{
    // Base casea
    if (n <= 1) return n;
    
    if (dp[n] != -1)
        return dp[n];
    return dp[n] = f(n - 1, dp) + f(n - 2, dp);
}

//<ain funtion
int main()
{
    int n;
    cin >> n;

    vector<int> dp(n + 1, -1);
    cout << f(n, dp);

    //Tabukization
    dp[0] = 0;
     dp[1] = 1;
     for(int i = 2; i<= n ; i++){
        dp[i] = dp[i-1] + dp[i-2];

     }
     printf(" the answer is \n" );
     cout<<dp[n];

     //Space optimazation
     int prev = 1;
     int prev2 = 0;

     for(int i =2; i<= n ; i++){
        int curri = prev + prev2;
        prev2 = prev;
        prev = curri;
     }
     printf("The space optimized result is \n");
     cout<< prev;


    return 0;
}