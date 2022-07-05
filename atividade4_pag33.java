import java.util.Scanner;

public class atividade4 {

    public static void main(String[]args){
    float valor, salario, hora ;
    Scanner s = new Scanner(System.in);
    System.out.print("Digite a quantidade de horas trabalhadas: ");
    hora = s.nextInt();
    valor = (10.25f);
    salario = (valor * hora);
    System.out.print("VALOR DO SALARIO: " + salario);
    
}
}