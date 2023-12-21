# Minimize mutability

Mutable class is simple a class whose instances cannot be modified. Information in the instances would be fixed for
lifetime of the objects.

## Rules:

1. Don't provide any method to modify the state of the objects (Mutators)
2. Ensure the class cannot be extended which can be achieved by using `final`.
3. Make all fields final. It ensures the correct behaviour of the instance when it passed from one thread to another
   without synchronization.
4. Make all fields private. Its is permissible to have the public final fields of primitives and reference to the
   immutable objects. But it's not recommended.
5. Ensure exclusive access to the mutable components. If your class has the reference to the mutable class, make sure
   that clients of the class cannot access the reference to those objects.

Example mutable class is `ImmutableComplex`.

a) You can see that add function is just returning the new `ImmutableComplex` instance instead of modifying the object.
This is called `Functional` approach. Functional approach is returning the result of applying the function to their
operand without modifying it.

Contrast to Functional approach is `Procedural` or `Imperative` approach which apply the procedure on the operand and
modifying its state.

b) Functional approach enables the immutability.

c) Immutable objects are inherently thread safe, and it doesn't require synchronization. So immutable objects can be
shared freely. So we never have to make a `defensive copies`. Because copies are equivalent to the original objects as
its never changed. So we don't need to have the `Copy Constructors` or `clone()` method.

d) The only disadvantage of immutable class is, it requires the separate object for each distinct value. Creating these
objects are costly if they are large objects.So, always make the small value object as immutable.

e) Another way to precludes the extension of the subclass by making the constructor private or package private.
CannotExtendChild cannot extend the CannotExtend as it's constructor is private. In this approach we can use the Static
Factory methods to initialise the objects and reuse the existing objects to improve the performance.

f) In case, any client sends the untrusted BigInteger instance, we can ensure the type in Static factory method. This
approach provides the security.

g) Exceptionally, we can have few or more non-final fields, to cache the results of expensive computation. For example,
String object has the `hash` which will calculate the hashcode value. It will be recalculated only if the contents
changed.

h) One caveat to have the immutable is serializability. If the immutable class implements `Serializable`, then we should
have the explicit `readObject` and `readResolve` method.

To be precise, Classes should be immutable unless there is a concrete reason to make them mutable.
