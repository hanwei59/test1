package com.ofpay.test;

/**
 * Created with IntelliJ IDEA.
 * User: hanwei
 * Date: 13-10-29
 * Time: 下午1:26
 * To change this template use File | Settings | File Templates.
 */
public class TestSingleton {
    private static TestSingleton ourInstance = new TestSingleton();

    public static TestSingleton getInstance() {
        return ourInstance;
    }

    private TestSingleton() {
    }
}
