
import java.util.ArrayList;


public class GerenciadorProdutos extends Produto{
    
    public GerenciadorProdutos(String nome, double preco, int quantidade) {
        super(nome, preco, quantidade);
    }
    
    public void adicionarProduto(Produto p){
            listaProdutos.add(p);
    }
    
    public String listarProdutos(){
        
        return toString();
    }
}
