
public class Main {
    public static void main(String[] args) {
        Telephone phone = new Telephone();
        phone.call();
        phone.sendMessage();
        phone.screen = 6.0;
        phone.cpu = 1.8;
        phone.mem = 128;
        phone.show();

        Telephone phone1 = new Telephone(6.5, 1.7, 256);
        phone1.show();

    }
}