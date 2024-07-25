package com.xipeng.myexception;

public class AgeOutOfBoundException extends RuntimeException {
    public AgeOutOfBoundException() {
    }

    public AgeOutOfBoundException(String message) {
        super(message);
    }
}
