//Rondaom Number Genrator after 5 seconds
public class RondomNumber {
    public static void main(String[] args) {
        int min = 1;
        int max = 6;
        for (int i = 0; i <= 10; i++) {
            System.out.println("Random value of type int between " + min + " to " + max + ":");
            int b = (int) (Math.random() * (max - min + 1) + min);
            System.out.println(b);
            try {
                Thread.sleep(5000); // 5000ms = 5s
            } catch (InterruptedException ex) {

                System.exit(0);
            }
        }
    }
}
