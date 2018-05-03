
/**
 * Implementa la parte de Modelo de Datow
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class ModeloArrayList extends ModeloAbs
{
    private ArrayList <Producto> lista;
    
    public ModeloArrayList()
    {
       lista=new ArrayList <Producto>();
    }

    // Implementar los metodos abstractos de ModeloAbs
    public boolean insertarProducto ( Producto p){
      lista.add(p);
      return true;
    }
 
    public boolean borrarProducto ( int codigo ){
      for(int i = 0; i < lista.size();i++){
          if(codigo == lista.get(i).codigo){
              lista.remove(i);
              return true;
            }
        }
        
      return false;
    }
    
    public Producto buscarProducto ( int codigo) {
      
        for(int i = 0; i < lista.size(); i++){
            if(codigo == lista.get(i).codigo){
            Producto buscado = lista.get(i);
            return buscado;
            }
        }
      return null;  
    }
    
    public void listarProductos (){
        for(int i = 0; i<lista.size();i++){
        System.out.println(lista.get(i));
        }
    }
    
    public boolean modificarProducto (Producto nuevo){
       return false;
    }
    public void pocoStock (){
    for (int i = 0; i<lista.size();i++){
        if(lista.get(i).stock < lista.get(i).stock_min){
            System.out.println(lista.get(i));
        } 
    }
    
    }
    
}    
