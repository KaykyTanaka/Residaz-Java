import java.util.Scanner;

public class teste {
    public static void main(String args[]) {
        Scanner leia = new Scanner(System.in);
        int x, y;

        do {
            System.out.println("1 - próximo menu");
            System.out.println("0 - sair");
            System.out.print(">>> ");
            x = leia.nextInt();
            switch (x) {
                case 1:
                    do {
                        System.out.println("1 - funfou");
                        System.out.println("0 - sair");
                        System.out.print(">>> ");
                        y = leia.nextInt();
                    } while (y != 0);
                    break;
            }
        } while (x != 0);
    }
}