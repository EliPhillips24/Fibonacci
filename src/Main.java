import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
      /*  Scanner fiboObj = new Scanner(System.in);
        System.out.println("Number One");
        String Number1 = fiboObj.nextLine();
        System.out.println("Number Two");
        String Number2 = fiboObj.nextLine();
        System.out.println("Amount Of Times");
        String amountOfTime = fiboObj.nextLine();

*/
       // Fibo fib = new Fibo(Integer.parseInt(Number1), Integer.parseInt(Number2), 0, Integer.parseInt(amountOfTime));
        Fibo fib = new Fibo(0, 1, 0,12);
        Thread thread1 = new Thread(fib);
        thread1.start();

        Fibo fib1 = new Fibo(12, 3, 0,11);
        Thread thread2 = new Thread(fib1);
        thread2.start();

        Fibo fib2 = new Fibo(3, 20, 0,4);
        Thread thread3 = new Thread(fib2);
        thread3.start();




        // fib.run();

     
    }
}