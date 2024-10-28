package co.edu.unicauca.articulo.microservicio_articulo.capaAccesoDatos.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import co.edu.unicauca.articulo.microservicio_articulo.dominio.ArticuloEntity;

@Repository
public class ArticuloRepository {
    private int pos;
    private ArrayList<ArticuloEntity> listaDeArticulos;

    public ArticuloRepository() {
        this.listaDeArticulos = new ArrayList<ArticuloEntity>();
        cargarArticulos();
        pos = this.listaDeArticulos.size() + 1;
    }

    public List<ArticuloEntity> findAll() {
        System.out.println("Invocando a listarArticulos");
        return this.listaDeArticulos;
    }

    public ArticuloEntity findById(Integer id) {
        System.out.println("Invocando a consultar un Articulo");
        ArticuloEntity objArticulo = null;

        for (ArticuloEntity articulo : listaDeArticulos) {
            if (articulo.getIdArticulo() == id) {
                objArticulo = articulo;
                break;
            }
        }

        return objArticulo;
    }

    public ArticuloEntity save(ArticuloEntity articulo) {
        System.out.println("Invocando a almacenar articulo");
        articulo.setIdArticulo(pos);
        ArticuloEntity objArticulo = null;
        if (this.listaDeArticulos.add(articulo)) {
            objArticulo = articulo;
            pos++;
        }

        return objArticulo;
    }

    public ArticuloEntity update(Integer id, ArticuloEntity articulo) {
        System.out.println("Invocando a actualizar un articulo");
        ArticuloEntity objArticulo = null;

        for (int i = 0; i < this.listaDeArticulos.size(); i++) {
            if (this.listaDeArticulos.get(i).getIdArticulo() == id) {
                this.listaDeArticulos.set(i, articulo);
                objArticulo = articulo;
                break;
            }
        }

        return objArticulo;
    }

    public boolean delete(Integer id) {
        System.out.println("Invocando a eliminar un articulo");
        boolean bandera = false;

        for (int i = 0; i < this.listaDeArticulos.size(); i++) {
            if (this.listaDeArticulos.get(i).getIdArticulo() == id) {
                this.listaDeArticulos.remove(i);
                bandera = true;
                break;
            }
        }

        return bandera;
    }

    private void cargarArticulos() {

        ArticuloEntity objArticulo1 = new ArticuloEntity("Inteligencia Artificial en Educación",
                "Este artículo explora el uso de IA en el ámbito educativo", "Resumen prueba", "IA, Educación, Tecnología");
        this.listaDeArticulos.add(objArticulo1);

        ArticuloEntity objArticulo2 = new ArticuloEntity("Desarrollo Sostenible y Energía Renovable",
                "Análisis del impacto de las energías renovables en el desarrollo sostenible", "Resumen prueba",
                "Energía, Sostenibilidad, Medio Ambiente");
        this.listaDeArticulos.add(objArticulo2);

        ArticuloEntity objArticulo3 = new ArticuloEntity("Big Data y Análisis de Datos",
                "Estudio sobre la recolección y análisis de grandes volúmenes de datos", "Resumen prueba", "Big Data, Análisis, Datos");
        this.listaDeArticulos.add(objArticulo3);

        ArticuloEntity objArticulo4 = new ArticuloEntity("Ciberseguridad en la Era Digital",
                "Propuestas para mejorar la seguridad digital en la actualidad", "Resumen prueba",
                "Ciberseguridad, Tecnología, Seguridad");
        this.listaDeArticulos.add(objArticulo4);
    }
}
