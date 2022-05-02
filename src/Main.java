public class Main {
    public static void main(String[] args) {

        int balance = 100;
        int replenishment = 500;
        int bonus;
        if (replenishment == 500) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }
        int totalBalance = balance + replenishment + bonus;
        System.out.println(" Баланс " + totalBalance + " Бонус " + bonus);
    }

}