public class ControleForArray {


    public static void main(String[] args) {

        String alunos [] = {"Anderson","Davi","Elza","Marcos"};

        for (int x=0; x < alunos.length; x++) {
            System.out.println("O Aluno no indice x=" + x + " é " + alunos[x]);
        }

        System.out.println("****************************");

        for (String aluno : alunos) {
            System.out.println("Nome do aluno é: " + aluno);
        }

    }



}
