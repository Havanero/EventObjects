package com.events;

import org.junit.Test;

/**
 * Created by caleb.carvalho on 09/09/2014.
 */
public class TestEvents {

   static MoodObject moodObject = new MoodObject();
   static MoodListener sky = new Sky();
   static MoodListener births = new Birds();

    public static void main(String args[]){

        moodObject.addMoodListener(sky);
        moodObject.addMoodListener(births);

        Thread thread = new Thread(
         new Runnable() {

            @Override
            public void run() {

                    while (true) {
                        System.out.println("Running thread");
                        System.out.println("");
                        System.out.println("Lets Hug");
                        moodObject.ReceiveHug();
                        System.out.println("");
                        System.out.println("Make it Angry");
                        moodObject.receivePinch();
                        moodObject.receivePinch();
                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        thread.start();



    }

}
