import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Corrida c = new Corrida();

        System.out.println("=== Calcule o valor da corrida ===");
        System.out.println("Digite a distância percorrida: ");
        c.setDistancia(sc.nextDouble());
        System.out.println("Digite o tempo de espera: ");
        c.setTempoEspera(sc.nextInt());
        System.out.println("Digite a tarifa base: ");
        c.setTarifaBase(sc.nextDouble());
        System.out.println("Digite o fator de demanda(Valor do preço em horários de demanda): ");
        System.out.println( "Fator demanda: R$ 1,0 = horário normal, R$ 1,2 = pico: ");
        c.setFatorDemanda(sc.nextDouble());

        c.calcularValorCorrida();
        c.exibirDetalhesCorrida();

    }
}