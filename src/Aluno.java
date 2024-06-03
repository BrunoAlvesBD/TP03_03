public class Aluno {
    private String matricula;
    private String nome;
    private String telefone;
    private Endereco endereco;

    public Aluno(String matricula, String nome, String telefone, Endereco endereco) {
        this.matricula = matricula;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public Aluno(){

    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Matricula: "+matricula+"\nNome: "+nome+"\nTelefone: "+telefone+"\nEndereco: "+endereco;
    }
}
