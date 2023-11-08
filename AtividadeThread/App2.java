public class App2 {
    public static void main(String[] args) {
        Thread[] threads = new Thread[5];

        for (int i = 0; i < 5; i++) {
            threads[i] = new MinhaThreadSoma(i * 2);
            threads[i].start();
        }
    }
}
