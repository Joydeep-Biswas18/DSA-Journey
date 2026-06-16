#include <stdio.h>
#define INF 9999

struct Edge
{
    int source, dist, weight;
};

void BellmanFord(struct Edge edge[], int v, int E, int Source)
{
    int dist[v];

    // Initialize Distance as INF and 0
    for (int i = 0; i < v; i++)
    {
        dist[i] = INF;
        dist[Source] = 0;
    }

    // Relax All edges upto V-1 times
    for (int i = 0; i < v - 1; i++)
    {
        for (int j = 0; j < E; j++)
        {
            int u = edge[j].source;
            int v = edge[j].dist;
            int w = edge[j].weight;

            if (dist[u] != INF && dist[u] + w < dist[v])
            {
                dist[v] = dist[u] + w;
            }
        }
    }

    // Check whether it contains negative weight Cycle or not

    for (int j = 0; j < E; j++)
    {
        int u = edge[j].source;
        int v = edge[j].dist;
        int w = edge[j].weight;

        if (dist[u] != INF && dist[u] + w < dist[v])
        {
            printf("Graph Contains Negative weighted Cycle ");

            return;
        }
    }

    printf("Vertex Distance From Source \n");
    for (int i = 0; i < v; i++)
    {
        printf("%d ----> %d\n", i, dist[i]);
    }
}
int main()
{
    int V = 4;
    int E = 4;

    struct Edge edges[] = {
        // {0, 1, 4},
        // {0, 2, 5},
        // {1, 2, -3},
        // {2, 3, 4}

        {0, 1, 1},
        {1, 2, -1},
        {2, 3, -1},
        {3, 1, -1}

    };

    BellmanFord(edges, V, E, 0);

    return 0;
}
