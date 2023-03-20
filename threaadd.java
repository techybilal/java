public class threaadd extends Thread {

    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("Run");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        threaadd t = new threaadd();
        t.run();
    }
}
