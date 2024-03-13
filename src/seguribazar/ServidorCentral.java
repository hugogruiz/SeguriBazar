/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seguribazar;

/**
 *
 * @author Simple
 */
public class ServidorCentral extends Aplicacion {
     // Métodos específicos para el servidor central
    public void registrarIncidente(String incidente) {
        System.out.println("Registrando incidente en la base de datos: " + incidente);
    }

    public void accederCapacitacion() {
        System.out.println("Accediendo a la capacitación en seguridad");
    }
}
