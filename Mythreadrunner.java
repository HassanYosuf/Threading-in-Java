public class Mythreadrunner extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.err.println(i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        super.run();
    }
}