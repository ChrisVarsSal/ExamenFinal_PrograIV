package com.progra.examenfinal_prograiv.service;

import com.progra.examenfinal_prograiv.data.payload.request.RequestProducto;
import com.progra.examenfinal_prograiv.data.payload.response.ResponseMensaje;
import com.progra.examenfinal_prograiv.data.models.Producto;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Optional;

@Component
public interface ServicioProducto {
    ResponseMensaje crearProducto(RequestProducto reqPr);
    Optional<Producto> actualizarProducto(Integer id,RequestProducto reqPr);
    void eliminarProducto(Integer id);
    Producto getProducoSolo(Integer id);
    List<Producto> getTodosLosProductos();
}