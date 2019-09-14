public class TestaAluno {
    
    public static void main(String[] args) {
        
        //Criando objeto aluno
        Aluno a1 = new Aluno();
        a1.setCPF("00000000000");
        
        //Criando objeto data
        Data d1 = new Data();
        d1.setDia(29);
        d1.setMes(4);
        d1.setAno(1998);
        
        //Atribuindo data de nascimento do aluno
        a1.setData(d1);
        
        //Imprimindo dados do aluno
        System.out.println(a1.imprimir());
        
        
    }
    
}
