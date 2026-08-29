#include <bits/stdc++.h>
using namespace std;

class Node
{
public:
    int data;
    Node *next;
    Node(int data1, Node *next1)
    {
        data = data1;
        next = next1;
    }

    Node(int data1)
    {
        data = data1;
        next = nullptr;
    }
};

Node *Convert2LL(vector<int> &arr)
{
    Node *head = new Node(arr[0]);
    Node *mover = head;
    for (int i = 1; i < arr.size(); i++)
    {
        Node *temp = new Node(arr[i]);
        mover->next = temp;
        mover = temp;
    }
    return head;
}
// Find The Length
int lengthOfLL(Node *head)
{
    int count = 0;
    Node *temp = head;
    while (temp != nullptr)
    {
        count++;
        temp = temp->next;
    }
    return count;
}
// Delete The Head of the LinkedList
Node *DeleteHead(Node *head)
{
    Node *temp = head;
    // Here Head point next temp and That is our new Head And after that we need to remove The Previous head Node
    head = head->next;
    free(temp);
    // delete(temp);
    return head;
}

// DeleteLast
Node *Deltelast(Node *head)
{
    if (head == NULL || head->next == NULL)
    {
        return NULL;
    }
    else{
        Node*temp = head;
        while(temp->next->next!=NULL){
            temp = temp->next;
        }
         delete temp->next;
        temp->next = NULL;

    }
    return head;
}

int main()
{
    vector<int> arr = {2, 3, 4, 5};
    Node *y = new Node(arr[0], nullptr);
    cout << y->data;
    cout << "\n";
    Node *head = Convert2LL(arr);
    cout << head->data;

    cout << "\n";
    Node *temp = head;
    while (temp)
    {
        cout << temp->data << " ";
        temp = temp->next;
    }
    // Find The Length of the LinkedList
    int length = lengthOfLL(head);
    cout << "\n";
    cout << "The Length of the LinkedList is" << " " << length;

    // delete hEad
    head = DeleteHead(head);
    cout << "\n";
    printf("The new head is ");
    cout << head->data;
    //DeleteLast
    cout<<"\n";
    cout<<"Deleting The Last Node"<<" ";
    head = Deltelast(head);
    Node*temp1 = head;
    while(temp1){
            cout << temp1->data << " ";
            temp1 = temp1->next;
    }
}