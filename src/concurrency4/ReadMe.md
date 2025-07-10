# Problem statement

- Given an array of 1 million random numbers,
  divide the array into N chunks (N = number of available cores).
- Figure out how to find the number of available cores.
    - Runtime available processors.

Implement `SumMultiThreadCallable` which will take in List, start index, end index
and return the sum of that part of the array.

In the `SumCalculation` class:
- find the number of available cores.
- divide the array into multiple parts.
- and pass them to executor service.


# Implement a `BankAccount` class with a balance.

- Create multiple threads representing depositors and withdrawers.
- Simulate a race condition where multiple users deposit and withdraw simultaneously.

- Fix the issue using:
- `synchronized` methods
- `synchronized` blocks
-
Measure execution time with and without synchronization.