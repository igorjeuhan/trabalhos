public class Aluno {
    
    //Atributos
    private String cpf;
    private Data dataDeNascimento;
    
    //Métodos
    String imprimir (){
        String dados = "CPF: " + cpf + " Data de nascimento: " + dataDeNascimento.imprimir();
        return dados;
    }
    
    public void setCPF (String cpf) {
        this.cpf = cpf;
    }
    
    public void setData (Data data) {
        this.dataDeNascimento = data;
    }
    
}
