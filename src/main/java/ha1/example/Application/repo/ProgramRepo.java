package ha1.example.Application.repo;

import ha1.example.Application.entity.Program;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgramRepo extends JpaRepository<Program,Integer> {
}
