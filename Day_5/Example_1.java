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
