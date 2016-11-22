package com.vamshi._05_passing_behavior_in_OOP;

/**
 * Created by vamshins on 11/22/2016.
 */
public class Main {

    public void greet(Greeting greeting){
        greeting.perform();
    }

    public static void main(String[] args) {
        Main main = new Main();
        HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
        main.greet(helloWorldGreeting);
    }
}
