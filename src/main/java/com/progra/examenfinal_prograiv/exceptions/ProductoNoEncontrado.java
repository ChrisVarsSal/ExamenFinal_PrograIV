package com.progra.examenfinal_prograiv.exceptions;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ProductoNoEncontrado extends RuntimeException{
    private String nombreProducto;
    private String fieldNom;
    private Object fieldVal;
    public ProductoNoEncontrado(String nombreProducto,String fieldNom,Object fieldVal){
        super(String.format("%s Producto No Encontrado '%s'", nombreProducto, fieldNom, fieldVal));
        this.nombreProducto=nombreProducto;
        this.fieldNom=fieldNom;
        this.fieldVal=fieldVal;
    }
}
