public class Cardapio {
   private String[] produto = new String[22];
   private Double[] preco = new Double[22];
   private int[] quantidade = new int[22];
   private Double valor_final;
   private Double valor_para_balanço = 0.0;
   
//não esquecer de fazer um método para exclusão de itens caso o cliente não deseje mais o produto

   public Cardapio colocarnoCarrinho() {
      Cardapio c1 = new Cardapio();
      return c1;
    
}
   public Double finalizarPedido(){ //calcular valor final
      return valor_final;
   }
   
   public void limparValorParaBalanco(){
      this.valor_para_balanço = 0.0;
   } 

   public Double getValorParaBalanco(){
      return this.valor_para_balanço;
   }

}