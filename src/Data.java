public class Data {

    //Atributos
    private int dia;
    private int mes;
    private int ano;
    
    public Data (int d, int m, int a) {
        this.setDia(d);
        this.setMes(m);
        this.setAno(a);
    }
    
    //Métodos
    void setDia(int dia){
        this.dia = dia;
    }
    
    void setMes(int mes){
        this.mes = mes;
    }
    
    void setAno(int ano){
        this.ano = ano;
    }
    
    String imprimir (){
        String data = dia + "/" + mes + "/" + ano;
        return data;
    }
}
