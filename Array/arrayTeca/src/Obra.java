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

   

   public boolean isPrestada() {
      return prestada;
   } 
   
   @Override
   public String toString() {
      return ("Titulo: "+ titulo+ "\nautor: "+ autor);
   }
}
