
package atividadefunc;

public class Funcionario {
    private String nome;
    private int idade;
    private String cargo;
    private float salario;
    private boolean responsavel;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public boolean getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(boolean responsavel) {
        this.responsavel = responsavel;
    }

    @Override
    public String toString() {
        return "Funcionario {\n" + "nome=" + nome + ",\nidade=" + idade + ",\ncargo=" + cargo + ",\nsalario=" + salario + ",\nresponsavel=" + responsavel + '}';
    }
    
    
}
