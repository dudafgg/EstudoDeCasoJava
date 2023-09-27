public class SistemaOperacional extends Produto {
    String versao;

    public SistemaOperacional(String nome, String descricao, String versao) {

        super(nome, descricao);
        this.versao = versao;
    }

    public String getNome() { // Método para acessar o valor da variável
        return nome;
    }

    public String getDescricao() { // Método para acessar o valor da variável
        return descricao;
    }

    public String getVersao() { // Método para acessar o valor da variável
        return versao;
    }

    public void exibirInfo() {

        super.exibirinfo();
        System.out.println("Versão: " + versao);
    }
}