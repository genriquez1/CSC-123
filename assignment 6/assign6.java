//Gerardo Enriquez
//CSC 123
//Assignment 6

/*

2. What is the order of magnitude to insert a new node at the beginning and end of a
doubly linked list? Defend your answer.

The order of magnitude is 0(1) because it uses the list tail to insert the new node into the beginning or end of the double linked list.
This would be the only case where it would be 0(1) because it has both a List Head and List Tail. If it were just a linked list then adding
 to the beginning of the list would be dependent on the nodes and thus be 0(n). Adding to both the beginning and end of a double linked list 
 is independent to the values already inside the double linked list.


3. What is the order of magnitude to search for a value in an unsorted array? In an
unsorted linked list? In a sorted array? In a sorted linked list?

The order of magnitude to search for a value in an unsorted array is 0(n).
In an unsorted linked list is nlog2n    (n log base 2 of n)
In a sorted array it is log2n  (log base 2 of n)
in a sorted linked list it is 0(n log2 n)  

4. What is the lowest order of magnitude to sort an array of integers? What is the name

of the sorting algorithm?
nlog2n    (n log base n of n) the name of the sorting algorithm is quick sort algorithm 


5. What is recursion? What limits exist using recursion? Name at least one algorithm
where the use of recursion is useful and unlikely to be impacted by limits of recursion.

Recursion is a method that calls itself. A repeated number of times. 
Its limitation is the size of the stack, the fact that it requires a lot of memory, it is harder to maintain and debug and it is a lot slower. 
Relative efficiency of algorithms in linked lists and linear search that are independent of its numbers within the array class. starts 
from the beginning and searches each file in ordser with no additional work needed. It holds an order of magnitude of 0(1)


6. What is a Red-Black Binary tree? What advantages does a binary tree offer over a
linear linked list?
A Red-Black Binary tree will juggle itself to get balanced at each step. This is the primary advantage that is offers over linear linked list.


7. What is a hash table, name at least one case where a hash table is advantages over
a binary tree; name one case where a binary tree would be preferable.
Hash tables 
A hash table is a data structure that uses the hash function to implement values as an array. 
In a Hash table you do not store order and there is no relationship among the data. 
You can insert and retrieve in 0(1) magnitude. Hash tables at 60-65% capacity are prone to collisions.

A hash table would be preferred over a binary tree because it goes DIRECTLY to the value although the values are usually not in order.
You would prefer a binary tree because it gives you the ability to be sorted automatically for you.  
Note that in a Binary Tree data is related.

*/
