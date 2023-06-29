package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
class User{
    String fname;
    String lname;
    String email;
    String mobile;
    // String pass = "";

    public User(String fname, String lname, String email, String mobile) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.mobile = mobile;
        // this.pass = pass;
    }

    public void checkValidity(){
        Pattern fnamePattern = Pattern.compile("^[A-Z][A-za-z]{3,}") ;
        Pattern lnamePattern = Pattern.compile("^[A-Z][A-za-z]{3,}") ;
        Pattern emailPattern = Pattern.compile("^abc([.]xyz)*@bl[.]co([.]in)*") ;
        Pattern mobilePattern = Pattern.compile("91 [0-9]{10}") ;
        // Pattern passPattern = "  [A]+";
        /* exactly one special char
         atleast one numeric and one upper case
         min length 8  */

        Matcher fnameMatcher = fnamePattern.matcher("" + fname + "");
        Matcher lnameMatcher = lnamePattern.matcher("" + lname + "");
        Matcher emailMatcher = emailPattern.matcher("" + email + "");
        Matcher mobileMatcher = mobilePattern.matcher("" + mobile + "");

        boolean fnameOk = fnameMatcher.matches();
        boolean lnameOk = lnameMatcher.matches();
        boolean emailOk = emailMatcher.matches();
        boolean mobileOk = mobileMatcher.matches();

        System.out.println(fname + " -- fname matched?: " + fnameOk);
        System.out.println(lname + " -- lname matched?: " + lnameOk);
        System.out.println(email + " -- email matched?: " + emailOk);
        System.out.println(mobile + " -- mobile matched?: " + mobileOk);
    }

}

public class DetailsValidityRegex {

    public static void main(String[] args) {

        User u1 = new User("Rafe", "Shaikh", "abc@bl.co", "91 9876543210");
        System.out.println("User 1");
        u1.checkValidity();

        System.out.println(" \n User 2");
        User u2 = new User("rafe", "shaikh", "ab@abl.co", "19 9876543210");
        u2.checkValidity();

        System.out.println(" \n User 3");
        User u3 = new User("Ra", "sh", "abc@bl.co.in", "91 98765");
        u3.checkValidity();
    }
}
