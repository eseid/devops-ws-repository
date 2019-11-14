package repository;

import model.Personne;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class PersonneRepository {
    Map<Long, Personne> map = new HashMap<>();

    public Iterable<Personne> findAll(){
        return map.values();
    }

}
