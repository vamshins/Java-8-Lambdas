package com.vamshi._06_passing_behavior_in_OOP;

/**
 * Created by vamshins on 11/22/2016.
 */
public class HelloWorldGreeting implements Greeting{
    @Override
    public void perform(){
        System.out.println("Hello World");
    }
}
