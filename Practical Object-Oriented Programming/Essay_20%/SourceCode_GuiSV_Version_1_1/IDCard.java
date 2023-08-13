public class IDCard {
      private int IDNumber;
      private String fullName;
      private String sex;
      private String date;
      private String address;
      private int phoneNumber;

      public IDCard (int IDNumber, String fullName, String sex, String date, String address, int phoneNumber) {
            this.IDNumber = IDNumber;
            this.fullName = fullName;
            this.sex = sex;
            this.date = date;
            this.address = address;
            this.phoneNumber = phoneNumber;
      }
      public int getIDNumber() {
		return IDNumber;
	}
	public void setIDNumber(int IDNumber) {
		this.IDNumber = IDNumber;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
      public String toString () {
            return this.IDNumber + "," + this.fullName + "," + this.sex + "," + this.date + "," + this.address + "," + this.phoneNumber;
      }
}
