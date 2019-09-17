public class TestaCasa {
    public static void main(String[] args) {
        
        //Criando objeto casa
        Casa casa1 = new Casa("verde");
        
        //Criando objetos porta
        Porta p1 = new Porta("Azul", 1.5, 2.5, 0.15);
        
        //Atribuindo dados
        casa1.setPorta1(p1);
        casa1.setAbrePorta1();
       
        Porta p2 = new Porta("Violeta", 1.0, 2.0, 0.30);
        //Atribuindo dados
        casa1.setPorta2(p2);
        casa1.setAbrePorta2();
        
        Porta p3 = new Porta("Cinza", 2.0, 3.5, 1.0);
        //Atribuindo dados
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
