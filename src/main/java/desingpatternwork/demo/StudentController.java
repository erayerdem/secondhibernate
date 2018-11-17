package desingpatternwork.demo;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

@RestController
@RequestMapping("students")
@AllArgsConstructor
public class StudentController {

    private final SqlRepository<Student> sqlRepository;


    @PostMapping
    public void responseEntity(@RequestBody Student student) throws SQLException, NoSuchFieldException, IllegalAccessException {

        sqlRepository.persistSaveData(student);


    }



}
