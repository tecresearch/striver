## Notes------>

## Notes------

# Below are some common Java interview Q&A related to loops.

# These can be used in preparation for interviews or reference:

/*

1. **What is a loop in Java?**
   A loop in Java is a control structure that repeatedly executes a block of code
   as long as the given condition is true.

2. **What are the types of loops in Java?**
   Java supports the following types of loops:
    - `for` loop
    - `while` loop
    - `do-while` loop
    - Enhanced `for` loop (also known as `for-each` loop for arrays/collections)

3. **What is the difference between `while` and `do-while` loops?**
    - In a `while` loop, the condition is evaluated before executing the loop body.
    - In a `do-while` loop, the condition is evaluated after executing the loop body.
      This guarantees the loop body executes at least once in a `do-while`.

4. **Can you explain the enhanced for loop?**
   An enhanced `for` loop (introduced in Java 5) simplifies iteration over arrays or collections.
   Syntax:
   ```
   for (type element : arrayOrCollection) {
       // loop body
   }
   ```

   Example:
   ```
   int[] numbers = {1, 2, 3, 4};
   for (int num : numbers) {
       System.out.println(num);
   }
   ```

5. **What is an infinite loop? How can you avoid it?**
   An infinite loop is one that never terminates. It occurs if the loop's condition never evaluates to false.

   Example of infinite loop:
   ```
   while (true) {
       // Logic that runs infinitely unless explicitly broken out
   }
   ```

   To avoid this, ensure a proper exit condition is applied.

6. **Explain the use of a `break` statement in a loop.**
   The `break` statement is used to terminate the loop immediately, regardless of the loop condition.

   Example:
   ```
   for (int i = 0; i < 10; i++) {
       if (i == 5) {
           break;
       }
       System.out.println(i);
   }
   ```

7. **Explain the use of a `continue` statement in a loop.**
   The `continue` statement skips the current iteration of the loop and proceeds with the next iteration.

   Example:
   ```
   for (int i = 0; i < 10; i++) {
       if (i % 2 == 0) {
           continue;
       }
       System.out.println(i);  // Prints only odd numbers
   }
   ```

8. **Can you nest loops in Java? Provide an example.**
   Yes, loops can be nested. This is useful for operations like matrix calculations or iterating over multi-dimensional
   arrays.

   Example:
   ```
   for (int i = 0; i < 3; i++) {
       for (int j = 0; j < 3; j++) {
           System.out.println("i = " + i + ", j = " + j);
       }
   }
   ```

9. **What is the limitation of the `for-each` loop?**
   The `for-each` loop does not allow modification of the collection or array being iterated.
   If modification is required, a traditional `for` loop or `Iterator` should be used.

   Example of invalid modification:
   ```
   List<Integer> numbers = List.of(1, 2, 3);
   for (int num : numbers) {
       num *= 2;   // This does not change the actual list elements
   }
   ```

10. **Write a program to print the Fibonacci sequence using a `for` loop.**
    ```
    int n = 10; // Print first 10 Fibonacci numbers
    int num1 = 0, num2 = 1;

    System.out.println("Fibonacci Series up to " + n + ":");
    for (int i = 1; i <= n; i++) {
        System.out.print(num1 + " ");
        int sum = num1 + num2;
        num1 = num2;
        num2 = sum;
    }
    ```

*/
/*

11. **Write a program to print common patterns using loops in Java.**
    Below are examples of some common patterns:
    */

// 1. Simple Pyramid Pattern
int n = 5; // Number of rows
for (int i = 1; i <= n; i++) {
for (int j = 1; j <= i; j++) {
System.out.print("* ");
}
System.out.println();
}

/*
Output:

*
*
    *

* * * 
* * * * 
* * * * * 
*/

// 2. Inverted Pyramid Pattern
for (int i = n; i >= 1; i--) {
for (int j = 1; j <= i; j++) {
System.out.print("* ");
}
System.out.println();
}

/*
Output:
* * * * * 
* * * * 
* * * 

*
    *
*

*/

// 3. Right-Aligned Triangle Pattern
for (int i = 1; i <= n; i++) {
for (int j = 1; j <= n - i; j++) {
System.out.print("  ");
}
for (int j = 1; j <= i; j++) {
System.out.print("* ");
}
System.out.println();
}

/*
Output:
*
* *
* * *
  * * * * 
* * * * * 
*/

// 4. Number Pyramid Pattern
for (int i = 1; i <= n; i++) {
for (int j = 1; j <= i; j++) {
System.out.print(j + " ");
}
System.out.println();
}

/*
Output:
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
*/

// 5. Floyd's Triangle
int count = 1;
for (int i = 1; i <= n; i++) {
for (int j = 1; j <= i; j++) {
System.out.print(count + " ");
count++;
}
System.out.println();
}

/*
Output:
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
*/
// 6. Square Pattern
for (int i = 1; i <= n; i++) {
for (int j = 1; j <= n; j++) {
System.out.print("* ");
}
System.out.println();
}

/*
Output:
* * * * *
* * * * *
* * * * *
* * * * *
* * * * *
*/

// 7. Hollow Square Pattern
for (int i = 1; i <= n; i++) {
for (int j = 1; j <= n; j++) {
if (i == 1 || i == n || j == 1 || j == n) {
System.out.print("* ");
} else {
System.out.print("  ");
}
}
System.out.println();
}

/*
Output:
* * * * *

*       *
*       *
*       *

* * * * *
*/

// 8. Simple Right Triangle Pattern
for (int i = 1; i <= n; i++) {
for (int j = 1; j <= i; j++) {
System.out.print("* ");
}
System.out.println();
}

/*
Output:

*
*
    *

* * *
* * * *
* * * * *
*/

// 9. Hollow Right Triangle Pattern
for (int i = 1; i <= n; i++) {
for (int j = 1; j <= i; j++) {
if (j == 1 || i == j || i == n) {
System.out.print("* ");
} else {
System.out.print("  ");
}
}
System.out.println();
}

/*
Output:

*
*
    *
*
    *
*     *

* * * * *
*/

// 10. Left-Aligned Triangle Pattern
for (int i = 1; i <= n; i++) {
for (int j = 1; j <= n - i; j++) {
System.out.print("  ");
}
for (int j = 1; j <= i; j++) {
System.out.print("* ");
}
System.out.println();
}

/*
Output:
*
* *
* * *
  * * * *
* * * * *
*/

// 11. Number Square Pattern
for (int i = 1; i <= n; i++) {
for (int j = 1; j <= n; j++) {
System.out.print(j + " ");
}
System.out.println();
}

/*
Output:
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
*/
// 12. **Write a method to check if a number is prime or not.**
public static boolean isPrime(int num) {
if (num <= 1) {
return false;
}
for (int i = 2; i <= Math.sqrt(num); i++) {
if (num % i == 0) {
return false;
}
}
return true;
}

/*
Example usage:
System.out.println(isPrime(11)); // Output: true
System.out.println(isPrime(4)); // Output: false
*/

// 13. **Write a method to find the factorial of a number using recursion.**
public static int factorial(int num) {
if (num == 0 || num == 1) {
return 1;
}
return num * factorial(num - 1);
}

/*
Example usage:
System.out.println(factorial(5)); // Output: 120
System.out.println(factorial(0)); // Output: 1
*/

// 14. **Write a method to reverse a string.**
public static String reverseString(String str) {
StringBuilder reversed = new StringBuilder();
for (int i = str.length() - 1; i >= 0; i--) {
reversed.append(str.charAt(i));
}
return reversed.toString();
}

/*
Example usage:
System.out.println(reverseString("hello")); // Output: "olleh"
*/

// 15. **Write a method to check if a number is a palindrome.**
public static boolean isPalindrome(int num) {
int original = num;
int reversed = 0;

    while (num > 0) {
        int digit = num % 10;
        reversed = reversed * 10 + digit;
        num /= 10;
    }

    return original == reversed;

}

/*
Example usage:
System.out.println(isPalindrome(121)); // Output: true
System.out.println(isPalindrome(123)); // Output: false
*/

// 16. **Write a method to find the greatest common divisor (GCD) of two numbers.**
public static int gcd(int a, int b) {
if (b == 0) {
return a;
}
return gcd(b, a % b);
}

/*
Example usage:
System.out.println(gcd(18, 12)); // Output: 6
System.out.println(gcd(101, 103)); // Output: 1
*/

// 17. **Write a method to check if a string is a palindrome.**
public static boolean isStringPalindrome(String str) {
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

/*
Example usage:
System.out.println(isStringPalindrome("radar")); // Output: true
System.out.println(isStringPalindrome("hello")); // Output: false
*/

// 18. **Write a method to generate a Fibonacci sequence of 'n' numbers using recursion.**
public static int fibonacci(int n) {
if (n <= 1) {
return n;
}
return fibonacci(n - 1) + fibonacci(n - 2);
}

/*
Example usage:
for (int i = 0; i < 10; i++) {
System.out.print(fibonacci(i) + " ");
}
// Output: 0 1 1 2 3 5 8 13 21 34
*/

// 19. **Write a method to sort an array using bubble sort.**
public static void bubbleSort(int[] arr) {
int n = arr.length;
for (int i = 0; i < n - 1; i++) {
for (int j = 0; j < n - i - 1; j++) {
if (arr[j] > arr[j + 1]) {
// Swap arr[j] and arr[j+1]
int temp = arr[j];
arr[j] = arr[j + 1];
arr[j + 1] = temp;
}
}
}
}

/*
Example usage:
int[] arr = {5, 1, 4, 2, 8};
bubbleSort(arr);
System.out.println(Arrays.toString(arr)); // Output: [1, 2, 4, 5, 8]
*/

// 20. **Write a method to find the second largest number in an array.**
public static int secondLargest(int[] arr) {
int largest = Integer.MIN_VALUE;
int secondLargest = Integer.MIN_VALUE;

    for (int num : arr) {
        if (num > largest) {
            secondLargest = largest;
            largest = num;
        } else if (num > secondLargest && num != largest) {
            secondLargest = num;
        }
    }
    return secondLargest;

}

/*
Example usage:
int[] arr = {12, 35, 1, 10, 34, 1};
System.out.println(secondLargest(arr)); // Output: 34
*/
// 21. **Write a method to find the missing number in an array of size 'n' containing numbers from 1 to n.**
public static int findMissingNumber(int[] arr, int n) {
int totalSum = n * (n + 1) / 2; // Sum of numbers from 1 to n
int arraySum = 0;
for (int num : arr) {
arraySum += num;
}
return totalSum - arraySum;
}

/*
Example usage:
int[] arr = {1, 2, 3, 5};
System.out.println(findMissingNumber(arr, 5)); // Output: 4
*/

// 22. **Write a method to count the number of vowels in a string.**
public static int countVowels(String str) {
int count = 0;
str = str.toLowerCase();
for (char ch : str.toCharArray()) {
if ("aeiou".indexOf(ch) != -1) {
count++;
}
}
return count;
}

/*
Example usage:
System.out.println(countVowels("hello world")); // Output: 3
*/

// 23. **Write a method to find the maximum product of two integers in an array.**
public static int maxProduct(int[] arr) {
int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
for (int num : arr) {
if (num > max1) {
max2 = max1;
max1 = num;
} else if (num > max2) {
max2 = num;
}
}
return max1 * max2;
}

/*
Example usage:
int[] arr = {1, 10, 2, 6, 5, 3};
System.out.println(maxProduct(arr)); // Output: 60
*/

// 24. **Write a method to rotate an array by 'k' steps.**
public static void rotateArray(int[] arr, int k) {
int n = arr.length;
k = k % n;
reverse(arr, 0, n - 1);
reverse(arr, 0, k - 1);
reverse(arr, k, n - 1);
}

private static void reverse(int[] arr, int start, int end) {
while (start < end) {
int temp = arr[start];
arr[start] = arr[end];
arr[end] = temp;
start++;
end--;
}
}

/*
Example usage:
int[] arr = {1, 2, 3, 4, 5, 6, 7};
rotateArray(arr, 3);
System.out.println(Arrays.toString(arr)); // Output: [5, 6, 7, 1, 2, 3, 4]
*/

// 25. **Write a method to remove duplicates from an array.**
public static int[] removeDuplicates(int[] arr) {
Set<Integer> uniqueElements = new LinkedHashSet<>();
for (int num : arr) {
uniqueElements.add(num);
}
int[] result = new int[uniqueElements.size()];
int i = 0;
for (int num : uniqueElements) {
result[i++] = num;
}
return result;
}

/*
Example usage:
int[] arr = {1, 2, 2, 3, 4, 4, 5};
System.out.println(Arrays.toString(removeDuplicates(arr))); // Output: [1, 2, 3, 4, 5]
*/

// 26. **Write a method to find all prime numbers less than 'n'.**
public static List<Integer> primeNumbersLessThanN(int n) {
List<Integer> primes = new ArrayList<>();
for (int i = 2; i < n; i++) {
if (isPrime(i)) {
primes.add(i);
}
}
return primes;
}

/*
Example usage:
System.out.println(primeNumbersLessThanN(10)); // Output: [2, 3, 5, 7]
*/

// 27. **Write a method to find the first non-repeating character in a string.**
public static char firstNonRepeatingChar(String str) {
Map<Character, Integer> charCount = new LinkedHashMap<>();
for (char ch : str.toCharArray()) {
charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
}
for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
if (entry.getValue() == 1) {
return entry.getKey();
}
}
return '\0'; // Return null char if no non-repeating character is found
}

/*
Example usage:
System.out.println(firstNonRepeatingChar("swiss")); // Output: 'w'
*/

// 28. **Write a method to check if two strings are anagrams.**
public static boolean areAnagrams(String str1, String str2) {
if (str1.length() != str2.length()) {
return false;
}
char[] arr1 = str1.toCharArray();
char[] arr2 = str2.toCharArray();
Arrays.sort(arr1);
Arrays.sort(arr2);
return Arrays.equals(arr1, arr2);
}

/*
Example usage:
System.out.println(areAnagrams("listen", "silent")); // Output: true
System.out.println(areAnagrams("apple", "papel")); // Output: false
*/

// 29. **Write a method to find the longest common prefix among a set of strings.**
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

/*
Example usage:
String[] strs = {"flower", "flow", "flight"};
System.out.println(longestCommonPrefix(strs)); // Output: "fl"
*/

// 30. **Write a method to merge two sorted arrays into one sorted array.**
public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
int[] result = new int[arr1.length + arr2.length];
int i = 0, j = 0, k = 0;
while (i < arr1.length && j < arr2.length) {
if (arr1[i] < arr2[j]) {
result[k++] = arr1[i++];
} else {
result[k++] = arr2[j++];
}
}
while (i < arr1.length) {
result[k++] = arr1[i++];
}
while (j < arr2.length) {
result[k++] = arr2[j++];
}
return result;
}

/*
Example usage:
int[] arr1 = {1, 3, 5};
int[] arr2 = {2, 4, 6};
System.out.println(Arrays.toString(mergeSortedArrays(arr1, arr2))); // Output: [1, 2, 3, 4, 5, 6]
*/

// 31. **Write a method to calculate the power of a number `x` raised to `y` (x^y).**
public static double power(double x, int y) {
if (y == 0) {
return 1;
}
double temp = power(x, y / 2);
if (y % 2 == 0) {
return temp * temp;
} else {
if (y > 0) {
return x * temp * temp;
} else {
return (temp * temp) / x;
}
}
}

/*
Example usage:
System.out.println(power(2, 5)); // Output: 32.0
System.out.println(power(2, -3)); // Output: 0.125
*/

// 32. **Write a method to reverse a string.**
public static String reverseString(String str) {
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

/*
Example usage:
System.out.println(reverseString("hello")); // Output: "olleh"
*/

// 33. **Write a method to find the factorial of a number.**
public static long factorial(int n) {
if (n < 0) {
throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
}
long result = 1;
for (int i = 1; i <= n; i++) {
result *= i;
}
return result;
}

/*
Example usage:
System.out.println(factorial(5)); // Output: 120
System.out.println(factorial(0)); // Output: 1
*/

// 34. **Write a method to validate if a string is a palindrome.**
public static boolean isPalindrome(String str) {
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

/*
Example usage:
System.out.println(isPalindrome("radar")); // Output: true
System.out.println(isPalindrome("hello")); // Output: false
*/

// 35. **Write a method to generate the Fibonacci sequence up to 'n' terms.**
public static List<Integer> generateFibonacci(int n) {
List<Integer> fibSequence = new ArrayList<>();
if (n <= 0) {
return fibSequence;
}
fibSequence.add(0);
if (n == 1) {
return fibSequence;
}
fibSequence.add(1);
for (int i = 2; i < n; i++) {
fibSequence.add(fibSequence.get(i - 1) + fibSequence.get(i - 2));
}
return fibSequence;
}

/*
Example usage:
System.out.println(generateFibonacci(5)); // Output: [0, 1, 1, 2, 3]
*/

// 36. **Write a method to find the second largest element in an array.**
public static int secondLargest(int[] arr) {
int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
for (int num : arr) {
if (num > largest) {
secondLargest = largest;
largest = num;
} else if (num > secondLargest && num != largest) {
secondLargest = num;
}
}
return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;
}

/*
Example usage:
int[] arr = {3, 1, 4, 1, 5, 9};
System.out.println(secondLargest(arr)); // Output: 5
*/

// 37. **Write a method to check if a number is a power of 2.**
public static boolean isPowerOfTwo(int n) {
if (n <= 0) {
return false;
}
return (n & (n - 1)) == 0;
}

/*
Example usage:
System.out.println(isPowerOfTwo(8)); // Output: true
System.out.println(isPowerOfTwo(10)); // Output: false
*/
// 38. **Write a method to count the number of set bits (1s) in the binary representation of an integer.**
public static int countSetBits(int n) {
int count = 0;
while (n > 0) {
count += (n & 1);
n >>= 1;
}
return count;
}

/*
Example usage:
System.out.println(countSetBits(9)); // Output: 2 (binary: 1001)
*/

// 39. **Write a method to check if a string contains only digits.**
public static boolean containsOnlyDigits(String str) {
for (char c : str.toCharArray()) {
if (!Character.isDigit(c)) {
return false;
}
}
return true;
}

/*
Example usage:
System.out.println(containsOnlyDigits("12345")); // Output: true
System.out.println(containsOnlyDigits("123a5")); // Output: false
*/

// 40. **Write a method to rotate an array to the right by 'k' steps.**
public static void rotateArray(int[] arr, int k) {
k = k % arr.length;
reverse(arr, 0, arr.length - 1);
reverse(arr, 0, k - 1);
reverse(arr, k, arr.length - 1);
}

private static void reverse(int[] arr, int start, int end) {
while (start < end) {
int temp = arr[start];
arr[start] = arr[end];
arr[end] = temp;
start++;
end--;
}
}

/*
Example usage:
int[] arr = {1, 2, 3, 4, 5};
rotateArray(arr, 2);
System.out.println(Arrays.toString(arr)); // Output: [4, 5, 1, 2, 3]
*/

// 41. **Write a method to find the greatest common divisor (GCD) of two numbers.**
public static int gcd(int a, int b) {
while (b != 0) {
int temp = b;
b = a % b;
a = temp;
}
return Math.abs(a);
}

/*
Example usage:
System.out.println(gcd(54, 24)); // Output: 6
*/

// 42. **Write a method to find the least common multiple (LCM) of two numbers.**
public static int lcm(int a, int b) {
return Math.abs(a * b) / gcd(a, b);
}

/*
Example usage:
System.out.println(lcm(15, 20)); // Output: 60
*/

// 43. **Write a method to count the occurrences of a character in a string.**
public static int countOccurrences(String str, char c) {
int count = 0;
for (char ch : str.toCharArray()) {
if (ch == c) {
count++;
}
}
return count;
}

/*
Example usage:
System.out.println(countOccurrences("hello", 'l')); // Output: 2
*/

// 44. **Write a method to generate all prime numbers up to 'n'.**
public static List<Integer> generatePrimes(int n) {
List<Integer> primes = new ArrayList<>();
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
    for (int i = 2; i <= n; i++) {
        if (isPrime[i]) {
            primes.add(i);
        }
    }
    return primes;

}

/*
Example usage:
System.out.println(generatePrimes(10)); // Output: [2, 3, 5, 7]
*/

// 45. **Write a method to calculate the sum of digits of a number.**
public static int sumOfDigits(int n) {
int sum = 0;
n = Math.abs(n);
while (n > 0) {
sum += n % 10;
n /= 10;
}
return sum;
}

/*
Example usage:
System.out.println(sumOfDigits(123)); // Output: 6
*/

// 46. **Write a method to determine if an array of integers is sorted in ascending order.**
public static boolean isSorted(int[] arr) {
for (int i = 1; i < arr.length; i++) {
if (arr[i] < arr[i - 1]) {
return false;
}
}
return true;
}

/*
Example usage:
System.out.println(isSorted(new int[]{1, 2, 3, 4, 5})); // Output: true
System.out.println(isSorted(new int[]{1, 3, 2, 4, 5})); // Output: false
*/

// 47. **Write a method to check if a number is a perfect square.**
public static boolean isPerfectSquare(int n) {
if (n < 0) {
return false;
}
int sqrt = (int) Math.sqrt(n);
return sqrt * sqrt == n;
}

/*
Example usage:
System.out.println(isPerfectSquare(16)); // Output: true
System.out.println(isPerfectSquare(14)); // Output: false
*/

// 48. **Write a method to convert a decimal number to binary.**
public static String decimalToBinary(int n) {
if (n == 0) {
return "0";
}
StringBuilder binary = new StringBuilder();
while (n > 0) {
binary.append(n % 2);
n /= 2;
}
return binary.reverse().toString();
}

/*
Example usage:
System.out.println(decimalToBinary(10)); // Output: "1010"
*/

// 49. **Write a method to convert binary to decimal.**
public static int binaryToDecimal(String binary) {
int decimal = 0;
int base = 1; // 2^0
for (int i = binary.length() - 1; i >= 0; i--) {
if (binary.charAt(i) == '1') {
decimal += base;
}
base *= 2;
}
return decimal;
}

/*
Example usage:
System.out.println(binaryToDecimal("1010")); // Output: 10
*/

// 50. **Write a method to remove duplicate characters from a string.**
public static String removeDuplicates(String str) {
StringBuilder result = new StringBuilder();
Set<Character> seen = new HashSet<>();
for (char c : str.toCharArray()) {
if (!seen.contains(c)) {
seen.add(c);
result.append(c);
}
}
return result.toString();
}

/*
Example usage:
System.out.println(removeDuplicates("programming")); // Output: "progamin"
*/