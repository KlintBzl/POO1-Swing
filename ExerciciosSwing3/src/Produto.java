
import java.util.ArrayList;
public class Produto {
    String nome;
    double preco, resultado;
    int quantidade;
    ArrayList listaProdutos = new ArrayList();

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto{" + "nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + '}';
    }
    
    public double calcularTotal(){
        resultado = preco * quantidade;
        return resultado;
    }
    
}
