#include <stdio.h>

struct Item
{
    int profit;
    int weight;
    float ratio;
};

void swap(struct Item *a, struct Item *b)
{
    struct Item temp = *a;
    *a = *b;
    *b = temp;
}

void SortItem(struct Item item[], int n)
{
    int i, j;

    for (i = 0; i < n - 1; i++)
    {
        for (j = 0; j < n - i - 1; j++)
        {
            if (item[j].ratio < item[j + 1].ratio)
            {
                swap(&item[j], &item[j + 1]);
            }
        }
    }
}

// Fractional Knapsack Function
float FractionKnapsack(struct Item item[], int n, int capacity)
{
    float totalprofit = 0.0;
    int i;

    SortItem(item, n);

    printf("\nSelected Items:\n");

    for (i = 0; i < n; i++)
    {
        if (item[i].weight <= capacity)
        {
            capacity -= item[i].weight;
            totalprofit += item[i].profit;

            printf("Take Full Item --> Profit = %d Weight = %d\n",
                   item[i].profit,
                   item[i].weight);
        }
        else
        {
            float fraction = (float)capacity / item[i].weight;

            totalprofit += item[i].profit * fraction;

            printf("Take %.2f fraction of item --> Profit = %d\n",
                   fraction, item[i].profit);

            break;
        }
    }

    return totalprofit;
}

int main()
{
    int n, capacity, i;

    printf("Enter Number of Items: ");
    scanf("%d", &n);

    struct Item item[n];

    for (i = 0; i < n; i++)
    {
        printf("Enter Profit and Weight of Item %d: ", i + 1);

        scanf("%d %d",
              &item[i].profit,
              &item[i].weight);

        item[i].ratio =
            (float)item[i].profit / item[i].weight;
    }

    printf("Enter Knapsack Capacity: ");
    scanf("%d", &capacity);

    float MaxProfit =
        FractionKnapsack(item, n, capacity);

    printf("\nMaximum Profit = %.2f\n", MaxProfit);

    return 0;
}