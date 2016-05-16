/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package reino;

/**
 *
 * @author Usuario
 */
public class Reino {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        clsAnimales a= new clsAnimales();
        a.setNombre("Caballo");
        
        clsAnimales a1=new clsAnimales();
        a1.setNombre("Serpiente");
        
        clsAnimales a2=new clsAnimales();
        a2.setNombre("Tiburon");
        
        clsAnimales a3=new clsAnimales();
        a3.Clase_Animal(clsAnimales.Clase.Herbivoro);
        
        clsAnimales a4=new clsAnimales();
        a4.Desplazamiento(clsAnimales.Des.Nadan);
        
        clsAnimales a5=new clsAnimales();
        a5.Respiracion(clsAnimales.Res.Branquias);
        
    }
    public void imprimir(clsAnimales a)
    {
        System.out.println("Nombre:"+a.getNombre());
       
    }
    public void imprimir1(clsAnimales a1)
    {
        System.out.println("Nombre:"+a1.getNombre());
        
    }
    
}
