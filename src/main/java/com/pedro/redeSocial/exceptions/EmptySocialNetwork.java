package com.pedro.redeSocial.exceptions;

public class EmptySocialNetwork extends Exception {
    public EmptySocialNetwork(String message) {
        super(message);
    }

    public EmptySocialNetwork(String message, Throwable cause) {
        super(message, cause);
    }

    public EmptySocialNetwork(Throwable cause) {
        super(cause);
    }

    public EmptySocialNetwork(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public EmptySocialNetwork() {
    }
}
