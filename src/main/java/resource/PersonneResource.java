package resource;

import model.Personne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import service.PersonneService;

@RestController
public class PersonneResource {
    @Autowired
    private PersonneService personneResource = new PersonneService();

    @GetMapping("/personnes")
    public Iterable<Personne> getAll(){
        return personneResource.getAll();
    }
}
