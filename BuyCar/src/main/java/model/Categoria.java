package model;

import javax.persistence.*;

@Entity
public class Categoria {

	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

    private String tipoCategoria;
    private Coche coche;
	
    
	  //Constructor necesario para la carga de la BBDD
	    protected Categoria(){}


	public Categoria(String tipoCategoria, Coche coche) {
	
		this.tipoCategoria = tipoCategoria;
		this.coche = coche;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getTipoCategoria() {
		return tipoCategoria;
	}


	public void setTipoCategoria(String tipoCategoria) {
		this.tipoCategoria = tipoCategoria;
	}


	public Coche getCoche() {
		return coche;
	}


	public void setCoche(Coche coche) {
		this.coche = coche;
	}

	
	    
	  
	
	    
}
