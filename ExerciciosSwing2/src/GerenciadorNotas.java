
public class GerenciadorNotas extends Aluno{
    
    String aprovacao;

    public GerenciadorNotas(String nome, double nota1, double nota2) {
        super(nome, nota1, nota2);
    }
    
    public String verificarMedia(double media){
        if(media >= 7){
        aprovacao = "Aprovado";
        }else{
        aprovacao = "Reprovado";
        }
        return aprovacao;
    }
}
