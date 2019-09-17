public class TestaCliente {
    
    public static void main(String[] args) {
        
        Cliente c1 = new Cliente("Igor Jeuhan", "00000000000");
        
        //c1.setNome("Igor Jeuhan");
        //c1.setCpf("00000000000");
        
        System.out.println("Nome: " + c1.getNome() + "\n" + "CPF: " + c1.getCpf());
    }
    
}
