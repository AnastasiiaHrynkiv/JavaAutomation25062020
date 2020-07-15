package com.ahryn.nameaddress;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NameAddress {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Hello. What is your name? ");
        String name = br.readLine();
        System.out.println("Where do you live," + name + "?");
        String address = br.readLine();

        System.out.println("Hello " + name);
        System.out.println("You live in " + address);
    }
}
