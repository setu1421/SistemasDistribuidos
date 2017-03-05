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
	
	@PostConstruct
	public void init() {
		repository.save(new Anuncio("Maria", "Quiero vender mi coche BMW 320D", "20000€"));
		repository.save(new Anuncio("Carlos", "Compro BMW", "10000€"));
		repository.save(new Anuncio("Roberto", "Vendo Mercedes", "15000€"));
		
	
		categoriaRepository.save(new Categoria("Fragoneta"));
		cocheRepository.save(new Coche("4422FGU", "Seat","leon","diesel","azul","250cv",100.000,5,25000.00));
	}

	
	
	
	
	
	
	@RequestMapping("/")
	public String tablon(Model model, Pageable page) {

		model.addAttribute("anuncios", repository.findAll(page));

		return "tablon";
	}

	@RequestMapping("/anuncio/nuevo")
	public String nuevoAnuncio(Model model, Anuncio anuncio) {

		repository.save(anuncio);

		return "anuncio_guardado";

	}
	
	
	
	@RequestMapping("/anuncio/{id}")
	public String verAnuncio(Model model, @PathVariable long id) {
		
		Anuncio anuncio = repository.findOne(id);

		model.addAttribute("anuncio", anuncio);

		return "ver_anuncio";
	}
}
