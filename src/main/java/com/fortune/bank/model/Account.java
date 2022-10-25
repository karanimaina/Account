package com.fortune.bank.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import javax.persistence.*;
import java.time.LocalDate;
@Entity
@AllArgsConstructor
//@NoArgsConstructor
//@Getter @Setter
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne
    private Customer customer;
    private Type type;
    @Column(unique = true)
    private String accountNumber;
    private  String branchAddress;
    @CreatedDate
    private LocalDate createDt;
}
