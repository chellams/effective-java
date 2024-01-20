# Use function objects to represent strategies

PS: This topic is about before Java 8.

1. Java doesn't support function pointers or function as parameter(Before Java 8). However it can be achieved by passing
   the `function objects`. `StringLengthComparator.class` demonstrate the function object strategy. This example
   contains the concrete strategy. We can use this only to compre two strings always.
2. To make a generic approach, we can have the interface which can be implemented by other classes with whatever
   functionality they want. For example, IntComparator compares the two integers and which can be used to sort the list.
   eg. `MainTest.class`.
3. Still we are passing `new IntComparator()` to sort function in `MainTest.class` which will create new object every
   time. This can be overcome by introducing singleton object. Whenever we call sort method, we can reuse the singleton
   object. eg `MainTest.class`
4. Still we can enhance it by making the Strategy class as private and expose its instance as public static or
   Singleton. In this way we don't need to have it as a separate class.
