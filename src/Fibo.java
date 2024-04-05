public class Fibo implements Runnable {

    int num1;
    int num2;
    int num3;

    int amountOfDig;
    public Fibo(int num1, int num2, int num3, int amountOfDig) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.amountOfDig = amountOfDig;

    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum3() {
        return num3;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    public int getAmountOfDig() {
        return amountOfDig;
    }

    public void setAmountOfDig(int amountOfDig) {
        this.amountOfDig = amountOfDig;
    }

    public void calculate() {
        try {
            for (int i = 0; i < amountOfDig; i = i + 1) {
                Thread.sleep(10); // delay
                num3 = num1 + num2;
                System.out.println(num3);
                num1 = num2;
                num2 = num3;

            }
        }catch (Exception ex) {
        }
    }
    public void run() {
        calculate();
    }

}
