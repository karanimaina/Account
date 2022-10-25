package com.fortune.bank.exceptions;

public class CustomerDoesNotExist extends IllegalArgumentException {
    public CustomerDoesNotExist(String s) {
        super(s);
    }
}
