# Singly Linked List Practice Questions

This document contains **7 important singly linked list questions** — ranging from easy to intermediate.  
Each question includes a **detailed explanation** of what is being asked and what you are expected to do.

---

## 1. Remove Duplicates from a Sorted Linked List

**Difficulty:** Easy

### Problem:
Given the head of a **sorted singly linked list**, remove all duplicates so that each element appears only once.

### Example:
```
Input: 1 -> 1 -> 2 -> 3 -> 3
Output: 1 -> 2 -> 3
```

### Explanation:
Since the list is sorted, duplicates will always be adjacent. Traverse the list once, compare the current node’s value with the next node’s value, and skip nodes that have duplicate values.

---

## 2. Find the Middle of the Linked List

**Difficulty:** Easy

### Problem:
Given the head of a linked list, return the **middle node**.  
If there are two middle nodes, return the **second one**.

### Example:
```
Input: 1 -> 2 -> 3 -> 4 -> 5
Output: 3
```
```
Input: 1 -> 2 -> 3 -> 4 -> 5 -> 6
Output: 4
```

### Explanation:
Use the **slow and fast pointer technique** — move one pointer twice as fast as the other. When the fast pointer reaches the end, the slow pointer will be at the middle.

---

## 3. Reverse a Linked List

**Difficulty:** Easy/Medium

### Problem:
Given the head of a singly linked list, reverse the list and return the new head.

### Example:
```
Input: 1 -> 2 -> 3 -> 4 -> 5
Output: 5 -> 4 -> 3 -> 2 -> 1
```

### Explanation:
Iteratively reverse the `next` pointer of each node so it points to the previous node instead of the next.  
Keep track of three pointers — `prev`, `curr`, and `nextNode`.

---

## 4. Detect Cycle in a Linked List

**Difficulty:** Medium

### Problem:
Given the head of a linked list, determine if there is a **cycle** in it.

### Example:
```
Input: head = [3,2,0,-4], pos = 1 (tail connects to node index 1)
Output: true
```

### Explanation:
Use **Floyd’s Cycle Detection Algorithm (Tortoise and Hare)** — two pointers move at different speeds.  
If they ever meet, there’s a cycle. If the fast pointer reaches `null`, there’s no cycle.

---

## 5. Length of the Cycle in a Linked List

**Difficulty:** Medium

### Problem:
If a linked list has a cycle, find the **length of the cycle** (number of nodes in the loop).

### Example:
```
Input: head = [1,2,3,4,5] and 5->next = 3 (cycle)
Output: 3
```

### Explanation:
After detecting a cycle using Floyd’s algorithm, keep one pointer fixed and move the other until it meets again — counting the steps gives the cycle length.

---

## 6. Palindrome Linked List

**Difficulty:** Medium

### Problem:
Check whether a given linked list is a **palindrome** (reads the same backward as forward).

### Example:
```
Input: 1 -> 2 -> 2 -> 1
Output: true
```
```
Input: 1 -> 2
Output: false
```

### Explanation:
Find the middle, reverse the second half, and compare both halves node by node.

---

## 7. Reverse Nodes in K-Group

**Difficulty:** Hard

### Problem:
Given the head of a linked list, reverse the nodes of the list **k at a time**, and return the modified list.  
If the number of nodes is not a multiple of k, leave the last remaining nodes as-is.

### Example:
```
Input: 1 -> 2 -> 3 -> 4 -> 5, k = 2
Output: 2 -> 1 -> 4 -> 3 -> 5
```
```
Input: 1 -> 2 -> 3 -> 4 -> 5, k = 3
Output: 3 -> 2 -> 1 -> 4 -> 5
```

### Explanation:
Reverse the list in groups of k nodes using iterative or recursive approach. Keep track of group boundaries and handle the case when remaining nodes are fewer than k.

---

### ✅ Bonus Tips for Practice:
- Practice each problem **both iteratively and recursively** where possible.  
- Use **dry runs** to understand how pointers move.  
- Understand the **space and time complexity** of each solution.
- Don’t skip the edge cases like empty lists, single-node lists, or k > length of list.

---

**Author:** Rajneesh Mishra  
**Topic:** Singly Linked List Practice Questions  
**License:** For learning and personal practice only.
