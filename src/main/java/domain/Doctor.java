package domain;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import java.sql.Timestamp;

/**
 * @author Prashant
 */
@Entity
@Table(name = "ar_doctor",schema = "heroku_6004db5a2f7c285")
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Doctor {
    private long id;
    private String mciRegistrationNumber;
    private String userName;
    private String mbbsCollege;
    private int yearPassOutMbbs;
    private String  mastersCollege;
    private int yearPassOutMasters;
    private String image;
    private String description;
    private Timestamp createdOn;
    private Timestamp modifiedOn;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true,nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    @NotBlank(message = "MCI Registration Number cannot be blank")
    @Column(name = "mci_registration_number",unique = true,nullable = false)
    public String getMciRegistrationNumber() {
        return mciRegistrationNumber;
    }

    public void setMciRegistrationNumber(String mciRegistrationNumber) {
        this.mciRegistrationNumber = mciRegistrationNumber;
    }

    @NotBlank(message = "User Name cannot be blank")
    @Column(name = "user_name",nullable = false)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @NotBlank(message = "MBBS  cannot be blank")
    @Column(name = "college_mbbs", nullable = false)
    public String getMbbsCollege() {
        return mbbsCollege;
    }

    public void setMbbsCollege(String mbbsCollege) {
        this.mbbsCollege = mbbsCollege;
    }

    @NotBlank(message = "MBBS pass out year cannot be blank")
    @Digits(integer = 4,message = "Must be a number", fraction = 0)
    @Column(name = "year_passout_mbbs", nullable = false)
    public int getYearPassOutMbbs() {
        return yearPassOutMbbs;
    }

    public void setYearPassOutMbbs(int yearPassOutMbbs) {
        this.yearPassOutMbbs = yearPassOutMbbs;
    }
    @NotBlank(message = "Masters college name cannot be blank")
    @Column(name = "coellge_masters", nullable = false)
    public String getMastersCollege() {
        return mastersCollege;
    }

    public void setMastersCollege(String mastersCollege) {
        this.mastersCollege = mastersCollege;
    }

    @NotBlank(message = "Masters passing out year cannot be blank")
    @Digits(integer = 4,message = "Must be a number", fraction = 0)
    @Column(name = "year_passout_masters", nullable = false)
    public int getYearPassOutMasters() {
        return yearPassOutMasters;
    }

    public void setYearPassOutMasters(int yearPassOutMasters) {
        this.yearPassOutMasters = yearPassOutMasters;
    }

    @Column(name = "img_usr", nullable = false)
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Column(name = "description",nullable = true)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "created_on")
    public Timestamp getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }

    @Column(name = "modified_on")
    public Timestamp getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(Timestamp modifiedOn) {
        this.modifiedOn = modifiedOn;
    }
}
