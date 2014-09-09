package com.events;

/**
 * Created by caleb.carvalho on 09/09/2014.
 */
public class Birds implements MoodListener {
    @Override
    public void moodReceived(MoodEvent event) {
        if(event.mood()==Mood.HAPPY){
            System.out.println("Hey Birds Are Happy");
        }
        else if(event.mood()==Mood.ANNOYED){
            System.out.println("Oh no Birds are Not Happy");
        }else{
            System.out.println("ARRGG Births fly away!");
        }
    }
}
