public class Main {

    public static void main(String[] args) {

        Pet pet1 = new Pet("Thor", "Cachorro", 4, 80.00);
        Pet pet2 = new Pet("Mel", "Gato", 3, 60.00);
        Pet pet3 = new Pet("Nina", "Cachorro", 6, 100.00);

        pet1.exibirInformacoes();
        System.out.println("Valor com desconto: R$ " + pet1.calcularValorComDesconto());
        System.out.println();

        pet2.exibirInformacoes();
        System.out.println("Valor com desconto: R$ " + pet2.calcularValorComDesconto());
        System.out.println();

        pet3.exibirInformacoes();
        System.out.println("Valor com desconto: R$ " + pet3.calcularValorComDesconto());
    }
}