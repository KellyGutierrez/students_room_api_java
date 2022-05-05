package co.edu.umanizales.students_room_api_java.controller;

import co.edu.umanizales.students_room_api_java.model.Node;
import co.edu.umanizales.students_room_api_java.model.Pet;
import co.edu.umanizales.students_room_api_java.service.ListCircularService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/listsecircular")
public class ListCircularController {
    @Autowired
    private ListCircularService listCircularService;

    @GetMapping
    public Node getAllLinked(){
        return listCircularService.getAllLinked();
    }

    @PostMapping
    public String createPet(@RequestBody Pet pet)
    {
        return listCircularService.add(pet);
    }

    @PostMapping(path="/tostart")
    public String createPetToStart(@RequestBody Pet pet){
        return listCircularService.addToStart(pet);
    }

    @GetMapping(path = "/invert")
    public String invertList()
    {
        return listCircularService.invert();
    }

    @PostMapping(path = "/loadpets")
    public String loadPets(@RequestBody List<Pet> pets)
    {
        for(Pet pet:pets)
        {
            listCircularService.add(pet);
        }
        return "Mascotas cargadas exitosamente";

    }
}

