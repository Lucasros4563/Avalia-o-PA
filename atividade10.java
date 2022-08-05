import java.util.Scanner;

public class atividade10{

    public static void main(String[] args) {
        Scanner num;
        float numero,antecessor;

       num= new Scanner(System.in);
        System.out.println("Digite um numero");
        numero = num.nextInt();

        antecessor = (numero - 1);
        System.out.println("O antecessor de " + numero + " é: " + antecessor);

    }

}