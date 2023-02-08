package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

    static Pattern pattern = Pattern.compile("^([a-z]{8,})$");
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Password:");
        String password = s.next();
        Matcher matcher = pattern.matcher(password);
        if(matcher.matches())
            System.out.println(true);
        else
            System.out.println(false);
    }
}
