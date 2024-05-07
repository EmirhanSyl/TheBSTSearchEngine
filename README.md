# TheBSTSearchEngine
 Mini desktop search engine with Binary Search Tree

## DESIGN: 

### FileFilter

This class encapsulates functionality for preprocessing text files, filtering out unwanted words, and updating a binary search tree with relevant word data. It provides methods for setting custom punctuations and ignore files, as well as updating a binary search tree with the content of text files.

### Member Variables:

`private String[] punctuations`: An array containing punctuation marks to be ignored during text processing.

`private final String projectFolderPath`: Represents the path to the current project directory.

`private File ignoreFile`: Represents a file containing words to be ignored during text processing.

`private final LL<String> ignoreList`: A linked list to store words to be ignored, including punctuations and words from the ignore file.


**Constructor:**

`public FileFilter()`: Initializes the FileFilter object by creating the list of words to ignore based on the provided punctuations and the content of the ignore file.


### Key Methods:

`public void setPunctuationList(String[] punctuations)`: Sets the punctuation list to the specified array of punctuations.

`public void setIgnoreFile(File ignoreFile)`: Sets the ignore file to the specified file.

`private void createFilterList()`: Reads the content of the ignore file and adds each word to the ignore list. Additionally, it adds punctuations to the ignore list.

`private String readFile(File file)`: Reads the content of a file, removing HTML tags if present, and returns the content as a string.

`private String readFileContentWithoutHtmlTags(File file)`: Reads the content of a file, removes HTML tags from each line, and returns the content as a string.

`public void updateBSTWithFile(BinarySearchTree bst, File file)`: Reads the content of a file, splits it into words, and adds non-ignored words to the provided binary search tree (bst) along with the file name.

## Binary Search Tree
The BinarySearchTree class is a fundamental component of binary tree management, providing the necessary data structure to store and search data efficiently. It offers a range of methods to add, search, and for sorting it offers; inOrder, postOrder, preOrder methods.

### Class Structure:
Root: Represents the root node of the binary search tree.

### Key Methods:
1) `add(T data)`:
This method adds a new node containing the data to the binary search tree.
It calls the private method addRecursive() to recursively traverse the tree and find the appropriate position to insert the new node.
2) `addRecursive(BSTNode<T> node, T data)`:
This private method recursively traverses the tree to find the correct position to insert the new data.
If the node is null, it creates a new node with the provided data.
Otherwise, it compares the data with the current node's data and traverses either left or right accordingly.
If the data already exists in the tree, it updates the existing node's data.
3) `search(T data)`:
This method searches for specific data in the binary search tree.
It calls the private method searchRecursive() to recursively traverse the tree and find the data.
4) `searchRecursive(BSTNode<T> node, T data)`:
This private method recursively traverses the tree to search for the specified data.
If the data is found, it returns true; otherwise, it continues searching recursively.
5) `searchRecursiveNode(BSTNode<BSTWordData> node, BSTWordData data)`:
This method is a specialized version of the search functionality, specifically tailored for a binary search tree containing nodes with data of type BSTWordData.
It recursively searches for a node containing the specified BSTWordData within the binary search tree.
If the provided node is null or the data in the node matches the target data, it returns the node.
Otherwise, it compares the target data with the data in the current node and continues the search either in the left subtree or the right subtree, depending on the result of the comparison.
This method is useful when you need to retrieve the actual node containing the target data rather than just checking for the presence of the data in the tree.
6) `inOrder(BSTNode<T> node), postOrder(BSTNode<T> node), preOrder(BSTNode<T> node)`:
These methods perform in-order, post-order, and pre-order traversals of the binary search tree, respectively.
They call their respective private traversal methods (inOrderTraversal(), postOrderTraversal(), preOrderTraversal()) to traverse the tree recursively and append the node data to a StringBuilder in the desired order.

## LL Class

The LL class represents a singly linked list data structure, which consists of nodes where each node contains some data (data) and a reference to the next node (next). This class provides methods to manipulate and access the elements of the linked list.

### Member Variables:

`private int size`: Represents the size of the linked list, indicating the number of elements it currently holds.

`private LLNode<T> head`: Represents the reference to the first node (head) of the linked list.

**Constructor:**

`public LL()`: Initializes an empty linked list with size 0 and sets the head reference to null.



### Key Methods:

`public int getSize()`: Returns the size of the linked list.

`public void setSize(int size)`: Sets the size of the linked list.

`public LLNode<T> getHead()`: Returns the reference to the head node of the linked list.

`public void setHead(LLNode<T> head)`: Sets the head node of the linked list.

`public void addFirst(T data)`: Adds a new node with the provided data at the beginning of the linked list.

`public void addLast(T data)`: Adds a new node with the provided data at the end of the linked list.

`public T get(int index)`: Retrieves the data at the specified index in the linked list.

`public LLNode<T> get(T data)`: Retrieves the node containing the specified data in the linked list.

`public void remove(int index)`: Removes the node at the specified index from the linked list.

`public boolean contains(T data)`: Checks if the linked list contains a node with the specified data.


## Implementation Details:

In this Project, to adjust the data in the files these methods are implemented;
`private void createFilterList()`:
 This method is responsible for creating a list of words to be ignored during text processing. It reads the content of the ignore file and adds each word to the ignore list. Additionally, it adds punctuations to the ignore list.

`private String readFileContentWithoutHtmlTags(File file)`:
This method reads the content of a file, removes HTML tags from each line, and returns the content as a string.

`public void updateBSTWithFile(BinarySearchTree bst, File file)`;
This method updates a binary search tree (BST) with the content of a specified text file. It reads the content of the file, splits it into words, and adds non-ignored words to the provided binary search tree (BST) along with the file name.


For storing and sorting the data in the files by using binary tree data structure, these methods are implemented;

`private BSTNode<T> addRecursive(BSTNode<T> node, T data)`:
This method recursively adds a new node with provided data to the binary search tree. It ensures proper placement based on comparison with existing nodes' data, maintaining the binary search tree property.

`public BSTNode<BSTWordData> searchRecursiveNode(BSTNode<BSTWordData> node, BSTWordData data)`:
This method performs a recursive search for a node with specified data in a binary search tree. It is specifically tailored for BSTWordData nodes, aiding in efficient retrieval of relevant data.

`public String inOrder(BSTNode<T> node)`:
In-order traversal of a binary search tree collects elements in ascending order, facilitating efficient sorting and retrieval of data.

`public String postOrder(BSTNode<T> node)`:
Post-order traversal of a binary search tree collects elements in a specified order, offering flexibility in data processing and analysis.

`public String preOrder(BSTNode<T> node)`:
This method performs a pre-order traversal of a binary search tree, which means it visits the root node first, followed by traversing the left subtree, and then the right subtree


## Example Scenario:

The Project starts with the Welcome Screen;
 
![image](https://github.com/EmirhanSyl/TheBSTSearchEngine/assets/61618968/11582d16-ae25-449c-8ed6-38f70dad4305)

After pressing choose file button, the file choosing screen pops up;

![image](https://github.com/EmirhanSyl/TheBSTSearchEngine/assets/61618968/f3fd9b0d-2a7c-40e9-8ec3-17f16450aa38)


In Result Screen, the order can be chosen to sort the data in these files;
  
![image](https://github.com/EmirhanSyl/TheBSTSearchEngine/assets/61618968/ba43b28f-c43b-4875-8bd9-af4eb925b710)


To search a spesific data in these files, find button should be used;

 ![image](https://github.com/EmirhanSyl/TheBSTSearchEngine/assets/61618968/d5a11e90-27eb-4259-b5c1-ea880fac7d81)


If the data we search is not exist in the files;

 ![image](https://github.com/EmirhanSyl/TheBSTSearchEngine/assets/61618968/490958e4-5c8d-42d1-95c2-2776d661680a)

