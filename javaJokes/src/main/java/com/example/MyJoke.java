package com.example;

import java.util.Random;

public class MyJoke {
    public static String getJoke() {
        String[] jokes;
        Random random;
        jokes = new String[3];
        jokes[0] = "This is totally a funny joke";
        jokes[1] = "Are you ill?\n" +"No, just felling abit off :D ";
        jokes[2] = "Why do programmers always mix up Halloween and Christmas?\n" + "Because Oct 31 equals Dec 25.";
        random = new Random();
        return jokes[random.nextInt(jokes.length)];
    }
}
