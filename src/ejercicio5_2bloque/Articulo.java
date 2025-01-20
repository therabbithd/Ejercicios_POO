package ejercicio5_2bloque;

/**
 * Clase Artículo
 * Almacena información útil de un artículo
 * Código (Alfanumérico aleatorio)
 * Descripción
 * precioCompra
 * precioVenta
 * stock (cantidad de artículo en el almacen)
 */
public class Articulo {
    String codigo;
    String descripcion;
    double precioCompra;
    double precioVenta;
    int stock;

    private static String obtenerNuevoCodigo(int longitud){
        String codigo = "";
        char minLetra = 'A';
        char maxLetra = 'Z';
        char minNumero = '0';
        char maxNumero = '9';
        for(int i = 1; i<=longitud; i++){
            if(Math.random()>0.5)
                codigo+=(char)(Math.random()*(maxLetra - minLetra - 1) + minLetra);
            else
                codigo+=(char)(Math.random()*(maxNumero - minNumero - 1) + minNumero);
        }
        return codigo;
    }

    public Articulo(String descripcion, double precioCompra, double precioVenta){
        stock = 0;
        this.descripcion = descripcion;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.codigo = obtenerNuevoCodigo(3);
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) throws StockException{
        if(stock<0)
            throw new StockException();
        this.stock = stock;
    }

    @Override
    public String toString() {
        return String.format("""
                ------------------------------------------
                Código: %s
                Descripción: %s
                Precio de compra: %.2f
                Precio de venta: %.2f
                Stock: %d unidades
                """,codigo, descripcion, precioCompra, precioVenta, stock);
    }
}

