import java.time.Year;
public class ConvenientCard implements Payment{
    private String type;
	private double accountBalance;
	private IDCard idCard;

	public ConvenientCard (IDCard idCard) throws CannotCreateCard {
		this.idCard = idCard;
		this.accountBalance = 100;
		String date = this.idCard.getDate();
		String [] dateArr = date.split("/");
		int year = Integer.parseInt(dateArr[2]);
		int age = Integer.parseInt(Year.now()+"") - year;
		if (age < 12) {
			throw new CannotCreateCard ("Not enough age");
		} else if (age <= 18) {
			this.type = "Student";
		} else {
			this.type = "Adult";
		}
	}
	public IDCard getIDCard () {
		return this.idCard;
	}
	public String getType() {
		return this.type;
	}
	public boolean pay(double amount){
		if (this.getType().equals("Student")) {
			if (amount <= accountBalance){
				this.accountBalance -= amount;
				return true;
			} else {
				return false;
			}
		} else {
			if (amount * 1.01 <= accountBalance) {
				this.accountBalance -= (amount * 1.01);
				return true;
			} else {
				return false;
			}
		}
	}
    public double checkBalance(){
		return this.accountBalance;
	}
	public void topUp (double amount) {
		this.accountBalance += amount;
	}
	public String toString () {
		return this.idCard + "," + this.type + "," + this.accountBalance; 
	}
}
