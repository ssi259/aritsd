package repository;

import domain.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Prashant
 */
public interface ArDoctorRepository extends JpaRepository<Doctor,Long> {


}
