public class TestaCasa {
    public static void main(String[] args) {
        
        //Criando objeto casa
        Casa casa1 = new Casa();
        casa1.setPinta("Verde");
        
        //Criando objetos porta
        Porta p1 = new Porta();
        //Atribuindo dados
        p1.cor = "Azul";
        p1.dimensaoX = 1.5;
        p1.dimensaoY = 2.5;
        p1.dimensaoZ = 0.15;
        casa1.setPorta1(p1);
        casa1.setAbrePorta1();
       
        Porta p2 = new Porta();
        //Atribuindo dados
        p2.cor = "Violeta";
        p2.dimensaoX = 1.0;
        p2.dimensaoY = 2.0;
        p2.dimensaoZ = 0.30;
        casa1.setPorta2(p2);
        casa1.setAbrePorta2();
        
        Porta p3 = new Porta();
        //Atribuindo dados
        p3.cor = "Cinza";
        p3.dimensaoX = 2.0;
        p3.dimensaoY = 3.5;
        p3.dimensaoZ = 1.0;
        casa1.setPorta3(p3);
        casa1.setAbrePorta3();
        
        //Chamando Métodos
        casa1.setPinta("Laranja"); 
        System.out.println("Cor da casa: " + casa1.getCor() + 
                "\nPortas abertas: " + casa1.getQuantasPortasEstaoAbertas() + "\n");
        
        casa1.setPinta("Lilas"); 
        casa1.setAbrePorta1();
        casa1.setAbrePorta2();
        casa1.setAbrePorta3();
        
        System.out.println("Cor da casa: " + casa1.getCor() + 
                "\nPortas abertas: " + casa1.getQuantasPortasEstaoAbertas() + "\n");
        
        casa1.setPinta("Azul");
        casa1.setFechaPorta1();
        casa1.setFechaPorta2();
        casa1.setFechaPorta3();
        
        System.out.println("Cor da casa: " + casa1.getCor() + 
                "\nPortas abertas: " + casa1.getQuantasPortasEstaoAbertas() + "\n");
        
    }
}
