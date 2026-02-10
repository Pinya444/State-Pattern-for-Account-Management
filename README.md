# State-Pattern-for-Account-Management

This project implements the **State Design Pattern** to manage the lifecycle of bank accounts. By encapsulating state-specific behavior into separate classes, we eliminate the need for cumbersome conditional statements (`if-else` or `switch`) and improve code maintainability.


| State | Deposits/Withdrawals | Transitions Allowed |
| :--- | :--- | :--- |
| **Active** | ✅ Allowed | Suspend, Close |
| **Suspended** | ❌ Blocked | Activate, Close |
| **Closed** | ❌ Blocked | None (Terminal State) |
