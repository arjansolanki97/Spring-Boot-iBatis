package com.anjaneya.ibatis.exception;

public class UserIdNotFoundException extends RuntimeException{
    public UserIdNotFoundException()
    {
        super("User Id Not Found");
    }
}