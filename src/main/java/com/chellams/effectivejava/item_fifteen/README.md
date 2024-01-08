# Prefer class hierarchies to tagged class

1. Avoid the class having too manny functionalities which are executed based on the tag. For
   example `TaggedClass.class`. If we use the above approach, there is a possibility of runtime exception when we don't
   give proper shape type.
2. Instead of the above approach, use hierarchy approach. `Shape.class` is an interface which is extended
   by `Circle.class` and `Rectangle.class`. Here is there is no possibility of runtime exception.
3. Additional benefit of this approach is, we can reuse the existing class ina special class. For
   example, `Square.class` extends the already implemented `Rectangle.class`. IN this scenario, we don't need to
   override the abstract method.
