# Enforce Singleton property using constructor/static property

Singleton class creates one object per application at anytime. There are multiple ways to create a singleton class.

### 1. Singleton object can be created using public static field (`PublicStaticSingleton`)

### 2. Singleton can be created using static factory methods (`StaticFactorySingleton`)

Above methods will create single instance per application, but when we call it from multithreaded environments, we might
end up with multiple instances.

### 3. Singleton can be created using Lazy initialization method (`LazySingleton`)

Using lazy initialization method, we can avoid creating multiple instances in multithreaded environment. But still we
can create multiple instances in two situations

- Serialization and Deserialization

  When we implement the Serialization interface on a singleton class, `readResolve()` method will create a new instance.
  Still it's resolvable by overriding `readResolve()` method.
    ```
     public Singleton readResolve(){
        return INSTANCE;
     }
    ```
- Reflection

  Using Class.newInstance() method we can create multiple instance for a singleton class. Because newInstance() will
  look for default constructor even it's a private.

### 4. Best approach/solution to create Singleton class would be enum. (`EnumSingleton`)
 