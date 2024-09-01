package com;

public class FilenameException extends Exception {
   
    public String message;

    public FilenameException(String message){
        this.message = message;
    }

    @Override
    public String getMessage(){
        return String.join("-", super.getMessage(), this.message);
    }


    
}
