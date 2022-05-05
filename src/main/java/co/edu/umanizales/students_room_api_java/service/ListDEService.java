package co.edu.umanizales.students_room_api_java.service;

import co.edu.umanizales.students_room_api_java.model.ListDE;
import co.edu.umanizales.students_room_api_java.model.Node;
import co.edu.umanizales.students_room_api_java.model.Pet;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
public class ListDEService {
    private ListDE list= new ListDE();

    public Node getAllLinked(){
        return this.list.enlist();
    }
    public String add(Pet pet){
        this.list.add(pet);
        return "Adicionado con exito";
    }
    public String addToStart(Pet pet){
        this.list.addToStart(pet);
        return "Adicionado con éxito";
    }

    public String invert()
    {
        try {
            this.list.invert();
            return "Invertido con éxito.";
        }
        catch (Exception e)
        {
            return e.getMessage();
        }
    }
}


