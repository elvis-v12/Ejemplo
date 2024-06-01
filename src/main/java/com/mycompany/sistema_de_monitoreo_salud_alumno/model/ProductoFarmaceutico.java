package com.mycompany.sistema_de_monitoreo_salud_alumno.model;

import java.util.Date;

public class ProductoFarmaceutico {
    private String codigo;
    private String nombre;
    private double precio;
    private int stock;
    private Date fechaVencimiento;
    private Proveedor proveedor;

    public ProductoFarmaceutico(String codigo, String nombre, double precio, int stock, Date fechaVencimiento) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.fechaVencimiento = fechaVencimiento;
    }

    public ProductoFarmaceutico(String codigo, String nombre, double precio, int stock, Date fechaVencimiento, Proveedor proveedor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.fechaVencimiento = fechaVencimiento;
        this.proveedor = proveedor;  // Aquí asignamos el proveedor
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
}
