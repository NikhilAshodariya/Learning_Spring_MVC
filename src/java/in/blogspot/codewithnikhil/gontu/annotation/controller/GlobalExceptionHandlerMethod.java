package in.blogspot.codewithnikhil.gontu.annotation.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandlerMethod
{
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(value = NullPointerException.class)
    public String handleNullPointerException(Exception ex)
    {
        System.out.println("Null pointer exception occureed in Student Admission Controller");
        /**
         * The returning parameter should be a view name
         */
        return "NikhilNullPointerExceptionHandling";
    }
    
}
