public class EWallet implements Payment, Transfer {
	private int phoneNumber;
	private double accountBalance;

	public EWallet (int phoneNumber) {
		this.phoneNumber = phoneNumber;
		this.accountBalance = 0;
	}
	public int getPhoneNumber() {
		return this.phoneNumber;
	}
	public boolean pay(double amount){
		if (amount <= accountBalance) {
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
		if (accountBalance >= totalAmount) {
			this.accountBalance -= totalAmount;
			if (to instanceof BankAccount) {
				BankAccount ba = (BankAccount) to;
				ba.topUp(amount);
			} else {
				EWallet e = (EWallet)to;
				e.topUp(amount);
			}
			return true;
		}
		return false;
	}

	public void topUp (double amount) {
		this.accountBalance += amount;
	}
	public String toString () {
		return this.phoneNumber + "," + this.accountBalance;
	}
} 
