package o0pavel0o.buycars;

public class ElementoRest {

	private long id = -1;
	private String description;
	private String marca;
	private String modelo;

	public ElementoRest() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	@Override
	public String toString() {
		return "Item [id=" + id + ", description=" + description + ",  modelo=" + modelo + ", marca=" + marca + "]";
	}

}
