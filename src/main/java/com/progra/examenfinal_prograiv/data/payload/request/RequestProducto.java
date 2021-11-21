package com.progra.examenfinal_prograiv.data.payload.request;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class RequestProducto {
    @NotBlank
    @NotNull
    private String nombre;
    @NotBlank
    @NotNull
    private String descripcion;
    @NotBlank
    @NotNull
    private String url;
    @NotBlank
    @NotNull
    private double precio;
    @NotBlank
    @NotNull
    private int canInventario;
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
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public double getPrecio() {
        return precio;
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
}
