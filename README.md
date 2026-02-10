# State-Pattern-for-Account-Management

This project implements the **State Design Pattern** to manage the lifecycle of bank accounts. By encapsulating state-specific behavior into separate classes, we eliminate the need for cumbersome conditional statements (`if-else` or `switch`) and improve code maintainability.

---

## 🏗️ Core Components

### 1. State Interface (`AccountState.java`)
The interface defines the operations that vary depending on the account's state.

```java
public interface AccountState {
    void deposit(Account account, Double depositAmount);
    void withdraw(Account account, Double withdrawAmount);
    void activate(Account account);
    void suspend(Account account);
    void close(Account account);
}
