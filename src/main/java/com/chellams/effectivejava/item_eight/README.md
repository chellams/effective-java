# Minimize the accessibility of Class and Methods

1. Make the class, interfaces and members as inaccessible as possible. Class can be public if its declared as public. We
   didn't mention public, the class becomes package-private(`default` access)

2. If we declare a package-private class/interface which can be deleted whenever we need to delete. If it's a public and
   exported to other modules, it's our responsibility to maintain forever.

3. Instance fields should never be public.
    - public members in an immutable objects are not thread safe.
    - We cannot limit the immutable objects fields, if the object is public
    - Constants can be `public static final` which will be either primitive or immutable object.
    - Final field contains the reference of mutable objects, has all the disadvantages of non-final field. Reference
      cannot be modified. But reference object can be modified.
    - Non-zero length of public static final array is always mutable. We can modify the contents of
      array. (`ArrayExample` and `AccessibilityTest` are demonstrates this use-case). It can be avoided by returning thr
      clone of the object.
