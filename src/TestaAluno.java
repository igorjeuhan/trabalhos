public class TestaAluno {
    
    public static void main(String[] args) {
        
        //Criando objeto data
        Data d1 = new Data(29, 4, 1998);
        
        //Criando objeto aluno
        Aluno a1 = new Aluno("00000000000", d1);
        
        //Imprimindo dados do aluno
        System.out.println(a1.imprimir());
        
        
    }
    
}
