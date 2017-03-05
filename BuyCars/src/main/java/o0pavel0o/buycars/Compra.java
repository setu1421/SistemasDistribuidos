package o0pavel0o.buycars;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Compra {

	

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private Usuario usuario;
	private Coche coche;
	
	
	
	
	protected Compra(){}




	public long getId() {
		return id;
	}




	public void setId(long id) {
		this.id = id;
	}




	public Usuario getUsuario() {
		return usuario;
	}




	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}




	public Coche getCoche() {
		return coche;
	}




	public void setCoche(Coche coche) {
		this.coche = coche;
	}
	
	
	
	
}
