package entities;

public final class ProdutoImportado extends Produto{
    private double custoImportacao;

    @Override
    public void etiquetaProduto(){

    }

    public double precoFinal(){

        return preco + custoImportacao;
    }
}
