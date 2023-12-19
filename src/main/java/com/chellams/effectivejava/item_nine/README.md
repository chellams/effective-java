# In public class, use accessors, not public fields

1. We want to have some degenerate classes which will be used to group instance fields. Those fields should be private
   and should be accessed using public accessors. Those class should not be public. (`Data.class`)

2. If the class is package-private class, then it's fields don't need to be public.

3. Still we can have public fields with only read-only access. When we write values to those fields using constructor,
   we can have some invariants (`PublicFields.class)`.