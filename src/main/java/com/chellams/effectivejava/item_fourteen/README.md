# Use interfaces only to define types

1. Interfaces should only be used to define types. For example `Vehicle` is a interface which can be implemented
   on `Car` class. So `Car` becomes `Vehicle` type.
2. Interfaces cannot be used to hold constants. It's the poor usage of interfaces. `InterfaceConstants.class`
   demonstrates the poor usage of interfaces. Rather we can define constants in the non-instantiable utility
   classes (`ClassConstants.class`).
