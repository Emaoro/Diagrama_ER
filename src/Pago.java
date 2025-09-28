public class Pago {
    private int idPago;
    private String fechaPago;
    private double monto;
    private String metodoPago;

    public Pago(int idPago, String fechaPago, double monto, String metodoPago) {
        this.idPago = idPago;
        this.fechaPago = fechaPago;
        this.monto = monto;
        this.metodoPago = metodoPago;
    }

    // Getters
    public int getIdPago() {
        return idPago;
    }

    public String getFechaPago() {
        return fechaPago;
    }

    public double getMonto() {
        return monto;
    }

    public String getMetodoPago() {
        return metodoPago;
    }
}
