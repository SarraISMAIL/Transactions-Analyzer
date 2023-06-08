/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transactionall;

/**
 *
 * @author Sarra ISMAIL
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class TransactionALL {
    private String phoneNumber;
    private String description;
    private double amount;
    private Date date;

    public TransactionALL(String phoneNumber, String description, double amount) {
        this.phoneNumber = phoneNumber;
        this.description = description;
        this.amount = amount;
        this.date= date;
    }

    // Getters and setters

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }
    
    public Date getDate() {
        return date;
    }

}
