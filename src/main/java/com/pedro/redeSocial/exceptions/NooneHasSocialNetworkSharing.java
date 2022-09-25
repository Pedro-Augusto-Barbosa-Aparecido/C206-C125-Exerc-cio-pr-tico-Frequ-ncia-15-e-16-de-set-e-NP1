package com.pedro.redeSocial.exceptions;

import java.util.concurrent.ExecutionException;

public class NooneHasSocialNetworkSharing extends Exception {
    public NooneHasSocialNetworkSharing() {
    }

    public NooneHasSocialNetworkSharing(String message) {
        super(message);
    }

    public NooneHasSocialNetworkSharing(String message, Throwable cause) {
        super(message, cause);
    }

    public NooneHasSocialNetworkSharing(Throwable cause) {
        super(cause);
    }

    public NooneHasSocialNetworkSharing(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
