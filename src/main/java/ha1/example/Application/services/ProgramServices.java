package ha1.example.Application.services;

import ha1.example.Application.entity.Program;
import ha1.example.Application.repo.ProgramRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProgramServices {

    @Autowired
    private ProgramRepo programRepo;



    public List<Program> getPrograms() {
    //    List<Program> programs = new ArrayList<>();
//        programRepo.findAll().forEach(i -> program.add(i));
        return programRepo.findAll();
    }


    public Program getPrograms(Integer programId) {
        return programRepo.findById(programId).orElseThrow();
    }

    public Program saveProgram(Program program) {
        return programRepo.save(program);
    }

    public Program updateProgram(Program program) {
        programRepo.findById(program.getProgramId()).orElseThrow();
        return programRepo.save(program);
    }

    public void deleteProgram(Integer programId) {
        programRepo.deleteById(programId);
    }
}
