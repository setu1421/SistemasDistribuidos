package o0pavel0o.buycars;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Coche {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	    
    private String matricula;
    private String marca;
    private String modelo;
    private String combustible;
    private String color;
    private String potencia;
    private float kilometros;
    private int plazas;
    private float precio;
    
    private List<String> equipamientoExtra;
    
    
  //Constructor necesario para la carga de la BBDD
    protected Coche(){}

    


	public Coche(String matricula, String marca, String modelo, String combustible, String color, String potencia,
			float kilometros, int plazas, float precio, List<String> equipamientoExtra) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.combustible = combustible;
		this.color = color;
		this.potencia = potencia;
		this.kilometros = kilometros;
		this.plazas = plazas;
		this.precio = precio;
		this.equipamientoExtra = equipamientoExtra;
	}




	public long getId() {
		return id;
	}




	public void setId(long id) {
		this.id = id;
	}




	public String getMatricula() {
		return matricula;
	}




	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}




	public String getMarca() {
		return marca;
	}




	public void setMarca(String marca) {
		this.marca = marca;
	}




	public String getModelo() {
		return modelo;
	}




	public void setModelo(String modelo) {
		this.modelo = modelo;
	}




	public String getCombustible() {
		return combustible;
	}




	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}




	public String getColor() {
		return color;
	}




	public void setColor(String color) {
		this.color = color;
	}




	public String getPotencia() {
		return potencia;
	}




	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}




	public float getKilometros() {
		return kilometros;
	}




	public void setKilometros(float kilometros) {
		this.kilometros = kilometros;
	}




	public int getPlazas() {
		return plazas;
	}




	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}




	public float getPrecio() {
		return precio;
	}




	public void setPrecio(float precio) {
		this.precio = precio;
	}




	public List<String> getEquipamientoExtra() {
		return equipamientoExtra;
	}




	public void setEquipamientoExtra(List<String> equipamientoExtra) {
		this.equipamientoExtra = equipamientoExtra;
	}
	
    
    
	
	
	
    
	
}
