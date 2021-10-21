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

public void cadastro() {
        System.out.println("Nome:");
        this.nome = ler.next();
        System.out.println("Senha:");
        this.senha = ler.next();

        do{

            System.out.println("CPF:");
            this.cpf = ler.next();
            if(cpf.length() != 11){
                System.out.println("CPF inválido, favor digitar 8 números.");
            }
    
        }while(cpf.length() != 11);
        
        System.out.println("E-mail:");
        this.email = ler.next();
        System.out.println("Endereço:");
        this.endereco = ler.next();
    
        System.out.println("\n Cadastro Efetuado com Sucesso!");
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
    public int login(String login, String pass){ //pela programação definiremos também o login do adm, podendo modificar valores de algumas classes.

        if(login.equals("adm")&& pass.equals("123")){
            //pagina de administrador (numero 1)
            return 1;
        }
        else if(login.equals(this.nome)&& pass.equals(this.senha)){
            //pode fazer pedido (numero 2)
            return 2;
        }
        else{
            //acesso negado (numero 3)
            return 3;
        }           
        }
    }

