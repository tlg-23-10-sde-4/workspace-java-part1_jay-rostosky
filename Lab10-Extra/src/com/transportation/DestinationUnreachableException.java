package com.transportation;

public class DestinationUnreachableException extends Exception {

    public DestinationUnreachableException() {
        super();
    }

    public DestinationUnreachableException(String message) {
        super(message);
    }

    public DestinationUnreachableException(Throwable cause) {
        super(cause);
    }

    public DestinationUnreachableException(String message, Throwable cause) {
        super(message, cause);
    }
}