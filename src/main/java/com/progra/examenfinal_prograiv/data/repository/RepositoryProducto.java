package com.progra.examenfinal_prograiv.data.repository;
import com.progra.examenfinal_prograiv.data.models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryProducto  extends JpaRepository<Producto, Integer>{
}
