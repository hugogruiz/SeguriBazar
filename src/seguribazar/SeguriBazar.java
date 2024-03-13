/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package seguribazar;

/**
 *
 * @author Simple
 */
public class SeguriBazar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creación de instancias de las aplicaciones
        ClienteApp clienteApp = new ClienteApp();
        PersonalBazarApp personalBazarApp = new PersonalBazarApp();
        ServidorCentral servidorCentral = new ServidorCentral();

        // Creación de instancias de otras clases del sistema
        BaseDatosIncidentes baseDatos = new BaseDatosIncidentes();
        SistemaMonitoreo sistemaMonitoreo = new SistemaMonitoreo();

        // Ejecución de operaciones del sistema
        clienteApp.iniciar();
        clienteApp.reportarIncidente("Vandalismo en la sección de frutas");

        personalBazarApp.iniciar();
        personalBazarApp.generarInforme();

        servidorCentral.registrarIncidente("Robo en el área de cajas");
        servidorCentral.accederCapacitacion();

        // Simulación de otras operaciones del sistema
        baseDatos.guardarIncidente("Robo en el área de cajas");
        sistemaMonitoreo.monitorear();
    }
    
}
