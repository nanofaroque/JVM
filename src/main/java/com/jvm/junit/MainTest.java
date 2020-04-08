package com.jvm.junit;

public class MainTest {
    public static void main(String[] args) throws Exception {
        SimpleUnitTester tester = new SimpleUnitTester();
        tester.execute(Class.forName("com.jvm.junit.Reflection"));
    }
}
