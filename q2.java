import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
            float r, t, s, temp;
            char maior = 'r';
            Scanner teclado = new Scanner(System.in);

            System.out.print("Insira o valor de r.\n>");
            r = teclado.nextFloat();
            System.out.print("Insira o valor de t.\n>");
            t = teclado.nextFloat();
            System.out.print("Insira o valor de s.\n>");
            s = teclado.nextFloat();

            temp = r;
            if(t > temp){
                maior = 't';
                temp = t;
            }
            if(s > temp){
                maior = 's';
                temp = s;
            }

            System.out.println("O maior valor é: " + maior + ".");
            teclado.close();    
    }  
}
