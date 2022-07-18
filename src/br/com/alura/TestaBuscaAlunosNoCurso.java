package gerenciadorDeCursos.src.br.com.alura;

import java.util.List;

public class TestaBuscaAlunosNoCurso {

    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções Java", "Paulo Silveira");
        List<Aula> aula = javaColecoes.getAulas();
        System.out.println(aula);

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 22));

        Aluno a1 = new Aluno("Matheus Canteri", 24672);
        Aluno a2 = new Aluno("Matheus Kuc", 24673);
        Aluno a3 = new Aluno("Mateus Rodrigues", 24674);

        //24672 é o Matheus Canteri

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        System.out.println("Quem é o aluno com matricula 24672? ");
        Aluno aluno = javaColecoes.buscaMatricula(24672);
        System.out.println("aluno : " + aluno);
    
    }
}
