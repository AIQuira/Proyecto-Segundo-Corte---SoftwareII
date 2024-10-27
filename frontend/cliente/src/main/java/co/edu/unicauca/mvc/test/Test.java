package co.edu.unicauca.mvc.test;

//import co.edu.unicauca.mvc.accesoADatos.Factory;
//import co.edu.unicauca.mvc.accesoADatos.InterfaceRepositorioArticulo;
//import co.edu.unicauca.mvc.controladores.ServicioAlmacenamientoArticulos;
import co.edu.unicauca.mvc.vistas.GUIOpciones;
//import co.edu.unicauca.mvc.vistas.adminConferencia.VtnPrincipalAdmin;
//import co.edu.unicauca.mvc.vistas.asistente.VtnPrincipalAsistente;
//import co.edu.unicauca.mvc.vistas.autorPublicacion.VtnPrincipalAutor;
import javax.swing.UIManager;



public class Test {

    
    public static void main(String[] args) {
        
        seleccionarLookAndField();
        
        //Para que fábrica nos de el repositorio por defecto
//        InterfaceRepositorioArticulo repositorioArticulo = Factory.getInstance().getRepository("default");
//        ServicioAlmacenamientoArticulos objServicioArticulos = new ServicioAlmacenamientoArticulos(repositorioArticulo);
//        GUIOpciones gui = new GUIOpciones(objServicioArticulos);
//        gui.setVisible(true);
        
    }
    
    private static void seleccionarLookAndField()
    {
        for(UIManager.LookAndFeelInfo laf:UIManager.getInstalledLookAndFeels()){
            if("Nimbus".equals(laf.getName()))
                try {
                UIManager.setLookAndFeel(laf.getClassName());
                 } catch (Exception ex) {
            }
        }
    }
}
