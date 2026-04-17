//Sistema principal
public class Banco {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Ana Clara",
                "123.456.789-10", "anaclara@hotmail.com", 18);


        if (cliente.getIdade() < 16) {
            System.out.println("Idade insuficiente para criação de conta");
        } else {
            Conta conta = new Conta("1234", "4567-8", "AnaC");
            System.out.println("Conta criada com sucesso:");
            System.out.println("==== Dados da conta ===");
            System.out.println("Agência: " + conta.getAgencia());
            System.out.println("Conta: " + conta.getConta());
            System.out.println("Titular: " + conta.getNomeUsuario());


            conta.depositar(500);
           //System.out.println("===Depósito efetuado===");
            //System.out.println("Saldo atual: " + conta.getSaldo());

            conta.sacar(200);
            //System.out.println("===Saque efetuado===");
            //System.out.println("Saldo atual: " + conta.getSaldo());

            conta.transferencia(100);
            //System.out.println( conta.transferencia(100));

        }

    }
}
