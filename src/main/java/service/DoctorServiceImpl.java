package service;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import repository.ArDoctorRepository;

/**
 * @author Prashant
 */
public class DoctorServiceImpl implements DoctorService {
 private Logger logger = LoggerFactory.getLogger(DoctorServiceImpl.class);
 @Autowired
 private ArDoctorRepository arDoctorRepository;

 public ResponseEntity<?> createDoctorProfile(){
  try {
   //

  }catch (Exception e){
   logger.error("Error while creating Doctor profile",e);
   return ResponseEntity.ok(0);
  }
   ResponseEntity.ok(1);
  return null;
 }

}
