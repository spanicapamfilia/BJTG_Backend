package org.example.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "db_card")
public class CardData {

    @Id
    private String cardnumber;
    private String cardholder;
    private String expirydate;
    private String securitycode;

    public String cardnumber(){
        return  cardnumber;
    }
    public void setCardNumber(){
        this.cardnumber = cardnumber;
    }
    public String cardholder(){
        return cardholder;
    }
    public  void setCardHolder(){
        this.cardholder = cardholder;
    }
    public String expirydate(){
        return expirydate;
    }
    public void setExpirydate(){
        this.expirydate = expirydate;
    }

    public String securitycode(){
        return securitycode;
    }

    public void setSecurityCode(){
        this.securitycode = securitycode;
    }



}
