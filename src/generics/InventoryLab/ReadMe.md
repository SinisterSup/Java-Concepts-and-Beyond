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
