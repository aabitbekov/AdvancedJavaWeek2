package ServletsClasses;

public class User {
	private int UserID = 0;
	private String name;
	private String Surname;
	private String email;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return Surname;
	}
	public double getUserID() {
		return UserID;
	}
	public void setUserID(int userID) {
		UserID = userID++;
	}
	public void setSurname(String surname) {
		Surname = surname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	


}
