package principle.Assignment;

public class ReverseHello implements Runnable {

    public int num;

    public ReverseHello(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        if (num > 0){
            System.out.println("Hello from Thread " + num);
            num --;
            new Thread(new ReverseHello(num)).start();
        }
    }

    public static void main(String[] args) {

        ReverseHello reverseHello = new ReverseHello(50);
        new Thread(reverseHello).start();
    }
}
