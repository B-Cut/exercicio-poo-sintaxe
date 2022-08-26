import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n;
        System.out.print("Insira a ordem da matriz quadrada: ");
        n = teclado.nextInt();

        int[][] matriz = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print("Insira o valor em ["+i+"]["+j+"]: ");
                matriz[i][j] = teclado.nextInt();
            }
        }

        int soma_referencia = 0; //Soma que todas as outras somas devem ser comparadas
        int soma = 0;
        //Somando linhas
        for(int i = 0; i < n; i++){
            soma = 0;
            for(int j = 0; j < n; j++){
                soma += matriz[i][j]; 
            }
            //Se for a primeira soma, designa o valor de diferença
            if(i == 0){
                soma_referencia = soma;
            }
            if(soma != soma_referencia){ //Como a nova soma é diferente da soma de referência, a matriz não é um quadrado mágico
                System.out.println("A matriz não é um quadrado mágico.");
                teclado.close();
                return;
            }
        }

        //Somando colunas
        for(int j = 0; j < n; j++){
            soma = 0;
            for(int i = 0; i < n; i++){
               soma += matriz[i][j]; 
            }
            if(soma != soma_referencia){ //Como a nova soma é diferente da soma de referência, a matriz não é um quadrado mágico
                System.out.println("A matriz não é um quadrado mágico.");
                teclado.close();
                return;
            }
        }
        soma = 0;

        //Soma diagonal principal
        for(int i = 0; i < n; i++){
            soma += matriz[i][i];
        }
        if(soma != soma_referencia){ //Como a nova soma é diferente da soma de referência, a matriz não é um quadrado mágico
            System.out.println("A matriz não é um quadrado mágico.");
            teclado.close();
            return;
        }

        //Soma diagonal secundária
        soma = 0;
        for(int i = 0; i < n; i++){
                soma += matriz[i][n-i-1];
        }
        if(soma != soma_referencia){ //Como a nova soma é diferente da soma de referência, a matriz não é um quadrado mágico
            System.out.println("A matriz não é um quadrado mágico.");
            teclado.close();
            return;
        }
        
        System.out.println("A matriz é um quadrado mágico!");
        teclado.close();
    }
}
