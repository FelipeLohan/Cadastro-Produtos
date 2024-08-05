package entities;

public final class ProdutoImportado extends Produto{
    
    private double custoImportacao;

    public ProdutoImportado(String nome, double preco, double custoImportacao) {
        super(nome, preco);
        this.custoImportacao = custoImportacao;
    }

    @Override
    public void etiquetaProduto(){
        System.out.println(nome + "é um produto importado, custando: " + precoFinal());
    }

    public double precoFinal(){

        return preco + custoImportacao;
    }
}
