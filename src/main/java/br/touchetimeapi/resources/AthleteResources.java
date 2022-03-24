package br.touchetimeapi.resources;

import br.touchetimeapi.model.Athlete;
import br.touchetimeapi.repository.AthleteRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/touchetime")
@Api(value = "Touche Time API REST")
@CrossOrigin(origins = "*")
public class AthleteResources {

    @Autowired
    AthleteRepository athleteRepository;

    @GetMapping("/athletes")
    @ApiOperation(value = "This method return a athlete list")
    public List<Athlete> getAllAthletes() {
        return athleteRepository.findAll();
    }

    @GetMapping("/athlete/{id}")
    @ApiOperation(value = "This method return a athlete with id selected for user")
    public Athlete getAthleteById(@PathVariable(value = "id") Long id) {
        return athleteRepository.findAthleteById(id);
    }

    @PostMapping("/athlete")
    @ApiOperation(value = "This method create a athlete")
    public Athlete createAthlete(@RequestBody Athlete athlete) {
        return athleteRepository.save(athlete);
    }

    @DeleteMapping("/athlete/{id}")
    @ApiOperation(value = "This method delete a athlete")
    public void deleteAthleteById(@PathVariable(value = "id") Long id) {
        athleteRepository.deleteById(id);
    }

    @PutMapping("/athlete")
    @ApiOperation(value = "This method update a athlete")
    public Athlete updateAthlete(@RequestBody Athlete athlete) {
        return athleteRepository.save(athlete);
    }
}
