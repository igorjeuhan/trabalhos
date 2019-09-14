public class Porta {
    
    //Atributos
    private boolean aberta;
    private String cor;
    //Dimensão em metros
    private double dimensaoX;
    private double dimensaoY;
    private double dimensaoZ;
    
    //Métodos
    public void setDimensaoX(double x){
        this.dimensaoX = x;
    }
    
    public void setDimensaoY(double y){
        this.dimensaoY = y;
    }
    
    public void setDimensaoZ(double z){
        this.dimensaoZ = z;
    }
    
    public double getDimensaoX(){
        return this.dimensaoX;
    }
    
    public double getDimensaoY(){
        return this.dimensaoY;
    }
    
    public double getDimensaoZ(){
        return this.dimensaoZ;
    }
    
    public void setAbre(){
        this.aberta = true;
    }
    
    public void setFecha(){
        this.aberta = false;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public String getCor() {
        return this.cor;
    }
    
    public boolean isAberta(){
        return aberta;
    }
}
