public class Porta {
    
    //Atributos
    boolean aberta;
    String cor;
    //Dimensão em metros
    double dimensaoX;
    double dimensaoY;
    double dimensaoZ;
    
    //Métodos
    public void setAbre(){
        this.aberta = true;
    }
    
    void setFecha(){
        this.aberta = false;
    }
    
    void setPinta(String cor) {
        this.cor = cor;
    }
    
    public boolean isAberta(){
        return aberta;
    }
}
