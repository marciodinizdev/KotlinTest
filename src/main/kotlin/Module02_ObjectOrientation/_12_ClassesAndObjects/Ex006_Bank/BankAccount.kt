package Module02_ObjectOrientation._12_ClassesAndObjects.Ex006_Bank

class BankAccount (
    val accountNumber: String,
    private var balance: Double
) {
    fun deposit(amount: Double) {
        balance += amount
        println("Deposited ${"%.2f".format(amount)} into account $accountNumber. \nNew balance: ${"%.2f".format(balance)}")
    }
    fun withdraw(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("Withdrew ${"%.2f".format(amount)} from account $accountNumber. \nNew balance: ${"%.2f".format(balance)}")
        } else {
            println("Insufficient funds in account $accountNumber.")
        }
    }
    fun getBalance() {
        println("Current balance: ${"%.2f".format(balance)}")
    }
    // "%.2f".format(variable) grants two decimal places to the variable
}