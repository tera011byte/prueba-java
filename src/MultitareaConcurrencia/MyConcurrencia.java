package MultitareaConcurrencia;

import java.util.List;
import java.util.concurrent.*;
import java.util.stream.IntStream;

public class MyConcurrencia {
    public static void main(String[] args) {
        MyRunable run = new MyRunable();
        Thread tr = new Thread(run);
        Thread tr2 = new Thread(run);

        tr.start();
        tr2.start();

        MyThread th = new MyThread();
        MyThread th2 = new MyThread();

        th.start();
        th2.start();

        //nueva manera de multitarea
        ExecutorService exs = Executors.newCachedThreadPool();
        exs.submit(()-> System.out.println("hello"));
        exs.submit(()-> System.out.println("Word"));
        exs.submit(()-> System.out.println("hello2"));
        exs.submit(()-> System.out.println("hello3"));
        exs.submit(()-> System.out.println("hello4"));
        exs.shutdown();

        Callable callb = ()->{
            int suma = 0;
            for(int i =0;i<=100;i++){
                suma+=i;
            }
            return suma;
        };

        try {
            int sum = (int) callb.call();
            System.out.println("Suma: " + sum);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        //CyclicBarrier
        List<Integer> lis = new CopyOnWriteArrayList<>();
        ExecutorService service = Executors.newFixedThreadPool(6);
        CyclicBarrier cb = new CyclicBarrier(2, ()-> System.out.println(lis));
        IntStream.range(0,6).forEach(n-> service.execute(()->{
            try{
                lis.add(n);
                cb.await();
            } catch (BrokenBarrierException | InterruptedException  e) {
                System.out.println("Excepcion");
                throw new RuntimeException(e);
            }
        }));
        service.shutdown();
    }
}
