import java.util.Random;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        int numDigitado = 0;
        int contador = 1;
        int numAleatorio = new Random().nextInt(100);
        //System.out.println(numAleatorio);

        while ((numDigitado != numAleatorio) && (contador <= 5)) {

            System.out.println("Digite um número: ");
            Scanner leitor = new Scanner(System.in);
            numDigitado = leitor.nextInt();

            if (numDigitado == numAleatorio) {
                System.out.println("*Este é o número correto! Parabéns!");
                break;
            }

            if (numDigitado < numAleatorio) {
                System.out.println("Esse numero é menor do que o numero correto!");
            } else {
                System.out.println("Esse número é maior do que o número correto!");
            }

            if (contador == 5) {
                System.out.println(" ");
                System.out.println("*Que pena que você não acertou! O número correto era: " + numAleatorio);
            }

            contador++;
        }

    }

}


