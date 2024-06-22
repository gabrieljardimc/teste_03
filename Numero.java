package gestao_tres;

public class Numero {

    // Método que retorna a raiz cúbica de um número
    public double raizCubica(double numero) {
        return Math.cbrt(numero);
    }

    // Método que retorna o fatorial de um número
    public int fatorial(int numero) {
        if (numero == 0) {
            return 1;
        }
        int resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }

    // Método que retorna o somatório dos números compreendidos entre 1 e o número
    public int somaIntervalo(int numero) {
        int soma = 0;
        for (int i = 1; i <= numero; i++) {
            soma += i;
        }
        return soma;
    }

    // Casos de teste
    public static void main(String[] args) {
        Numero numero = new Numero();

        // Teste para raizCubica
        System.out.println(numero.raizCubica(27.0)); // Esperado: 3.0
        System.out.println(numero.raizCubica(20.0)); // Esperado: 2.71 (com delta de 0.01)

        // Teste para fatorial
        System.out.println(numero.fatorial(5)); // Esperado: 120
        System.out.println(numero.fatorial(0)); // Esperado: 1

        // Teste para somaIntervalo
        System.out.println(numero.somaIntervalo(5)); // Esperado: 15
        System.out.println(numero.somaIntervalo(0)); // Esperado: 0
    }
}
