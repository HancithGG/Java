class Payment {
    void processPayment() {
        System.out.println("Processing payment");
    }
}

class CashPayment extends Payment {
    void processPayment() {
        System.out.println("Cash payment successful");
    }
}

class CardPayment extends Payment {
    void processPayment() {
        System.out.println("Card payment successful");
    }
}

class UPIPayment extends Payment {
    void processPayment() {
        System.out.println("UPI payment successful");
    }
}

class Main {
    public static void main(String[] args) {

        Payment p;

        p = new CashPayment();
        p.processPayment();

        p = new CardPayment();
        p.processPayment();

        p = new UPIPayment();
        p.processPayment();
    }
}
