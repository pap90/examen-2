
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class album {
    private String nombre;
    private String artista;
    private ArrayList<cancion> c=new ArrayList();

    public album() {
    }

    public album(String nombre, String artista) {
        this.nombre = nombre;
        this.artista = artista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public ArrayList<cancion> getC() {
        return c;
    }

    public void setC(ArrayList<cancion> c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
