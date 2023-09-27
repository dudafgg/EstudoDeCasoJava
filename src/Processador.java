public class Processador extends Produto {
    double velocidade;

    public Processador(String nome, String descricao, double velocidade) {

        super(nome, descricao);

        this.velocidade = velocidade;

    }

    public String getNome() { // Método para acessar o valor da variável
        return nome;
    }

    public String getDescricao() { // Método para acessar o valor da variável
        return descricao;
    }

    public double getVelocidade() { // Método para acessar o valor da variável
        return velocidade;
    }

    public void exibirInfo() {

        super.exibirinfo();

        System.out.println("Velocidade: " + velocidade + " GHz");
    }
}