//Consider the following Java program where a base class Payment is extended by three subclasses: CashPayment, CardPayment, and UPIPayment. Each subclass overrides the processPayment() method.
class Payment {
    void processPayment() {
        System.out.println("Processing payment");
    }
}

class CashPayment extends Payment {
    void processPayment() {
        System.out.println("Cash payment successful");
    }
    void walletname(){
        System.out.println("brown leather");
    }
}

class CardPayment extends Payment {
    void processPayment() {
        System.out.println("Card payment successful");
    }
    void cardname(){
        System.out.println("sbi");
    }
}

class UPIPayment extends Payment {
    void processPayment() {
        System.out.println("UPI payment successful");
    }
    void appname(){
        System.out.println("phonePe");
    }
}

class Main {
    public static void main(String[] args) {

        Payment p;

        p = new CashPayment();
        p.processPayment();
        p.walletname(); // unable to access though parent reference

        p = new CardPayment();
        p.processPayment();
        p.cardname();    // unable to access though parent reference

        p = new UPIPayment();
        p.processPayment();
        p.appname();    // unable to access though parent reference
    }
}
