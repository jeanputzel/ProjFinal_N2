public class Cardapio {
   private String[] produto = new String[22];
   private Double[] preco = new Double[22];
   private int[] quantidade = new int[22];
   private Double valor_final = 0.0;
   private Double valor_para_balanço = 0.0;

   //definição de valores abaixo
      //XIS
   
//não esquecer de fazer um método para exclusão de itens caso o cliente não deseje mais o produto

   public void colocarnoCarrinho() {
      int cont; // contador para verificar o numero de itens que foram colocados
         
}
    public void setProduto(String produto, int i) {
        this.produto[i] = produto;
    }
    public String getProduto(int i) {
        return this.produto[i];
    }

    public void setPreco(Double preco, int i) {
      this.preco[i] = preco;
   }
      public Double getPreco(int i) {
         return this.preco[i];
   }

   public void setQuantidade(int quantidade, int i) {
      this.quantidade[i] = quantidade;
   }
      public int getQuantidade(int i) {
         return this.quantidade[i];
   }

      public void definicaoprecos(){
         //preços do xis
         setPreco(18.90, 0);  //xis salada
         setPreco(25.90, 1);  //xis bacon
         setPreco(24.90, 2);  //xis atum
         setPreco(28.90, 3);  //xis bagunça
         setPreco(19.90, 4);  //xis calabresa
         setPreco(24.90, 5);  //xis carne de panela
         setPreco(29.90, 6);  //xis estrogonofe
         setPreco(30.90, 7);  //xis filé mignon
         //Dogs
         setPreco(13.90, 8);  //dog 1 salsicha
         setPreco(14.90, 9);  //dogão 2 salsicha
         //Bebidas
         setPreco(2.00, 10);  //água sem gás
         setPreco(10.00, 11); //Pepsi 2L
         setPreco(10.00, 12); //Coca 2L
         setPreco(2.50, 13);  //Polar latão
         setPreco(2.50, 14);  //Skol latão
         setPreco(2.00, 15);  //Água com Gás
         //Porções
         setPreco(10.00, 16); //Batata Frita com Queijo
         setPreco(10.00, 17); //Cebola Frita
         setPreco(25.00, 18); //Picadão
         setPreco(10.00, 19); //Polenta Frita
         setPreco(10.00, 20); //Batata Frita
         setPreco(10.00, 21); //Bacon
      }

      public void definicaoquantidade(){ //definição de quantidade inicial do site para 0
         for (int i = 0; i<=21; i++){
            setQuantidade(0, i);
         }
      }

   public Double finalizarPedido(){ //calcular valor final
      for (int i = 0; i<=21; i++){
         this.valor_final = this.valor_final + (preco[i]*quantidade[i]);
      }
      return this.valor_final;
   }

   public void comprafinalizada(){ //para utilizar no balanço
      this.valor_para_balanço = this.valor_para_balanço + this.valor_final;
   }
   
   public void limparValorParaBalanco(){
      this.valor_para_balanço = 0.0;
   } 

   public Double getValorParaBalanco(){
      return this.valor_para_balanço;
   }

}
