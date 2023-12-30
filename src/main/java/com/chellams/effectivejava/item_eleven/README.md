# Favor composition over inheritance

1. We should not extend an ordinary class. We should extend only the class which is designed for inheritance.
   Inheritance here mentioned is about implementation inheritance not extends. Implementing inheritance on an ordinary
   class is an error-prone.
2. Inheritance violates the encapsulation principle
3. Subclass depends on superclass. If anything changed on superclass will affect the subclass. So subclass needs to be
   updated even though there is no changes needed in subclass.
4. `ErrorHashsetImpl` is perfect example not to implement the ordinary class. But still can be solved by using
   `forwarding methods` technique.