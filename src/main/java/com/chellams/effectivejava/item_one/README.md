# Consider Static Factory Method over constructor
## Static Factory method:
Static Factory method is used to create a new instance of a specific class. Factory pattern is totally different from static factory method. Both are not same.

eg:
```java
public static Boolean valueOf(boolean b){
    return b? Boolean.TRUE? Boolean.False;
}
```

The above method is used create a `Boolean` object from `boolean` primitive.

#### 1. We can have Static Factory methods instead of having multiple constructors. If we have multiple constructors use user would be confused which needs to be used as it has different number of parameters. We can have readable name for static factory methods which can easy for user to use the method. eg : `MultipleConstructors` 

#### 2. We can reuse the objects existing objects using static factory methods. But constructor wil create new object everytime. We can utilise the SingleTon pattern here. eg `ReuseObjects`

#### 3. We can return any subtype of a return type of the Static Factory method. For example, `EnumSet` has two subtypes `RegularEnumSet` and `JumboEnumSet`. If the `enumset` size is less than 64, it will return RegularEnumSet. Else return `JumboEnumSet`. eg `ParentObject`

#### 4. When there is a parameterized class, (like Map), it would be lenghty and diffult to read when declaring a variable. For eg:
```java
Map<String, List<String>> m = new HashMap<String,List<String>>();
```
The above declaration can be simplified by following if we have a Static Factory method.
```java
public static <K,V> HashMap<K,V> newInstance(){
    return new HashMap<K,V>();    
}
```
This ca be initialised by
```java
HashMap<String,List<String>> m = HashMap.newInstance();
```

In this way we can handle any number of types.
