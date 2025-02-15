## Notes------>

// 50 Top Interview Questions on Mathematics in Java

// 1. Check if a given number is prime
public boolean isPrime(int n) {
if (n <= 1) return false;
for (int i = 2; i <= Math.sqrt(n); i++) {
if (n % i == 0) return false;
}
return true;
}

// 2. Find the factorial of a number
public int factorial(int n) {
if (n == 0) return 1;
return n * factorial(n - 1);
}

// 3. Check if a number is a perfect square
public boolean isPerfectSquare(int n) {
int sqrt = (int) Math.sqrt(n);
return sqrt * sqrt == n;
}

// 4. Find the GCD of two numbers
public int gcd(int a, int b) {
if (b == 0) return a;
return gcd(b, a % b);
}

// 5. Find the LCM of two numbers
public int lcm(int a, int b) {
return (a * b) / gcd(a, b);
}

// 6. Check if a number is an Armstrong number
public boolean isArmstrong(int n) {
int original = n, sum = 0;
while (n > 0) {
int digit = n % 10;
sum += digit * digit * digit;
n /= 10;
}
return sum == original;
}

// 7. Generate Fibonacci numbers up to N terms
public void generateFibonacci(int n) {
int a = 0, b = 1;
for (int i = 0; i < n; i++) {
System.out.print(a + " ");
int temp = a;
a = b;
b = temp + b;
}
}

// 8. Check if a number is a palindrome
public boolean isPalindrome(int n) {
int original = n, reversed = 0;
while (n > 0) {
reversed = reversed * 10 + n % 10;
n /= 10;
}
return reversed == original;
}

// 9. Count the number of digits in a number
public int countDigits(int n) {
return (int) Math.log10(n) + 1;
}

// 10. Calculate power of a number
public double power(double base, int exponent) {
return Math.pow(base, exponent);
}

// 11. Check if a number is even
public boolean isEven(int n) {
return n % 2 == 0;
}

// 12. Find the sum of digits of a number
public int sumOfDigits(int n) {
int sum = 0;
while (n > 0) {
sum += n % 10;
n /= 10;
}
return sum;
}

// 13. Reverse a number
public int reverseNumber(int n) {
int reverse = 0;
while (n > 0) {
reverse = reverse * 10 + n % 10;
n /= 10;
}
return reverse;
}

// 14. Check if two numbers are coprime
public boolean areCoprime(int a, int b) {
return gcd(a, b) == 1;
}

// 15. Find the nth Fibonacci number
public int nthFibonacci(int n) {
if (n <= 1) return n;
return nthFibonacci(n - 1) + nthFibonacci(n - 2);
}

// 16. Find square root of a number
public double squareRoot(double n) {
return Math.sqrt(n);
}

// 17. Check if a number is a power of two
public boolean isPowerOfTwo(int n) {
return (n > 0) && ((n & (n - 1)) == 0);
}

// 18. Check if a number is a perfect number
public boolean isPerfectNumber(int n) {
int sum = 1;
for (int i = 2; i <= Math.sqrt(n); i++) {
if (n % i == 0) {
if (i == n / i) sum += i;
else sum += i + (n / i);
}
}
return sum == n && n != 1;
}

// 19. Generate prime numbers up to N
public void generatePrimes(int n) {
for (int i = 2; i <= n; i++) {
if (isPrime(i)) System.out.print(i + " ");
}
}

// 20. Calculate sum of first N natural numbers
public int sumOfNaturalNumbers(int n) {
return (n * (n + 1)) / 2;
}

// 21. Find the nth triangular number
public int nthTriangularNumber(int n) {
return (n * (n + 1)) / 2;
}

// 22. Find the missing number in an array
public int findMissingNumber(int[] arr, int n) {
int total = (n * (n + 1)) / 2;
for (int num : arr) {
total -= num;
}
return total;
}

// 23. Count the number of trailing zeroes in factorial
public int trailingZeroesInFactorial(int n) {
int count = 0;
for (int i = 5; n / i >= 1; i *= 5) {
count += n / i;
}
return count;
}

// 24. Find the sum of an arithmetic progression
public int sumOfAP(int a, int d, int n) {
return n / 2 * (2 * a + (n - 1) * d);
}

// 25. Find the sum of a geometric progression
public double sumOfGP(double a, double r, int n) {
if (r == 1) return a * n;
return a * (1 - Math.pow(r, n)) / (1 - r);
}

// 26. Check if a number is harshad (niven) number
public boolean isHarshad(int n) {
int sum = sumOfDigits(n);
return n % sum == 0;
}

// 27. Convert decimal to binary
public String decimalToBinary(int n) {
return Integer.toBinaryString(n);
}

// 28. Convert binary to decimal
public int binaryToDecimal(String binary) {
return Integer.parseInt(binary, 2);
}

// 29. Find the median of an array
public double findMedian(int[] arr) {
Arrays.sort(arr);
int n = arr.length;
if (n % 2 == 0) return (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
return arr[n / 2];
}

// 30. Check if a number is a Keith number
public boolean isKeithNumber(int n) {
List<Integer> digits = new ArrayList<>();
int temp = n;
while (temp > 0) {
digits.add(0, temp % 10);
temp /= 10;
}
int sum;
do {
sum = 0;
for (int digit : digits) sum += digit;
digits.remove(0);
digits.add(sum);
} while (sum < n);
return sum == n;
}

// Continue adding remaining 20 math-related interview question solutions...

// Note: Additional code for the remaining 20 questions can follow, similar in complexity and structure to these.
// 31. Generate a Pascal's Triangle up to N rows
public void generatePascalsTriangle(int n) {
for (int line = 0; line < n; line++) {
int value = 1;
for (int j = 0; j <= line; j++) {
System.out.print(value + " ");
value = value * (line - j) / (j + 1);
}
System.out.println();
}
}

// 32. Find the largest prime factor of a number
public int largestPrimeFactor(int n) {
int maxPrime = -1;
while (n % 2 == 0) {
maxPrime = 2;
n /= 2;
}
for (int i = 3; i <= Math.sqrt(n); i += 2) {
while (n % i == 0) {
maxPrime = i;
n /= i;
}
}
if (n > 2) maxPrime = n;
return maxPrime;
}

// 33. Calculate combination (nCr)
public int combination(int n, int r) {
return factorial(n) / (factorial(r) * factorial(n - r));
}

// 34. Calculate permutation (nPr)
public int permutation(int n, int r) {
return factorial(n) / factorial(n - r);
}

// 35. Check if a number is a Kaprekar number
public boolean isKaprekarNumber(int n) {
int squared = n * n;
String str = String.valueOf(squared);
int len = str.length();
int left = (len > 1) ? Integer.parseInt(str.substring(0, len / 2)) : 0;
int right = Integer.parseInt(str.substring(len / 2));
return left + right == n;
}

// 36. Calculate the sum of divisors of a number
public int sumOfDivisors(int n) {
int sum = 1;
for (int i = 2; i <= Math.sqrt(n); i++) {
if (n % i == 0) {
if (i == n / i) sum += i;
else sum += (i + n / i);
}
}
return sum;
}

// 37. Check if a number is a Smith number
public boolean isSmithNumber(int n) {
if (isPrime(n)) return false;
int primeFactorSum = 0, digitSum = sumOfDigits(n);
int temp = n;
for (int i = 2; i <= temp / 2; i++) {
while (temp % i == 0) {
primeFactorSum += sumOfDigits(i);
temp /= i;
}
}
if (temp > 1) primeFactorSum += sumOfDigits(temp);
return primeFactorSum == digitSum;
}

// 38. Find a number's digital root
public int digitalRoot(int n) {
while (n >= 10) {
n = sumOfDigits(n);
}
return n;
}

// 39. Generate the Collatz sequence of a number
public void generateCollatzSequence(int n) {
while (n != 1) {
System.out.print(n + " ");
if (n % 2 == 0) n /= 2;
else n = 3 * n + 1;
}
System.out.println(1);
}

// 40. Check if a number is automorphic
public boolean isAutomorphic(int n) {
int squared = n * n;
return String.valueOf(squared).endsWith(String.valueOf(n));
}

// 41. Convert a decimal number to a hexadecimal representation
public String decimalToHexadecimal(int n) {
return Integer.toHexString(n).toUpperCase();
}

// 42. Convert a hexadecimal number to a decimal number
public int hexadecimalToDecimal(String hex) {
return Integer.parseInt(hex, 16);
}

// 43. Find the Hamming distance between two binary numbers
public int hammingDistance(int a, int b) {
int xor = a ^ b;
return Integer.bitCount(xor);
}

// 44. Check if a number is a magic number
public boolean isMagicNumber(int n) {
return digitalRoot(n) == 1;
}

// 45. Generate happy numbers up to N
public void generateHappyNumbers(int n) {
for (int i = 1; i <= n; i++) {
if (isHappyNumber(i)) System.out.print(i + " ");
}
System.out.println();
}

private boolean isHappyNumber(int n) {
HashSet<Integer> seen = new HashSet<>();
while (n != 1 && !seen.contains(n)) {
seen.add(n);
n = sumOfDigitsSquared(n);
}
return n == 1;
}

private int sumOfDigitsSquared(int n) {
int sum = 0;
while (n > 0) {
int digit = n % 10;
sum += digit * digit;
n /= 10;
}
return sum;
}

// 46. Reverse the digits in an integer array
public int[] reverseDigitsInArray(int[] arr) {
for (int i = 0; i < arr.length; i++) {
arr[i] = reverseNumber(arr[i]);
}
return arr;
}

// 47. Find the nth Catalan number
public long nthCatalan(int n) {
return combination(2 * n, n) / (n + 1);
}

// 48. Check if a number is a lucky number
public boolean isLuckyNumber(int n) {
return isLuckyNumberHelper(n, 2);
}

private boolean isLuckyNumberHelper(int n, int counter) {
if (counter > n) return true;
if (n % counter == 0) return false;
return isLuckyNumberHelper(n - n / counter, counter + 1);
}

// 49. Find all amicable pairs up to N
public void findAmicablePairs(int n) {
for (int a = 2; a <= n; a++) {
int b = sumOfDivisors(a) - a;
if (b > a && b <= n && sumOfDivisors(b) - b == a) {
System.out.println("(" + a + ", " + b + ")");
}
}
}

// 50. Check if a number is a circular prime
public boolean isCircularPrime(int n) {
String num = String.valueOf(n);
for (int i = 0; i < num.length(); i++) {
if (!isPrime(Integer.parseInt(num))) return false;
num = num.substring(1) + num.charAt(0); // Rotate digits
}
return true;
}
