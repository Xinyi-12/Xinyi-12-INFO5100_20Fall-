package principle.Assignment;

import java.util.Random;
import java.util.concurrent.*;

public class SumValues implements Callable<Long> {

    private int begin;
    private static int ARRAY_LENGTH = 4000000;
    private static int ARRAY_LENGTH02 = ARRAY_LENGTH / 4;
    private static int ARRAY_LENGTH03 = ARRAY_LENGTH02 / 2;

    public SumValues(int begin) {
        this.begin = begin;
    }

    /*generate array of random numbers*/
    static  void generateRandomArray(int[] arr){

        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1000);
        }

    }

    static  long sum(int[] arr){
        long all = 0;
        for (int i = 0; i < arr.length; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(arr[i]);
            all = all  + arr[i];
        }

        System.out.println();
        System.out.println(Thread.currentThread().getName() + ": " + all);
        return all;
    }

    @Override
    public Long call() throws Exception {
        int[] arr = new int[4000000];
        generateRandomArray(arr);

        long sum = sum(arr);
        return sum;
    }

    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(4);
        Future<Long> ret1 = service.submit(new SumValues(1));
        Future<Long> ret2 = service.submit(new SumValues(ARRAY_LENGTH02));//count part 2
        Future<Long> ret3 = service.submit(new SumValues(ARRAY_LENGTH03));//count part3
        Future<Long> ret4 = service.submit(new SumValues(ARRAY_LENGTH));//count part4

        try {

            System.out.print( ret1.get() + ret2.get() + ret3.get() + ret4.get());

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }



    }

}
//test when Array is : int[] arr = new int[4], print out:
//
//        pool-1-thread-1: 185
//
//        pool-1-thread-3: 272
//
//        pool-1-thread-4: 168
//
//        pool-1-thread-2: 263
//        888