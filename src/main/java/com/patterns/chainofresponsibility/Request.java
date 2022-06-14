package com.patterns.chainofresponsibility;

public class Request {
    private String email;
    private String senderCode;

    public Request(String email, String senderCode) {
        this.email = email;
        this.senderCode = senderCode;
    }

    public String getEmail() {
        return email;
    }

    public String getSenderCode() {
        return senderCode;
    }
}
