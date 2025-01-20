package ejercicio5_2bloque;

public interface StockInterface {
    /**
     * Añade un nuevo artículo al almacen
     * @param a Articulo a añadir
     * @return El códidgo del articulo
     * @throws ArticuloYaExisteException Si el artículo ya existe en el almacen
     * @throws EspacioInsuficienteException Si no hay espacio suficiente en el almacen
     */
    public String nuevoArticulo(Articulo a) throws ArticuloYaExisteException, EspacioInsuficienteException;

    /**
     * Modifica los datos de un artículo del almacen
     * @param a Artículo con los nuevos datos
     * @return El Artículo antes de modificarlo
     * @throws ArticuloNoExisteException Si no existe el artículo en el almacen
     */
    public Articulo modificaArticulo(Articulo a) throws ArticuloNoExisteException;

    /**
     * Elimina un artículo del almacen
     * @param codigo Código del artículo a eliminar
     * @return El artículo eliminado
     * @throws ArticuloNoExisteException Si el artículo no existe en el almacen
     */
    public Articulo bajaArticulo(String codigo) throws ArticuloNoExisteException;

    /**
     * Añade stock a un artículo
     * @param codigo Código del artículo 
     * @param cantidad Cantidad a añadir al stock actual
     * @return El nuevo stock del artículo
     * @throws ArticuloNoExisteException Si el artículo no existe en el almacen
     * @throws StockException Si el stock es inválido
     */
    public int entrada(String codigo, int cantidad) throws ArticuloNoExisteException, StockException;

    /**
     * Elimina stock del almacen
     * @param codigo Código del artículo
     * @param cantidad Cantidad a eliminar del stock
     * @return Nuevo stock del artículo
     * @throws ArticuloNoExisteException Si el artículo no existe
     * @throws StockException Si el stock es inválido
     */
    public int salida(String codigo, int cantidad) throws ArticuloNoExisteException, StockException;

    /**
     * Devuelve si existe el artículo en el almacen
     * @param codigo Código del artículo a buscar
     * @return true si existe, false si no.
     */
    public boolean existe(String codigo);
}
