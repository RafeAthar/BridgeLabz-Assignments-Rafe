import org.example.InvalidEmailException;
import org.example.InvalidFnameException;
import org.example.InvalidLnameException;
import org.example.InvalidMobileException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class UserValidity{

    String fname;
    String lname;
    String email;
    String mobile;
    // String pass = "";

    public UserValidity(String fname, String lname, String email, String mobile) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.mobile = mobile;
        // this.pass = pass;
    }

    public void checkFname() throws InvalidFnameException {
        Pattern fnamePattern = Pattern.compile("^[A-Z][A-za-z]{3,}") ;
        Matcher fnameMatcher = fnamePattern.matcher("" + fname + "");
        boolean fnameOk = fnameMatcher.matches();
        if(!fnameOk){
            throw new InvalidFnameException("First name is not valid");
        }else{
            System.out.println("First name Valid");
        }
    }

    public void checkLname() throws InvalidLnameException {
        Pattern lnamePattern = Pattern.compile("^[A-Z][A-za-z]{3,}") ;
        Matcher lnameMatcher = lnamePattern.matcher("" + fname + "");
        boolean lnameOk = lnameMatcher.matches();
        if(!lnameOk){
            throw new InvalidLnameException("Last name is not valid");
        }else{
            System.out.println("Last name Valid");
        }
    }

    public void checkEmail() throws InvalidEmailException {
        Pattern emailPattern = Pattern.compile("^abc([.]xyz)*@bl[.]co([.]in)*") ;
        Matcher emailMatcher = emailPattern.matcher("" + email + "");
        boolean emailOk = emailMatcher.matches();
        if(!emailOk){
            throw new InvalidEmailException("Email is not valid");
        }else{
            System.out.println("Email Valid");
        }
    }

    public void checkMobile() throws InvalidMobileException {
        Pattern mobilePattern = Pattern.compile("91 [0-9]{10}") ;
        Matcher mobileMatcher = mobilePattern.matcher("" + mobile + "");
        boolean mobileOk = mobileMatcher.matches();
        if(!mobileOk){
            throw new InvalidMobileException("Mobile Number is not valid");
        }else{
            System.out.println("Mobile Valid");
        }
    }

}


public class UserValidationEx {

    public static void main(String[] args) {
        UserValidity u1 = new UserValidity("Rafe", "Shaikh", "abc@bl.co", "91 9876543210");

        try{
            u1.checkFname();
        }catch(InvalidFnameException e){
            e.printStackTrace();
        }

        try{
            u1.checkLname();
        }catch(InvalidLnameException e){
            e.printStackTrace();
        }

        try{
            u1.checkEmail();
        }catch(InvalidEmailException e){
            e.printStackTrace();
        }

        try{
            u1.checkMobile();
        }catch(InvalidMobileException e){
            e.printStackTrace();
        }


    }
}
