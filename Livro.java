public class Livro {
    String titulo;
    String autor;
    double preco;
    int quantidade;


    public Livro(String titulo, String autor, double preco, int quantidade){
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
        this.quantidade = quantidade;
    }
         void exibirInformacoes() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + titulo);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade: " + quantidade);
    }
      
public double calcularValorEstoque(){
    return preco*quantidade;
    
   }
 } 
    
