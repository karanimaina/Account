package com.fortune.bank.Dto;

import com.fortune.bank.model.Type;
import lombok.Data;

import java.util.Date;

@Data
public class AccountDto {
    private Type type;
    private  String branchAddress;
    private String accountNumber;
    private long customerId;
    private Date creatdate = new Date();
}
