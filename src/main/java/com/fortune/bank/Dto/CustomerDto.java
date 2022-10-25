package com.fortune.bank.bank.Dto;

import com.fortune.bank.bank.auditing.AuditorBase;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDate;

@Data
public class CustomerDto  {
    private String username;
    private String email;
    private String mobileNumber;
}
