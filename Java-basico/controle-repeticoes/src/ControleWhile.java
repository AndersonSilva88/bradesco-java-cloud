import java.util.concurrent.ThreadLocalRandom;

public class ControleWhile {

    public static void main(String[] args) {
        double mesada = 50.0;

        while( mesada > 0 ) {
            Double valorDoce = valorAleatorio();

            System.out.println("Valor do doce: " + valorDoce );
            mesada = mesada - valorDoce;
        }

        System.out.println("Mesada" + mesada);

    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
