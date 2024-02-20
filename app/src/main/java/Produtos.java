public class Produtos {
    private string descricao;
    private int imagem;
    private int avaliacao;
    private double preco;

    public Produtos(string descricao, int imagem, int avaliacao, double preco) {
        this.descricao = descricao;
        this.imagem = imagem;
        this.avaliacao = avaliacao;
        this.preco = preco;
    }

    public string getDescricao() {
        return descricao;
    }

    public void setDescricao(string descricao) {
        this.descricao = descricao;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
