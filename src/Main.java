public class Main {
    public static void main(String[] args) {

        float balance = 100.24F;
        float refill = 2100.12F;
        int bonus;
        if (refill > 1000) {
            bonus = (int)refill / 100;
        } else {
            bonus = 0;
        }
    balance = balance + refill + bonus;
    System.out.println(balance);

    }
}