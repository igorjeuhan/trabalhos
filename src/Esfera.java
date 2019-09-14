public class Esfera {
    private double raio;
    
    
    void setRaio(double raio){
        this.raio = raio;
    }
            
    double calcVolume () {
        return (4.0/3.0) * 3.14 * (raio * raio * raio);
    }
}
