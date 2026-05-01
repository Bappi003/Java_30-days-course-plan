#  Eample !
~~~ java
class Language {
    void display() {
        System.out.println("Common Language");
    }
}
class German extends Language {
    @Override
    void display() {
        System.out.println("German Language");
    }
}
class Python extends Language {
    @Override
    void display() {
        System.out.println("Python Programming Language");
    }
}
public class Main {
    public static void main(String[] args) {
        Language obj;
        obj = new German();
        obj.display(); 
        obj = new Python();
        obj.display(); 
    }
}
~~~

#  Example 2
~~~ java
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
~~~
