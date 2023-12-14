# Avoid finalizers

## Reasons to not use finalizers.

1. There is no guarantee that finalizers will executed.

2. It takes longer time between object becomes unreachable and finalization of the object.

3. Finalizer execution will be varied with one JVM implementation with another JVM implementation. Because in some scenarios, finalizer thread will be run in lower priority.

4. If any exception occurs in the finalize method, those errors won't be logged. So the specific object becomes corrupted. We may invoke this corrupted object unknowingly and will lead to severe issues.

5. There is a severe performance penalty for finalize methods. Objects without finalize are many times faster than the objects with finalizer.

6. If any subclass extending parent class which has `finalize()` method, then its subclass's responsibility to call the finalize method. If subclass is not invoke, then parent class `finalize()` method won't be called.

7. Subclass should call the parent class finalize method in try-finally. Because if any exception occurs in subclass's `finalize()`, at least parent class `finalize()` will be executed.

In summary, it's not recommended to use finalize() 

PS: `finalize()` is deprecated since Java 9. So, no examples are provided.
