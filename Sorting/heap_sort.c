#include <stdio.h>

// Heapify Method
void heapify(int arr[], int n, int i)
{
    int largest = i;
    int left = 2 * i + 1;
    int right = 2 * i + 2;

    if (left < n && arr[left] > arr[largest])
    {
        largest = left;
    }
    if (right < n && arr[right] > arr[largest])
    {
        largest = right;
    }
    if (largest != i)
    {
        int temp = arr[i];
        arr[i] = arr[largest];
        arr[largest] = temp;

        heapify(arr,n ,largest);
    }
}

// Heap Sort
void heap_sort(int arr[], int n)
{
    for (int i = n / 2 - 1; i >= 0; i--)
    {
        heapify(arr, n, i);
    }
    for (int i = n - 1; i > 0; i--)
    {
        int temp = arr[0];
        arr[0] = arr[i];
        arr[i] = temp;

        heapify(arr, i, 0);
    }
}
void display_arr(int arr[], int n)
{
    for (int i = 0; i < n; i++)
    {
        printf("%d", arr[i]);

        printf("\n");
    }
}

int main()
{
    int arr[] = {12,4545, 45, 34, 53, 64, 23, 94};
    int n = sizeof(arr) / sizeof(arr[0]);
    printf("The original array is :\n");
    display_arr(arr, n);
    heap_sort(arr, n);
    printf("The array after sorrting :\n");
    display_arr(arr, n);

    return 0;
}