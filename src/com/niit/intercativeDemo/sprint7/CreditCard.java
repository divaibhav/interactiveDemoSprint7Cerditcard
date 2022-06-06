package com.niit.intercativeDemo.sprint7;

import java.util.Date;
import java.util.Objects;

public class CreditCard {
    private String cardNumber;
    private String cardHolderName;
    private int cvv;
    //Date or LocalDate
    private Date expiryDate;

    public CreditCard(String cardNumber, String cardHolderName, int cvv, Date expiryDate) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "cardNumber='" + cardNumber + '\'' +
                ", cardHolderName='" + cardHolderName + '\'' +
                ", cvv=" + cvv +
                ", expiryDate=" + expiryDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CreditCard)) return false;
        CreditCard o1 = (CreditCard) o;
        return getCvv() == o1.getCvv() && Objects.equals(getCardNumber(), o1.getCardNumber()) && Objects.equals(getCardHolderName(), o1.getCardHolderName()) && Objects.equals(getExpiryDate(), o1.getExpiryDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCardNumber(), getCardHolderName(), getCvv(), getExpiryDate());
    }


}
