package com.junit;
/**
 * UC1 :- As a User need to enter a valid First Name
 *        - First name starts with Cap and has minimum 3 characters
 * UC2 :- As a User need to enter a valid Last Name
 *        - Last name starts with Cap and has minimum 3 characters
 */

/**
 *  import matcher class and pattern class
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationProblem {
    /**
     * create  method name as isValidUsername this is parameterised
     * In this method function to validate the username
     * @param firstname of string
     * @return username
     */
    public static boolean isValidUsername(String firstname) {

        /**
         *  Regex to check valid username.
         *  \\w means any word character, short for [a-zA-Z_0-9]
         */
        String regex = "^[A-Za-z]\\w{3,29}$";

        /**
         *  Compile the Regex
         */
        Pattern p = Pattern.compile(regex);
        /**
         * If the username is empty
         *  return false
         */
        if (firstname == null) {
            return false;
        }
        /**
         * Pattern class contains matcher() method to find matching between given username
         * and regular expression.
         */
        Matcher m = p.matcher(firstname);
        /**
         * Return if the username matched the Regex
         */
        return m.matches();
    }

    /**
     * Create a method name as isValidUserLastName, this is parameterized method
     * Function to validate the userlastname
     * @param lastname
     * @return userlastname
     */
    public static boolean isValidUserLastName(String lastname)
    {
        /**
         *  Regex to check valid userlastname.
         */
        String regex = "^[A-Za-z]\\w{3,29}$";

        /**
         *  Compile the ReGex
         */
        Pattern p = Pattern.compile(regex);
        /**
         * If the userlastname is empty, then return false
         */
        if (lastname == null) {
            return false;
        }
        /**
         * Pattern class contains matcher() method to find matching between given userlastname
         * and regular expression.
         */
        Matcher m = p.matcher(lastname);
        /**
         * Return if the userlastname matched the Regex
         */
        return m.matches();
    }


    /**
     * create a main method , all program execute in main method
     * @param args no arguments
     */
    public static void main(String[] args) {

        /**
         *  Test Case: 1
         */
        String str1 = "Saurabh";
        System.out.println(isValidUsername(str1));
        /**
         * Test Case: 2
         */
        String str2 = "Vaidya";
        System.out.println(isValidUserLastName(str2));
    }
}