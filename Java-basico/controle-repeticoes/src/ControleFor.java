//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ControleFor {
    public static void main(String[] args) {
        for (int carnerinhos = 1; carnerinhos <= 20; carnerinhos++ ) {
            System.out.println("Carnerinhos " + carnerinhos);
        }
        System.out.println("Joaoziho dormiu!!");

        int numero = 1; for (int x=1; x<2; x++){ numero = numero + x; }
        System.out.println("O valor de número é: " + numero);

        //nunca executa devido ser false
        boolean condicao = false;
        while(condicao){
            System.out.println("executou ... ");
        }

        //looping infinito
        int num = 5, count = 1;
        do {
            num += count;
            System.out.println(num);
        } while (count <= 3);
    }
}