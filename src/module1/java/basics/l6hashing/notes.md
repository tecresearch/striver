## Notes------>

## Notes------>

// Hashing is a common technique and is often asked in interviews.
// Below are examples of interview questions related to hashing in Java, accompanied by code snippets.

import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;

public class HashingInterviewQuestions {

    // 1. Question: Find the First Non-Repeating Character in a String
    public static char firstNonRepeatingChar(String str) {
        Map<Character, Integer> charCount = new HashMap<>();

        // Count occurrences of each character
        for (char ch : str.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        // Find the first non-repeating character
        for (char ch : str.toCharArray()) {
            if (charCount.get(ch) == 1) {
                return ch;
            }
        }
        return '_'; // If no non-repeating character exists
    }

    // 2. Question: Check if Array Contains Duplicate
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (seen.contains(num)) {
                return true; // Duplicate exists
            }
            seen.add(num);
        }

        return false; // No duplicates found
    }

    // 3. Question: Find Intersection of Two Arrays
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            if (set1.contains(num)) {
                resultSet.add(num); // Add the common elements to the result set
            }
        }

        // Convert resultSet to array
        return resultSet.stream().mapToInt(i -> i).toArray();
    }

    // 4. Question: Two-Sum Problem
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numToIndex.containsKey(complement)) {
                return new int[]{numToIndex.get(complement), i};
            }
            numToIndex.put(nums[i], i);
        }

        return new int[0]; // If no solution found (shouldn't happen with valid input)
    }

    // 5. Question: Count Pairs With Given Sum in an Array
    public static int countPairsWithSum(int[] nums, int sum) {
        Map<Integer, Integer> numCount = new HashMap<>();
        int count = 0;

        for (int num : nums) {
            int complement = sum - num;
            if (numCount.containsKey(complement)) {
                count += numCount.get(complement);
            }
            numCount.put(num, numCount.getOrDefault(num, 0) + 1);
        }

        return count;
    }

    // Main function to test the above methods
    public static void main(String[] args) {
        System.out.println("First Non-Repeating Character: " + firstNonRepeatingChar("swiss"));

        int[] nums1 = {1, 2, 2, 3, 4};
        System.out.println("Contains Duplicate: " + containsDuplicate(nums1));

        int[] nums2 = {1, 2, 3, 4};
        int[] nums3 = {2, 3, 5};
        System.out.println("Intersection: " + java.util.Arrays.toString(intersection(nums2, nums3)));

        int[] nums4 = {2, 7, 11, 15};
        int target = 9;
        System.out.println("Two Sum: " + java.util.Arrays.toString(twoSum(nums4, target)));

        int[] nums5 = {1, 5, 7, 1};
        int sum = 6;
        System.out.println("Count Pairs With Given Sum: " + countPairsWithSum(nums5, sum));
    }

}

// 6. Question: Group Anagrams Together
// Explanation: Given a list of strings, group them into anagrams. Anagrams are strings that can be formed by
rearranging the characters.
public static List<List<String>> groupAnagrams(String[] strs) {
Map<String, List<String>> anagramMap = new HashMap<>();

    for (String str : strs) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        String sorted = new String(charArray);

        anagramMap.putIfAbsent(sorted, new ArrayList<>());
        anagramMap.get(sorted).add(str);
    }

    return new ArrayList<>(anagramMap.values());

}

// 7. Question: Longest Consecutive Sequence
// Explanation: Find the length of the longest consecutive elements sequence in an unsorted array.
public static int longestConsecutive(int[] nums) {
Set<Integer> numSet = new HashSet<>();
for (int num : nums) {
numSet.add(num);
}

    int longestStreak = 0;

    for (int num : nums) {
        if (!numSet.contains(num - 1)) { // Start of a sequence
            int currentNum = num;
            int currentStreak = 1;

            while (numSet.contains(currentNum + 1)) {
                currentNum += 1;
                currentStreak += 1;
            }

            longestStreak = Math.max(longestStreak, currentStreak);
        }
    }

    return longestStreak;

}

// 8. Question: Subarray Sum Equals K
// Explanation: Given an array of integers and an integer k, find the total number of continuous subarrays whose sum
equals to k.
public static int subarraySum(int[] nums, int k) {
Map<Integer, Integer> prefixSumCount = new HashMap<>();
prefixSumCount.put(0, 1);

    int count = 0, sum = 0;

    for (int num : nums) {
        sum += num;
        if (prefixSumCount.containsKey(sum - k)) {
            count += prefixSumCount.get(sum - k);
        }
        prefixSumCount.put(sum, prefixSumCount.getOrDefault(sum, 0) + 1);
    }

    return count;

}

// 9. Question: Top K Frequent Elements
// Explanation: Given an integer array, return the k most frequent elements.
public static List<Integer> topKFrequent(int[] nums, int k) {
Map<Integer, Integer> countMap = new HashMap<>();

    for (int num : nums) {
        countMap.put(num, countMap.getOrDefault(num, 0) + 1);
    }

    PriorityQueue<Integer> heap = new PriorityQueue<>((n1, n2) -> countMap.get(n1) - countMap.get(n2));

    for (int num : countMap.keySet()) {
        heap.add(num);
        if (heap.size() > k) {
            heap.poll();
        }
    }

    List<Integer> result = new ArrayList<>();
    while (!heap.isEmpty()) {
        result.add(heap.poll());
    }

    Collections.reverse(result);
    return result;

}

// 10. Question: Isomorphic Strings
// Explanation: Determine if two strings are isomorphic, meaning characters in string A can map to characters in string
B preserving order.
public static boolean isIsomorphic(String s, String t) {
if (s.length() != t.length()) {
return false;
}

    Map<Character, Character> mapS = new HashMap<>();
    Map<Character, Character> mapT = new HashMap<>();

    for (int i = 0; i < s.length(); i++) {
        char c1 = s.charAt(i);
        char c2 = t.charAt(i);

        if (mapS.containsKey(c1) && mapS.get(c1) != c2) {
            return false;
        }
        if (mapT.containsKey(c2) && mapT.get(c2) != c1) {
            return false;
        }

        mapS.put(c1, c2);
        mapT.put(c2, c1);
    }

    return true;


}

// 11. Question: Reverse a String
// Explanation: Reverse the given string without using in-built reverse methods.
public static String reverseString(String str) {
if (str == null || str.isEmpty()) {
return str;
}
char[] chars = str.toCharArray();
int left = 0, right = chars.length - 1;
while (left < right) {
char temp = chars[left];
chars[left] = chars[right];
chars[right] = temp;
left++;
right--;
}
return new String(chars);
}

// 12. Question: Check Palindrome
// Explanation: Verify if the given string is a palindrome (reads the same forward and backward).
public static boolean isPalindrome(String str) {
if (str == null || str.isEmpty()) {
return false;
}
int left = 0, right = str.length() - 1;
while (left < right) {
while (left < right && !Character.isLetterOrDigit(str.charAt(left))) {
left++;
}
while (left < right && !Character.isLetterOrDigit(str.charAt(right))) {
right--;
}
if (Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))) {
return false;
}
left++;
right--;
}
return true;
}

// 13. Question: Find Missing Number
// Explanation: Find the missing number in an array containing numbers 0 to n.
public static int findMissingNumber(int[] nums) {
int n = nums.length;
int totalSum = n * (n + 1) / 2; // Sum of numbers from 0 to n
int arraySum = 0;
for (int num : nums) {
arraySum += num;
}
return totalSum - arraySum;
}

// 14. Question: Find First Unique Integer in Array
// Explanation: Return the first integer in the array that does not repeat.
public static int firstUniqueInteger(int[] nums) {
Map<Integer, Integer> countMap = new HashMap<>();
for (int num : nums) {
countMap.put(num, countMap.getOrDefault(num, 0) + 1);
}
for (int num : nums) {
if (countMap.get(num) == 1) {
return num;
}
}
return -1; // Indicates no unique integer found
}

// 15. Question: Move Zeroes to End
// Explanation: Move all zeroes in the given array to the end while maintaining the order of non-zero elements.
public static void moveZeroes(int[] nums) {
int nonZeroIndex = 0;
for (int num : nums) {
if (num != 0) {
nums[nonZeroIndex++] = num;
}
}
while (nonZeroIndex < nums.length) {
nums[nonZeroIndex++] = 0;
}
}

/*

* Hashing Theory Overview for Interviews
*
* Hashing is a technique to store and retrieve data efficiently using a hash function.
* It maps keys to addresses in a hash table, which allows for fast lookups, inserts,
* and deletions.
*
* Key Concepts:
*
    - Hash Function: Maps a key to an index in a hash table.
*
    - Collisions: Occur when multiple keys hash to the same index.
*
    - Resolving Collisions: Handled using methods like chaining or open addressing.
*
    - Load Factor: Ratio of the number of keys to the size of the hash table.
*
* Common Hashing Problems for Interviews:
*
*
    1. Two Sum
*
    - Find two numbers in an array that add up to a target value.
*
    - Use a hash table to store visited numbers for O(n) time complexity.
*
*
    2. Group Anagrams
*
    - Group strings that are anagrams into lists.
*
    - Hash the sorted characters as keys to group anagrams.
*
*
    3. Longest Consecutive Sequence
*
    - Find the length of the longest consecutive sequence in an unsorted array.
*
    - Use a hash set for constant-time lookups of sequence elements.
*
*
    4. Subarray Sum Equals K
*
    - Find the number of continuous subarrays with a sum equal to k.
*
    - Use a hash map to track cumulative sums and their frequencies.
*
*
    5. Top K Frequent Elements
*
    - Return k most frequent elements from an array.
*
    - Use a hash map to count frequencies and a priority queue to get top k elements.
*
*
    6. Find First Unique Character
*
    - Find the first unique character in a string.
*
    - Use a hash map to count character occurrences.
      */
-

// 16. Question: Find Maximum Product of Three Numbers
// Explanation: Find the maximum product that can be obtained by multiplying three numbers in an array.
public static int maximumProduct(int[] nums) {
Arrays.sort(nums);
int n = nums.length;
return Math.max(nums[0] * nums[1] * nums[n - 1], nums[n - 3] * nums[n - 2] * nums[n - 1]);
}

// 17. Question: Valid Parentheses
// Explanation: Determine if a string has valid and properly closed parentheses.
public static boolean isValidParentheses(String s) {
Stack<Character> stack = new Stack<>();
for (char c : s.toCharArray()) {
if (c == '(' || c == '{' || c == '[') {
stack.push(c);
} else {
if (stack.isEmpty()) return false;
char top = stack.pop();
if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
return false;
}
}
}
return stack.isEmpty();
}

// 18. Question: Merge Intervals
// Explanation: Merge overlapping intervals in a list of intervals.
public static int[][] mergeIntervals(int[][] intervals) {
if (intervals.length <= 1) return intervals;
Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
List<int[]> result = new ArrayList<>();
int[] currentInterval = intervals[0];
result.add(currentInterval);
for (int[] interval : intervals) {
if (interval[0] <= currentInterval[1]) {
currentInterval[1] = Math.max(currentInterval[1], interval[1]);
} else {
currentInterval = interval;
result.add(currentInterval);
}
}
return result.toArray(new int[result.size()][]);
}

// 19. Question: Climbing Stairs
// Explanation: Calculate the number of ways to reach the top of a staircase of `n` steps.
public static int climbStairs(int n) {
if (n <= 2) return n;
int first = 1, second = 2;
for (int i = 3; i <= n; i++) {
int temp = first + second;
first = second;
second = temp;
}
return second;
}

// 20. Question: Longest Palindromic Substring
// Explanation: Find the longest substring in a given string that is a palindrome.
public static String longestPalindrome(String s) {
int n = s.length();
if (n <= 1) return s;
boolean[][] dp = new boolean[n][n];
int start = 0, maxLen = 1;
for (int i = 0; i < n; i++) dp[i][i] = true;
for (int end = 1; end < n; end++) {
for (int begin = 0; begin < end; begin++) {
if (s.charAt(begin) == s.charAt(end) && (end - begin <= 2 || dp[begin + 1][end - 1])) {
dp[begin][end] = true;
if (end - begin + 1 > maxLen) {
start = begin;
maxLen = end - begin + 1;
}
}
}
}
return s.substring(start, start + maxLen);
}
// 21. Question: Valid Anagram
// Explanation: Determine if two strings are anagrams of each other.
public static boolean isAnagram(String s, String t) {
if (s.length() != t.length()) return false;
int[] charCounts = new int[26];
for (char c : s.toCharArray()) charCounts[c - 'a']++;
for (char c : t.toCharArray()) {
if (--charCounts[c - 'a'] < 0) return false;
}
return true;
}

// 22. Question: Fibonacci Number
// Explanation: Calculate the Fibonacci number at the nth position.
public static int fibonacci(int n) {
if (n <= 1) return n;
int first = 0, second = 1;
for (int i = 2; i <= n; i++) {
int temp = first + second;
first = second;
second = temp;
}
return second;
}

// 23. Question: Maximum Subarray Sum
// Explanation: Find the largest sum of contiguous subarray.
public static int maxSubArraySum(int[] nums) {
int maxSum = nums[0], currentSum = nums[0];
for (int i = 1; i < nums.length; i++) {
currentSum = Math.max(nums[i], currentSum + nums[i]);
maxSum = Math.max(maxSum, currentSum);
}
return maxSum;
}

// 24. Question: Single Number
// Explanation: Find the single number that appears only once in an array.
public static int singleNumber(int[] nums) {
int result = 0;
for (int num : nums) result ^= num;
return result;
}

// 25. Question: Power of Two
// Explanation: Determine if a given integer is a power of two.
public static boolean isPowerOfTwo(int n) {
return n > 0 && (n & (n - 1)) == 0;
}

// 26. Question: Reverse Linked List
// Explanation: Reverse a singly linked list.
public static ListNode reverseList(ListNode head) {
ListNode prev = null;
while (head != null) {
ListNode next = head.next;
head.next = prev;
prev = head;
head = next;
}
return prev;
}

// 27. Question: Merge Two Sorted Lists
// Explanation: Merge two sorted linked lists into one sorted linked list.
public static ListNode mergeTwoSortedLists(ListNode l1, ListNode l2) {
ListNode dummy = new ListNode(0);
ListNode current = dummy;
while (l1 != null && l2 != null) {
if (l1.val < l2.val) {
current.next = l1;
l1 = l1.next;
} else {
current.next = l2;
l2 = l2.next;
}
current = current.next;
}
current.next = (l1 != null) ? l1 : l2;
return dummy.next;
}

// 28. Question: First Bad Version
// Explanation: Identify the first bad version using a given API isBadVersion.
public static int firstBadVersion(int n) {
int left = 1, right = n;
while (left < right) {
int mid = left + (right - left) / 2;
if (isBadVersion(mid)) {
right = mid;
} else {
left = mid + 1;
}
}
return left;
}

// 29. Question: Maximum Depth of Binary Tree
// Explanation: Find the maximum depth of a binary tree.
public static int maxDepth(TreeNode root) {
if (root == null) return 0;
return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
}

// 30. Question: Symmetric Tree
// Explanation: Check if a binary tree is symmetric around its center.
public static boolean isSymmetric(TreeNode root) {
if (root == null) return true;
return isMirror(root.left, root.right);
}
private static boolean isMirror(TreeNode t1, TreeNode t2) {
if (t1 == null || t2 == null) return t1 == t2;
if (t1.val != t2.val) return false;
return isMirror(t1.left, t2.right) && isMirror(t1.right, t2.left);
}

// 31. Question: Buy and Sell Stock
// Explanation: Find the maximum profit that can be achieved from one transaction.
public static int maxProfit(int[] prices) {
int minPrice = Integer.MAX_VALUE, maxProfit = 0;
for (int price : prices) {
minPrice = Math.min(minPrice, price);
maxProfit = Math.max(maxProfit, price - minPrice);
}
return maxProfit;
}

// 32. Question: Invert Binary Tree
// Explanation: Invert a binary tree by swapping left and right children.
public static TreeNode invertTree(TreeNode root) {
if (root == null) return null;
TreeNode temp = root.left;
root.left = root.right;
root.right = temp;
invertTree(root.left);
invertTree(root.right);
return root;
}

// 33. Question: Majority Element
// Explanation: Find the element that appears more than n/2 times in an array.
public static int majorityElement(int[] nums) {
int count = 0, candidate = 0;
for (int num : nums) {
if (count == 0) candidate = num;
count += (num == candidate) ? 1 : -1;
}
return candidate;
}

// 34. Question: Count Primes
// Explanation: Count the number of prime numbers less than a non-negative number n.
public static int countPrimes(int n) {
if (n <= 2) return 0;
boolean[] isPrime = new boolean[n];
Arrays.fill(isPrime, true);
isPrime[0] = isPrime[1] = false;
for (int i = 2; i * i < n; i++) {
if (isPrime[i]) {
for (int j = i * i; j < n; j += i) {
isPrime[j] = false;
}
}
}
int count = 0;
for (boolean prime : isPrime) {
if (prime) count++;
}
return count;
}

// 35. Question: Merge k Sorted Lists
// Explanation: Merge k sorted linked lists into one sorted list.
public static ListNode mergeKLists(ListNode[] lists) {
if (lists == null || lists.length == 0) return null;
PriorityQueue<ListNode> heap = new PriorityQueue<>(Comparator.comparingInt(a -> a.val));
for (ListNode list : lists) {
if (list != null) heap.add(list);
}
ListNode dummy = new ListNode(0);
ListNode current = dummy;
while (!heap.isEmpty()) {
ListNode minNode = heap.poll();
current.next = minNode;
current = current.next;
if (minNode.next != null) heap.add(minNode.next);
}
return dummy.next;
}

// 36. Question: Path Sum
// Explanation: Determine if a binary tree has a root-to-leaf path that equals a given sum.
public static boolean hasPathSum(TreeNode root, int sum) {
if (root == null) return false;
if (root.left == null && root.right == null) return root.val == sum;
return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
}
// 37. Question: Climbing Stairs
// Explanation: Count distinct ways to climb to the top of stairs with 1 or 2 steps.
public static int climbStairs(int n) {
if (n <= 2) return n;
int first = 1, second = 2;
for (int i = 3; i <= n; i++) {
int temp = first + second;
first = second;
second = temp;
}
return second;
}
// 38. Question: Binary Search
// Explanation: Implement binary search algorithm.
public static int binarySearch(int[] nums, int target) {
int left = 0, right = nums.length - 1;
while (left <= right) {
int mid = left + (right - left) / 2;
if (nums[mid] == target) return mid;
if (nums[mid] < target) left = mid + 1;
else right = mid - 1;
}
return -1;
}
// 39. Question: Min Stack
// Explanation: Design a stack that supports push, pop, top, and getting minimum in O(1).
class MinStack {
private Stack<Integer> stack = new Stack<>();
private Stack<Integer> minStack = new Stack<>();
public void push(int val) {
stack.push(val);
if (minStack.isEmpty() || val <= minStack.peek()) minStack.push(val);
}
public void pop() {
if (stack.pop().equals(minStack.peek())) minStack.pop();
}
public int top() {
return stack.peek();
}
public int getMin() {
return minStack.peek();
}
}
// 40. Question: Length of Last Word
// Explanation: Find the length of the last word in a string.
public static int lengthOfLastWord(String s) {
int length = 0, index = s.length() - 1;
while (index >= 0 && s.charAt(index) == ' ') index--;
while (index >= 0 && s.charAt(index) != ' ') {
length++;
index--;
}
return length;
}
// 41. Question: Pascal's Triangle
// Explanation: Generate Pascal's Triangle up to a certain number of rows.
public static List<List<Integer>> generatePascalTriangle(int numRows) {
List<List<Integer>> triangle = new ArrayList<>();
for (int i = 0; i < numRows; i++) {
List<Integer> row = new ArrayList<>();
for (int j = 0; j <= i; j++) {
if (j == 0 || j == i) row.add(1);
else row.add(triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j));
}
triangle.add(row);
}
return triangle;
}
// 42. Question: Intersection of Two Linked Lists
// Explanation: Find the intersection point of two singly linked lists.
public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
if (headA == null || headB == null) return null;
ListNode a = headA, b = headB;
while (a != b) {
a = (a == null) ? headB : a.next;
b = (b == null) ? headA : b.next;
}
return a;
}
// 43. Question: Valid Palindrome
// Explanation: Determine if a string is a valid palindrome.
public static boolean isPalindrome(String s) {
int left = 0, right = s.length() - 1;
while (left < right) {
while (left < right && !Character.isLetterOrDigit(s.charAt(left))) left++;
while (left < right && !Character.isLetterOrDigit(s.charAt(right))) right--;
if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) return false;
left++;
right--;
}
return true;
}
// 44. Question: Remove Duplicates from Sorted Array
// Explanation: Remove duplicates in-place from a sorted array.
public static int removeDuplicates(int[] nums) {
if (nums.length == 0) return 0;
int index = 1;
for (int i = 1; i < nums.length; i++) {
if (nums[i] != nums[i - 1]) {
nums[index++] = nums[i];
}
}
return index;
}
// 45. Question: Merge Sorted Array
// Explanation: Merge two sorted arrays into one sorted array.
public static void merge(int[] nums1, int m, int[] nums2, int n) {
int i = m - 1, j = n - 1, k = m + n - 1;
while (i >= 0 && j >= 0) {
nums1[k--] = (nums1[i] > nums2[j]) ? nums1[i--] : nums2[j--];
}
while (j >= 0) {
nums1[k--] = nums2[j--];
}
}

// 46. Question: Rotate Array
// Explanation: Rotate an array to the right by k steps.
public static void rotate(int[] nums, int k) {
k = k % nums.length;
reverse(nums, 0, nums.length - 1);
reverse(nums, 0, k - 1);
reverse(nums, k, nums.length - 1);
}
private static void reverse(int[] nums, int start, int end) {
while (start < end) {
int temp = nums[start];
nums[start] = nums[end];
nums[end] = temp;
start++;
end--;
}
}
// 47. Question: Single Number
// Explanation: Find the element that appears only once in an array where every other element appears twice.
public static int singleNumber(int[] nums) {
int result = 0;
for (int num : nums) {
result ^= num;
}
return result;
}
// 48. Question: Merge Intervals
// Explanation: Merge overlapping intervals into one.
public static int[][] mergeIntervals(int[][] intervals) {
if (intervals.length <= 1) return intervals;
Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
List<int[]> merged = new ArrayList<>();
int[] currentInterval = intervals[0];
merged.add(currentInterval);
for (int[] interval : intervals) {
if (interval[0] <= currentInterval[1]) {
currentInterval[1] = Math.max(currentInterval[1], interval[1]);
} else {
currentInterval = interval;
merged.add(currentInterval);
}
}
return merged.toArray(new int[merged.size()][]);
}
// 49. Question: Contains Duplicate
// Explanation: Check if an array contains any duplicates.
public static boolean containsDuplicate(int[] nums) {
Set<Integer> seen = new HashSet<>();
for (int num : nums) {
if (!seen.add(num)) return true;
}
return false;
}
// 50. Question: Maximum Subarray
// Explanation: Find the contiguous subarray with the largest sum.
public static int maxSubArray(int[] nums) {
int maxSum = nums[0];
int currentSum = nums[0];
for (int i = 1; i < nums.length; i++) {
currentSum = Math.max(nums[i], currentSum + nums[i]);
maxSum = Math.max(maxSum, currentSum);
}
return maxSum;
}