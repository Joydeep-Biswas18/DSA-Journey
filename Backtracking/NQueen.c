#include <stdio.h>

#define N 10


int board[N][N];
int count =0 ;

int isSafe(int row, int col)
{
    int i, j;
    // Check column
    for (i = 0; i < row; i++)
    {
        if (board[i][col] == 1)
        {
            return 0;
        }
    }

    // Cheack Upper-left
    for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--)
    {
        if (board[i][j] == 1)
        {
            return 0;
        }
    }

    // Cheack Upper-Right

    for (int i = row - 1, j = col + 1; i >= 0 && j < N; i--, j++)
    {
        if (board[i][j] == 1)
        {
            return 0;
        }
    }

    return 1;
}

// Nqueen-Function
void NQueen(int row)
{
    int col;
    if (row == N)
    {
        printf("The Solution is :\n");
        count++;
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
            {
                printf("%d", board[i][j]);
            }
            printf("\n");
        }
        printf("\n");

        return;
    }

    

    for(int col =0;col<N; col++){
        if(isSafe(row,col)){
            board[row][col]=1;
            NQueen(row+1);
            board[row][col]=0;
            }
        
    }
}

// Main Fuction
int main(){
    NQueen(0);
    printf("The Total No of combinations are :%d\n",count);

    return 0;
}