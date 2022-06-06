package com.niit.intercativeDemo.sprint7;

import java.time.LocalDate;
import java.util.Date;

public class CreditCardValidator {
    public boolean isValidCard(CreditCard creditCard){
        boolean response = false;
        if(creditCard.getCardNumber().length() == 16){
            if(creditCard.getCvv() >= 100 && creditCard.getCvv() <= 999 ){
                if(creditCard.getExpiryDate().after(new Date("06/06/2022"))){
                  response = true;
                }
            }
        }
        return response;
    }
}
