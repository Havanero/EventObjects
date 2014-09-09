package com.events;

import org.junit.Test;

/**
 * Created by caleb.carvalho on 09/09/2014.
 */
public class TestEvents {

    MoodObject moodObject = new MoodObject();
    MoodListener sky = new Sky();

    @Test
    public void CheckSkyEvent(){

        moodObject.addMoodListener(sky);

        System.out.println("");
        System.out.println("Lets Hug");
        moodObject.ReceiveHug();

        System.out.println("");
        System.out.println("Make it Angry");
        moodObject.receivePinch();
        moodObject.receivePinch();




    }

}
