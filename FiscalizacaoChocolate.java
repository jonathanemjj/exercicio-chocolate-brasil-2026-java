import java.util.Scanner;

public class FiscalizacaoChocolate {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println(" --- SISTEMA DE FISCALIZAÇÃO PASCOA 2026 --- ");
        System.out.println(" Digite o percentual de cacau da amostra: ");
        double percentual = sc.nextDouble();

        if (percentual < 25) { // se o percentual for menor que 25, exibe a mensagem abaixo
            System.out.println("ALERTA: Produto 'Fake'. Classificar como 'Sabor Chocolate'");
        } else if (percentual >= 25 && percentual < 35){ // se o percentual for maior ou igual a 25 e também menor que 35 exibe a mensagem abaixo
            System.out.println("Chocolate Comum (Padrão Nacional Atual)");
        }else { // casa nao seja nada igual as opções acima exibe a mensagem abaixo
            System.out.println("Chocolate de Alta Qualidade (Padrão Internacional/UE)");
        } 

        System.out.println("Digite o tipo de chocolate");
        sc.nextLine();
        String TipoChocolate = sc.nextLine();
        
        System.out.println(" Gramas de açúcar: ");
        int Gramasacucar = sc.nextInt();

        if(TipoChocolate.equalsIgnoreCase("AO_LEITE") && Gramasacucar > 15){
            System.out.println(" Classificação: Doce de leite com cacau (Excesso de açúcar) ");
        }else {
            System.out.println("Classificação: Chocolate balanceado");
        } 

        System.out.println(" Informe o valor do ovo de Páscoa: ");
        double ValorOvo = sc.nextDouble();
        System.out.println("Informe a nota de pureza (0 a 10) ");
        int pureza = sc.nextInt();

        if (ValorOvo > 100 || pureza < 5){
            System.out.println(" REJEITADO PARA EXPORTAÇÃO: Custo-benefício fora dos padrões ");
        } else {
            System.out.println(" APROVADO: Produto competitivo para o mercado externo ");
        }

       sc.close();


    }
}
