import  java.util.Scanner;

public class MainLancheria {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Cliente[] cliente = new Cliente[100];
        Cardapio c1 = new Cardapio();
        c1.definicaoprecos();
        c1.definicaoquantidade();
        int escolha; //escolhas relacionadas ao menu
        int escolha_cardapio;
        int contador_pessoas = 0; // contador de pessoas (delimitado até 100)
        boolean login = false;
        do{

        System.out.println("Digite o que deseja fazer:");
        System.out.println("1-Cadastrar");
        System.out.println("2-Login");
        System.out.println("3- Fazer pedido");
        System.out.println("4- Ir para o carrinho");
        System.out.println("5- Deslogar");
        System.out.println("0- Sair");
        escolha = ler.nextInt();

        switch (escolha) {
            case 1:
                cliente[contador_pessoas].cadastro();
                contador_pessoas++;
                break;
            
            case 2:
                String logar;
                String pass;
                int cont = 0;

                System.out.println("Digite seu login");
                logar = ler.next();
                System.out.println("Digite a senha");
                pass = ler.next();
                
                do{
                    if(cliente[cont].login(logar, pass) == 1){
                        // pag administrador
                    }

                    else if(cliente[cont].login(logar, pass) == 2){
                        //cliente
                        login = true;
                    }
                    else{
                        cont++;
                    }
                }while(cont < 100 || login == true);

                break;
            
            case 3:
                
                if(login == true){

                    do{
                        int i; // contador dos fors para mostrar o cardapio
                        System.out.println("O que deseja pedir - Digite 0 caso queira sair do menu");
                        System.out.println("XIS: \n");

                        for (i = 0; i <= 7; i++);{
                        System.out.println(c1.getProduto(i) + "R$ " + c1.getPreco(i));
                        }
                        System.out.println("\n DOGS: \n");

                        for (i = 8; i <= 9; i++);{
                            System.out.println(c1.getProduto(i) + "R$ " + c1.getPreco(i));
                        }

                        System.out.println("\n BEBIDAS: \n");

                        for (i = 10; i <= 15; i++);{
                            System.out.println(c1.getProduto(i) + "R$ " + c1.getPreco(i));
                        }

                        System.out.println("\n PORÇÕES: \n");

                        for (i = 16; i <= 21; i++);{
                            System.out.println(c1.getProduto(i) + "R$ " + c1.getPreco(i));
                        }

                        escolha_cardapio = ler.nextInt();
                    }while(escolha_cardapio != 0);

                }
                else{

                }
                
                break;
            
            case 4:
                
                break;
            
            case 5:

                if(login == false){
                    System.out.println("Você não está logado para deslogar.");
                }
                else{
                    login = false;
                    System.out.println("Você saiu da conta com sucesso.");
                }
                
                break;

            case 0:
                System.out.println("\n Saindo");
                break;
            default:
                System.out.println("Número inválido, por favor digite um numero compatível com o menu!");
                break;
        }

        }while(escolha == 0);

    }    
}
