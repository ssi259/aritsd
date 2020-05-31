package service;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import repository.ArDoctorRepository;
import utils.BaseResponse;

/**
 * @author Prashant
 */
public class DoctorServiceImpl implements DoctorService {
 private Logger logger = LoggerFactory.getLogger(DoctorServiceImpl.class);
 @Autowired
 private ArDoctorRepository arDoctorRepository;

 public BaseResponse createDoctorProfile(){
  BaseResponse baseResponse =new BaseResponse();
  try {
   //

  }catch (Exception e){
   logger.error("Error while creating Doctor profile",e);
   baseResponse.setStatusCOde(0);
   return baseResponse;
  }
   baseResponse.setStatusCOde(1);
  return baseResponse;
 }

}
