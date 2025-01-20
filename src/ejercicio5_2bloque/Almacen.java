package ejercicio5_2bloque;

public class Almacen implements StockInterface{

    Articulo[] stockArticulos;
    int stock;
    
    public Almacen(int articulos){
        stockArticulos = new Articulo[articulos];
        stock = 0; 
    }

    

    @Override
    public boolean existe(String codigo) {
        for(Articulo a:stockArticulos){
            if(a!=null && a.getCodigo().equals(codigo))
                return true;
        }
        return false;
    }

    private int encontrarHuecoLibre(){
        int posicion = -1;
        int contador = 0;
        while(posicion == -1 && contador < stockArticulos.length){
            if(stockArticulos[contador]!=null){
                posicion = contador;
            }
            contador++;
        }
        return posicion;
    }

    private int encontrarArticulo(String codigo){
        int posicion = -1;
        int contador = 0;
        while(posicion == -1 && contador < stockArticulos.length){
            if(stockArticulos[contador].getCodigo().equals(codigo)){
                posicion = contador;
            }
            contador++;
        }
        return posicion;
    }

    @Override
    public String nuevoArticulo(Articulo a) throws ArticuloYaExisteException, EspacioInsuficienteException {
        int indice = encontrarHuecoLibre();
        if(indice!=-1)
            throw new EspacioInsuficienteException();
        indice = encontrarArticulo(a.getCodigo());
        if(indice!=-1)
            throw new ArticuloYaExisteException();
        stockArticulos[indice] = a;
        return a.codigo;
    }



    @Override
    public Articulo modificaArticulo(Articulo a) throws ArticuloNoExisteException {
        int indice = encontrarArticulo(a.getCodigo());
        if(indice==-1)
            throw new ArticuloNoExisteException();
        Articulo anterior = stockArticulos[indice];
        stockArticulos[indice] = a;
        return anterior;
    }



    @Override
    public Articulo bajaArticulo(String codigo) throws ArticuloNoExisteException {
        int indice = encontrarArticulo(codigo);
        if(indice==-1)
            throw new ArticuloNoExisteException();
        Articulo a = stockArticulos[indice];
        stockArticulos[indice] = null;
        return a;
    }



    @Override
    public int entrada(String codigo, int cantidad) throws ArticuloNoExisteException, StockException{
        int indice = encontrarArticulo(codigo);
        if(indice==-1)
            throw new ArticuloNoExisteException();
        stockArticulos[indice].setStock(stockArticulos[indice].getStock()+cantidad);
        return stockArticulos[indice].getStock();
    }



    @Override
    public int salida(String codigo, int cantidad) throws ArticuloNoExisteException, StockException {
        int indice = encontrarArticulo(codigo);
        if(indice==-1)
            throw new ArticuloNoExisteException();
        stockArticulos[indice].setStock(stockArticulos[indice].getStock()-cantidad);
        return stockArticulos[indice].getStock();
    }
}
