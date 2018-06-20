package com.altman.common.exception;

public class ControllerException extends RuntimeException{

    public ControllerException () {
        super();
    }

    public ControllerException (String msg) {
        super(msg);
    }
}
