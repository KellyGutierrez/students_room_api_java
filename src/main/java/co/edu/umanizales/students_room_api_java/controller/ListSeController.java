package co.edu.umanizales.students_room_api_java.controller;


import co.edu.umanizales.students_room_api_java.model.Node;
import co.edu.umanizales.students_room_api_java.model.Pet;
import co.edu.umanizales.students_room_api_java.service.ListSeService;
import co.edu.umanizales.students_room_api_java.model.Node;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "listse")
public class ListSeController {
    @Autowired
    private ListSeService listSeService;

    @GetMapping
    public Node getAllLinked() {
        return listSeService.getAllLinked();

    }

    @PostMapping(path = "/tostart")
    public String createPetStart(@RequestBody Pet pet) {
        return listSeService.addStart(pet);

    }

    @PostMapping(path = "/toposition/{position}")
    public String createPetPosition(@PathVariable int position,
                                    @RequestBody Pet pet) {
        return listSeService.addStart(pet);

    }
    @GetMapping(path = "/deletebyposition/{position}")
    public String deletePetPosition(@PathVariable int position)
    {
        return listSeService.deleteToPosition(position);
    }
}


