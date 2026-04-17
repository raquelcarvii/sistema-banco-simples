//Dados bancários
public class Conta {

    private String agencia;
    private String conta;
    private String nomeUsuario;
    private double saldo = 00.00;


    //construtor com parâmetros e sem

    public Conta(String agencia, String conta, String nomeUsuario){
        this.agencia = agencia;
        this.conta = conta;
        this.nomeUsuario = nomeUsuario;
        this.saldo = saldo;
    }
    public Conta(){
    }

    //metodos getters e setters

    public String getAgencia(){
        return agencia;
    }
    public void setAgencia(String agencia){
        this.agencia = agencia;
    }
    public String getConta(){
        return conta;
    }
    public void setConta(String conta){
        this.conta = conta;
    }
    public String getNomeUsuario(){
        return nomeUsuario;
    }
    public void setNomeUsuario(String nomeUsuario){
        this.nomeUsuario = nomeUsuario;
    }
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    //metodos de ações

    public void depositar(double deposito){
        this.saldo += deposito;
    }
    public void sacar(double saque){ //sem retorno, só executa
        if(this.saldo >= saque){ //valida antes de executar
            this.saldo -= saque; //subtrai se tiver saldo
        }else{ //caso não tiver o saldo para saque
            System.out.println("Saldo insuficiente");
        }
    }

    public String transferencia(double valor){
            if(this.saldo >= valor){
                this.saldo -= valor;
                return "Transferência realizada com sucesso";
            }else{
               return "Saldo insuficiente";
            }

        }


    }





