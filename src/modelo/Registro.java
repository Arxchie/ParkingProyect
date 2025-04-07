/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class Registro
{

    public static void main(String[] args)
    {
        Registro miRegistro = new Registro(new Vehiculo("abcd"), new Tarifa("Tarifa 1", 1, 10));
        try
        {
            Thread.sleep(2000);
        } catch (InterruptedException ex)
        {
            Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
        }
        miRegistro.registrarSalida();
        System.out.println(miRegistro.toString());

    }

    private Vehiculo vehiculo;
    private LocalDateTime horaEntrada;
    private LocalDateTime horaSalida;
    private Tarifa tarifa;

    public Registro(Vehiculo vehiculo, Tarifa tarifa)
    {
        this.horaEntrada = LocalDateTime.now();
        this.vehiculo = vehiculo;
        this.tarifa = tarifa;
    }

    public Vehiculo getVehiculo()
    {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo)
    {
        this.vehiculo = vehiculo;
    }

    public LocalDateTime getHoraEntrada()
    {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalDateTime horaEntrada)
    {
        this.horaEntrada = horaEntrada;
    }

    public LocalDateTime getHoraSalida()
    {
        return horaSalida;
    }

    public void setHoraSalida(LocalDateTime horaSalida)
    {
        this.horaSalida = horaSalida;
    }

    public Tarifa getTarifa()
    {
        return tarifa;
    }

    public void setTarifa(Tarifa tarifa)
    {
        this.tarifa = tarifa;
    }

    public void registrarSalida()
    {
        horaSalida = LocalDateTime.now();
    }

    public double calcularTotal()
    {
        double total = 0;

        if (horaSalida != null)
        {
            double tiempoEstancia = tiempoDeEstancia();
            total = tiempoEstancia * tarifa.getPrecio() / tarifa.getMinutos();
        }
        return total;
    }

    public double tiempoDeEstancia()
    {
        double tiempoEstancia = 0;
        tiempoEstancia = Duration.between(horaEntrada, horaSalida).toSeconds();//puesto en segundos solo para probar
        return tiempoEstancia;

    }

    @Override
    public String toString()
    {
        return "Registro{" + "vehiculo=" + vehiculo.getPlaca() + ", horaEntrada=" + horaEntrada + ", horaSalida=" + horaSalida + ", tarifa="
                + tarifa.getPrecio() + " por " + tarifa.getMinutos() + " minutos,"+" Tiempo estaionado: "+tiempoDeEstancia() +
                " minutos"+ " Total: " + calcularTotal() + '}';
    }

}
