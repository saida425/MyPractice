package com.dl.two;

class UserProfile {
	int userId;
	String userName;
	long contactNumber;
	String city;

	public UserProfile(int userId, String userName, long contactNumber, String city) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.contactNumber = contactNumber;
		this.city = city;
	}

}

class UserDetails {
	int userDetailsId;
	UserProfile[] userProfile;// HAS A relationship(data number)

	public UserDetails(int userDetailsId, UserProfile[] userProfile) {
		super();
		this.userDetailsId = userDetailsId;
		this.userProfile = userProfile;
	}

	public void getDetails() {
		System.out.println(userDetailsId);
		for (UserProfile userProfile : userProfile) {
			System.out.println(userProfile.userId);
			System.out.println(userProfile.userName);
			System.out.println(userProfile.contactNumber);
			System.out.println(userProfile.city);
		}
	}
}

public class Eg1 {

	public static void main(String[] args) {
		UserProfile userProfile = new UserProfile(1, "sai", 985373888, "Hyd");
		UserProfile[] profiles = { userProfile };
		UserDetails details = new UserDetails(1, profiles);
		details.getDetails();
	}

}
