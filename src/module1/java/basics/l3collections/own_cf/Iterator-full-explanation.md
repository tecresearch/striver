## Notes------>
for-loops.
2. **No Redundancy**: The `iterator()` method **is not redeclared** in `Collection`. It is simply **inherited from `Iterable`**, but shown in the `Collection` interface to make the iteration method explicit and clear for developers.
3. **Design Philosophy**: Java collections like `ArrayList`, `HashSet`, and others **must** provide an `iterator()` method, which is made visible through `Collection` (even though inherited from `Iterable`).

---

## **Summary of Key Concepts**

| Interface       | `iterator()` Declaration  | Why Appears Here |
|-----------------|---------------------------|------------------|
| `Iterable<E>`   | Yes                       | Defines the iteration contract for classes to implement. |
| `Collection<E>` | No (inherited)            | Inherited from `Iterable`, shown explicitly for clarity and consistency. |
| `ArrayList<E>`  | Yes (implemented)         | Provides its own implementation of `iterator()` to support iteration. |

---

## **Conclusion**

- The `iterator()` method is **inherited** from `Iterable` to `Collection`.  
- `Collection` does not **redeclare** `iterator()`. It **inherits** it, and the method is visible in the `Collection` interface for clarity.
- **No conflict** arises because of this inheritance.

This design ensures that all collections, such as `ArrayList`, `HashSet`, etc., implement the `iterator()` method, and they can be used seamlessly in enhanced for-loops.

---

itâ€™s an **abstract class** or inherits it from a superclass.

```java
public class MyList<T> implements Iterable<T> {
    public Iterator<T> iterator() {
        // Must provide logic here
    }
}
```

### 2. If a class extends an abstract class like `AbstractList`:
Not necessarily. The method can be inherited.

```java
public class MyArrayList<E> extends AbstractList<E> {
    // No need to override iterator() unless custom behavior is needed
}
```

### Summary Table

| Class Type | Needs to Implement `iterator()`? | Notes |
|------------|-------------------------------|-------|
| Interface (`Collection`, `Iterable`) | **No** | Only declares method (no body). |
| Concrete class implementing `Collection` | **Yes** | Must implement unless inherited. |
| Abstract class | **Optional** | Can declare or implement; subclass must handle it. |
| Extending class with inherited implementation | **No** | Inherits method. |

---

## **Conclusion**

- `iterator()` is inherited from `Iterable` to `Collection`.
- Itâ€™s not **mandatory** to show it in `Collection`, but itâ€™s done for clarity.
- All concrete classes **must implement** it unless inherited.
- `ArrayList` provides its own implementation using an inner `Itr` class.

---
