package co.agenciaviajes.negocio;

/**
 * Clase abstracta de pagos
 *
 * @author Libardo Pantoja, Ricardo Zambrano, Julio A. Hurtado
 */
public abstract class Pago {

    protected int valor;
    protected Cliente cliente;

    // Completar constructores

public Pago(){
}

    public Pago(int pvalor, Cliente pcliente) {
        this.valor = pvalor;
        this.cliente = pcliente;
    }
    
    public abstract void registrarPago();

    // Completar getters and setters

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}
