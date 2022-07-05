import java.util.Scanner;

public class atividade2 {

    public static void main(String[] args) {
        float h, b, B, area;

        Scanner med = new Scanner(System.in);
        System.out.println("Digite a altura do trapézio");
        h = med.nextFloat();
        System.out.println("Digite a base menor do trapézio");
        b = med.nextFloat();
        System.out.println("Digite a base maior do trapézio");
        B = med.nextFloat();

        area = ((h * (b + B)) / 2);
        System.out.println("A area do trapézio:" + area);
        System.out.println("A area do trapézio arredondado:" + Math.round(area));

    }
}