public class Casa {
    
    //Atributos
    private String cor;
    private Porta porta1;
    private Porta porta2;
    private Porta porta3;
    
    //Métodos
    
    public void setPorta1(Porta porta1) {
        this.porta1 = porta1;
    }
    
    public void setAbrePorta1() {
        this.porta1.setAbre();
    }
    
    public void setFechaPorta1() {
        this.porta1.setFecha();
    }
    
    public void setPorta2(Porta porta2) {
        this.porta2 = porta2;
    }
    
    public void setAbrePorta2() {
        this.porta2.setAbre();
    }
    
    public void setFechaPorta2() {
        this.porta2.setFecha();
    }
    
    public void setPorta3(Porta porta3) {
        this.porta3 = porta3;
    }
    
    public void setAbrePorta3() {
        this.porta3.setAbre();
    }
    
    public void setFechaPorta3() {
        this.porta3.setFecha();
    }
    
    public void setCor(String cor){
        this.cor = cor;
    }
    
    public String getCor() {
        return this.cor;
    }
    
    public int getQuantasPortasEstaoAbertas(){
        int qtd = 0;
        if(porta1.isAberta() || porta2.isAberta() || porta3.isAberta()){
            qtd = 1;
        }
        if(porta1.isAberta() && porta2.isAberta()){
            qtd = 2;
        }
        if(porta1.isAberta() && porta3.isAberta()){
            qtd = 2;
        }
        if(porta2.isAberta() && porta3.isAberta()){
            qtd = 2;
        }
        if(porta1.isAberta() && porta2.isAberta() && porta3.isAberta()) {
            qtd = 3;
        }
        return qtd;
    }
    
}
