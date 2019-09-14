public class Data {

    //Atributos
    private int dia;
    private int mes;
    private int ano;
    
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
