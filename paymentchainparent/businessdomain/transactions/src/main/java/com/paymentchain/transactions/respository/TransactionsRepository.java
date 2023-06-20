/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.paymentchain.transactions.respository;

import com.paymentchain.transactions.entities.Transactions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author sotobotero
 */
public interface TransactionsRepository extends JpaRepository<Transactions, Long> {
    
    @Query("SELECT c FROM Customer c WHERE c.code = ?1")
    public Transactions findByCode(String code);
    
    @Query("SELECT c FROM Customer c WHERE c.iban = ?1")
    public Transactions findByAccount(String iban);
}
