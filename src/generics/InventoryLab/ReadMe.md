# Lab session - Inventory Management System

## Milestone 1:
Implement `Item` class which would further be extended by

Item has following attributes:
- id
- name
- price
- quantity

Item
----Book ----> author
----Clothing --->size
----Electronics ---> warranty


## Milestone 2
Implement class `Inventory` which should be a generic class supporting all different types of Items
hashmap <id -> Item>
Inventory<T>

- add(Item)
- remove(Item)
- get(id)
- getAll() -> List<Items>


## Milestone 3
Implement `RecentlyViewItems` class that should have 2 methods:
- RecentlyViewItems(int limit)
- addRecentlyViewedItem(Item item)
- getRecentlyViewedItems()

A -> add(A)
B -> add(B)
get() -> [B, A]
C -> add(C)
get() -> [C, B, A]
D -> add(D)
get() -> [D, C, B]
C -> add(C)
get() -> [C, D, B]
