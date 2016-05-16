/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package reino;

/**
 *
 * @author Usuario
 */
public class clsAnimales {
    enum Clase {Herbivoro,Vertebrado,Invertebrado};
    enum Sex {Macho,Hembra};
    enum Res {Branquias, Pulmones};
    enum Pat {Tiene_Patas,No_Tiene_Patas};
    enum Rep {Oviparos, Viviparos};
    enum Tipo {Ave,Mamifero,Reptil};
    enum Hab {Tierra, Agua};
    enum Des {Caminan, Vuelan, Nadan};
    
    private String _Nombre;
    private int _Edad;
    private Clase _Clase_Ani;
    private reino.clsAnimales.Des _Desplazamiento;
    private reino.clsAnimales.Hab _Habitat;
    private reino.clsAnimales.Pat _Patas;
    private reino.clsAnimales.Rep _Reproduccion;
    private reino.clsAnimales.Res _Respiracion;
    private reino.clsAnimales.Sex _Sexo;
    private reino.clsAnimales.Tipo _Tipo;
    
    public clsAnimales() {
    }

    public clsAnimales(String nombre, int edad, Clase clase)
    {
        this._Nombre = nombre;
        this._Edad = edad;
        this._Clase_Ani = clase;
    }

    public Clase clase() {
        return _Clase_Ani;
    }

    public void Clase_Animal(Clase clase) {
        this._Clase_Ani = clase;
    }
 public String getNombre() {
        return _Nombre;
    }

    public void setNombre(String Nombre) {
        this._Nombre = Nombre;
    }

    public int Edad() {
        return _Edad;
    }

    public void Edad(int Edad) {
        this._Edad = Edad;
    }

    public Clase Clase_Ani() {
        return _Clase_Ani;
    }

    public void Clase_Ani(Clase Clase_Ani) {
        this._Clase_Ani = Clase_Ani;
    }

    public reino.clsAnimales.Des Desplazamiento() {
        return _Desplazamiento;
    }

    public void Desplazamiento(reino.clsAnimales.Des Desplazamiento) {
        this._Desplazamiento = Desplazamiento;
    }

    public reino.clsAnimales.Hab Habitat() {
        return _Habitat;
    }

    public void Habitat(reino.clsAnimales.Hab Habitat) {
        this._Habitat = Habitat;
    }

    public reino.clsAnimales.Pat Patas() {
        return _Patas;
    }

    public void Patas(reino.clsAnimales.Pat Patas) {
        this._Patas = Patas;
    }

    public reino.clsAnimales.Rep Reproduccion() {
        return _Reproduccion;
    }

    public void Reproduccion(reino.clsAnimales.Rep Reproduccion) {
        this._Reproduccion = Reproduccion;
    }

    public reino.clsAnimales.Res Respiracion() {
        return _Respiracion;
    }

    public void Respiracion(reino.clsAnimales.Res Respiracion) {
        this._Respiracion = Respiracion;
    }

    public reino.clsAnimales.Sex Sexo() {
        return _Sexo;
    }

    public void Sexo(reino.clsAnimales.Sex Sexo) {
        this._Sexo = Sexo;
    }

    public reino.clsAnimales.Tipo Tipo() {
        return _Tipo;
    }

    public void Tipo(reino.clsAnimales.Tipo Tipo) {
        this._Tipo = Tipo;
    }
}