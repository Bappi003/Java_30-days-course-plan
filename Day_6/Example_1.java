interface DataBase {
    void connect();
}
interface Cloud {
    void upload();
}
class SystemServer implements DataBase, Cloud {
    public void connect() {
        System.out.println("Connected to SQL Database");
    }
    public void upload() {
        System.out.println("Data uploaded to Cloud");
    }
}
public class Main {
    public static void main(String[] args) {
        SystemServer server = new SystemServer();
        server.connect();
        server.upload();
    }
}
