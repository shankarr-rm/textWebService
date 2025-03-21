package com.jeran.calwebservice;

import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
    public class TextWebServiceImpl implements TextWebService {

    @Override
    public String reverseText(String text) {
        return new StringBuilder(text).reverse().toString();
    }

    @Override
    public int countCharactes(String text) {
        return text.length();
    }
}
