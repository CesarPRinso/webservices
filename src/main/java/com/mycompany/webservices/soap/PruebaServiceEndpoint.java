/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webservices.soap;

import java.util.Arrays;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;
import org.springframework.stereotype.Component;

@Component
@WebService(serviceName = "pruebaService")
public class PruebaServiceEndpoint {

    @WebMethod
    public String descripcion() {
        return "Web Service de Prueba Utilizando JAX-WS";
    }

    @WebMethod
    public List<String> listHeros() {
        return Arrays.asList("Batman", "Iron Man", "Spiderman", "Thor");
    }

    @WebMethod
    public String doObservacion(String observacion) {
        return "Recibido: " + observacion;
    }

    @WebMethod
    public String sumar(int x, int y) {
        return Integer.toString(x + y);
    }
}