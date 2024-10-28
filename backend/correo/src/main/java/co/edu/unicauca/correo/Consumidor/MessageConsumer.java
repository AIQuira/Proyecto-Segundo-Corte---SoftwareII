package co.edu.unicauca.correo.Consumidor;

import org.springframework.stereotype.Service;

import co.edu.unicauca.correo.DTOs.ArticuloDTO;

import org.springframework.amqp.rabbit.annotation.RabbitListener;

@Service
public class MessageConsumer {

    @RabbitListener(queues = "temaarticulo.revision")
    public void receiveMessage(ArticuloDTO objArticuloCreado) {
        System.out.println("Datos de la conferencia");
        System.out.println("Enviando correo electrónico");
        System.out.println("Id: "+objArticuloCreado.getId());
        System.out.println("Nombre: "+objArticuloCreado.getNombre());
        System.out.println("lugar: "+objArticuloCreado.getLugar());
        System.out.println("Fecha: "+objArticuloCreado.getFecha());
        System.out.println("tema: "+objArticuloCreado.getTema());
        System.out.println("descripcion: "+objArticuloCreado.getDescripcion());
        System.out.println("contacto: "+objArticuloCreado.getContacto());         
    }
}
