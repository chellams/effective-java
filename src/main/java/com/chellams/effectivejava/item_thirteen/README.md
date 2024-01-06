# Prefer interface to abstract class

1. Existing classes can be easily implemented with interfaces, but cannot be retrofitted with abstract classes. Because
   if two classes wants to extend the abstract class, abstract class should be placed one level up for those two
   classes.But in case of interface we don't need to maintain the hierarchy.
2. We can achieve multiple inheritance using interfaces but not with abstract classes. `Rapper.class` implements
   both `Singer` and `Lyricist` interfaces. In this way we can achieve the multiple inheritance. In case of abstract
   classes, we need to have separate implementation classes for both `Singer` and `Lyricist`. If **n** types in the
   system, we need 2^n possible combination implementations we may need implement. This is
   called `combinatorial explosion`.
3. Interfaces are safe and powerful function enhancements via wrapper class or method forwarding
   technique([item_twelve](https://github.com/chellams/effective-java/tree/7ca4455fa6db3008956e4a95678c2e4370bc64eb/src/main/java/com/chellams/effectivejava/item_twelve)).
4. Both abstract class and interfaces are used as types. But when we go for asbtarct class as type, we will be facing
   the bloated hierarchy as we discussed in the Point number 2.
5. One advantage of abstract class over interface is, once the interface is released and widely deployed, it cannot be
   changed. whereas in abstract class it is possible to add new methods whenever needed. So we need to test it properly
   with multiple implementation before its getting released.

To summarize,interface is a best way to define types and permits multiple implementations.
