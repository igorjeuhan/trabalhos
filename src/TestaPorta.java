public class TestaPorta {
    
    public static void main(String[] args) {
        
        //Criando objeto porta
        Porta porta1 = new Porta("Azul", 1.5, 2.5, 0.30);
        
        String estado;
        if (porta1.isAberta()) {
           estado = "Aberta";
        }else {
           estado = "Fechada";
        }
        
        //Imprimindo dados da porta
        String dados = "Cor: " + porta1.getCor() + "\nDimensões: " + porta1.getDimensaoX()
                + "m x " + porta1.getDimensaoY() + "m x " + porta1.getDimensaoZ() + "m" + "\nEstado: "
                + estado;
        System.out.println(dados);
        
        //Chamando métodos
        porta1.setAbre();
        
        if (porta1.isAberta()) {
           estado = "Aberta";
        }else {
           estado = "Fechada";
        }
        
        porta1.setCor("Vermelha");
        porta1.setDimensaoX(2.0);
        porta1.setDimensaoY(3.0);
        porta1.setDimensaoZ(0.15);
        
        dados = "Cor: " + porta1.getCor() + "\nDimensões: " + porta1.getDimensaoX()
                + "m x " + porta1.getDimensaoY() + "m x " + porta1.getDimensaoZ() + "m" + "\nEstado: "
                + estado;
        System.out.println(dados);
        
    }
}
