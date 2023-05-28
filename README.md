# Sorting Algorithms

#### Counting sort algorithm

------------
In computer science, counting sort is an algorithm for sorting a collection of objects according to keys that are small positive integers; that is, it is an integer sorting algorithm. It operates by counting the number of objects that possess distinct key values, and applying prefix sum on those counts to determine the positions of each key value in the output sequence. Its running time is linear in the number of items and the difference between the maximum key value and the minimum key value, so it is only suitable for direct use in situations where the variation in keys is not significantly greater than the number of items. It is often used as a subroutine in radix sort, another sorting algorithm, which can handle larger keys more efficiently.

**Time Complexity:** O(N + K) where N is the number of elements in the input array and K is the range of input.

**Auxiliary Space:** O(N + K)

https://en.wikipedia.org/wiki/Counting_sort

