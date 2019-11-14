package service;

import model.Personne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.PersonneRepository;

@Service
public class PersonneService {
    @Autowired
    PersonneRepository personneRepository = new PersonneRepository();

    public Iterable<Personne> getAll(){
        return personneRepository.findAll();
    }


}
