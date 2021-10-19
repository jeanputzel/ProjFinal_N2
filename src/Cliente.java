import java.util.Scanner;

public class  Cliente{

// VARIAVEIS
private String nome;
private String cpf;
private String email;
private String endereco;
private String senha;
//INSTANCIANDO
Scanner ler = new Scanner(System.in);

// _c é um identificador para a variavel q será passada por parâmetro
public void cadastro() { 
        System.out.println("Nome:");
        this.nome = ler.next();
        System.out.println("Senha:");
        this.senha = ler.next();
        System.out.println("CPF:");
        this.cpf = ler.next();
        System.out.println("E-mail:");
        this.email = ler.next();
        System.out.println("Endereço:");
        this.endereco = ler.next();      
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getCpf() {
        return this.cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return this.email;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getEndereco() {
        return this.endereco;
    }

    public String toString() {
        return this.nome + "\n" + 
               this.cpf + "\n";                          
    }
    //login

}