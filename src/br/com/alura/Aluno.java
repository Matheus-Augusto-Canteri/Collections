package gerenciadorDeCursos.src.br.com.alura;

public class Aluno {

    private String nome;
    private int numeroMatricula;

    public Aluno(String nome, int numeroMatricula){
        if (nome == null){
            throw new NullPointerException("O nome não pode ser nulo!");
        }
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    // public void setNome(String nome) {
    //     this.nome = nome;
    // }

    // public void setNumeroMatricula(int numeroMatricula) {
    //     this.numeroMatricula = numeroMatricula;
    // }

    @Override
    public boolean equals(Object obj) {
        Aluno outro = (Aluno) obj;
        return this.nome.equals(outro.nome);
    }

// Sempre que for reescrever o equals, tem que reescrever o hascode

    @Override
    public int hashCode() {
        return this.nome.hashCode();
    }

    @Override
    public String toString() {
        return "[Aluno: " + this.nome + ", matrícula: " + this.numeroMatricula + "]";
    }
}
