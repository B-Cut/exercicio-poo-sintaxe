import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Por favor insira um número inteiro\n>");
        int valor = teclado.nextInt();

        int fat = fatorial(valor);
        
        if(fat == -1) System.out.println("Não é possível calcular o fatorial de um número negativo");
        else System.out.println("O fatorial de " + valor + " é " + fat);

        teclado.close();
    }

    private static int fatorial(int n){
        if(n < 0) return -1;
        else if(n <=1) return 1;// n = 0 ou 1

        return n * fatorial( n - 1);
    }
}
