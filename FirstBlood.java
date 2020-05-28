package lesson1;

public class FirstBlood {

    public static void main(String[] args) throws InterruptedException {

        //main线程和子线程都阻塞
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    Thread.sleep(99999999l);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        },"第一滴血").start();
//        Thread.sleep(99999999999l);

        //main线程运行run方法
//        Thread t = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    Thread.sleep(99999999999l);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }, "第一滴血");
//        t.run();


        //main和子线程同时运行，观察打印顺序
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("第一滴血");
            }
        }, "第一滴血").start();
        System.out.println("main");
    }
}
