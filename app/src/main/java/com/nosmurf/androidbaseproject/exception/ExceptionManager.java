package com.nosmurf.androidbaseproject.exception;

import com.nosmurf.androidbaseproject.R;

public class ExceptionManager {

    private ExceptionManager() {
        //Empty constructor
    }

    public static int convert(Exception exception) {
        int message = R.string.exception_message_generic;

        // TODO: 23/10/2016 Manage the exceptions.

        return message;
    }

}
