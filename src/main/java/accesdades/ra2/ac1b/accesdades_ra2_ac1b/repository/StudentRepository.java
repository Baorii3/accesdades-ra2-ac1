package accesdades.ra2.ac1b.accesdades_ra2_ac1b.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import accesdades.ra2.ac1b.accesdades_ra2_ac1b.model.Student;

@Repository
public class StudentRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    private static final class StudentRowMapper implements RowMapper<Student>{
        
        // Convierte una fila del ResultSet en un objeto Student
        @Override
        public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
            
            Student student = new Student();
            student.setId(rs.getLong("id"));
            student.setNom(rs.getString("nom"));
            student.setCognom(rs.getString("cognom"));
            student.setAge(rs.getInt("age"));
            student.setCicle(rs.getString("cicle"));
            student.setAny(rs.getInt("anyo"));
            return student;
        }
    }

    public List<Student> findAll(){
        String sql = "select * from students";
        return jdbcTemplate.query(sql, new StudentRowMapper());
    }

    public int save(){
        String sql = "insert into Students (nom, age, cicle) values (?, ?, ?)";
        return jdbcTemplate.update(sql, "Ian", 19, "tercero");
    }
}
