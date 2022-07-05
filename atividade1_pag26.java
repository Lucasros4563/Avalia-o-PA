import java.util.Scanner;

public class atividade1{

    public static void main(String[] args) {
        Scanner med;
        float h,b,B,area;

       med = new Scanner(System.in);
        System.out.println("Digite a altura do trapézio");
        h = med.nextInt();
        System.out.println("Digite a base menor do trapézio");
        b = med.nextInt();
        System.out.println("Digite a base maior do trapézio");
        B = med.nextInt();

        area = (h * (b + B)) / 2;
        System.out.println("A area do trapézio:" + area);

    }

}