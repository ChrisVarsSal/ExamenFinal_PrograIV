package com.progra.examenfinal_prograiv.service;
import com.progra.examenfinal_prograiv.data.models.Producto;
import com.progra.examenfinal_prograiv.data.payload.request.RequestProducto;
import com.progra.examenfinal_prograiv.data.payload.response.ResponseMensaje;
import com.progra.examenfinal_prograiv.data.repository.RepositoryProducto;
import com.progra.examenfinal_prograiv.data.repository.RepositoryProducto;
import com.progra.examenfinal_prograiv.exceptions.ProductoNoEncontrado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ServicioProductoImp implements ServicioProducto{
    @Autowired
    RepositoryProducto repoPro;
    @Override
    public ResponseMensaje crearProducto(RequestProducto reqPr) {
        Producto p=new Producto();
        p.setNombre(reqPr.getNombre());
        p.setDescripcion(reqPr.getDescripcion());
        p.setUrl(reqPr.getUrl());
        p.setPrecio(reqPr.getPrecio());
        p.setCanInventario(reqPr.getCanInventario());
        repoPro.save(p);
        return new ResponseMensaje("Producto creado");
    }
    @Override
    public Optional<Producto> actualizarProducto(Integer id, RequestProducto reqPr)
            throws ProductoNoEncontrado {
        Optional<Producto> p=repoPro.findById(id);
        if(p.isEmpty()){
            throw new ProductoNoEncontrado("Producto","id",id);
        }else{
            p.get().setNombre(reqPr.getNombre());
            p.get().setDescripcion(reqPr.getDescripcion());
            p.get().setUrl(reqPr.getUrl());
            p.get().setPrecio(reqPr.getPrecio());
            p.get().setCanInventario(reqPr.getCanInventario());
            repoPro.save(p.get());
            return p;
        }
    }
    @Override
    public void eliminarProducto(Integer id) throws ProductoNoEncontrado{}
    @Override
    public Producto getProducoSolo(Integer id) {
        return null;
    }
    @Override
    public List<Producto> getTodosLosProductos() {
        return repoPro.findAll();
    }
}
