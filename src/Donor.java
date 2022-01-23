import java.util.Scanner;


public class Donor extends Person {
	private String bloodbankName;
	private String donorType;
	private String donationDate;
	
	public static Donor theDonor = new Donor();
	
	// blood bank name getter and setter
	public String getBloodbankName() {
		return bloodbankName;
	}
	public void setBloodbankName(String newBloodbankName) {
		this.bloodbankName = newBloodbankName;
	}
	
	// donor Type getter and setter
	public String getDonorType() {
		return donorType;
	}
	public void setDonorType(String newDonorType) {
		this.donorType = newDonorType;
	}
	
	// Donation Date getter and setter
	public String getDonationDate() {
		return donationDate;
	}
	public void setDonationDate(String newDonationDate) {
		this.donationDate = newDonationDate;
	}
	
	// Display all the information
	public static void displayDonationDetails() {
		System.out.println("Donation Details:");
		System.out.println("Name: " + theDonor.getName());
		System.out.println("Date Of Birth: " + theDonor.getDateOfBirth());
		System.out.println("Gender: " + theDonor.getGender());
		System.out.println("Mobile Number: " + theDonor.getMobileNumber());
		System.out.println("Blood Group: " + theDonor.getBloodGroup());
		System.out.println("Blood Bank Name: " + theDonor.getBloodbankName());
		System.out.println("Donor Type: " + theDonor.getDonorType());
		System.out.println("Donation Date: " + theDonor.getDonationDate());
	}
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the name: ");
		String newName = scan.nextLine();
		theDonor.setName(newName);
		
		System.out.println("Enter Date of Birth: ");
		String newDateOfBirth = scan.nextLine();
		theDonor.setDateOfBirth(newDateOfBirth);
		
		System.out.println("Enter Gender: ");
		String newGender = scan.nextLine();
		theDonor.setGender(newGender);
		
		System.out.println("Enter Mobile Number: ");
		String newMobileNumber = scan.nextLine();
		theDonor.setMobileNumber(newMobileNumber);
		
		System.out.println("Enter Blood Group: ");
		String newBloodGroup = scan.nextLine();
		theDonor.setBloodGroup(newBloodGroup);
		
		System.out.println("Enter Blood Bank Name: ");
		String newBloodbankName = scan.nextLine();
		theDonor.setBloodbankName(newBloodbankName);
		
		System.out.println("Enter Donor Type: ");
		String newDonorType = scan.nextLine();
		theDonor.setDonorType(newDonorType);
		
		System.out.println("Enter Donation Date: ");
		String newDonationDate = scan.nextLine();
		theDonor.setDonationDate(newDonationDate);
		
		
		
		displayDonationDetails();
	}
}
