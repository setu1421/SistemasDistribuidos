package o0pavel0o.buycars;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Venta {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    
    private String fechaVenta;
    private String hora;
    private int numCoches;

    
    /**
     * Constructores
     */
    protected Venta(){}



	public Venta(String fechaVenta, String hora, int numCoches) {
		
		this.fechaVenta = fechaVenta;
		this.hora = hora;
		this.numCoches = numCoches;
	}



	public String getFechaVenta() {
		return fechaVenta;
	}



	public void setFechaVenta(String fechaVenta) {
		this.fechaVenta = fechaVenta;
	}



	public String getHora() {
		return hora;
	}



	public void setHora(String hora) {
		this.hora = hora;
	}



	public int getNumCoches() {
		return numCoches;
	}



	public void setNumCoches(int numCoches) {
		this.numCoches = numCoches;
	}
    
    
    
    
}
