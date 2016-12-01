// Creating a registration class.
public class Registration {

  // creating variable to store customer information.
  private String firstName;
  private String lastName;
  private String address;
  private int zipCode;
  //.matches(\\d{5});
  private char[] state;
  private String userName;
  // Should program store user names and alert usre if user name is already taken?
  private String password;
  private String email;
  // check for valid email address.
  // most common email TLD's: .aero .biz .com .coop .edu .gov .info .int .mil .museum
  // .name .net .org .pro

  private String SSN;
  private securityQuestion;

// check first/last name for invalid characters (e.g. numbers, dashes).
// check address for invalid characters.
// check that zipcode is only numbers - omit last four digits.
// Check that US state is valid.

//State abbreviations stored in a String array? or Switch-case or something?
// AL AK AZ AR CA CO CT DE FL GA HI ID IL IN IA KS KY LA ME MD MA MI MN MS MO MT NE NV
// NH NJ NM NY NC ND OH OK OR PA RI SC SD TN TX UT VT VA WA WV WI WY





} // end registration class.


public static void main(String[] args) {

  System.out.println("Please enter your LOGIN information below");
  System.out.println("If you have n ot yet registered, please click \"REGISTER\" below");
  System.out.println("First Name:");
  System.out.println("Last Name:");
  System.out.println("Address:");
  System.out.println("Zip Code: ");
  System.out.println("State:");
  System.out.println("Username:");
  System.out.println("Password:");
  System.out.println("Email Address:");
  System.out.println("Social Security Number:");
  System.out.println("Please select one of the Secuirty Questions below: ");

//need to find out how the security questions will be prompted to user
  //currnetly not prompting anything - link to login?
  
  String secQues1 = "What town were you born in?";
  String secQues2 = "What highschool did you graduate from?";
  String secQues3 = "What was your favorite pet's name?";
  String secQues4 = "What is you Mother's maiden name?";
  String secQues5 = "Who is your favorite artist/singer?";

} // end main.
