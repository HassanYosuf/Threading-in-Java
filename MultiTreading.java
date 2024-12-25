public class MultiTreading {

    public static void main(String[] args) {
        Mythreadrunner Mythread = new Mythreadrunner();
        Mythreadrunner Mythread1 = new Mythreadrunner();
        Mythread.run();
        Mythread1.run();

    }
}