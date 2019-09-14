public class Produto {
    
    //Atributos
    private double preco;
    private String nome;
    
    //Métodos
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public double getPreco(){
        return this.preco;
    }
    
    public String getNome(){
        return this.nome;
    }
    public void diminuir10 () {
        preco = preco - (preco * 10 / 100);
    }
    
    public void aumenta25 () {
        preco = preco + (preco * 25 / 100);
    }
}
