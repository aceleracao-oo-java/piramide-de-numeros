
public class App {
    public static void main(String[] args) throws Exception {
        // limite de iterações => fixo
        int limite = 5;

        for (int i = 1; i <= limite; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
