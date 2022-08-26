public class q6 {
    public static void main(String[] args) {
        int limite = 100;
        int a = 0;
        int b = 1;
        System.out.println("A sequência de Fibonacci até "+ limite + " é:");
        while(a <= limite){
            System.out.print(" "+ a);
            int temp = a;
            a = b;
            b += temp;
        } 
    }
}
