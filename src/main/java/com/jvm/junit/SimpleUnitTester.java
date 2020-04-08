package com.jvm.junit;

import java.lang.reflect.Method;

public class SimpleUnitTester {

    public int execute(Class clazz) throws Exception {
        int failedCount = 0;

        // your code
        Method[] method = clazz.getDeclaredMethods();
        for (Method m : method) {
            if (m.getName().startsWith("test") && m.getReturnType() == boolean.class) {
                failedCount++;
            }
        }
        System.out.println(failedCount);
        return failedCount;
    }

}
