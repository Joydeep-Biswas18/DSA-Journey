#include <stdio.h>
#include <stdlib.h>

#define COUNT 5

struct Node
{
    int data;
    struct Node *left;
    struct Node *right;
};

struct Node* createNode(int data)
{
    struct Node *newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->data = data;
    newNode->left = NULL;
    newNode->right = NULL;
    return newNode;
}

struct Node* insert(struct Node *root, int key)
{
    if(root == NULL)
        return createNode(key);

    if(key < root->data)
        root->left = insert(root->left, key);
    else if(key > root->data)
        root->right = insert(root->right, key);

    return root;
}

struct Node* search(struct Node *root, int key)
{
    if(root == NULL || root->data == key)
        return root;

    if(key < root->data)
        return search(root->left, key);

    return search(root->right, key);
}

struct Node* minValueNode(struct Node *node)
{
    struct Node *current = node;

    while(current != NULL && current->left != NULL)
        current = current->left;

    return current;
}

struct Node* deleteNode(struct Node *root, int key)
{
    if(root == NULL)
        return root;

    if(key < root->data)
    {
        root->left = deleteNode(root->left, key);
    }
    else if(key > root->data)
    {
        root->right = deleteNode(root->right, key);
    }
    else
    {
        if(root->left == NULL)
        {
            struct Node *temp = root->right;
            free(root);
            return temp;
        }
        else if(root->right == NULL)
        {
            struct Node *temp = root->left;
            free(root);
            return temp;
        }

        struct Node *temp = minValueNode(root->right);

        root->data = temp->data;

        root->right = deleteNode(root->right, temp->data);
    }

    return root;
}

void printTree(struct Node *root, int space)
{
    if(root == NULL)
        return;

    space += COUNT;

    printTree(root->right, space);

    printf("\n");

    for(int i = COUNT; i < space; i++)
        printf(" ");

    printf("%d\n", root->data);

    printTree(root->left, space);
}

void inorder(struct Node *root)
{
    if(root != NULL)
    {
        inorder(root->left);
        printf("%d ", root->data);
        inorder(root->right);
    }
}

int main()
{
    struct Node *root = NULL;
    int n, value, key, choice;

    printf("Enter number of nodes: ");
    scanf("%d", &n);

    printf("Enter BST elements:\n");
    for(int i = 0; i < n; i++)
    {
        scanf("%d", &value);
        root = insert(root, value);
    }

    do
    {
        printf("\n========== BST MENU ==========\n");
        printf("1. Insert\n");
        printf("2. Search\n");
        printf("3. Delete\n");
        printf("4. Display Inorder\n");
        printf("5. Display BST Horizontally\n");
        printf("6. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch(choice)
        {
            case 1:
                printf("Enter value to insert: ");
                scanf("%d", &value);
                root = insert(root, value);
                printf("Node inserted successfully.\n");
                break;

            case 2:
                printf("Enter value to search: ");
                scanf("%d", &key);

                if(search(root, key) != NULL)
                    printf("%d found in BST.\n", key);
                else
                    printf("%d not found.\n", key);
                break;

            case 3:
                printf("Enter value to delete: ");
                scanf("%d", &key);
                root = deleteNode(root, key);
                printf("Deletion completed.\n");
                break;

            case 4:
                printf("Inorder Traversal: ");
                inorder(root);
                printf("\n");
                break;

            case 5:
                printf("\nBST (Horizontal View):\n");
                printTree(root, 0);
                printf("\n");
                break;

            case 6:
                printf("Exiting...\n");
                break;

            default:
                printf("Invalid choice!\n");
        }

    } while(choice != 6);

    return 0;
}