import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            int valor;
            int pessimo = 0, ruim = 0, boa = 0, otima = 0, total = 0;

            while(true){
                System.out.print("Insira uma nota entre 1-100. Para finalizar o programa, insira um valor fora desse intervalo.\n>");
                valor = teclado.nextInt();

                if(valor < 0 || valor > 100) break;
                //Valor entre 0-100
                if(valor <= 25) pessimo++;
                else if(valor <= 50) ruim++;
                else if(valor <= 75) boa++;
                else if(valor <= 100) otima++;

                total++;
            }
            
            System.out.println(total + " funcionários votaram.\n");

            System.out.println( ( (float) pessimo/total) * 100 + "% dos funcionários considera as refeições péssimas");
            System.out.println( ( (float) ruim/total) * 100 + "% dos funcionários considera as refeições ruins");
            System.out.println( ( (float) boa/total) * 100 + "% dos funcionários considera as refeições boas");
            System.out.println( ( (float) otima/total) * 100 + "% dos funcionários considera as refeições ótimas");

            teclado.close();

    }
}
