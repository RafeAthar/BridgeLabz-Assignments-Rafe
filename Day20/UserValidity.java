import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidity {

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


    public boolean checkFname(){
        Pattern fnamePattern = Pattern.compile("^[A-Z][A-za-z]{3,}") ;
        Matcher fnameMatcher = fnamePattern.matcher("" + fname + "");
        boolean fnameOk = fnameMatcher.matches();
        return fnameOk;
    }

    public boolean checkLname(){
        Pattern lnamePattern = Pattern.compile("^[A-Z][A-za-z]{3,}") ;
        Matcher lnameMatcher = lnamePattern.matcher("" + fname + "");
        boolean lnameOk = lnameMatcher.matches();
        return lnameOk;
    }

    public boolean checkEmail(){
        Pattern emailPattern = Pattern.compile("^abc([.]xyz)*@bl[.]co([.]in)*") ;
        Matcher emailMatcher = emailPattern.matcher("" + email + "");
        boolean emailOk = emailMatcher.matches();
        return emailOk;
    }

    public boolean checkMobile(){
        Pattern mobilePattern = Pattern.compile("91 [0-9]{10}") ;
        Matcher mobileMatcher = mobilePattern.matcher("" + mobile + "");
        boolean mobileOk = mobileMatcher.matches();
        return mobileOk;
    }

}





//
//        System.out.println(" \n User 2");
//                UserRegistration u2 = new UserRegistration("rafe", "shaikh", "ab@abl.co", "19 9876543210");
//                u2.checkValidity();
//
//                System.out.println(" \n User 3");
//                UserRegistration u3 = new UserRegistration("Ra", "sh", "abc@bl.co.in", "91 98765");
//                u3.checkValidity();