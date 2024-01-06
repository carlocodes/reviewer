# Transaction Management Attributes

Transaction attributes define how transactions should behave in different scenarios. These
attributes can be specified using annotations (e.g., `'@Transactional'`) or XML configuration
in Spring. The key transaction attributes include:

1. Propagation:
Propagation defines the behavior of a transaction when a method is called that is already
within a transactional context or when a method is called from a non-transactional context.

Propagation Types:

- `'REQUIRED'`
  - Supports a current transaction, creating a new one if none exists.
- `'SUPPORTS"`
  - Supports a current transaction, executing non-transactionally if none exists.
- `'MANDATORY'`
  - Requires a current transaction, throwing an exception if none exists.
- `'REQUIRES_NEW'`
  - Creates a new transaction, suspending the current transaction if one exists.
- `'NOT_SUPPORTED'`
  - Executes non-transactionally, suspending the current transaction if one exists.
- `'NEVER'`
  - Executes non-transactionally, throwing an exception if a transaction exists.

Usage and Example:

- Used to define how transactions should propagate between methods.
```
@Transactional(propagation = Propagation.REQUIRED)
public void methodWithRequiredPropagation() {
    // Transactional business logic
}
```

2. Isolation:
Isolation determines how the changes made by one transaction are visible to other concurrent
transactions. It deals with the level of independence between transactions.

Isolation Levels:

- `'DEFAULT'`
  - The default isolation level.
- `'READ_UNCOMMITED'`
  - Allows dirty reads, non-repeatable reads, and phantom reads.
- `'READ_COMMITED'`
  - Prevents dirty reads, allows non-repeatable reads, and allows phantom reads.
- `'REPEATABLE_READ'`
  - Prevents dirty reads and non-repeatable reads, allows phantom reads.
- `'SERIALIZABLE'`
  - Prevents dirty reads, non-repeatable reads, and phantom reads.

Usage and Example:

- Used to control the level of isolation between concurrent transactions:
```
@Transactional(isolation = Isolation.READ_COMMITED)
public void methodWithReadCommitedIsolation() {
    // Transactional business logic
}
```

3. Timeout
Timeout defines the maximum time a transaction is allowed to run before being automatically
rolled back if it hasn't completed.

Usage and Example:

- Used to prevent long-running transactions that might lead to performance issues or resource
contention.
```
@Transactional(timeout = 60) // 60 seconds timeout
public void methodWithTimeout() {
    // Transactional business logic
}
```

4. ReadOnly:
ReadOnly specifies whether the transaction is read-only, meaning it doesn't modify the
database.

Usage and Example:

- Used when a method only reads data and doesn't perform any write operations to optimize
database access.
```
@Transactional(readOnly = true)
public void readOnlyMethod() {
    // Read-only transactional business logic
}
```

5. Rollback Rules:
Rollback Rules specify exceptions for which the transaction should be automatically rolled
back.

Usage and Example:

- Used to control which exceptions trigger a transaction rollback.
```
@Transactional(rollbackFor = CustomException.class)
public void methodWithRollbackForCuustomException() throws CustomException {
    // Transactional business logic
    if (somethingBadHappened) {
        throw new CustomException("Something went wrong");
    }
}
```

### Scenarios and Use Cases:

1. Propagation:
- Nested Transactions
  - Use `'Propagation.REQUIRES_NEW'` when you want to ensure that a specific method is
  executed in a new transaction, independently of the calling method's transaction.

2. Isolation:
- Concurrent Data Modification
  - Use `'Isolation.READ_COMMITED'` when multiple transactions might be modifying the same
  data concurrently, and you want to prevent dirty reads.

3. Timeout
- Preventing Deadlocks
  - Use `'timeout'` to prevent long-running transactions that might contribute to database
  deadlocks or resource contention.

4. ReadOnly:
- Read-Only Operations
  - Use `'readOnly'` for methods that only read data and don't modify the database,
  optimizing performance.

5. Rollback Rules:
- Specific Exception Handling
  - Use `'rollbackFor'` to specify exceptions that should trigger a transaction rollback,
  ensuring proper error handling.

### Why do we have each transaction attribute?

1. Propagation:
Allows developers to manage how transactions propagate between methods, providing
flexibility in transactional behavior.

2. Isolation:
Ensures data consistency in concurrent environments by specifying the level of isolation
between transactions.

3. Timeout:
Prevents long-running transactions that could lead to performance issues, deadlocks, or
resource contention.

4. ReadOnly:
Optimizes performance by indicating that a method only reads data and doesn't modify the
database.

5. Rollback Rules:
Provides control over transaction rollback based on specific exceptions, ensuring proper
error handling and data consistency.

### Best Practices

1. Choose Appropriate Propagation:
Select the propagation type based on the desired behavior for nested transactions or
non-transactional methods.

2. Consider Isolation Levels Carefully:
Understand the data access patterns and concurrency requirements to choose an appropriate
isolation level.

3. Use Timeout Wisely:
Set timeouts based on the experienced duration of a transaction, preventing potential
performance bottlenecks.

4. ReadOnly for Read-Only Operations:
Use `'readOnly'` for methods that only read data to optimize database access.

5. Specify Rollback Rules Cautiously:
Specify `'rollbackFor'` only for exceptions that genuinely indicate a need for transaction
rollback.

Understanding and appropriately using these transaction attributes is crucial for designing
and implementing robust and performant transaction management strategies in Spring
applications.
