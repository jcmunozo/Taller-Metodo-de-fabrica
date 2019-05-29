package co.agenciaviajes.clientemain;

import java.util.logging.Level;
import java.util.logging.Logger;
import co.agenciaviajes.negocio.FabricaPagos;
import co.agenciaviajes.negocio.Pago;

/**
 * 29 de Mayo / 2019
 * @author Alexander Inagan
 */
public class ClienteMain {

    /**
     * Simula un objeto cliente que consume los servicios de la fábrica
     *
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     * @throws java.lang.InstantiationException
     */
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException {
        FabricaPagos factory = new FabricaPagos();

        Pago pago; // Referencia a la clase base
        try {
            pago = factory.getPago("co.agenciaviajes.negocio.PagoEfectivo");
            pago.registrarPago();

            pago = factory.getPago("co.agenciaviajes.negocio.PagoTarjetaCredito");
            pago.registrarPago();

            pago = factory.getPago("co.agenciaviajes.negocio.PagoTarjetaDebito");
            pago.registrarPago();
            
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(ClienteMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
