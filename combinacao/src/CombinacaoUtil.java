public class CombinacaoUtil {
    // Função para calcular combinações
    public static int combinacao(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        } else {
            return fatorial(n) / (fatorial(k) * fatorial(n - k));
        }
    }

    // Função para calcular o fatorial
    private static int fatorial(int num) {
        if (num <= 1) {
            return 1;
        } else {
            return num * fatorial(num - 1);
        }
    }
}
