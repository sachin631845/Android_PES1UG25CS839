//PESIUG25CS839
open class BankAccount(
    var accName: String,
    val accNumber: Int,
    var balance: Int = 0
) {
    open fun displayInfo() {
        println("Account holder: $accName")
        println("Account number: $accNumber")
        println("Balance: $balance")
    }
}

class SavingAccount(
    accName: String,
    accNumber: Int,
    val interestRate: Float
) : BankAccount(accName, accNumber) {

    fun credit(amount: Int) {
        balance += amount
    }

    fun debit(amount: Int) {
        balance -= amount
    }

    override fun displayInfo() {
        super.displayInfo()
        println("Interest rate: $interestRate%")
    }
}

fun main() {
    val account = SavingAccount("John", 12345, 4.5f)

    account.credit(5000)
    account.debit(1000)
    account.displayInfo()
}