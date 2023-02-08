package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

        static Pattern pattern = Pattern.compile("^([A-Z]{1}[a-z]{2,})$");
        public static void main(String[] args)
        {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter Last name: ");
            String name = s.next();
            Matcher matcher = pattern.matcher(name);
            if(matcher.matches())
                System.out.println(true);
            else
                System.out.println(false);
        }
}
