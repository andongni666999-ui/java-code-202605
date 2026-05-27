package th.aqs;
import java.util.concurrent.*;
/**
 * 10个任务，每次只允许4个同时执行，使用哪个多线程？
 */
public class Demo4 {


        public static void main(String[] args) {
            // 方案1：固定大小线程池
//            ExecutorService pool = Executors.newFixedThreadPool(4);
//
//            for (int i = 1; i <= 10; i++) {
//                int taskId = i;
//                pool.execute(() -> {
//                    System.out.println("开始执行任务：" + taskId + " 线程：" + Thread.currentThread().getName());
//                    try {
//                        Thread.sleep(9000);
//                    } catch (Exception e) {
//                        e.printStackTrace();
//                    }
//
//                    System.out.println("任务结束：" + taskId);
//                });
//            }
//
//            pool.shutdown();

            // 方案2：Semaphore
            Semaphore semaphore = new Semaphore(4);
            ExecutorService pool = Executors.newFixedThreadPool(10);

            for (int i = 1; i <= 10; i++) {
                int taskId = i;
                pool.execute(() -> {
                    try {
                        semaphore.acquire();
                        System.out.println("执行：" + taskId);
                        Thread.sleep(3000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        semaphore.release();
                    }
                });
            }

            pool.shutdown();
        }

}
