package cursojava.universidade;

public abstract class Pessoa {

    private String nome;
    private int idade;
    private String sexo;

    protected String getNome() {
        return this.nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected int getIdade() {
        return this.idade;
    }

    protected void setIdade(int idade) {
        this.idade = idade;
    }

    protected String getSexo() {
        return this.sexo;
    }

    protected void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public final void fazerAniversario() {
        this.idade++;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pessoa{");
        sb.append("nome=").append(nome);
        sb.append(", idade=").append(idade);
        sb.append(", sexo=").append(sexo);
        sb.append("}");
        return sb.toString();
    }
    
    
}
