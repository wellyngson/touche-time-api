package br.touchetimeapi.repository;

import br.touchetimeapi.model.Athlete;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AthleteRepository extends JpaRepository<Athlete, Long> {

    Athlete findAthleteById(long id);
}
