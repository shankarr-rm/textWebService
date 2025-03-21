package com.jeran.calwebservice;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
    public interface TextWebService {

        @WebMethod
        public String reverseText(String text);

        @WebMethod
        public int countCharactes(String text);
    }
