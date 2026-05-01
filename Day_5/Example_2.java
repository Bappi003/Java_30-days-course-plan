class Bank {
    void getInterestRate() {
        System.out.println("0%");
    }
}
class SBI extends Bank {
    @Override
    void getInterestRate() {
        System.out.println("5%");
    }
}
class ICICI extends Bank {
    @Override
    void getInterestRate() {
        System.out.println("7%");
    }
}
public class Main {
    public static void main(String[] args) {
        Bank myBank;
        myBank = new SBI();
        myBank.getInterestRate();
        myBank = new ICICI();
        myBank.getInterestRate();
    }
}
