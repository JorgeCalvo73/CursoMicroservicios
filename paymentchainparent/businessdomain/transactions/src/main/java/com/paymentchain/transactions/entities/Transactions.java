/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.paymentchain.transactions.entities;

import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
import lombok.Data;

/**
 *
 * @author sotobotero
 */
@Entity
@Data
public class Transactions {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private String reference;
    private String accountIban;
    private LocalDateTime date;   
    private double amount;
    private double fee; 
    private String description;
    private String status;
    private String channel;
}
