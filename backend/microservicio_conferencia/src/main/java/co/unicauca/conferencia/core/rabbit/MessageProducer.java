package co.unicauca.conferencia.core.rabbit;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Service;

import co.unicauca.conferencia.core.fachadaServices.DTO.ConferenceDTO;

@Service
public class MessageProducer {

    private final AmqpTemplate amqpTemplate;
    private final String exchange = "conferenciaExchange";
    private final String routingKey = "conferencia.revision.routingKey";

    public MessageProducer(AmqpTemplate amqpTemplate) {
        this.amqpTemplate = amqpTemplate;
    }

    public void sendMessage(ConferenceDTO objConferenciaCreada) {
        amqpTemplate.convertAndSend(exchange, routingKey, objConferenciaCreada);
        System.out.println("Datos de la conferencia enviado a la cola");
    }
}
