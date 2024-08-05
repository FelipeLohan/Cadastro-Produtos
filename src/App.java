import entities.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
            int opcao = 0;
                System.out.println("Quantos produtos você deseja cadastrar?");
                    int n = teclado.nextInt();
                        teclado.nextLine();
                            List<Produto> produtos = new ArrayList<>();

        for(int i = 0; i < n; i++){
            do{
            System.out.println("-----SISTEMA DE CADASTRO DE PRODUTOS-----");
                System.out.println("1 - PRODUTO COMUM");
                System.out.println("2 - PRODUTO IMPORTADO");
                System.out.println("3 - PRODUTO USADO");
                    opcao = teclado.nextInt();
                        teclado.nextLine();
                    switch (opcao) {
                        case 1:
                            System.out.println("NOME:");
                                String nomeComum = teclado.nextLine();
                            System.out.println("PRECO:");
                                double precoComum = teclado.nextDouble();
                                    teclado.nextLine();
                                        produtos.add(new Produto(nomeComum, precoComum));

                            break;
                        case 2:
                            System.out.println("NOME:");
                                String nomeImportado = teclado.nextLine();
                            System.out.println("PRECO:");
                                double precoImportado = teclado.nextDouble();
                                    teclado.nextLine();
                            System.out.println("CUSTO IMPORTACAO: ");
                                double custoImportacao = teclado.nextDouble();
                                    teclado.nextLine();
                                        produtos.add(new ProdutoImportado(nomeImportado, precoImportado, custoImportacao));                
                            break;
                        case 3:
                            System.out.println("NOME:");
                                String nomeUsado = teclado.nextLine();
                            System.out.println("PRECO:");
                                double precoUsado = teclado.nextDouble();
                                    teclado.nextLine();
                            System.out.println("Data de Fabricacao(dd/mm/yyyy)");
                                String dataFabricacaoString = teclado.nextLine();
                                    produtos.add(new ProdutoUsado(nomeUsado, precoUsado, dataFabricacaoString));                   
                            break;
                        default:
                            System.out.println("Opcao invalida.");
                            break;
                    }

            }while (opcao == 1 && opcao == 2 && opcao == 3);

        }
    }
}
