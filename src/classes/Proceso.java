package sininternet;

import java.util.ArrayList;

/**
 *
 * @author Kevin Casas
 */
public class Proceso {
    
    private ArrayList<Object> a = new ArrayList<Object>();
    
    public Proceso(){}
    
    public Proceso(ArrayList<Object> a){
        this.a = a;
    }
    
    public void agregarRegistro(Datos p){
        this.a.add(p);
    }

    public void modificarRegistro(int i, Datos p){
        this.a.set(i, p);
    }
    
    public void eliminarRegistro(int i){
        this.a.remove(i);
    }
    
    public Datos obtenerRegistro(int i){
        return (Datos)a.get(i);
    }
    
    public int cantidadRegistro(){
        return this.a.size();
    }
    
//    public int buscaCodigo(int codigo){
//        for(int i = 0; i < cantidadRegistro(); i++){
//            if(codigo == obtenerRegistro(i).getNoid())return i;
//        }
//        return -1;
//    }
    
}
