//Dados pessoais
public class Cliente {

    private String nome;
    private String cpf;
    private String email;
    private int idade;


    //metodos de acesso getters
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }


    //Construtor com parâmetros - inicia o objeto
    public Cliente(String nome, String cpf, String email, int idade){
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.idade = idade;

    }
    //Construtor sem parâmetros - inicia o objeto
    public Cliente(){
    }

   }




