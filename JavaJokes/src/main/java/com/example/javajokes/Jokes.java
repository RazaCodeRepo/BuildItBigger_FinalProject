package com.example.javajokes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Jokes {

    private static final List<String> jokeList = new ArrayList<String>();
    private static final Random rand = new Random();


    static{
        jokeList.add("Anton, do you think I'm a bad mother?\nMy name is Paul.");
        jokeList.add("My dog used to chase people on a bike a lot. It got so bad, I finally had to take his bike away.");
        jokeList.add("You know how it is in life. One door closes - that means another door opens...\nYeah, very nice, but you either " +
                "fix that door or I'm expecting a serious discount on that car!");
        jokeList.add("Men 1845: I just killed a buffalo.\nMen 1952: I just fixed the roof.\nMen 2017: I just shaved my legs");
        jokeList.add("Father: Son, you were adopted.\nSon: What? I knew it! I want to meet my biological parents" +
                "\nFather: We are your biological parents Now pack up, the new ones will you pick you up in 20 minutes");
    }

    public static int getJokeListSize(){
        return jokeList.size();
    }

    public static String getJoke(){
        int index = rand.nextInt(jokeList.size());
        return jokeList.get(index);
    }
}
