package Module02_ObjectOrientation._12_ClassesAndObjects.Ex006_Bank

fun main() {
    val bankAccount = BankAccount("123456789-0", 1000.00)
    bankAccount.getBalance()
    bankAccount.deposit(500.00)
    bankAccount.withdraw(200.00)
}