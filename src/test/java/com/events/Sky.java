package com.events;

/**
 * Created by caleb.carvalho on 09/09/2014.
 */
public class Sky implements MoodListener {

    @Override
    public void moodReceived(MoodEvent event) {
        if(event.mood()==Mood.HAPPY){
            System.out.println("Sun is Shinning!");
        }

        else if(event.mood()==Mood.ANNOYED){
            System.out.println("Cloudy skies !");
        }
        else{
            System.out.println("Lighting rains from the heavens! ");
        }
    }
}
