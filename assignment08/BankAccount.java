package ttt.java;

import java.util.Random;

public class BankAccount {

    private final Object lock = new Object();
    private double balance;

    public BankAccount() {
        balance = 0;
    }

    public void deposit(int amount){
        synchronized (lock) {
            balance += amount;
            System.out.println(Thread.currentThread().getName() + " deposited "+ amount
                    + ", and balance now is " + balance);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void withdraw(int amount){
        synchronized (lock){
            if (balance < amount){
                System.out.println("sorry,you have no enough money");
            }else {
                balance -= amount;
                System.out.println(Thread.currentThread().getName() + " withdrawed " + amount+
                        ", and balance now is " + balance);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    public double getBalance(){
        synchronized (lock){
            return balance;
        }
    }

    //deposit money
    class ClientA implements Runnable{

        Random random = new Random();

        @Override
        public void run() {
            int count = 0;
            while (count < 3){
                int amount = random.nextInt(100);
                deposit(amount);
                count += 1;
            }
        }
    }

    //withdraw money
    class ClientB implements Runnable{

        Random random = new Random();
        @Override
        public void run() {
            int count = 0;
            while (count < 3){
              int amount =  random.nextInt(3);
              withdraw(amount);
              count += 1;
            }
        }
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        ClientA a = bankAccount.new ClientA();
        ClientB b = bankAccount.new ClientB();

        Thread[] threads = new Thread[5];

        for (int i = 0; i < 4; i++) {
            if (i % 2 == 0){
                threads[i] = new Thread(a);
            }else {
                threads[i] = new Thread(b);
            }
        }

        for (int i = 0; i < 4; i++) {
            threads[i].start();
        }

        for (int i = 0; i < 4; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
//print out
//        Thread-0 deposited 62, and balance now is 62.0
//        Thread-3 withdrawed 2, and balance now is 60.0
//        Thread-2 deposited 32, and balance now is 92.0
//        Thread-1 withdrawed 2, and balance now is 90.0
//        Thread-2 deposited 48, and balance now is 138.0
//        Thread-3 withdrawed 0, and balance now is 138.0
//        Thread-0 deposited 35, and balance now is 173.0
//        Thread-3 withdrawed 1, and balance now is 172.0
//        Thread-2 deposited 86, and balance now is 258.0
//        Thread-1 withdrawed 0, and balance now is 258.0
//        Thread-0 deposited 18, and balance now is 276.0
//        Thread-1 withdrawed 0, and balance now is 276.0
