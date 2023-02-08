package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

        static Pattern pattern = Pattern.compile("^([a-zA-Z0-9.]+)@([a-zA-Z0-9.]+).([a-zA-Z]{2,5})$");
        public static void main(String[] args)
        {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter Email ID: ");
            String emailId = s.next();
            Matcher matcher = pattern.matcher(emailId);
            if(matcher.matches())
                System.out.println(true);
            else
                System.out.println(false);
        }
}
