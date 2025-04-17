public class CaixaEeletronico {

    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 37.0;

        //Controle de fluxo simples
        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;

            System.out.println(saldo);
        } else {
            System.out.println("Saldo insuficiente");
        }

        double alturaJoao = 1.46; double alturaMarcos = 1.37;
        if(alturaMarcos > alturaJoao)
            System.out.println("João é mais alto que Marcos");
        else
            System.out.println("Marcos é mais baixo que João");
    }
}
