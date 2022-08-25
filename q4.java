public class q4 {
    public static void main(String[] args) {
        int n = 3;
        int max = 100;
        System.out.print("Os múltiplos de " + n + " entre 1 e " + max + " são:");
        for(int i = 1; i*n <= max; i++){
            System.out.print(" " + i*n);
        }
    }
}
