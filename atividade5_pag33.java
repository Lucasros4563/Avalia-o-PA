import java.util.Scanner;

public class atividade5 {

    public static void main(String[]args){
    float valor, salario, hora ;
    Scanner s = new Scanner(System.in);
    System.out.print("Digite a quantidade de horas trabalhadas: ");
    hora = s.nextInt();
    valor = (10.25f);
    System.out.println("");
    salario = (valor * hora);
    System.out.print("VALOR DO SALARIO: " + salario);
    System.out.println("");
    if(salario < 50) {
        System.out.println("Atenção, dirija-se à direção do Hotel!");
    
}
}
}