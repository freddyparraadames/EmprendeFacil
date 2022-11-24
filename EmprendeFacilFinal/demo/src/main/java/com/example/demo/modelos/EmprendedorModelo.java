package com.example.demo.modelos;

import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document("emprendedor") // crea la entidad pacientes en mongoDB en la parte del modelo y va a estar conectada con la coleccion emprendedor
@NoArgsConstructor // Crea el constructor sin argumentos ojo solo si usa Lombok
@AllArgsConstructor // Crea el cosntructor con todos los elementos  tambien solo si una lombok
@Getter //  Insertar los Get con Lombok
@Setter // Insertar Setter com Lombok

public class EmprendedorModelo {
    @Id

    private String id;
    private String emprendimiento;
    private String tipo;
    private List<String> responsables;// Crea una lista que llena con los responsables
    private Object emails;
    private Object direccion; // es un campo envevido {departament , ciudad} objeto compuesto por que tiene atributos y valores

}
