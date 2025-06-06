package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

    public static void main(String[] args) {
//        System.out.println("Processo Seletivo");
//        analisarCandidato(1900.0);
//        analisarCandidato(2200.0);
//        analisarCandidato(3000.0);
//        analisarCandidato(2000.0);
        //selecaoCandidato();
        //imprimirSelecionados();
        String [] candidatos = {"Felipe","Marcia","Julia","Paulo","Augusto"};

        for (String candidato : candidatos) {
            entrandoEmContado(candidato);
        }
    }
    static void entrandoEmContado(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("Contato realizado com sucesso!");
            }
        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu) {
        System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativa.");
        } else  {
            System.out.println("Não conseguimos contato com " + candidato + ", número maximo  de " + tentativasRealizadas + " tentativas.");
        }
    }

    // método auxiliar
    static boolean atender() {
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados() {
        String [] candidatos = {"Felipe","Marcia","Julia","Paulo","Augusto"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for (int indice=0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de nº "+ (indice+1) + " é o " + candidatos[indice]);
        }

        System.out.println("Forma abrevida de interação for each");

        for (String candidato : candidatos) {
            System.out.println("O candidato seleciondado foi " + candidato);
        }
    }



    static void selecaoCandidato() {
        String [] candidatos = {"Felipe","Marcia","Julia","Paulo","Augusto","Monica","Fabricio","Mirela","Daniela","Ilda Furação","Gandaldf","Aysha","Pantufa"};

        int candidatoSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatoSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou este valor de salário " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O Candidato " + candidato + " foi selecionado para a vaga");
                candidatoSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salabase = 2000.0;
        if (salabase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        } else if (salabase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contra proposta");
        } else {
            System.out.println("Aguardando o resultado dos demais candidatos");
        }

    }
}
