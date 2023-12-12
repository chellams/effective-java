# Avoid creating unnecessary objects

#### 1. Create a string literal rather creating new objects

```java
String s=new String("test");
```

The above code creates a new string every time its called.

```java
String s="test";
```

The above code can reuse the same "test" string is available in a String pool.

#### 2.We can use the `Static Factory` methods to reuse the existing objects. Because constructor will create a new objects whenever it's called.

#### 3. Reuse the immutable objects rather creating it again and again. (`ReuseImmutableObject.calss`)

#### 4. Avoid creating object pool for heavyweight objects. Create object pool if its taking time to instantiate the object and those objects are lightweight. For example, database connections objects will take considerably more time than other objects. So we can have/use the connection pool for databse conection objects.  
