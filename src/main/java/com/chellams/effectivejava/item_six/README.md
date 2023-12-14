# Eliminate obsolete object reference

#### 1. When a class do the own object memory management, programmer should alert for memory leaks.

#### For example, `CustomStack` implements the Stack datastructure. When we pop out an object, we are just decreasing the index and objects in the size+1 index is still active. This will lead to memory leak. This can be fixed by nulling out the popped object.

#### 2. Second chance of memory leak is, when we implement a cache. There is a chance of some unused objects still maintained in Cache.It can be solved by using two methodologies.

#### i) Using `WeakHashmap` (`WeakHashMapTest.class`) or `LinkedHashmap` (`CustomLinkedHasMap.class`). `WeakHashmap` will remove the nulled out keys, and it's associated entries. `LinkedHashmap` will keep the `initialCapacity` elements in the map and remove rest of the elements.

#### ii) Using `Timer` or `ScheduledThreadPoolExecutor` we can clean up the unused objects.

#### 3.Third memory leak possibility is callbacks and listeners. Client registers some callback and unable to deregister. Those unregistered callbacks may still in server for years. It leads to memory leaks. We can have   