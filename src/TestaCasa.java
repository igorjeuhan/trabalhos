public class TestaCasa {
    public static void main(String[] args) {
        
        //Criando objeto casa
        Casa casa1 = new Casa("verde");
        
        //Criando objetos porta
        Porta p1 = new Porta();
        
        //Atribuindo dados
        p1.setCor("Azul");
        p1.setDimensaoX(1.5);
        p1.setDimensaoY(2.5);
        p1.setDimensaoZ(0.15);
        casa1.setPorta1(p1);
        casa1.setAbrePorta1();
       
        Porta p2 = new Porta();
        //Atribuindo dados
        p2.setCor("Violeta");
        p2.setDimensaoX(1.0);
        p2.setDimensaoY(2.0);
        p2.setDimensaoZ(0.30);
        casa1.setPorta2(p2);
        casa1.setAbrePorta2();
        
        Porta p3 = new Porta();
        //Atribuindo dados
        p3.setCor("Cinza");
        p3.setDimensaoX(2.0);
        p3.setDimensaoY(3.5);
        p3.setDimensaoZ(1.0);
        casa1.setPorta3(p3);
        casa1.setAbrePorta3();
        
        //Chamando Métodos
        casa1.setCor("Laranja"); 
        System.out.println("Cor da casa: " + casa1.getCor() + 
                "\nPortas abertas: " + casa1.getQuantasPortasEstaoAbertas() + "\n");
        
        casa1.setCor("Lilas"); 
        casa1.setAbrePorta1();
        casa1.setAbrePorta2();
        casa1.setAbrePorta3();
        
        System.out.println("Cor da casa: " + casa1.getCor() + 
                "\nPortas abertas: " + casa1.getQuantasPortasEstaoAbertas() + "\n");
        
        casa1.setCor("Azul");
        casa1.setFechaPorta1();
        casa1.setFechaPorta2();
        casa1.setFechaPorta3();
        
        System.out.println("Cor da casa: " + casa1.getCor() + 
                "\nPortas abertas: " + casa1.getQuantasPortasEstaoAbertas() + "\n");
        
    }
}
