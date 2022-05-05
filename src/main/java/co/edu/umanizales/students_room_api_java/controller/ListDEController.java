package co.edu.umanizales.students_room_api_java.controller;

import co.edu.umanizales.students_room_api_java.model.Node;
import co.edu.umanizales.students_room_api_java.model.Pet;
import co.edu.umanizales.students_room_api_java.service.ListDEService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/listde")
public class ListDEController {
    @Autowired
    private ListDEService listDEService;

    @GetMapping
    public Node getAllLinked(){
        return listDEService.getAllLinked();
    }

    @PostMapping
    public String createPet(@RequestBody Pet pet)
    {
        return listDEService.add(pet);
    }

    @PostMapping(path="/tostart")
    public String createPetToStart(@RequestBody Pet pet){
        return listDEService.addToStart(pet);
    }

    @GetMapping(path = "/invert")
    public String invertList()
    {
        return listDEService.invert();
    }

    @PostMapping(path = "/loadpets")
    public String loadPets(@RequestBody List<Pet> pets)
    {
        for(Pet pet:pets)
        {
            listDEService.add(pet);
        }
        return "Mascotas cargadas exitosamente";

    }
}




