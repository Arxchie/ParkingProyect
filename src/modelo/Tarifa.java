/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author HP
 */
public class Tarifa
{
    public static void main(String[] args)
    {
        Tarifa tarifa=new Tarifa("Tarifa 1", 60, 15);
        System.out.println(tarifa.toString());
        
    }
    private String nombre;
    private String descripcion="Sin descripcion";
    private int minutos;
    private double precio;

    public Tarifa(String nombre, int minutos, double precio)
    {
        this.nombre = nombre;
        this.minutos = minutos;
        this.precio = precio;
    }

    
    public Tarifa(String nombre, String descripcion, int minutos, double precio)
    {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.minutos = minutos;
        this.precio = precio;
    }
    

    /**
     * @return the nombre
     */
    public String getNombre()
    {
        return nombre;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion()
    {
        return descripcion;
    }

    /**
     * @return the minutos
     */
    public int getMinutos()
    {
        return minutos;
    }

    /**
     * @return the precio
     */
    public double getPrecio()
    {
        return precio;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion)
    {
        this.descripcion = descripcion;
    }

    /**
     * @param minutos the minutos to set
     */
    public void setMinutos(int minutos)
    {
        this.minutos = minutos;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio)
    {
        this.precio = precio;
    }

    
    @Override
    public String toString()
    {
        return "Tarifa{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", minutos=" + minutos + ", precio=" + precio + '}';
    }
    
    
}
