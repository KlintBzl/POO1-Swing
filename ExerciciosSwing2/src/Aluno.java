
public class Aluno {
    String nome;
    double nota1, nota2, media;

    public Aluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    
    public double calcularMedia(){
        media = (nota1 + nota2)/ 2;
        return media;
    }
    
    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", nota 1=" + nota1 + ", nota 2=" + nota2 + ", media=" + media + '}';
    }
}
