package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@FunctionalInterface
interface Fname{
    boolean fNameCheck(String s);
}

@FunctionalInterface
interface Lname{
    boolean lNameCheck(String s);
}

@FunctionalInterface
interface Email{
    boolean emailCheck(String s);
}

@FunctionalInterface
interface Mobile{
    boolean mobileCheck(String s);
}

// implements Fname, Lname, Email, Mobile
public class UserValidityLambda {
    String fname;
    String lname;
    String email;
    String mobile;
    // String pass = "";

    public UserValidityLambda(String fname, String lname, String email, String mobile) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.mobile = mobile;
        // this.pass = pass;
    }

    public static void main(String[] args) {

        UserValidityLambda u1 = new UserValidityLambda("Rafe", "Shaikh", "abc@bl.co", "91 9876543210");

        Fname fn = (String s) -> Pattern.matches("^[A-Z][A-za-z]{3,}", s);
        Lname ln = (String s) -> Pattern.matches("^[A-Z][A-za-z]{3,}", s);
        Email em = (String s) -> Pattern.matches("^abc([.]xyz)*@bl[.]co([.]in)*", s);
        Mobile mob = (String s) -> Pattern.matches("91 [0-9]{10}", s);

        System.out.println("First name --" +  u1.fname  +  "-- valid? " + fn.fNameCheck(u1.fname));
        System.out.println("Last name --"+  u1.lname  +  "-- valid? " + ln.lNameCheck(u1.lname));
        System.out.println("Email --" + u1.email + "-- valid? " + em.emailCheck(u1.email));
        System.out.println("Mobile --" + u1.mobile + "-- valid? " + mob.mobileCheck(u1.mobile));
    }

}