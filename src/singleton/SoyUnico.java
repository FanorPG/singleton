
package singleton;


public class SoyUnico {
    
    private String nombre;
    
// Instance
    private static SoyUnico soyUnico=null;
    
//Método privado
    private SoyUnico(String nombre) {
        this.nombre = nombre;
    }
    
//Método de acceso
    public static SoyUnico getSoyUnicoInstancia(String nombre){
        if(soyUnico==null){
            soyUnico=new SoyUnico(nombre);
        }else{
            System.out.println("El objeto ya estaba creado");
        }
        
        return soyUnico;
    }

// metodos getter y setter      
        
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static SoyUnico getSoyUnico() {
        return soyUnico;
    }

    public static void setSoyUnico(SoyUnico soyUnico) {
        SoyUnico.soyUnico = soyUnico;
    }
}
