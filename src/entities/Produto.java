package entities;

public class Produto {
    protected String nome;
    protected double preco;

    

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }



    public void etiquetaProduto(){
        System.out.println(nome + " é um produto comum, custando: " + preco);
    }
}
