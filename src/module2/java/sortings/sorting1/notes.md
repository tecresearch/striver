// 1. What is sorting in Java?
// Sorting in Java refers to arranging elements in a specific order (ascending or descending).

// 2. What are some commonly used sorting algorithms in Java?
// Examples: Bubble Sort, Selection Sort, Insertion Sort, Merge Sort, Quick Sort, Heap Sort.

// 3. What is the difference between Comparable and Comparator interfaces?
// Comparable: Used for natural ordering by overriding compareTo().
// Comparator: Used for custom ordering by overriding compare().

import java.util.*;

// Example:
class Employee implements Comparable<Employee> {
String name;
int age;

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Employee o) {
        return this.age - o.age; // natural ordering by age
    }

}

// 4. How can we sort a list in Java using Comparable?
List<Employee> employees = Arrays.asList(
new Employee("Alice", 30),
new Employee("Bob", 25),
new Employee("Charlie", 35)
);
Collections.sort(employees); // Sorting based on comparable definition

// 5. How can we sort a list in Java using Comparator?
Collections.sort(employees, new Comparator<Employee>() {
@Override
public int compare(Employee e1, Employee e2) {
return e1.name.compareTo(e2.name); // Sorting by name
}
});

// 6. What's the difference between Arrays.sort() and Collections.sort()?
// Arrays.sort() is used to sort arrays, while Collections.sort() is used for sorting lists.

// 7. How to sort an array in ascending order?
int[] arr = {5, 2, 9, 1, 3};
Arrays.sort(arr); // Sorts in place [1, 2, 3, 5, 9]

// 8. How to sort an array in descending order?
Integer[] arrDesc = {5, 2, 9, 1, 3};
Arrays.sort(arrDesc, Collections.reverseOrder()); // [9, 5, 3, 2, 1]

// 9. How to sort a list in ascending order?
List<Integer> list = Arrays.asList(5, 2, 9, 1, 3);
Collections.sort(list); // [1, 2, 3, 5, 9]

// 10. How to sort a list in descending order?
Collections.sort(list, Collections.reverseOrder()); // [9, 5, 3, 2, 1]

// 11. How to perform a custom sort using a lambda expression?
Collections.sort(employees, (e1, e2) -> e1.name.compareTo(e2.name));

// 12. What is the time complexity of Arrays.sort() for primitives?
// Arrays.sort() uses Dual-Pivot QuickSort for primitives, with O(n log n) average complexity.

// 13. What is the time complexity of Arrays.sort() for objects?
// Arrays.sort(Object[]) uses TimSort with O(n log n) average complexity.

// 14. Explain Merge Sort in Java.
// Divide and conquer algorithm that divides the list into halves, sorts them, and merges them.
public void mergeSort(int[] array, int left, int right) {
if (left < right) {
int middle = (left + right) / 2;
mergeSort(array, left, middle);
mergeSort(array, middle + 1, right);
merge(array, left, middle, right);
}
}

// 15. Explain Quick Sort in Java.
// A divide-and-conquer algorithm using a pivot element to partition the array.
public void quickSort(int[] array, int low, int high) {
if (low < high) {
int pivotIndex = partition(array, low, high);
quickSort(array, low, pivotIndex - 1);
quickSort(array, pivotIndex + 1, high);
}
}

// 16. How can you sort objects with multiple fields?
// Use a custom Comparator with multiple comparisons.
Collections.sort(employees, Comparator.comparing(Employee::getName)
.thenComparing(Employee::getAge));

// 17. How do you sort a string array?
String[] words = {"apple", "banana", "cherry"};
Arrays.sort(words); // [apple, banana, cherry]

// 18. How can you sort a map by its keys in Java?
Map<String, Integer> map = new TreeMap<>(unsortedMap);

// 19. How can you sort a map by its values in Java?
List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
entries.sort(Map.Entry.comparingByValue());

// 20. Explain Bubble Sort in Java.
public void bubbleSort(int[] arr) {
for (int i = 0; i < arr.length - 1; i++) {
for (int j = 0; j < arr.length - i - 1; j++) {
if (arr[j] > arr[j + 1]) {
int temp = arr[j];
arr[j] = arr[j + 1];
arr[j + 1] = temp;
}
}
}
}

// 21. What is the difference between stable and unstable sorting algorithms?
// Stable: Maintains relative order of equal elements (e.g., Merge Sort).
// Unstable: Does not maintain order (e.g., Quick Sort).

// 22. Is Quick Sort stable or unstable?
// Quick Sort is unstable because equal elements might be rearranged.

// 23. How can you perform parallel sorting in Java?
Arrays.parallelSort(arr); // Uses Fork/Join framework for faster sorting.

// 24. How is sorting handled in Java 8 Streams?
List<String> names = Arrays.asList("Anna", "Mike", "Elena");
List<String> sorted = names.stream().sorted().collect(Collectors.toList());

// 25. What is the purpose of Comparator.reverseOrder()?
// Reverse a natural order for sorting.
Arrays.sort(words, Comparator.reverseOrder());

// 26. What is the use of the TimSort algorithm in Java?
// TimSort is a hybrid of Merge and Insertion Sort, used in Collections.sort() and Arrays.sort().

// 27. How can you sort a List of integers by their absolute values?
list.sort(Comparator.comparingInt(Math::abs));

// 28. How do you sort using natural order?
Collection<String> names = new ArrayList<>(Set.of("X", "B", "A"));
names.stream().sorted(); // Alphabetical (natural order)

// 29. How do you implement radix sort in Java (for integers)?
// Radix Sort works by processing digits of numbers in ascending order.
public void radixSort(int[] arr) {
// Implementation logic
}

// 30. How do you sort a 2D array based on one column?
Arrays.sort(twoDArray, (row1, row2) -> Integer.compare(row1[0], row2[0]));

// 31. How do you sort a List of Strings ignoring case sensitivity?
List<String> caseInsensitiveList = Arrays.asList("Banana", "apple", "Cherry");
caseInsensitiveList.sort(String.CASE_INSENSITIVE_ORDER);

// 32. How do you sort a list of objects in reverse order by a field?
Collections.sort(employees, Comparator.comparing(Employee::getAge).reversed());

// 33. How can you sort a list using Stream API by length of strings?
List<String> stringList = Arrays.asList("short", "longer", "longest");
List<String> sortedByLength = stringList.stream()
.sorted(Comparator.comparingInt(String::length))
.collect(Collectors.toList());

// 34. How do you sort an array of doubles in ascending order?
double[] doubleArray = {3.2, 1.5, 4.8, 2.9};
Arrays.sort(doubleArray);

// 35. How do you sort an array of doubles in descending order?
Double[] doubleArrayDesc = {3.2, 1.5, 4.8, 2.9};
Arrays.sort(doubleArrayDesc, Collections.reverseOrder());

// 36. How do you sort a 2D array based on the second column?
Arrays.sort(twoDArray, (row1, row2) -> Integer.compare(row1[1], row2[1]));

// 37. How do you perform stable sorting in Java?
// Collections.sort() and Arrays.sort() for objects are stable due to TimSort implementation.

// 38. How do you sort a list into natural order without mutations?
List<String> sortedStrings = new ArrayList<>(names);
Collections.sort(sortedStrings);

// 39. How do you sort a map by its key length?
Map<String, Integer> mapByKeyLength = new TreeMap<>(Comparator.comparingInt(String::length));

// 40. How do you sort a priority queue based on a custom comparator?
PriorityQueue<Employee> sortedQueue = new PriorityQueue<>(Comparator.comparing(Employee::getAge));
sortedQueue.addAll(employees);
// 41. How do you sort a list of dates in ascending order?
List<LocalDate> dateList = Arrays.asList(
LocalDate.of(2023, 10, 15),
LocalDate.of(2021, 5, 10),
LocalDate.of(2022, 8, 5));
dateList.sort(Comparator.naturalOrder()); // [2021-05-10, 2022-08-05, 2023-10-15]

// 42. How do you sort a list of dates in descending order?
dateList.sort(Comparator.reverseOrder()); // [2023-10-15, 2022-08-05, 2021-05-10]

// 43. How do you sort nested lists in Java?
List<List<Integer>> nestedList = Arrays.asList(
Arrays.asList(3, 2),
Arrays.asList(1, 4),
Arrays.asList(5, 0));
nestedList.sort(Comparator.comparingInt(row -> row.get(0))); // Sorts by first element of each nested list

// 44. How can you sort numbers as strings in numerical order?
List<String> numbersAsStrings = Arrays.asList("10", "2", "30", "4");
numbersAsStrings.sort(Comparator.comparingInt(Integer::parseInt)); // [2, 4, 10, 30]

// 45. How do you sort an array of objects with a null-safe comparator?
Employee[] employeeArray = {employee1, null, employee2};
Arrays.sort(employeeArray, Comparator.nullsFirst(Comparator.comparing(Employee::getName)));

// 46. How do you sort a List of strings where empty strings come last?
List<String> stringListWithEmpty = Arrays.asList("apple", "", "banana", "cherry");
stringListWithEmpty.sort(Comparator.comparing(String::isEmpty).thenComparing(
Comparator.naturalOrder())); // ["apple", "banana", "cherry", ""]

// 47. How do you sort a class implementing Comparable?
class Product implements Comparable<Product> {
private String name;
private double price;

    @Override
    public int compareTo(Product other) {
        return Double.compare(this.price, other.price);
    }

}
List<Product> products = new ArrayList<>();
Collections.sort(products); // Sorted by price

// 48. How do you sort a stream with null-safe comparator?
List<String> nullableStringList = Arrays.asList(null, "Apple", "Banana", "Cherry");
List<String> sortedNullableStringList = nullableStringList.stream()
.sorted(Comparator.nullsLast(Comparator.naturalOrder()))
.collect(Collectors.toList()); // [Apple, Banana, Cherry, null]

// 49. How do you sort objects using both Comparable and Comparator?
List<Product> productList = new ArrayList<>();
productList.sort(Comparator.naturalOrder()); // Uses Comparable
productList.sort(Comparator.comparing(Product::getName)); // Uses Comparator

// 50. How do you sort by custom logic where even numbers come first followed by odd numbers?
List<Integer> numbers = Arrays.asList(5, 2, 9, 1, 8, 6, 3);
numbers.sort(Comparator.comparingInt(n -> n % 2).thenComparing(n -> n)); // [2, 8, 6, 1, 3, 5, 9]

// 51. How do you shuffle a list randomly in Java?
Collections.shuffle(numbers);
// 52. How do you find the maximum value in a list using Streams?
int maxValue = numbers.stream().max(Integer::compareTo).orElseThrow();
// 53. How do you count occurrences of each character in a String?
Map<Character, Long> charCount = "example".chars()
.mapToObj(c -> (char) c)
.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
// 54. How do you reverse a list in Java?
Collections.reverse(numbers);
// 55. How do you merge two lists into one in Java?
List<Integer> mergedList = new ArrayList<>(list1);
mergedList.addAll(list2);
// 56. How do you filter even numbers from a list using Streams?
List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
// 57. How do you create an immutable list in Java?
List<String> immutableList = List.of("A", "B", "C");
// 58. How do you remove duplicates from a list using a Set?
List<Integer> uniqueNumbers = new ArrayList<>(new HashSet<>(numbers));
// 59. How do you find the second highest number in a list?
int secondHighest = numbers.stream()
.sorted(Comparator.reverseOrder())
.distinct()
.skip(1)
.findFirst()
.orElseThrow();
// 60. How do you create a sublist from a list?
List<Integer> sublist = numbers.subList(1, 4);
// 61. How do you check if all numbers in a list are positive using Streams?
boolean allPositive = numbers.stream().allMatch(n -> n > 0);
// 62. How do you find the sum of all elements in a list using Streams?
int sum = numbers.stream().mapToInt(Integer::intValue).sum();
// 63. How do you flatten a list of lists into a single list?
List<Integer> flattenedList = nestedList.stream()
.flatMap(List::stream)
.collect(Collectors.toList());
// 64. How do you create a map from a list of objects?
Map<Integer, String> idToNameMap = people.stream()
.collect(Collectors.toMap(Person::getId, Person::getName));
// 65. How do you calculate the average of a list of integers using Streams?
double average = numbers.stream()
.mapToInt(Integer::intValue)
.average()
.orElse(0.0);
// 66. How do you check if a list contains duplicates?
boolean hasDuplicates = numbers.size() != new HashSet<>(numbers).size();
// 67. How do you partition a list into even and odd numbers?
Map<Boolean, List<Integer>> partitioned = numbers.stream()
.collect(Collectors.partitioningBy(n -> n % 2 == 0));
// 68. How do you find the length of the longest String in a list?
int longestLength = stringList.stream()
.mapToInt(String::length)
.max()
.orElse(0);
// 69. How do you remove null values from a list?
List<String> noNullsList = nullableStringList.stream()
.filter(Objects::nonNull)
.collect(Collectors.toList());
// 70. How do you create a thread-safe list in Java?
List<Integer> syncList = Collections.synchronizedList(new ArrayList<>(numbers));
// 71. How do you convert a list of strings to uppercase using Streams?
List<String> upperCaseList = stringList.stream()
.map(String::toUpperCase)
.collect(Collectors.toList());
// 72. How do you group strings by their length using Streams?
Map<Integer, List<String>> groupedByLength = stringList.stream()
.collect(Collectors.groupingBy(String::length));
// 73. How do you find distinct values in a list using Streams?
List<Integer> distinctValues = numbers.stream()
.distinct()
.collect(Collectors.toList());
// 74. How do you replace all occurrences of an element in a list?
Collections.replaceAll(numbers, 2, 20);
// 75. How do you find the most frequent element in a list?
int mostFrequent = numbers.stream()
.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
.entrySet()
.stream()
.max(Map.Entry.comparingByValue())
.get()
.getKey();
// 76. How do you find the sum of numbers from 1 to 100?
int sumUpTo100 = IntStream.rangeClosed(1, 100).sum(); // 5050

// 77. How do you find the factorial of a number using Streams?
int factorial = IntStream.rangeClosed(1, 5).reduce(1, (a, b) -> a * b); // 120 for 5!
// 78. How do you check if any number in a list is negative using Streams?
boolean hasNegative = numbers.stream().anyMatch(n -> n < 0);
// 79. How do you find common elements between two lists using Streams?
List<Integer> commonElements = list1.stream()
.filter(list2::contains)
.collect(Collectors.toList());
// 80. How do you convert a Stream to an array in Java?
Integer[] numberArray = numbers.stream().toArray(Integer[]::new);
// 81. How do you convert a Stream to a Set in Java?
Set<Integer> numberSet = numbers.stream().collect(Collectors.toSet());
// 82. How do you get a range of numbers as a list using Streams?
List<Integer> rangeList = IntStream.rangeClosed(1, 10).boxed().collect(Collectors.toList());
// 83. How do you calculate the sum of squares of a list of numbers?
int sumOfSquares = numbers.stream()
.mapToInt(n -> n * n)
.sum();
// 84. How do you flatten a map of lists into a single list?
Map<String, List<Integer>> mapOfLists = Map.of(
"A", List.of(1, 2),
"B", List.of(3, 4)
);
List<Integer> flattenedFromMap = mapOfLists.values().stream()
.flatMap(List::stream)
.collect(Collectors.toList());
// 85. How do you group numbers by even and odd using Streams?
Map<Boolean, List<Integer>> groupedByEvenOdd = numbers.stream()
.collect(Collectors.partitioningBy(n -> n % 2 == 0));
// 86. How do you find the intersection of two sets?
Set<Integer> set1 = Set.of(1, 2, 3, 4);
Set<Integer> set2 = Set.of(3, 4, 5, 6);
Set<Integer> intersection = set1.stream()
.filter(set2::contains)
.collect(Collectors.toSet());
// 87. How do you find the union of two sets?
Set<Integer> union = Stream.concat(set1.stream(), set2.stream())
.collect(Collectors.toSet());
// 88. How do you find the difference between two sets?
Set<Integer> difference = set1.stream()
.filter(e -> !set2.contains(e))
.collect(Collectors.toSet());
// 89. How do you generate an infinite stream of numbers?
Stream<Integer> infiniteStream = Stream.iterate(0, n -> n + 1);
// Make sure to limit processing, e.g., infiniteStream.limit(10).forEach(System.out::println)
// 90. How do you collect Stream elements into a linked list?
LinkedList<Integer> linkedList = numbers.stream()
.collect(Collectors.toCollection(LinkedList::new));
// 91. How do you find the last element of a Stream?
int lastElement = numbers.stream()
.reduce((first, second) -> second)
.orElseThrow();
// 92. How do you limit the size of a Stream?
List<Integer> limitedList = numbers.stream().limit(5).collect(Collectors.toList());
// 93. How do you skip first N elements of a Stream?
List<Integer> skippedList = numbers.stream().skip(2).collect(Collectors.toList());
// 94. How do you merge two maps in Java?
Map<Integer, String> map1 = Map.of(1, "One", 2, "Two");
Map<Integer, String> map2 = Map.of(3, "Three", 4, "Four");
Map<Integer, String> mergedMap = Stream.concat(map1.entrySet().stream(), map2.entrySet().stream())
.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
// 95. How do you count the frequency of elements in a list?
Map<Integer, Long> frequencyMap = numbers.stream()
.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
// 96. How do you convert a comma-separated string to a list?
String csv = "1,2,3,4,5";
List<Integer> csvList = Arrays.stream(csv.split(","))
.map(Integer::parseInt)
.collect(Collectors.toList());
// 97. How do you capitalize the first letter of each word in a list of strings?
List<String> capitalizedWords = stringList.stream()
.map(word -> word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase())
.collect(Collectors.toList());
// 98. How do you navigate a nested map of lists?
Map<String, Map<String, List<Integer>>> nestedMap = Map.of(
"Group1", Map.of("Category1", List.of(1, 2)),
"Group2", Map.of("Category2", List.of(3, 4))
);
List<Integer> values = nestedMap.values().stream()
.flatMap(subMap -> subMap.values().stream())
.flatMap(List::stream)
.collect(Collectors.toList());
// 99. How do you retrieve the first element of any Stream?
int firstElement = numbers.stream()
.findFirst()
.orElseThrow();
// 100. How do you convert a Stream of key-value pairs into a Map?
Stream<Map.Entry<Integer, String>> entryStream = Stream.of(
Map.entry(1, "One"),
Map.entry(2, "Two")
);
Map<Integer, String> mapFromStream = entryStream
.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));