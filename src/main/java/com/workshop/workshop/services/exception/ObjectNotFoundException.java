package com.workshop.workshop.services.exception;

public class ObjectNotFoundException extends RuntimeException{
        public ObjectNotFoundException(String msg){
            super(msg);
        }
}
