#include <stdio.h>
#define INF 9999

int main()
{

    int i, j, n;
    int source;
    printf("Enter the number of vertices :");
    scanf("%d", &n);

    int dist[n];
    int visited[n];
    int cost[n][n];

    printf("Enter the Adjacency Matrix :\n");

    for (i = 0; i < n; i++)
    {
        for (j = 0; j < n; j++)
        {
            scanf("%d", &cost[i][j]);
            if (i != j && cost[i][j] == 0)
            { // vertex ={0,2,4,7}
                cost[i][j] = INF;
            }
        }
    }

    printf("Enter the Source of Vertix : "); // Source = 0
    scanf("%d", &source);
    for (int i = 0; i < n; i++)
    {
        dist[i] = cost[source][i];
        visited[i] = 0;
    }

    dist[source] = 0;
    visited[source] = 1;
    for (int count = 1; count < n - 1; count++)
    {
        int min = INF;
        int nextNode;

        for (int i = 0; i < n; i++)
        {
            if (!visited[i] && dist[i] < min)
            {
                min = dist[i];
                nextNode = i;
            }
        }
        // Dijkstra Algo main
        visited[nextNode] = 1;
        for (int i = 0; i < n; i++)
        {
            if (!visited[i])
            {
                if (min + cost[nextNode][i] < dist[i])
                {
                    dist[i] = min + cost[nextNode][i];
                }
            }
        }
    }

    printf("\n Shortest Distance from Vertex %d : \n", source);
    for (int i = 0; i < n; i++)
    {
        printf("%d ---> %d = %d\n", source, i, dist[i]);
    }
    return 0;
}