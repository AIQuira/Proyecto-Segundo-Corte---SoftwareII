package co.edu.unicauca.isii.revision.repositorios;


import co.edu.unicauca.isii.revision.modelo.Articulo;
import co.edu.unicauca.isii.revision.servicios.ArticuloServiceImpl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RepositorioArticuloSqlite implements InterfaceRepositorioArticulo {

    private Connection connection;

    public RepositorioArticuloSqlite() {
        initDataBase();
    }

    @Override
    public boolean almacenarArticulo(Articulo objArticulo) {
        try {
            if (objArticulo == null || objArticulo.getIdArticulo() < 0 || objArticulo.getTitulo().isBlank()) {
                return false;
            }

            String sql = "INSERT INTO Trabajo (id_trabajo, titulo, descripcion, resumen, keyword, estado) "
                    + "VALUES (?, ?, ?, ?, ?, ?)\n";

            PreparedStatement pStatement = connection.prepareStatement(sql);
            pStatement.setString(2, objArticulo.getTitulo());
            pStatement.setString(3, objArticulo.getDescripcion());
            pStatement.setString(4, objArticulo.getResumen());
            pStatement.setString(5, objArticulo.getKeyword());
            pStatement.setString(6, objArticulo.getEstado());
            pStatement.executeUpdate();
            System.out.println("Se agrego un producto exitosamente.");
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(ArticuloServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public List<Articulo> listarArticulos() {
        List<Articulo> articulos = new ArrayList<>();
        try {
            String sql = "SELECT id_trabajo, titulo, descripcion, resumen, keyword, estado FROM Trabajo;";

            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()) {
                Articulo nuevoArticulo = new Articulo();
                nuevoArticulo.setIdArticulo(rs.getInt("id_trabajo"));
                nuevoArticulo.setTitulo(rs.getString("titulo"));
                nuevoArticulo.setDescripcion("descripcion");
                nuevoArticulo.setResumen(rs.getString("resumen"));
                nuevoArticulo.setKeyword(rs.getString("keyword"));
                nuevoArticulo.setEstado(rs.getString("estado"));

                articulos.add(nuevoArticulo);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ArticuloServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return articulos;
    }

    @Override
    public Articulo consultarArticulo(int idArticulo) {
        Articulo objArticulo = null;
        try {
            String sql = "SELECT * FROM Trabajo WHERE id_trabajo = ?;";
            PreparedStatement pStatement = connection.prepareStatement(sql);
            
            pStatement.setInt(1, idArticulo);
            
            ResultSet rs = pStatement.executeQuery();

            if (rs.next()){
                objArticulo = new Articulo();
                objArticulo.setIdArticulo(rs.getInt("id_trabajo"));
                objArticulo.setTitulo(rs.getString("titulo"));
                objArticulo.setDescripcion(rs.getString("descripcion"));
                objArticulo.setResumen(rs.getString("resumen"));
                objArticulo.setKeyword(rs.getString("keyword"));
                objArticulo.setEstado(rs.getString("estado"));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ArticuloServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return objArticulo;
    }

    @Override
    public boolean actualizarArticulo(Articulo objArticulo) {
        boolean actualizado = false;
        try{
            String sql = "UPDATE Trabajo SET titulo = ?, descripcion = ?, resumen = ?, keyword = ?, estado = ? WHERE id_trabajo = ?";
            PreparedStatement pStatement = connection.prepareStatement(sql);
            
            pStatement.setString(1, objArticulo.getTitulo());
            pStatement.setString(2, objArticulo.getDescripcion());
            pStatement.setString(3, objArticulo.getResumen());
            pStatement.setString(4, objArticulo.getKeyword());
            pStatement.setString(5, objArticulo.getEstado());
            pStatement.setInt(6, objArticulo.getIdArticulo());
            
            int rowsUpdated = pStatement.executeUpdate();
            if(rowsUpdated > 0){
                actualizado = true;
                System.out.println("Articulo actualizado correctamente");
            }
            
        } catch (SQLException ex){
            Logger.getLogger(ArticuloServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return actualizado;
    }
    
    @Override
    public boolean eliminarArticulo(int idArticulo) {
        boolean eliminado = false;
        try{
            String sql = "DELETE FROM Trabajo WHERE id_trabajo = ?";
            PreparedStatement pStatement = connection.prepareStatement(sql);
            // Asignar el valor del id
            pStatement.setInt(1, idArticulo);

            // Ejecutar el borrado
            int rowsDeleted = pStatement.executeUpdate();
            if (rowsDeleted > 0) {
                eliminado = true; // Borrado exitoso si al menos una fila fue afectada
                System.out.println("Articulo eliminados exitosamente");
            }
            
        } catch (SQLException ex){
            Logger.getLogger(ArticuloServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return eliminado;
    }

    private void initDataBase() {
        String sql = """
                     CREATE TABLE IF NOT EXISTS Trabajo (
                          id_trabajo INTEGER PRIMARY KEY AUTOINCREMENT,
                          titulo TEXT,
                          descripcion TEXT, resumen TEXT,
                          keyword TEXT,
                          estado TEXT,
                          CHECK ((estado = 'Aceptado' OR estado = 'Rechazado' OR estado = 'En revision' OR estado = 'Pendiente evaluacion')));""";

        try {
            this.connect();
            Statement statement = connection.createStatement();
            statement.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ArticuloServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void connect() {
        String url = "jdbc:sqlite:./proyectoSoftwareII.db";

        try {
            connection = DriverManager.getConnection(url);
        } catch (SQLException ex) {
            Logger.getLogger(ArticuloServiceImpl.class.getName()).log(Level.SEVERE, "Error al conectar a la base de datos", ex);
        }
    }

    private void disconnect() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
