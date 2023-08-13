public class BankAccount implements Payment, Transfer{
    private int accountNumber;
    private double interestRate;
    private double accountBalance;

    public BankAccount (int accountNumber, double interestRate) {
        this.accountNumber = accountNumber;
        this.interestRate = interestRate;
        this.accountBalance = 50;
    }
	public int getAccountNumber () {
		return this.accountNumber;
	}
	public boolean pay(double amount){
		if (amount + 50 <= accountBalance) {
			this.accountBalance -= amount;
			return true;
		}
		return false;
	}
    public double checkBalance(){
		return this.accountBalance;
	}
	public boolean transfer (double amount, Transfer to){
	    double totalAmount = amount + (amount * Transfer.transferFee);
		if (this.accountBalance >= totalAmount + 50) {
			this.accountBalance -= totalAmount;
            if (to instanceof EWallet) {
				EWallet e = (EWallet)to;
				e.topUp(amount);
			} else {
				BankAccount ba = (BankAccount)to;
                ba.topUp(amount);
			}
			return true;
		}
		return false;
	}

    public void topUp (double amount) {
		this.accountBalance += amount;
	}
    public String toString () {
        return this.accountNumber + "," + this.interestRate + "," + this.accountBalance;
    }
}
