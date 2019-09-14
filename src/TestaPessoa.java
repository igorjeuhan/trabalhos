public class TestaPessoa {
    
    public static void main(String[] args) {
        
        //Criando objeto pessoa
        Pessoa p1 = new Pessoa();
        p1.setNome("Igor Jeuhan");
        p1.setIdade(21);
        
        p1.fazAniversario();
        //Imprimindo dados da pessoa
        System.out.println("Nome: " + p1.getNome() + " Você fará: " + p1.getIdade() + " anos");
        
        p1.setIdade(32);
        p1.fazAniversario();
        //Imprimindo dados da pessoa
        System.out.println("Nome: " + p1.getNome() + " Você fará: " + p1.getIdade() + " anos");
        
        p1.setIdade(51);
        p1.fazAniversario();
        //Imprimindo dados da pessoa
        System.out.println("Nome: " + p1.getNome() + " Você fará: " + p1.getIdade() + " anos");
   
    }
    
}
