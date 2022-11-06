package org.example.exception;


import java.sql.Timestamp;
import java.util.Date;

/**
 * @author "Khazratov Aslonbek"
 * @since 10/07/2022 00:58 (Monday)
 * quiz-app-console-master/IntelliJ IDEA
 */
public class ValidationException extends RuntimeException{

    private Timestamp timestamp;

    public ValidationException(String message){
        super(message);
        this.timestamp = new Timestamp(new Date().getTime());
    }
}
