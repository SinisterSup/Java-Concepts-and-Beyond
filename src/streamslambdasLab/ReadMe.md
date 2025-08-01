#  Streams & Lambdas Lab Session

### Q1
- Implement a function that takes in a `List<Items>`
- Extracts id of each item
- Print each Id.
- Implement using streams API

### Q2
- filter out a list of item names in lowercase
- print them individually

### Q3
- Generate a list of the lengths(item_names).

### Q4
- Find all the items priced above 1000
- print their names

### Q5 - Perform the following, in a single stream pipeline:
1. Filter items with price > 1000 and quantity > 0.
2. Extract item names
3. Remove duplicates
4. Sort names alphabetically
5. Limit to Top 5 result
6. Collect into a list and print.

### Q6
- findFirst
  - find out first item which has quantity > 0
- use anyMatch
  - find if any of items are out-of-stock i.e quantity == 0
- use allMatch
  - say true if all items are in-stock
- use noneMatch
  - check if any of the items are priced below 5