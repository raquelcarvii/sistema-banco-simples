//Dados bancários
public class Conta {

    private String agencia;
    private String conta;
    private double saldo;
    private Cliente cliente;


    //construtores com parâmetros e sem

    public Conta(String agencia, String conta, Cliente cliente) {
        if (cliente.getIdade() < 16) {
            throw new IllegalArgumentException("Idade inapropriada para criação de conta");
        }
        this.agencia = agencia;
        this.conta = conta;
        this.cliente = cliente;
    }

    public Conta() {
    }

    //Métodos getters e setters

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public Cliente getCliente() {
        return cliente;
    }
    public String getSaldo(){
        return String.format("%.2f", saldo);
    }

    //Métodos de ações

    //Depósito
    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor negativo para depositar");
        }
        this.saldo += valor;
    }

    //Saque
    public void sacar(double saque) { //sem retorno, só executa
        if (saque <= 0) { //valida antes de executar
            throw new IllegalArgumentException("Valor negativo para saque");
        }
        if (this.saldo < saque) {
            throw new IllegalArgumentException("Saldo insuficiente para saque");
        }
        this.saldo -= saque;
    }

    //Transferência
    public void transferencia(double valor, Conta contaDestino) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor negativo para transferência");
            }
        if (this.saldo < valor) {
            throw new IllegalArgumentException("Saldo insuficiente para transferência");
        }
        this.saldo -= valor;
        contaDestino.depositar(valor);

    }
}





