package com.events;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by caleb.carvalho on 09/09/2014.
 */
public class MoodObject {

    private Mood _mood = Mood.HAPPY;
    private List _listener = new ArrayList();

    public synchronized void receivePinch(){

        if(_mood==Mood.HAPPY){
            _mood=Mood.ANNOYED;
            _fireMoodEvent();
        }else{
            _mood=Mood.ANGRY;
            _fireMoodEvent();
        }

    }
    public synchronized void ReceiveHug(){

        if(_mood==Mood.ANGRY){
            _mood=Mood.ANNOYED;
            _fireMoodEvent();
        }else{
            _mood=Mood.HAPPY;
            _fireMoodEvent();
        }
    }

    public synchronized void addMoodListener(MoodListener l){

        _listener.add(l);
    }

    public synchronized void removeMoodListener(MoodListener l){

        _listener.remove(l);
    }

    private synchronized void _fireMoodEvent(){
        MoodEvent mood = new MoodEvent(this,_mood);

        Iterator listener = _listener.iterator();

        while (listener.hasNext()){
            ((MoodListener)listener.next()).moodReceived(mood);
        }
    }

}
