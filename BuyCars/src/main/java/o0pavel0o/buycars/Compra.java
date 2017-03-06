package o0pavel0o.buycars;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Compra {
	
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private long id;
	    
	    
	    private String fechaCompra;
	    private String hora;
	    private int numCoches;
	    
	    
	 
	    
	    
	    
	    /**
	     * Constructores
	     */
	    
	    protected Compra(){}



	    
	    
		public Compra(String fechaCompra, String hora, int numCoches) {
			super();
			this.fechaCompra = fechaCompra;
			this.hora = hora;
			this.numCoches = numCoches;
		}


        /**
         * Getters and Setters
         * 
         */


		public String getFechaCompra() {
			return fechaCompra;
		}



		public void setFechaCompra(String fechaCompra) {
			this.fechaCompra = fechaCompra;
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

