public class Pessoa {
    
    //Atributos
    private String nome;
    private int idade;
    
    //Construtor
    public Pessoa(String nome, int idade) {
        this.setNome(nome);
        this.setIdade(idade);
    }
    
    //Métodos
    void setNome(String nome){
        this.nome = nome;
    }
    
    void setIdade(int idade){
        this.idade = idade;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    void fazAniversario() {
        this.idade += 1;
    }
}
