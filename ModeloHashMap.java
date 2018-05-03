
/**
 * Write a description of class ModeloHaspMap here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.HashMap;
import java.util.Map;

public class ModeloHashMap extends ModeloAbs
{
    private HashMap <Integer,Producto> lista;
    
    public ModeloHashMap()
    {
       lista=new HashMap  <Integer,Producto>();
    }
    // Implementar los metodos abstractos de ModeloAbs
    public boolean insertarProducto ( Producto p){
      lista.put(p.codigo,p);
      return true;    
    }
 
    public boolean borrarProducto ( int codigo ){
        boolean borrar = false;
      for (Map.Entry pareja: lista.entrySet()) {
            if(codigo == (int)pareja.getKey()){
                pareja = null;
                borrar = true;
            }
        }
      return borrar;
    }
    
    public Producto buscarProducto ( int codigo) {
        for (Map.Entry pareja: lista.entrySet()) {
            if(codigo == (int)pareja.getKey()){
                return (Producto)pareja;
            }
        }
        return null;
    }
    
    public void listarProductos (){
        for (Map.Entry pareja: lista.entrySet()) {
           System.out.println(pareja.getValue());
        }
    }
    
    public boolean modificarProducto (Producto nuevo){
       return false;
    }
     public void pocoStock (){
           for (Map.Entry pareja: lista.entrySet()) {
        	   Producto p = (Producto)pareja.getValue();
           if(p.stock < p.stock_min){
           System.out.println(p.getValue());
        }
        }
     }
    
}    

    
 

    
    

