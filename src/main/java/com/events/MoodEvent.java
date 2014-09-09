package com.events;

import java.util.EventObject;
import java.util.Objects;

/**
 * Created by caleb.carvalho on 09/09/2014.
 */
public class MoodEvent extends EventObject {

    private Mood _mood;

    public MoodEvent(Object source, Mood mood){
        super(source);
        _mood= mood;
    }

    public Mood mood(){

        return _mood;
    }
}
