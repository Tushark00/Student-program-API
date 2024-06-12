package ha1.example.Application.controller;

import ha1.example.Application.entity.Program;
import ha1.example.Application.services.ProgramServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/program")
public class ProgramController {

    @Autowired
    private ProgramServices programServices;

//    Write an api for Program resource
//
//● Get one         //done
// Get all programs //done
//● Create Program  //done
//● Update Program  //done
//● Delete Program  //done
    @GetMapping//all
    public List<Program> getPrograms(){
        return programServices.getPrograms();
    }

    @GetMapping("/{programId}") //id
    public  Program getProgram(@PathVariable Integer programId ){
        return programServices.getPrograms(programId);
    }

    @PostMapping // create
    public Program saveProgram(@RequestBody Program program){
        return programServices.saveProgram(program);
    }

    @PutMapping //update
    public Program updateProgram(@RequestBody Program program){
        return programServices.updateProgram(program);
    }

    @DeleteMapping("/{programId}") //delete
    public void deleteProgram(@PathVariable Integer programId ){
        programServices.deleteProgram(programId);
    }

}
