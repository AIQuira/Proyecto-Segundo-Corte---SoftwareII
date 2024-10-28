package co.edu.unicauca.isii.revision.fachadaServicios.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import co.edu.unicauca.isii.revision.fachadaServicios.DTO.RevisorConArticulos.ArticuloDTO;
import reactor.core.publisher.Mono;

@Service
public class ArticuloService {
    
    @Autowired
    private WebClient.Builder webClientBuilder;

    public List<ArticuloDTO> listarArticulosDeRevisor(Integer idRevisor) {
        String url = "http://localhost:8080/api/articulo/revisor/" + idRevisor;

        Mono<ArticuloDTO[]> response = this.webClientBuilder.build()
            .get()
            .uri(url)
            .retrieve()
            .bodyToMono(ArticuloDTO[].class);
        
        ArticuloDTO[] articulos = response.block();
        return articulos != null ? List.of(articulos) : List.of();
    }
}
