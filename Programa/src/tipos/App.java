package tipos;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Formatter;

public class App {
    public static void main(String[] args) throws FileNotFoundException{

        String arquivoImagem = "C:\\Java VSCODE\\Fixa\\Programa\\src\\Arquivo.txt";
        String arquivoDestino = "C:\\Java VSCODE\\Fixa\\Programa\\src\\Destino.txt";
        File arquivo = new File(arquivoImagem);
        Scanner leitor = new Scanner(arquivo);
        Formatter gravador = new Formatter(arquivoDestino);
        Produto[] vetorProdutos = new Produto[2];


        int count =0;
        while(leitor.hasNextLine()){
            String linha = leitor.nextLine();
            String[] vetor = linha.split(";");

            Produto p = new Produto();
            p.codigo = Integer.parseInt(vetor[0]);
            p.nome = vetor[1];
            p.marca = vetor[2];
            p.valor = Double.parseDouble(vetor[3]);


            vetorProdutos[count] = p;





            gravador.format("Codigo " + p.codigo + " \n");
            gravador.format("Nome " + p.nome+ " \n");
            gravador.format("Marca " + p.marca+ " \n");
            gravador.format("Valor " + p.valor+ " \n");

            count++;
        }

        System.out.println(vetorProdutos[0].codigo);
        System.out.println(vetorProdutos[0].nome);
        System.out.println(vetorProdutos[0].marca);
        System.out.println(vetorProdutos[0].valor+"\n");
        System.out.println(vetorProdutos[1].codigo);
        System.out.println(vetorProdutos[1].nome);
        System.out.println(vetorProdutos[1].marca);
        System.out.println(vetorProdutos[1].valor);
        
        

        leitor.close();
        gravador.close();
    }
}

/*package tipos;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws FileNotFoundException{

        String arquivoImagem = "C:\\Java VSCODE\\Fixa\\Programa\\src\\Arquivo.txt";
        File arquivo = new File(arquivoImagem);
        Scanner leitor = new Scanner(arquivo);
        
        Produto meuProduto = new Produto();
        meuProduto.codigo = 1;
        meuProduto.nome = "Computador";
        meuProduto.marca = "Dell";
        meuProduto.valor = 3500.00;


        Produto outroProduto = new Produto();
        outroProduto.codigo = 2;
        outroProduto.nome = "Smartphone";
        outroProduto.marca = "iPhone";
        outroProduto.valor = 5500.00;


        Produto[] vetorProdutos = new Produto[2];
        vetorProdutos[0] = meuProduto;
        vetorProdutos[1] = outroProduto;

        System.out.println("Lista de Produtos");
        for(int i = 0; i < vetorProdutos.length; i++){
            Produto p = vetorProdutos[i];

            System.out.println(p.codigo);
            System.out.println(p.nome);
            System.out.println(p.marca);
            System.out.println(p.valor);
            System.out.println(" ");
        }

    }
}
 */