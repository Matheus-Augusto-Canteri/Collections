package gerenciadorDeCursos.src.br.com.alura;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class TestaCursoComAluno {

    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções Java", "Paulo Silveira");
        List<Aula> aula = javaColecoes.getAulas();
        System.out.println(aula);

        // aulas.add(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 22));

        Aluno a1 = new Aluno("Matheus Canteri", 24672);
        Aluno a2 = new Aluno("Matheus Kuc", 24673);
        Aluno a3 = new Aluno("Mateus Rodrigues", 24674);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        System.out.println("Todos os alunos matriculados: ");

        Set<Aluno> alunos = javaColecoes.getAlunos();
        Iterator<Aluno> iterador = alunos.iterator(); // Usando iterator // code legacy
        while(iterador.hasNext()){
            Aluno proximo = iterador.next();
            System.out.println(proximo);
        }

        // Vector<Aluno> vetor = new Vector<>(); // Coisa velha

        // javaColecoes.getAlunos().forEach(a -> { // maneira certa de fazer e atualizada
        //     System.out.println(a);
        // });

        System.out.println(javaColecoes.estaMatriculado(a1));

        System.out.println("O aluno " + a1 + " está matriculado?");
        System.out.println(javaColecoes.estaMatriculado(a1));

        Aluno Kuc = new Aluno("Matheus Kuc", 24673);
        System.out.println("E esse Kuc, está matriculado? ");
        System.out.println(javaColecoes.estaMatriculado(Kuc));

        System.out.println("O a1 é equals ao Kuc? ");
        System.out.println(a1.equals(Kuc));

        // obrigadortiamente o seguinte  é true

        System.out.println(a1.hashCode() == Kuc.hashCode());

    }
}
