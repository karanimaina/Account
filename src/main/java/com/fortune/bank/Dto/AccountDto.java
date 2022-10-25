package com.fortune.bank.bank.Dto;

import com.fortune.bank.bank.model.Type;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Enumerated;

@Data
public class AccountDto {

    private Type type;
    private String accountNumber;
    private  String branchAddress;
    private long customerId;
}
