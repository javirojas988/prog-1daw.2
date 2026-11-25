public class Obra {
   private String cod ; 
   private String titulo;
   private String autor ;
   private boolean prestada = false ; 
   // private boolean prestada 
   

   public Obra(String cod, String titulo, String autor) {
    this.cod = cod;
    this.titulo = titulo;
    this.autor = autor;
   }

   public void setPrestada(boolean prestada) {
       this.prestada = prestada;
   }
   public void setCod(String cod) {
       this.cod = cod;
   }
   public boolean isPrestada() {
      return prestada;
   } 
   public String getCod() {
       return cod;
   }
   @Override
   public String toString() {
      return ("Cod: "+ cod +"\nTitulo: "+ titulo+ "\nAutor: "+ autor);
   }
}
