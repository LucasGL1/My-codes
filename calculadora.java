import java.util.Scanner;
public class calculadora {
    public static void main(String[] args) {
        double x;
        double y;
        int op;

    Scanner sc = new Scanner(System.in);

        System.out.println("Seja bem vindo à sua calculadora!");
        System.out.println("Por favor, digite o primeiro valor");
         x = sc.nextDouble();

        System.out.println("Agora, por favor");
        System.out.println("Selecione a operação desejada");
        System.out.println(" ");
        System.out.println("==============================");
        System.out.println("Se deseja somar, digite 1");
        System.out.println("Se deseja subtrair, digite 2");
        System.out.println("Se deseja multiplicar, digite 3");
        System.out.println("Se deseja dividir, digite 4");
        System.out.println("Se deseja potencializar, digite 5");
        System.out.println("Se deseja o resultado da raiz quadrada, digite 6");
        op = sc.nextInt();

                if (op==6) {
                    System.out.println("O resultado da sua raiz quadrada foi: " + (Math.sqrt(x)));
                System.exit(0);
                }

        System.out.println("Agora, envie o segundo valor:");
         y = sc.nextDouble();

         switch (op) {
             case 1:
                 System.out.println("O resultado da sua soma foi: " + (x + y));
                 break;
             case 2:
                 System.out.println("O resultado da sua subtração foi: " + (x - y));
                 break;
             case 3:
                 System.out.println("O resultado da sua multiplicação foi: " + (x * y));
                 break;
             case 4:
                 System.out.println("O resultado da sua divisão foi: " + (x / y));
                 break;
             case 5:
                 System.out.println("O resultado da sua potencialização foi: " + (Math.pow(x,y)));
                 break;
         }
    }
}