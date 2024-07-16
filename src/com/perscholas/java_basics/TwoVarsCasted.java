package com.perscholas.java_basics;

public class TwoVarsCasted {
    public static void main(String[] args){
        int x = 5;
        int y = 6;
        double q = (double)y/x;

        System.out.println("The result is, " + q);
        q = (double) y;

        System.out.println("The result when doubled is " + q);
        System.out.printf("");

    }
}
