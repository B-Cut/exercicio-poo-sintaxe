import java.util.Scanner;;

class q1{
    public static void  main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n, valor, count;
        valor = 0;
        count = 0;
        System.out.print("Quantos números serão inseridos?\n>");
        n = teclado.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.print("Insira o " + i + "° número\n>");
            valor = teclado.nextInt();
            if(valor < 0) count++;
        }

        System.out.println("Encontramos " + count + "valores negativos");
        teclado.close();
    }
}