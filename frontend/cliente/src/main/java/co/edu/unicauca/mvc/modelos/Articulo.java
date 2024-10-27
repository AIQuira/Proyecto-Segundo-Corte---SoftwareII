package co.edu.unicauca.mvc.modelos;

public class Articulo {
   private int idArticulo;
   private String titulo;
   private String resumen;
   private String keyword;
   private String estado;
   
   private Conferencia objConferencia;

   public Articulo()
   {
       
   }

    public Articulo( String titulo, String resumen, String keyword, String estado) {
        this.titulo = titulo;
        this.resumen = resumen;
        this.keyword = keyword;
        this.estado = estado;
    }

    public int getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    
    public void setObjConferencia(Conferencia objConferencia) {
        this.objConferencia = objConferencia;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Conferencia getObjConferencia() {
        return objConferencia;
    }

}
