public class Main {
    public static void main(String[] args) {

        int price = 835;
        int mile = 20;
        int bonus;

        if (price >= 20) {
            bonus = price / mile;
        } else {
            bonus = 0;
        }

        System.out.println(("Начислено бонусных миль - ") + (bonus)) ;


    }
}