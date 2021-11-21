package com.progra.examenfinal_prograiv.data.models;
import java.util.Objects;
import javax.persistence.*;

@Entity
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Enumerated(EnumType.STRING)
    private String nombre;
    private String descripcion;
    private String url;
    private double precio;
    private int canInventario;
    public Producto() {}
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public double getPrecio() {
        return precio;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public int getCanInventario() {
        return canInventario;
    }
    public void setCanInventario(int canInventario) {
        this.canInventario = canInventario;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto p = (Producto) o;
        return Double.compare(p.precio, precio) == 0 &&
                Objects.equals(descripcion, p.descripcion) &&
                Objects.equals(url, p.url) &&
                Objects.equals(precio, p.precio) &&
                Objects.equals(canInventario, p.canInventario);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nombre, descripcion, url, precio, canInventario);
    }
}
