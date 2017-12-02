package com.example.javajokes;

import java.util.ArrayList;
import java.util.List;

public class Jokes {

    private static final List<String> jokeList = new ArrayList<String>();


    static{
        jokeList.add("Anton, do you think I'm a bad mother?\nMy name is Paul.");
        jokeList.add("My dog used to people on a bike a lot. It got so bad, I finally had to take his bike away.");
        jokeList.add("What is the difference between a snowman and snowwoman?\nSnowballs");
        jokeList.add("You know how it is in life. One door closes - that means another door opens...\nYeah, very nice, but you either" +
                "fix that door or I'm expecting a serious discount on that car!");
        jokeList.add("Men 1845: I just killed a buffalo.\nMen 1952: I just fixed the roof.\nMen 2017: I just shaved my legs");
    }

    public static int getJokeListSize(){
        return jokeList.size();
    }

    public static String getJoke(int index){
        return jokeList.get(index);
    }
}
