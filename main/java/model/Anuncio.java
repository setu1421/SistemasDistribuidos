package model;

import javax.persistence.*;

@Entity
public class Anuncio {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private Coche coche;
	private Usuario propietario;
	private String comentario;
	
	
	   
	  //Constructor necesario para la carga de la BBDD
	    protected Anuncio(){}



		public Anuncio(Coche coche, Usuario propietario, String comentario) {
			this.coche = coche;
			this.propietario = propietario;
			this.comentario = comentario;
		}



		public long getId() {
			return id;
		}



		public void setId(long id) {
			this.id = id;
		}



		public Coche getCoche() {
			return coche;
		}



		public void setCoche(Coche coche) {
			this.coche = coche;
		}



		public Usuario getPropietario() {
			return propietario;
		}



		public void setPropietario(Usuario propietario) {
			this.propietario = propietario;
		}



		public String getComentario() {
			return comentario;
		}



		public void setComentario(String comentario) {
			this.comentario = comentario;
		}
	    
	 
		
		
	    
}
