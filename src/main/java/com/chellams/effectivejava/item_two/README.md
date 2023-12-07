# Consider a Builder when we have many constructor parameters.

## Alternative to Builder:

### 1. Telescoping constructors

```java
public class Parent {
    int age; // Optional parameter
    String name; // Required parameters
    String phone; // Optional parameters

    Parent(String name) {
        this(name, "phone");
    }

    Parent(String name, String phone) {
        this(name, phone, 0);
    }

    Parent(String name, String phone, int age) {
        this.name = name;
        this.phone = phone;
        this.age = age;
    }
}
```
In the above approach, we may get confused when the number of optional parameters are increased. 

### 2. Another approach is Java Beans.
Using Java beans we can create an instance using default constructor and initialise using setter methods. But still user might not know which are all the required parameters.

Both above methods has the disadvantages as mentioned. So we prefer Builder.

## Builder:
Builder pattern is recommended when we have handful of parameters over Constructors and Static factory methods. When we have optional and required parameters, we can go for Builder patterns.
Another advantage is, when we initialise a `Class` with `newInstance()` , it will look for default constructor (parameterless constructors). If it's not available, then it will be failed at runtime not at compile time. When we use Builder patter, we can resolve this issue.
Refer: `Student` class
