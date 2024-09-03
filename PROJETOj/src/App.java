public class App {
    public static void main(String[] args) throws Exception {
        
        Produto p;
        p = new Produto();

        p.adicionarEstoque(99);
        p.removerEstoque(8);
        
        System.out.println(p.consultarEstoque());

        Produto p2 = new Produto();

        p2.adicionarEstoque(80);
        p2.removerEstoque(2);
        p2.adicionarEstoque(1);
        p2.removerEstoque(900);

        System.out.println(p2.consultarEstoque());
    }
}
