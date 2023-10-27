package com.hr;

public class WorkException extends Exception {

    public WorkException() {
        super();
    }

    public WorkException(String message) {
        super(message);
    }

    public WorkException(String message, Throwable cause) {
        super(message, cause);
    }

    public WorkException(Throwable cause) {
        super(cause);
    }
}