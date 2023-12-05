# Consider Static Factory Method over constructor
## Static Factory method:
Static Factory method is used to create a new instance of a specific class. Factory pattern is totally different from static factory method. Both are not same.

eg:
```
public static Boolean valueOf(boolean b){
    return b? Boolean.TRUE? Boolean.False;
}
```

The above method is used create a `Boolean` object from `boolean` primitive.

#### 1. We can have Static Factory methods instead of having multiple constructors. If we have multiple constructors use user would be confused which needs to be used as it has different number of parameters. We can have readable name for static factory methods which can easy for user to use the method. 

#### 2. 

