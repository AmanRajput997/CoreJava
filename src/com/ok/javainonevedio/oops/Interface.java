package com.ok.javainonevedio.oops;

public class Interface {
}
/*
// Interface
interface Mobile{
    int numberofbatteries = 1;
    //static final  numberofbatteries = 1;
    void makeCall();
}
interface MusicPlayer{
    void playMusic();
}
class SmartPhone implements Mobile,MusicPlayer{
    public void makeCall(){
        System.out.println("Making call...");
    }

    @Override
    public void playMusic() {

    }
}
*/
/*
interface Payment {
    double getAmount();
    // other payment details...
}
interface PaymentValidator{
    boolean validatePayment(Interface payment);
    // static utility method - helper functions related to validation
    static boolean isvalidateCreditCard(String carNumber) {
        return cardNumber.length() == 16;
    }
    static boolean isValidAmount(double amount){
        return amount > 0 && amount < 1000000;

    }
}
class PayPalValidator implements PaymentValidator{
    public boolean validatePayment(Interface payment) {
        // First use static utility method
        if(!PaymentValidator.isValidAmount(payment.getAmount())) {
            return false;
        }
        // then do PayPal specific validation
        return true;
    }
}
 */
// A simple class to represent a payment
interface Payment {
    double getAmount();
    // other payment details...
}

interface PaymentValidator {
    boolean validatePayment(Payment payment);

    // static utility method - helper functions related to validation
    static boolean isValidateCreditCard(String cardNumber) {
        return cardNumber.length() == 16;
    }

    static boolean isValidAmount(double amount) {
        return amount > 0 && amount < 1000000;
    }
}

class PayPalValidator implements PaymentValidator {
    public boolean validatePayment(Payment payment) {
        // First use static utility method
        if (!PaymentValidator.isValidAmount(payment.getAmount())) {
            return false;
        }
        // then do PayPal specific validation
        System.out.println("Amount is valid. Proceeding with PayPal validation...");
        return true;
    }
}
