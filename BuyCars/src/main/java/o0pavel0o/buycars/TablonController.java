package o0pavel0o.buycars;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TablonController {

	@Autowired
	private AnunciosRepository repository;
    

	@Autowired
	private CategoriaRepository categoriaRepository;
	

	@Autowired
	private CocheRepository cocheRepository;
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private CompraRepository compraRepository;
	
	
	@Autowired
	private VentaRepository ventaRepository;
	
	@PostConstruct
	public void init() {
		repository.save(new Anuncio("Maria", "Quiero vender mi coche BMW 320D", "20000€"));
		repository.save(new Anuncio("Carlos", "Vendo Audi", "10000€"));
		repository.save(new Anuncio("Roberto", "Vendo Mercedes", "15000€"));
		
	
		categoriaRepository.save(new Categoria("Furgoneta"));
		cocheRepository.save(new Coche("4422FGU", "BMW","320","diesel","rojo","250cv",100.000,5,25000.00));
		cocheRepository.save(new Coche("5555FGU", "Audi","A5","diesel","azul","350cv",100.000,5,25000.00));
		cocheRepository.save(new Coche("4422FFF", "Mercedes","A180","gasolina","negro","150cv",100.000,5,25000.00));
   
	//Creo usuario
	Usuario u1 = new Usuario("Pedro",0,"cerca de casa","notengo@gmail.com","677455558");
	usuarioRepository.save(u1);
	
    //Creo compra
	Compra c1 = new Compra("6/03/2017","02:45",2);
	compraRepository.save(c1);
	
	//Creo venta
	Venta v1 = new Venta("07/03/2017","02:55",1);
	ventaRepository.save(v1);
	}

	
	@RequestMapping("/")
	public String tablon(Model model, Pageable page) {

		model.addAttribute("anuncios", repository.findAll(page));
		model.addAttribute("anunciosCount", repository.count());
		model.addAttribute("usuarios", usuarioRepository.count());
		model.addAttribute("categorias", categoriaRepository.count());
		model.addAttribute("coches", cocheRepository.count());

		return "tablon";
	}

	@RequestMapping("/anuncio/nuevo")
	public String nuevoAnuncio(Model model, Anuncio anuncio, Coche coche) {

		repository.save(anuncio);
		cocheRepository.save(coche);

		return "anuncio_guardado";

	}
	
	
	
	@RequestMapping("/anuncio/{id}")
	public String verAnuncio(Model model, @PathVariable long id) {
		
		Anuncio anuncio = repository.findOne(id);

		model.addAttribute("anuncio", anuncio);

		return "ver_anuncio";
	}
	
	
	@RequestMapping("/categoria/nueva")
	public String nuevaCategoria(Model model, Categoria categoria) {

		categoriaRepository.save(categoria);

		return "categoria_guardada";

	}
	
	
	@RequestMapping("/usuario/nuevo")
	public String nuevoUsuario(Model model, Usuario usuario) {

		usuarioRepository.save(usuario);

		return "usuario_guardado";

	}
	
	
	
}
