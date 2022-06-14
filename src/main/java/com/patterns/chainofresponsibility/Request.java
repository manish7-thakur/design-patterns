package com.patterns.chainofresponsibility;

public class Request {
    private String email;
    private String senderCode;
    private String receiverCode;

    public Request(String email, String senderCode, String receiverCode) {
        this.email = email;
        this.senderCode = senderCode;
        this.receiverCode = receiverCode;
    }

    public String getEmail() {
        return email;
    }

    public String getSenderCode() {
        return senderCode;
    }

    public String getReceiverCode() {
        return this.receiverCode;
    }
}
