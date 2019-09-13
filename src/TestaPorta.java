public class TestaPorta {
    
    public static void main(String[] args) {
        
        //Criando objeto porta
        Porta porta1 = new Porta();
        porta1.cor = "Azul";
        porta1.dimensaoX = 1.5;
        porta1.dimensaoY = 2.5;
        porta1.dimensaoZ = 0.3;
        
        String estado;
        if (porta1.isAberta()) {
           estado = "Aberta";
        }else {
           estado = "Fechada";
        }
        
        //Imprimindo dados da porta
        String dados = "Cor: " + porta1.cor + "\nDimensões: " + porta1.dimensaoX
                + "m x " + porta1.dimensaoY + "m x " + porta1.dimensaoZ + "m" + "\nEstado: "
                + estado;
        System.out.println(dados);
        
        //Chamando métodos
        porta1.setAbre();
        
        if (porta1.isAberta()) {
           estado = "Aberta";
        }else {
           estado = "Fechada";
        }
        
        porta1.setPinta("Vermelha");
        porta1.dimensaoX = 2.0;
        porta1.dimensaoY = 3.0;
        porta1.dimensaoZ = 0.15;
        
        dados = "Cor: " + porta1.cor + "\nDimensões: " + porta1.dimensaoX
                + "m x " + porta1.dimensaoY + "m x " + porta1.dimensaoZ + "m" + "\nEstado: "
                + estado;
        System.out.println(dados);
        
    }
}
