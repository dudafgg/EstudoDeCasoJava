public class Computador extends Produto {
    private String marca;

    public Computador(String nome, String descricao, String marca) {
        super(nome, descricao);
        this.marca = marca;
    }

    public String getNome() { // Método para acessar o valor da variável
        return nome;
    }

    public String getDescricao() { // Método para acessar o valor da variável
        return descricao;
    }

    public String getMarca() { // Método para acessar o valor da variável
        return marca;
    }

    public void exibirInfo() {

        super.exibirinfo();

        System.out.println("Marca: " + marca);
    }
}