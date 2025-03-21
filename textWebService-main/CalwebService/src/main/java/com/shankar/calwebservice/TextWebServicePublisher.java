package com.jeran.calwebservice;

import jakarta.xml.ws.Endpoint;

public class TextWebServicePublisher {
    public static void main(String[] args) {

        String address = "http://localhost:8080/calculatorWebService";

        Endpoint.publish(address, new TextWebServiceImpl());

        System.out.println("Calculator Web Service is running at " + address);

        TextWebService textWebService =  new TextWebServiceImpl();

        String reversed = textWebService.reverseText("Hello");
        int count = textWebService.countCharactes("Hello");

        System.out.println("Reversed: " + reversed);
        System.out.println("Character Count: " + count);
    }
}
