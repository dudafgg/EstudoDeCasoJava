public class Produto {

    String nome;
    String descricao;

    public Produto(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public void exibirinfo() {

        System.out.println("\nNome: " + nome);
        System.out.println("Descrição: " + descricao);
    }
}