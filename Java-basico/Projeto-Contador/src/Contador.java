

import java.util.Scanner;

public class Contador {

    public static void main(String[] args) throws ParametroInvalidoException {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametroInvalidoException exception) {
            throw new ParametroInvalidoException();
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametroInvalidoException {
        if (parametroUm > parametroDois) {
            throw new ParametroInvalidoException();
        }
        int contagem = parametroDois - parametroUm;
        for (int i = 0; i < contagem; i++) {
            System.out.println("Imprimindo o número: " + (i+1));
        }
    }
}
