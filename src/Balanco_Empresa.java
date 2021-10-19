import java.util.ArrayList; // classe para usar com cardapio(pois não sabemos quantos pedidos ocorrerão num mês)


public class Balanco_Empresa {
    
    public Double balanco(){
        
        double resultado = 0;
        int num_funcionarios = 5;
        Funcionario[] f = new Funcionario[num_funcionarios];
        Cardapio c1 = new Cardapio();

        for (int i = 0 ; i<num_funcionarios; i++){
            resultado = resultado - f[i].getSalario();            
        }

        resultado = resultado + c1.getValorParaBalanco();

        return resultado;
    }
}