package Class_Program_2;

import.java.until.ArrayList;
public class ArrayList {

	public static void main(String[] args) {
		ArrayList<UserDetails> arr = new ArrayList<UserDetails>();
		UserDetails mUserDetails = new UserDetails(10, "Ramu");
		arr.add(mUserDetails);
		arr.add(new UserDetails(20, "Guru"));
		arr.add(new UserDetails(30, "Raju"));
		arr.add(new UserDetails(240, "Somu"));
		arr.add(new UserDetails(260, "Ranjith"));
		arr.add(new UserDetails(270, "Ravi"));
		arr.add(new UserDetails(290, "Ram"));
		arr.add(new UserDetails(280, "Raja"));
		arr.add(new UserDetails(2760, "Raju"));
		arr.add(new UserDetails(2540, "Keerthana"));
		arr.add(new UserDetails(250, "etc"));
		
		arr.remove(5);
//		arr.remove(mUserDetails);
		arr.contains(mUserDetails);
		arr.indexOf(mUserDetails);
		
		arr.forEach(userDetails -> {
			System.out.println(userDetails.name+" : "+userDetails.getIndex());
		});
		

	}

}
