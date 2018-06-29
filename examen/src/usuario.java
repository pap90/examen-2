
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
public class usuario {
    private String nombre;
    private int edad;
    private String username;
    private String password;
    private ArrayList<album> playlist=new ArrayList();
    private ArrayList<album> favoritos=new ArrayList();

    public usuario() {
    }

    public usuario(String nombre, int edad, String username, String password) {
        this.nombre = nombre;
        this.edad = edad;
        this.username = username;
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<album> getPlaylist() {
        return playlist;
    }

    public void setPlaylist(ArrayList<album> playlist) {
        this.playlist = playlist;
    }

    public ArrayList<album> getFavoritos() {
        return favoritos;
    }

    public void setFavoritos(ArrayList<album> favoritos) {
        this.favoritos = favoritos;
    }

    @Override
    public String toString() {
        return username;
    }
    
    
    
}
