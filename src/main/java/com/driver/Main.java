package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();

        obj.setName("Raj");

        System.out.println(obj.getName());
    }

}