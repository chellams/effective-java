# Design and document for inheritance or prohibit it

1. Class must document the self-use overridable methods. For example HashSet addAll method is internally calling add().
   If inherit the HashSet, we might endup with the problem that we discussed
   in [item_eleven](https://github.com/chellams/effective-java/blob/2b21c72035f5413d3cecea280644f391f0e352a9/src/main/java/com/chellams/effectivejava/item_eleven/MainTest.java#L10).
2. We need to test a inheritance with at least three or more subclasses.
3. Constructor must not invoke the overridable methods. For example, `Child` class extending the `Parent` class. Parent
   class is calling `overrideMethod()` in its constructor. So `overrideMethod()` will be executed before `Child`
   constructor executed in `Child` class. We have initialized `Date` object in Child constructor. So we will get
   NullPointerException when access Date object before Child constructor executed.
4. If a class implements `Cloneable` or `Serializable` interface, there are some difficulties in extending such classes.
   Because `clone()` and `readObject()` method directly/indirectly calls overridable methods.

   **i)** There is a possibility os calling `readObject()` method before the subclass is fully deserialized.

   **ii)** There is a possibility of calling `clone()` method before subclass `clone()` runs.
   But if we want to implement the Serializable class, we should make the `readResolve()` and `writeReplace()` methods *
   *protected** not **private**.

To be summarized, we should not exend the class which is not designed for inheritance and properly documented. Still if
we need to do that, we can use the `Method Forwarding` or `Wrapper Class` approach mentioned
in [item_eleven](https://github.com/chellams/effective-java/blob/2b21c72035f5413d3cecea280644f391f0e352a9/src/main/java/com/chellams/effectivejava/item_eleven/ProperHashImpl.java#L6).
