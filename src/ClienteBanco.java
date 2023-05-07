import java.util.Scanner;

public class ClienteBanco {
    public static void main(String[] args) {

  /***********************
  Dados iniciais do cliente:
  Nome: Jackson da Silva
  Tipo conta: Corrente
  Saldo inicial: R$ 3000,00
  ***********************/

      Scanner leitor = new Scanner(System.in);

      double saldoConta = 3000;
      int numDigitado = 0;

      String textoPadrao = """
             
              ------------------------
              Operações
                            
              	1- Consultar saldos
              	2- Receber valor
              	3- Transferir valor
              	4- Sair
                            
              Digite a opção desejada:
                            """;

      while (true){

          System.out.println(textoPadrao);
          numDigitado = leitor.nextInt();

          if (numDigitado == 1){
              System.out.println("O saldo da conta é: " + saldoConta);
          }

          if (numDigitado == 2) {
              System.out.println("Informe o valor a receber:");
              double valorReceber = leitor.nextDouble();
              saldoConta += valorReceber;
          }

          if (numDigitado == 3) {
              System.out.println("Informe o valor a transferir:");
              double valorTransferido = leitor.nextDouble();

              if ((valorTransferido > saldoConta) || (saldoConta == 0)) {
                  System.out.println("A transferência não pode ser executada");
              } else {
                  System.out.println("Valor transferido");
                  saldoConta -= valorTransferido;
              }
          }

          if ((numDigitado < 1) || (numDigitado > 4)){
              System.out.println("Operação Inválida. Insira um número válido: ");
          }

          if (numDigitado == 4){
              break;
          }
      }
   }
}
