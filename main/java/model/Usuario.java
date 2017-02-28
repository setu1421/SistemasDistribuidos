package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
    
    private String nombre;
    private String direccion;
    private String email;
    private String telefono;
    
    
//Constructor necesario para la carga de la BBDD
    protected Usuario(){}


public Usuario(String nombre, String direccion, String email, String telefono) {
	
	this.nombre = nombre;
	this.direccion = direccion;
	this.email = email;
	this.telefono = telefono;
}


public long getId() {
	return id;
}


public void setId(long id) {
	this.id = id;
}


public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}


public String getDireccion() {
	return direccion;
}


public void setDireccion(String direccion) {
	this.direccion = direccion;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}


public String getTelefono() {
	return telefono;
}


public void setTelefono(String telefono) {
	this.telefono = telefono;
}
    




    
    
}
