public class Lab73 {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 102);
        System.out.println("Згенероване число: "+number);
        if(number<10){
            System.out.println("Довжина згенерованого числа дорівнює 1");
        }
        else if (number>=10 && number<100) {
            System.out.println("Довжина згенерованого числа дорівнює 2");
        }
        else {
            System.out.println("Довжина згенерованого числа дорівнює 3");
        }
    }
}
