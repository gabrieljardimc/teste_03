package gestao_tres;

public class PesoIdeal {

    // Método que retorna a classificação do peso de acordo com o IMC calculado
    public String classificarIMC(double peso, double altura) {
        double imc = peso / (altura * altura);

        if (imc < 20) {
            return "Abaixo do peso";
        } else if (imc < 25) {
            return "Peso normal";
        } else if (imc < 30) {
            return "Sobre peso";
        } else if (imc < 40) {
            return "Obeso";
        } else {
            return "Obeso mórbido";
        }
    }

    // Casos de teste
    public static void main(String[] args) {
        PesoIdeal pesoIdeal = new PesoIdeal();

        // Testes para classificarIMC
        System.out.println(pesoIdeal.classificarIMC(50, 1.75)); // Esperado: Abaixo do peso
        System.out.println(pesoIdeal.classificarIMC(70, 1.75)); // Esperado: Peso normal
        System.out.println(pesoIdeal.classificarIMC(85, 1.75)); // Esperado: Sobre peso
        System.out.println(pesoIdeal.classificarIMC(110, 1.75)); // Esperado: Obeso
        System.out.println(pesoIdeal.classificarIMC(130, 1.75)); // Esperado: Obeso mórbido
    }
}
