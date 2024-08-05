package entities;

import java.util.Date;

public final class ProdutoUsado extends Produto{

    private Date dataFabricacao;

    

    public ProdutoUsado(String nome, double preco, Date dataFabricacao) {
        super(nome, preco);
        this.dataFabricacao = dataFabricacao;
    }



    @Override
    public void etiquetaProduto(){
        System.out.println(nome + "é um produto usado, fabricado em " + dataFabricacao + " custando: " + preco);
    }
}
