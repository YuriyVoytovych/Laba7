import java.util.Scanner;

public class Lab74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = " ";
        String second = " ";
        String number1 = String.valueOf((int) (Math.random() * 4));
        String number2 = String.valueOf((int) (Math.random() * 4));
        String number3 = String.valueOf((int) (Math.random() * 4));
        String number = number1.concat(number2).concat(number3);
        System.out.println(number);
        System.out.println("Введіть число: ");
        first = sc.next();
        if(first.equals(number)){
            System.out.println("Вітаю, ви виграли!");
        }
        else{
            System.out.println("Ви помилились, у вас залишилась одна спроба! Введіть число: ");
            second=sc.next();
            if(second.equals(number)){
                System.out.println("Вітаю, ви виграли!");
            }
            else{
                System.out.println("Ви програли. Спробуйте ще раз!");
            }
        }
    }
}
