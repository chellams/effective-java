# Enforce non-instantiability with private constructor

#### 1. Usually if we have static fields and static methods in class which can avoid the instantiation by making the private constructor. But it still can be instantiated using Reflection. So we should throw the exception in private constructor.

#### 2. If there is no constructor is available, then the JVM will create the default (parameterless) constructor. If there is any constructor is available, JVM won't create any constructor.

#### 3. Side effect of having private constructor is , it cannot be subclassed ot extended.
