#include<stdio.h>

void insert_heap(int heap[], int *n , int value){
    int i = *n;
    heap[i]= value;
    (*n)++;

    while(i>0){
        int parent = (i-1)/2;
        if(heap[parent]< heap[i]){
            int temp = heap[parent];
            heap[parent] = heap[i];
            heap[i] = temp ;

            i = parent;
        }
        else{
            break;
        }


    }

}
void display(int heap[] ,int n ){
        for (int i =0; i<n; i++){
            printf("The Existing Heap is : %d",heap[i]);
            
        printf("\n");        
        }


    }


int main(){
    int heap[100] ={600,90,80,40,20,10};
    int n = 6;

    insert_heap(heap,&n,69);

    printf("Heap After Inserting Element :\n");

    display(heap,n);

    return 0;

    }
