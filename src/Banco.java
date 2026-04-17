//Sistema principal
public class Banco {

    public static void main(String[] args) {

        try {


            //Cliente1
            Cliente ana = new Cliente("Ana Clara",
                    "123.456.789-10", "anaclara@hotmail.com", 18);

            //Cliente2
            Cliente joao = new Cliente("João Silva", "987.654.321-00", "joaoo@gmail.com", 20);

            //Criação da contaAna passando a Ana
            Conta contaAna = new Conta("123", "4567-8", ana);
            System.out.println("Sua conta foi criada com sucesso!");
            System.out.println("===Dados da conta===");
            System.out.println("Agência: " + contaAna.getAgencia());
            System.out.println("Conta: " + contaAna.getConta());
            System.out.println("Titular: " + contaAna.getCliente().getNome()); //encadeamento
            System.out.println();


            //Criação da contaJoao passando a joao
            Conta contaJoao = new Conta("987", "9874-5", joao);
            System.out.println("Sua conta foi criada com sucesso!");
            System.out.println("===Dados da conta===");
            System.out.println("Agência: " + contaJoao.getAgencia());
            System.out.println("Conta: " + contaJoao.getConta());
            System.out.println("Titular: " + contaJoao.getCliente().getNome()); //encadeamento
            System.out.println();


            //Depositar um valor inicial na contaAna
            contaAna.depositar(500);
            System.out.println("Usuário: " + contaAna.getCliente().getNome());
            System.out.println("Saldo atual: " + contaAna.getSaldo());
            System.out.println();

            //Saque de um valor da contaAna
            contaAna.sacar(250);
            System.out.println("Usuário: " + contaAna.getCliente().getNome());
            System.out.println("Saque efetuado com sucesso!");
            System.out.println("Saldo atual: " + contaAna.getSaldo());
            System.out.println();

            //Transferência da contaAna pra contaJoao
            contaAna.transferencia(50, contaJoao);
            System.out.println("Usuário: " + contaAna.getCliente().getNome());
            System.out.println("Transferência realizada com sucesso");
            System.out.println("Saldo atual: " + contaAna.getSaldo());

        }catch (IllegalArgumentException e){
            System.out.println("Erro: " + e.getMessage());
        }



        }

    }

