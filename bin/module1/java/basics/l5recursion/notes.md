## Notes------>

// Example 1: Recursive Function for Factorial
// Question: Write a recursive function to calculate the factorial of a number.
public static int factorial(int n) {
if (n <= 1) { // Base case
return 1;
}
return n * factorial(n - 1); // Recursive case
}

// Example 2: Fibonacci Sequence
// Question: Write a recursive function to return the nth Fibonacci number.
public static int fibonacci(int n) {
if (n <= 1) { // Base case
return n;
}
return fibonacci(n - 1) + fibonacci(n - 2); // Recursive case
}

// Example 3: Sum of Digits
// Question: Write a recursive method to find the sum of digits of a given number.
public static int sumOfDigits(int num) {
if (num == 0) { // Base case
return 0;
}
return num % 10 + sumOfDigits(num / 10); // Recursive case
}

// Example 4: Reverse a String
// Question: Write a recursive function to reverse a string.
public static String reverseString(String str) {
if (str.isEmpty()) { // Base case
return str;
}
return reverseString(str.substring(1)) + str.charAt(0); // Recursive case
}

// Example 5: Check Palindrome
// Question: Write a recursive function to check if a string is a palindrome.
public static boolean isPalindrome(String str) {
if (str.length() <= 1) { // Base case
return true;
}
if (str.charAt(0) != str.charAt(str.length() - 1)) {
return false; // Not a palindrome
}
return isPalindrome(str.substring(1, str.length() - 1)); // Recursive case
}
// Example 6: Sum up to 300
// Question: Write a recursive function to calculate the sum of all numbers from 1 to 300.
public static int sumUpTo300(int n) {
if (n == 0) { // Base case
return 0;
}
return n + sumUpTo300(n - 1); // Recursive case
}

// Example 7: Find Greatest Common Divisor (GCD)
public static int gcd(int a, int b) {
if (b == 0) { // Base case
return a;
}
return gcd(b, a % b); // Recursive case
}

// Example 8: Recursive Binary Search
public static int binarySearch(int[] arr, int left, int right, int target) {
if (left > right) {
return -1; // Target not found
}
int mid = left + (right - left) / 2;
if (arr[mid] == target) {
return mid;
} else if (arr[mid] > target) {
return binarySearch(arr, left, mid - 1, target);
} else {
return binarySearch(arr, mid + 1, right, target);
}
}

// Example 9: Power of a Number
public static int power(int base, int exp) {
if (exp == 0) { // Base case
return 1;
}
return base * power(base, exp - 1); // Recursive case
}

// Example 10: Find Minimum in Array
public static int findMin(int[] arr, int index) {
if (index == arr.length - 1) { // Base case
return arr[index];
}
return Math.min(arr[index], findMin(arr, index + 1)); // Recursive case
}

// Example 11: Check if Array Is Sorted
public static boolean isSorted(int[] arr, int index) {
if (index == arr.length - 1) { // Base case
return true;
}
return arr[index] <= arr[index + 1] && isSorted(arr, index + 1); // Recursive case
}

// Example 12: Sum of Array
public static int sumOfArray(int[] arr, int index) {
if (index < 0) { // Base case
return 0;
}
return arr[index] + sumOfArray(arr, index - 1); // Recursive case
}

// Example 13: Count Occurrences of a Number in Array
public static int countOccurrences(int[] arr, int index, int target) {
if (index < 0) { // Base case
return 0;
}
int count = (arr[index] == target) ? 1 : 0;
return count + countOccurrences(arr, index - 1, target); // Recursive case
}

// Example 14: Reverse an Array
public static void reverseArray(int[] arr, int left, int right) {
if (left >= right) { // Base case
return;
}
// Swap elements
int temp = arr[left];
arr[left] = arr[right];
arr[right] = temp;
reverseArray(arr, left + 1, right - 1); // Recursive case
}

// Example 15: Check if String Contains Only Digits
public static boolean isNumeric(String str) {
if (str.isEmpty()) { // Base case
return true;
}
char ch = str.charAt(0);
if (!Character.isDigit(ch)) { // Check if character is not a digit
return false;
}
return isNumeric(str.substring(1)); // Recursive case
}

// Example 16: Generate All Subsets of a String
public static void generateSubsets(String str, String current, int index) {
if (index == str.length()) { // Base case
System.out.println(current);
return;
}
generateSubsets(str, current, index + 1); // Exclude current character
generateSubsets(str, current + str.charAt(index), index + 1); // Include current character
}

// Continue adding more examples if you'd like...
// Example 17: Print Numbers from 1 to N
public static void printNumbers(int n) {
if (n <= 0) { // Base case
return;
}
printNumbers(n - 1); // Recursive call (to handle lower numbers first)
System.out.print(n + " "); // Print current number
}

// Example 18: Count the Digits of a Number
public static int countDigits(int num) {
if (num == 0) { // Base case
return 0;
}
return 1 + countDigits(num / 10); // Recursive case
}

// Example 19: Find Maximum in Array
public static int findMax(int[] arr, int index) {
if (index == arr.length - 1) { // Base case
return arr[index];
}
return Math.max(arr[index], findMax(arr, index + 1)); // Recursive case
}

// Example 20: Check if a Number is Prime
public static boolean isPrime(int num, int divisor) {
if (num < 2) { // Special case for numbers less than 2
return false;
}
if (divisor == 1) { // Base case
return true;
}
if (num % divisor == 0) { // If divisible by the current divisor
return false;
}
return isPrime(num, divisor - 1); // Recursive case
}

// Example 21: Generate All Permutations of a String
public static void generatePermutations(String str, String current) {
if (str.isEmpty()) { // Base case
System.out.println(current);
return;
}
for (int i = 0; i < str.length(); i++) {
char ch = str.charAt(i);
String rest = str.substring(0, i) + str.substring(i + 1);
generatePermutations(rest, current + ch); // Recursive case
}
}

// Example 22: Calculate Exponential Without Using Library
public static double calculateExponential(double base, int exp) {
if (exp == 0) { // Base case
return 1;
}
if (exp < 0) { // For negative exponents
return 1 / calculateExponential(base, -exp);
}
return base * calculateExponential(base, exp - 1); // Recursive case
}

// Example 23: Count Vowels in a String
public static int countVowels(String str) {
if (str.isEmpty()) { // Base case
return 0;
}
char ch = Character.toLowerCase(str.charAt(0));
int isVowel = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') ? 1 : 0;
return isVowel + countVowels(str.substring(1)); // Recursive case
}

// Example 24: Tower of Hanoi
public static void towerOfHanoi(int n, char source, char auxiliary, char target) {
if (n == 1) { // Base case
System.out.println("Move disk 1 from " + source + " to " + target);
return;
}
towerOfHanoi(n - 1, source, target, auxiliary); // Move n-1 disks to auxiliary
System.out.println("Move disk " + n + " from " + source + " to " + target);
towerOfHanoi(n - 1, auxiliary, source, target); // Move n-1 disks to target
}

// Example 25: Flatten a Nested Array of Integers
public static void flattenArray(Object[] arr, List<Integer> result) {
for (Object element : arr) {
if (element instanceof Integer) {
result.add((Integer) element);
} else if (element instanceof Object[]) {
flattenArray((Object[]) element, result); // Recursive case
}
}
}

251:
// Example 26: Calculate Fibonacci using Recursion
252:public static int fibonacci(int n) {
253:if (n <= 1) { // Base cases
254:return n;
255:}
256:return fibonacci(n - 1) + fibonacci(n - 2); // Recursive case
257:}
258:
259:// Example 27: Find String Length without Using length()
260:public static int findStringLength(String str) {
261:if (str.isEmpty()) { // Base case
262:return 0;
263:}
264:return 1 + findStringLength(str.substring(1)); // Recursive case
265:}
266:
267:// Example 28: Count Consonants in a String
268:public static int countConsonants(String str) {
269:if (str.isEmpty()) { // Base case
270:return 0;
271:}
272:char ch = Character.toLowerCase(str.charAt(0));
273:int isConsonant = (ch >= 'a' && ch <= 'z' && "aeiou".indexOf(ch) == -1) ? 1 : 0;
274:return isConsonant + countConsonants(str.substring(1)); // Recursive case
275:}
276:
277:// Example 29: Calculate Factorial of a Number
278:public static int factorial(int n) {
279:if (n == 0 || n == 1) { // Base case
280:return 1;
281:}
282:return n * factorial(n - 1); // Recursive case
283:}
284:
285:// Example 30: Reverse a String Using Recursion
286:public static String reverseString(String str) {
287:if (str.isEmpty()) { // Base case
288:return str;
289:}
290:return reverseString(str.substring(1)) + str.charAt(0); // Recursive case
291:}
// Example 31: Calculate Sum of Digits of a Number
public static int sumOfDigits(int num) {
if (num == 0) { // Base case
return 0;
}
return num % 10 + sumOfDigits(num / 10); // Recursive case
}

// Example 32: Calculate GCD (Greatest Common Divisor)
public static int gcd(int a, int b) {
if (b == 0) { // Base case
return a;
}
return gcd(b, a % b); // Recursive case
}

// Example 33: Binary Search Using Recursion
public static int binarySearch(int[] arr, int left, int right, int target) {
if (left > right) { // Base case: element not found
return -1;
}
int mid = left + (right - left) / 2;
if (arr[mid] == target) {
return mid;
}
if (arr[mid] > target) {
return binarySearch(arr, left, mid - 1, target); // Search in left half
}
return binarySearch(arr, mid + 1, right, target); // Search in right half
}

// Example 34: Check if Array is Sorted
public static boolean isArraySorted(int[] arr, int index) {
if (index == arr.length - 1) { // Base case
return true;
}
if (arr[index] > arr[index + 1]) {
return false;
}
return isArraySorted(arr, index + 1); // Recursive case
}

// Example 35: Find Power of a Number (Iterative Multiplication)
public static int power(int base, int exp) {
if (exp == 0) { // Base case
return 1;
}
return base * power(base, exp - 1); // Recursive case
}

// Example 36: Multiply Two Numbers Recursively
public static int multiply(int a, int b) {
if (b == 0) {
return 0;
}
return a + multiply(a, b - 1);
}

// Example 37: Find Nth Triangular Number
public static int triangularNumber(int n) {
if (n == 0) {
return 0;
}
return n + triangularNumber(n - 1);
}

// Example 38: Check if Palindrome (String)
public static boolean isPalindrome(String str) {
if (str.length() <= 1) {
return true;
}
return str.charAt(0) == str.charAt(str.length() - 1) &&
isPalindrome(str.substring(1, str.length() - 1));
}

// Example 39: Find Sum of Array Elements
public static int sumArray(int[] arr, int index) {
if (index == arr.length) {
return 0;
}
return arr[index] + sumArray(arr, index + 1);
}

// Example 40: Calculate Power Modulo (a^b % m)
public static int powerModulo(int base, int exp, int mod) {
if (exp == 0) {
return 1;
}
long half = powerModulo(base, exp / 2, mod);
half = (half * half) % mod;
if (exp % 2 != 0) {
half = (half * base) % mod;
}
return (int) half;
}

// Example 41: Find Second Maximum in Array
public static int findSecondMax(int[] arr, int index, int max, int secondMax) {
if (index == arr.length) {
return secondMax;
}
if (arr[index] > max) {
secondMax = max;
max = arr[index];
} else if (arr[index] > secondMax && arr[index] != max) {
secondMax = arr[index];
}
return findSecondMax(arr, index + 1, max, secondMax);
}

// Example 42: Check if Number is a Power of 2
public static boolean isPowerOfTwo(int n) {
if (n == 1) {
return true;
}
if (n == 0 || n % 2 != 0) {
return false;
}
return isPowerOfTwo(n / 2);
}

// Example 43: Calculate Sum of Even Numbers in Array
public static int sumEvenNumbers(int[] arr, int index) {
if (index == arr.length) {
return 0;
}
return (arr[index] % 2 == 0 ? arr[index] : 0) + sumEvenNumbers(arr, index + 1);
}

// Example 44: Remove Duplicates from String
public static String removeDuplicates(String str) {
if (str.isEmpty()) {
return str;
}
char firstChar = str.charAt(0);
String rest = removeDuplicates(str.substring(1));
if (rest.indexOf(firstChar) != -1) {
return rest;
}
return firstChar + rest;
}

// Example 45: Check if Array Contains a Target Element
public static boolean containsValue(int[] arr, int index, int target) {
if (index == arr.length) {
return false;
}
if (arr[index] == target) {
return true;
}
return containsValue(arr, index + 1, target);
}

// Example 46: Replace a Character in a String
public static String replaceChar(String str, char oldChar, char newChar) {
if (str.isEmpty()) {
return str;
}
char firstChar = str.charAt(0);
return (firstChar == oldChar ? newChar : firstChar) + replaceChar(str.substring(1), oldChar, newChar);
}

// Example 47: Find Depth of Nested Brackets
public static int findDepth(String str, int index, int maxDepth, int currDepth) {
if (index == str.length()) {
return maxDepth;
}
if (str.charAt(index) == '(') {
currDepth++;
maxDepth = Math.max(maxDepth, currDepth);
} else if (str.charAt(index) == ')') {
currDepth--;
}
return findDepth(str, index + 1, maxDepth, currDepth);
}

// Example 48: Compute Base-n Logarithm
public static int logBaseN(int num, int base) {
if (num < base) {
return 0;
}
return 1 + logBaseN(num / base, base);
}

// Example 49: Calculate Factorial (Tail Recursion)
public static int factorialTail(int n, int result) {
if (n == 0) {
return result;
}
return factorialTail(n - 1, result * n);
}

// Example 50: Check if Array is Symmetric
public static boolean isSymmetric(int[] arr, int left, int right) {
if (left >= right) {
return true;
}
if (arr[left] != arr[right]) {
return false;
}
return isSymmetric(arr, left + 1, right - 1);
}

// Example 51: Convert Decimal to Binary
public static String decimalToBinary(int num) {
if (num == 0) {
return "0";
}
if (num == 1) {
return "1";
}
return decimalToBinary(num / 2) + (num % 2);
}

// Example 52: Reverse an Array
public static void reverseArray(int[] arr, int left, int right) {
if (left >= right) {
return;
}
int temp = arr[left];
arr[left] = arr[right];
arr[right] = temp;
reverseArray(arr, left + 1, right - 1);
}

// Example 53: Generate Gray Code of n Bits
public static List<String> grayCode(int n) {
if (n == 0) {
List<String> base = new ArrayList<>();
base.add("0");
return base;
}
List<String> prev = grayCode(n - 1);
List<String> result = new ArrayList<>();
for (String code : prev) {
result.add("0" + code);
}
Collections.reverse(prev);
for (String code : prev) {
result.add("1" + code);
}
return result;
}

// Example 54: Count Occurrence of a Character in String
public static int countCharacterOccurrences(String str, char c) {
if (str.isEmpty()) {
return 0;
}
return (str.charAt(0) == c ? 1 : 0) + countCharacterOccurrences(str.substring(1), c);
}

// Example 55: Find Maximum Depth of a Binary Tree (TreeNode assumed)
// Example 56: Convert a String to All Lower Case etc ..
// Example 55: Find Maximum Depth of a Binary Tree (TreeNode assumed)
public static int maxDepth(TreeNode root) {
if (root == null) {
return 0;
}
int leftDepth = maxDepth(root.left);
int rightDepth = maxDepth(root.right);
return Math.max(leftDepth, rightDepth) + 1;
}

// Example 56: Invert a Binary Tree
public static TreeNode invertTree(TreeNode root) {
if (root == null) {
return null;
}
TreeNode temp = root.left;
root.left = root.right;
root.right = temp;
invertTree(root.left);
invertTree(root.right);
return root;
}

// Example 57: Validate if a Binary Search Tree
public static boolean isValidBST(TreeNode root, Integer min, Integer max) {
if (root == null) {
return true;
}
if ((min != null && root.val <= min) || (max != null && root.val >= max)) {
return false;
}
return isValidBST(root.left, min, root.val) && isValidBST(root.right, root.val, max);
}

// Example 58: Get All Paths From Root to Leaf in Binary Tree
public static List<List<Integer>> allPaths(TreeNode root) {
List<List<Integer>> paths = new ArrayList<>();
if (root == null) {
return paths;
}
allPathsHelper(root, new ArrayList<>(), paths);
return paths;
}

private static void allPathsHelper(TreeNode node, List<Integer> current, List<List<Integer>> paths) {
if (node == null) {
return;
}
current.add(node.val);
if (node.left == null && node.right == null) {
paths.add(new ArrayList<>(current));
} else {
allPathsHelper(node.left, current, paths);
allPathsHelper(node.right, current, paths);
}
current.remove(current.size() - 1);
}

// Example 59: Flatten Binary Tree into Linked List
public static void flatten(TreeNode root) {
if (root == null) {
return;
}
flatten(root.left);
flatten(root.right);
TreeNode temp = root.right;
root.right = root.left;
root.left = null;
TreeNode current = root;
while (current.right != null) {
current = current.right;
}
current.right = temp;
}

// Example 60: Find Lowest Common Ancestor of Two Nodes in Binary Tree
public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
if (root == null || root == p || root == q) {
return root;
}
TreeNode left = lowestCommonAncestor(root.left, p, q);
TreeNode right = lowestCommonAncestor(root.right, p, q);
return left == null ? right : right == null ? left : root;
}

// Example 61: Find Kth Smallest Element in BST
public static int kthSmallest(TreeNode root, int k) {
Stack<TreeNode> stack = new Stack<>();
TreeNode current = root;
while (current != null || !stack.isEmpty()) {
while (current != null) {
stack.push(current);
current = current.left;
}
current = stack.pop();
if (--k == 0) {
return current.val;
}
current = current.right;
}
throw new IllegalArgumentException("k is larger than number of elements in the BST");
}
// Example 62: Merge Two Sorted Arrays
public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
int[] merged = new int[arr1.length + arr2.length];
int i = 0, j = 0, k = 0;
while (i < arr1.length && j < arr2.length) {
if (arr1[i] <= arr2[j]) {
merged[k++] = arr1[i++];
} else {
merged[k++] = arr2[j++];
}
}
while (i < arr1.length) {
merged[k++] = arr1[i++];
}
while (j < arr2.length) {
merged[k++] = arr2[j++];
}
return merged;
}
// Example 63: Rotate Matrix by 90 Degrees
public static void rotateMatrix(int[][] matrix) {
int n = matrix.length;
for (int layer = 0; layer < n / 2; layer++) {
int first = layer;
int last = n - 1 - layer;
for (int i = first; i < last; i++) {
int offset = i - first;
int top = matrix[first][i];
matrix[first][i] = matrix[last - offset][first];
matrix[last - offset][first] = matrix[last][last - offset];
matrix[last][last - offset] = matrix[i][last];
matrix[i][last] = top;
}
}
}
// Example 64: Find Longest Consecutive Sequence in Array
public static int longestConsecutiveSequence(int[] nums) {
Set<Integer> numSet = new HashSet<>();
int longest = 0;
for (int num : nums) {
numSet.add(num);
}
for (int num : nums) {
if (!numSet.contains(num - 1)) {
int currentNum = num;
int streak = 1;
while (numSet.contains(currentNum + 1)) {
currentNum++;
streak++;
}
longest = Math.max(longest, streak);
}
}
return longest;
}
// Example 65: Find Majority Element in Array
public static int findMajorityElement(int[] nums) {
int count = 0, candidate = 0;
for (int num : nums) {
if (count == 0) {
candidate = num;
}
count += (num == candidate) ? 1 : -1;
}
return candidate;
}
// Example 66: Serialize and Deserialize Binary Tree
public static String serialize(TreeNode root) {
StringBuilder sb = new StringBuilder();
serializeHelper(root, sb);
return sb.toString();
}
private static void serializeHelper(TreeNode node, StringBuilder sb) {
if (node == null) {
sb.append("null,");
return;
}
sb.append(node.val).append(",");
serializeHelper(node.left, sb);
serializeHelper(node.right, sb);
}
public static TreeNode deserialize(String data) {
Queue<String> nodes = new LinkedList<>(Arrays.asList(data.split(",")));
return deserializeHelper(nodes);
}
private static TreeNode deserializeHelper(Queue<String> nodes) {
String val = nodes.poll();
if ("null".equals(val)) {
return null;
}
TreeNode node = new TreeNode(Integer.parseInt(val));
node.left = deserializeHelper(nodes);
node.right = deserializeHelper(nodes);
return node;
}
// Example 67: Find the Single Non-Repeating Element
public static int singleNonRepeatingElement(int[] nums) {
int result = 0;
for (int num : nums) {
result ^= num;
}
return result;
}
// Example 68: Check if a Linked List is a Palindrome
public static boolean isPalindrome(ListNode head) {
List<Integer> list = new ArrayList<>();
ListNode current = head;
while (current != null) {
list.add(current.val);
current = current.next;
}
int left = 0, right = list.size() - 1;
while (left < right) {
if (!list.get(left).equals(list.get(right))) {
return false;
}
left++;
right--;
}
return true;
}
// Example 69: Find Missing Number in Array
public static int missingNumber(int[] nums) {
int n = nums.length;
int totalSum = (n * (n + 1)) / 2;
int arraySum = 0;
for (int num : nums) {
arraySum += num;
}
return totalSum - arraySum;
}
// Example 70: Detect Cycle in Graph (DFS)
public static boolean hasCycle(int n, List<List<Integer>> adjList) {
boolean[] visited = new boolean[n];
boolean[] stack = new boolean[n];
for (int i = 0; i < n; i++) {
if (!visited[i] && hasCycleDFS(i, adjList, visited, stack)) {
return true;
}
}
return false;
}
private static boolean hasCycleDFS(int node, List<List<Integer>> adjList, boolean[] visited, boolean[] stack) {
visited[node] = true;
stack[node] = true;
for (int neighbor : adjList.get(node)) {
if (!visited[neighbor] && hasCycleDFS(neighbor, adjList, visited, stack)) {
return true;
} else if (stack[neighbor]) {
return true;
}
}
stack[node] = false;
return false;
}

// Example 71: Sum of First N Natural Numbers Using Recursion
public static int sumOfFirstNNumbers(int n) {
if (n == 0) {
return 0; // Base case: The sum of the first 0 numbers is 0
}
return n + sumOfFirstNNumbers(n - 1); // Recursive call
}
// Example 72: Calculate Factorial of a Number Iteratively
public static int factorialIterative(int n) {
int result = 1;
for (int i = 1; i <= n; i++) {
result *= i;
}
return result;
}

// Example 73: Reverse a String
public static String reverseString(String str) {
StringBuilder reversed = new StringBuilder();
for (int i = str.length() - 1; i >= 0; i--) {
reversed.append(str.charAt(i));
}
return reversed.toString();
}

// Example 74: Check if a String is a Palindrome
public static boolean isPalindromeString(String str) {
int left = 0, right = str.length() - 1;
while (left < right) {
if (str.charAt(left) != str.charAt(right)) {
return false;
}
left++;
right--;
}
return true;
}

// Example 75: Merge Two Sorted Linked Lists
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

// Example 76: Implement Binary Search
public static int binarySearch(int[] arr, int target) {
int left = 0, right = arr.length - 1;
while (left <= right) {
int mid = left + (right - left) / 2;
if (arr[mid] == target) {
return mid;
} else if (arr[mid] < target) {
left = mid + 1;
} else {
right = mid - 1;
}
}
return -1; // Element not found
}

// Example 77: Fibonacci Sequence Using Iteration
public static int fibonacciIterative(int n) {
if (n <= 1) {
return n;
}
int a = 0, b = 1, sum = 0;
for (int i = 2; i <= n; i++) {
sum = a + b;
a = b;
b = sum;
}
return sum;
}

// Example 78: Find All Prime Numbers Up To N
public static List<Integer> findPrimesUpToN(int n) {
boolean[] isPrime = new boolean[n + 1];
Arrays.fill(isPrime, true);
isPrime[0] = isPrime[1] = false;
for (int i = 2; i * i <= n; i++) {
if (isPrime[i]) {
for (int j = i * i; j <= n; j += i) {
isPrime[j] = false;
}
}
}
List<Integer> primes = new ArrayList<>();
for (int i = 2; i <= n; i++) {
if (isPrime[i]) {
primes.add(i);
}
}
return primes;
}

// Example 79: Find GCD of Two Numbers Using Euclid's Algorithm
public static int findGCD(int a, int b) {
while (b != 0) {
int temp = b;
b = a % b;
a = temp;
}
return a;
}

// Example 80: Find LCM of Two Numbers
public static int findLCM(int a, int b) {
return (a * b) / findGCD(a, b);
}

// Example 81: Check if Two Strings Are Anagrams
public static boolean areAnagrams(String s1, String s2) {
if (s1.length() != s2.length()) {
return false;
}
int[] charCounts = new int[26];
for (int i = 0; i < s1.length(); i++) {
charCounts[s1.charAt(i) - 'a']++;
charCounts[s2.charAt(i) - 'a']--;
}
for (int count : charCounts) {
if (count != 0) {
return false;
}
}
return true;
}

// Example 82: Find Maximum Subarray Sum (Kadane’s Algorithm)
public static int maxSubarraySum(int[] nums) {
int maxSum = nums[0];
int currentSum = nums[0];
for (int i = 1; i < nums.length; i++) {
currentSum = Math.max(nums[i], currentSum + nums[i]);
maxSum = Math.max(maxSum, currentSum);
}
return maxSum;
}

// Example 83: Find the First Unique Character in a String
public static int firstUniqueCharacter(String s) {
int[] charCounts = new int[26];
for (char c : s.toCharArray()) {
charCounts[c - 'a']++;
}
for (int i = 0; i < s.length(); i++) {
if (charCounts[s.charAt(i) - 'a'] == 1) {
return i;
}
}
return -1; // No unique character found
}

// Example 84: Find the Minimum Path Sum in a Grid
public static int minPathSum(int[][] grid) {
int m = grid.length, n = grid[0].length;
for (int i = 1; i < m; i++) {
grid[i][0] += grid[i - 1][0];
}
for (int j = 1; j < n; j++) {
grid[0][j] += grid[0][j - 1];
}
for (int i = 1; i < m; i++) {
for (int j = 1; j < n; j++) {
grid[i][j] += Math.min(grid[i - 1][j], grid[i][j - 1]);
}
}
return grid[m - 1][n - 1];
}

// Example 85: Count Number of 1s in Binary Representation
public static int countOnes(int num) {
int count = 0;
while (num != 0) {
num &= (num - 1); // Remove the rightmost 1
count++;
}
return count;
}

// Example 86: Check if Two Strings Are Rotations of Each Other
public static boolean areRotations(String s1, String s2) {
if (s1.length() != s2.length()) {
return false;
}
String combined = s1 + s1;
return combined.contains(s2);
}

// Example 87: Find the Longest Common Prefix Among Strings
public static String longestCommonPrefix(String[] strs) {
if (strs == null || strs.length == 0) {
return "";
}
String prefix = strs[0];
for (int i = 1; i < strs.length; i++) {
while (strs[i].indexOf(prefix) != 0) {
prefix = prefix.substring(0, prefix.length() - 1);
if (prefix.isEmpty()) {
return "";
}
}
}
return prefix;
}

// Example 88: Sort an Array Using Bubble Sort
public static void bubbleSort(int[] arr) {
int n = arr.length;
for (int i = 0; i < n - 1; i++) {
for (int j = 0; j < n - i - 1; j++) {
if (arr[j] > arr[j + 1]) {
int temp = arr[j];
arr[j] = arr[j + 1];
arr[j + 1] = temp;
}
}
}
}

// Example 89: Perform Depth-First Search on Graph
public static void dfs(int node, List<List<Integer>> graph, boolean[] visited) {
if (visited[node]) {
return;
}
visited[node] = true;
System.out.print(node + " ");
for (int neighbor : graph.get(node)) {
dfs(neighbor, graph, visited);
}
}

// Example 90: Implement Quick Sort
public static void quickSort(int[] arr, int low, int high) {
if (low < high) {
int pi = partition(arr, low, high);
quickSort(arr, low, pi - 1);
quickSort(arr, pi + 1, high);
}
}

private static int partition(int[] arr, int low, int high) {
int pivot = arr[high];
int i = low - 1;
for (int j = low; j < high; j++) {
if (arr[j] <= pivot) {
i++;
int temp = arr[i];
arr[i] = arr[j];
arr[j] = temp;
}
}
int temp = arr[i + 1];
arr[i + 1] = arr[high];
arr[high] = temp;
return i + 1;
}

// Example 91: Calculate the Power of a Number Using Recursion
public static double power(double base, int exponent) {
if (exponent == 0) {
return 1;
}
if (exponent < 0) {
return 1 / power(base, -exponent);
}
double halfPower = power(base, exponent / 2);
if (exponent % 2 == 0) {
return halfPower * halfPower;
} else {
return base * halfPower * halfPower;
}
}

// Example 92: Reverse a String
public static String reverseString(String s) {
char[] strArray = s.toCharArray();
int left = 0, right = strArray.length - 1;
while (left < right) {
char temp = strArray[left];
strArray[left] = strArray[right];
strArray[right] = temp;
left++;
right--;
}
return new String(strArray);
}

// Example 93: Determine If a Number Is a Palindrome
public static boolean isPalindromeNumber(int num) {
if (num < 0 || (num % 10 == 0 && num != 0)) {
return false;
}
int reversed = 0;
while (num > reversed) {
reversed = reversed * 10 + num % 10;
num /= 10;
}
return num == reversed || num == reversed / 10;
}

// Example 94: Generate Pascal's Triangle
public static List<List<Integer>> generatePascalsTriangle(int numRows) {
List<List<Integer>> triangle = new ArrayList<>();
for (int i = 0; i < numRows; i++) {
List<Integer> row = new ArrayList<>();
for (int j = 0; j <= i; j++) {
if (j == 0 || j == i) {
row.add(1);
} else {
row.add(triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j));
}
}
triangle.add(row);
}
return triangle;
}

// Example 95: Find Median of Two Sorted Arrays
public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
int[] merged = new int[nums1.length + nums2.length];
int i = 0, j = 0, k = 0;

    while (i < nums1.length && j < nums2.length) {
        if (nums1[i] < nums2[j]) {
            merged[k++] = nums1[i++];
        } else {
            merged[k++] = nums2[j++];
        }
    }
    while (i < nums1.length) {
        merged[k++] = nums1[i++];
    }
    while (j < nums2.length) {
        merged[k++] = nums2[j++];
    }

    int mid = merged.length / 2;
    if (merged.length % 2 == 0) {
        return (merged[mid - 1] + merged[mid]) / 2.0;
    } else {
        return merged[mid];
    }

}

// Example 96: Find Missing Number in an Array
public static int findMissingNumber(int[] nums) {
int n = nums.length;
int total = n * (n + 1) / 2;
int sum = 0;
for (int num : nums) {
sum += num;
}
return total - sum;
}

// Example 97: Transpose a Matrix
public static int[][] transposeMatrix(int[][] matrix) {
int rows = matrix.length;
int cols = matrix[0].length;
int[][] transposed = new int[cols][rows];
for (int i = 0; i < rows; i++) {
for (int j = 0; j < cols; j++) {
transposed[j][i] = matrix[i][j];
}
}
return transposed;
}

// Example 98: Find the Longest Palindromic Substring
public static String longestPalindromicSubstring(String s) {
if (s == null || s.length() < 1) return "";
int start = 0, end = 0;
for (int i = 0; i < s.length(); i++) {
int len1 = expandAroundCenter(s, i, i);
int len2 = expandAroundCenter(s, i, i + 1);
int len = Math.max(len1, len2);
if (len > end - start) {
start = i - (len - 1) / 2;
end = i + len / 2;
}
}
return s.substring(start, end + 1);
}

private static int expandAroundCenter(String s, int left, int right) {
while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
left--;
right++;
}
return right - left - 1;
}

// Example 99: Convert Roman Numerals to Integer
public static int romanToInt(String s) {
Map<Character, Integer> romanMap = Map.of(
'I', 1, 'V', 5, 'X', 10, 'L', 50,
'C', 100, 'D', 500, 'M', 1000
);
int sum = 0;
for (int i = 0; i < s.length(); i++) {
if (i > 0 && romanMap.get(s.charAt(i)) > romanMap.get(s.charAt(i - 1))) {
sum += romanMap.get(s.charAt(i)) - 2 * romanMap.get(s.charAt(i - 1));
} else {
sum += romanMap.get(s.charAt(i));
}
}
return sum;
}

// Example 100: Check if a Number is Happy
public static boolean isHappyNumber(int n) {
Set<Integer> seen = new HashSet<>();
while (n != 1 && !seen.contains(n)) {
seen.add(n);
n = sumOfSquares(n);
}
return n == 1;
}

private static int sumOfSquares(int num) {
int sum = 0;
while (num > 0) {
int digit = num % 10;
sum += digit * digit;
num /= 10;
}
return sum;
}