
package atividadefunc;

public class AtividadeFunc {

    public static void main(String[] args) {
        
        Funcionario f = new Funcionario();
        f.setNome("Rogerio");
        f.setCargo("Atendente");
        f.setIdade(32);
        f.setResponsavel(true);
        f.setSalario(2100);
        
        f.toString();
        
        Funcionario f2 = new Funcionario();
        f2.setNome("Rogerio");
        f2.setCargo("Atendente");
        f2.setIdade(32);
        f2.setResponsavel(true);
        f2.setSalario(2100);
        
        f2.toString();
    }
    
}
