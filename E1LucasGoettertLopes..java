import java.util.Scanner;
public class Trabalho {
    public static void main(String[] args) {
        Double num1;
        Double num2;
        Double num3;
        Double num4;
        Double num5;
        Double aux;

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, forneça os 5 valores");
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
        num3 = sc.nextDouble();
        num4 = sc.nextDouble();
        num5 = sc.nextDouble();


        if (num1 > num2) {
            aux = num1;
            num1 = num2;
            num2 = aux;
        }
        if (num3 < num1) {
            aux = num1;
            num1 = num3;
            num3 = aux;
        }
        if (num3 < num2) {
            aux = num2;
            num2 = num3;
            num3 = aux;
        }
        if (num4 < num1) {
            aux = num1;
            num1 = num4;
            num4 = aux;
        }
        if (num4 < num2) {
            aux = num2;
            num2 = num4;
            num4 = aux;
        }
        if (num4 < num3) {
            aux = num3;
            num3 = num4;
            num4 = aux;
        }if (num5 < num1) {
            aux = num1;
            num1 = num5;
            num5 = aux;
        }
        if (num5 < num2) {
            aux = num2;
            num2 = num5;
            num5 = aux;
        }
        if (num5 < num3) {
            aux = num3;
            num3 = num5;
            num5 = aux;
        }
        if (num5 < num4) {
            aux = num4;
            num4 = num5;
            num5 = aux;
        }

        System.out.println("A média dos valores excluindo o maior e o menor foi: " + ((num2+num3+num4)/3));
    }
}


