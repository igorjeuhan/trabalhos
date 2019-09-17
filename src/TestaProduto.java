public class TestaProduto {
    
    public static void main(String[] args) {
        
        Produto pd1 = new Produto("Pizza", 100.00);
       
        pd1.diminuir10();
        
        System.out.println(pd1.getNome());
        System.out.println("Valor: " + pd1.getPreco());
 
        pd1.aumenta25();
        
        System.out.println(pd1.getNome());
        System.out.println("Valor: " + pd1.getPreco());
    }
        
}
