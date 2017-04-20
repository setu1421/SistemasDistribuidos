package o0pavel0o.buycars;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,
		RequestMethod.DELETE })
@RequestMapping("/rest")
public class ElementoRestController {

	private Map<Long, ElementoRest> rest = new ConcurrentHashMap<>();
	private AtomicLong lastId = new AtomicLong();

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public Collection<ElementoRest> rest() {
		return rest.values();
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public ElementoRest nuevoObj(@RequestBody ElementoRest obj) {

		long id = lastId.incrementAndGet();
		obj.setId(id);
		rest.put(id, obj);

		return obj;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity<ElementoRest> actulizaObj(@PathVariable long id, @RequestBody ElementoRest objActualizado) {

		ElementoRest obj = rest.get(id);

		if (obj != null) {

			objActualizado.setId(id);
			rest.put(id, objActualizado);

			return new ResponseEntity<>(objActualizado, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<ElementoRest> getObj(@PathVariable long id) {

		ElementoRest obj = rest.get(id);

		if (obj != null) {
			return new ResponseEntity<>(obj, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<ElementoRest> borraObj(@PathVariable long id) {

		ElementoRest obj = rest.remove(id);

		if (obj != null) {
			return new ResponseEntity<>(obj, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

}
