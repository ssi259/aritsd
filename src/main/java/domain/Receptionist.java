package domain;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "ar_receptionist", schema = "heroku_6004db5a2f7c285")
public class Receptionist {


    @Column(name = "id")
    @Id
    @NotNull
    private String id;

    @NotNull
    @Column(name = "name")
    String name;

    @NotNull
    @Column(name = "phone_number")
    Integer phone;

    @NotNull
    @Column(name = "doctor_id")
    String docId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getDocId() {
        return docId;
    }

    public void setDocId(String docId) {
        this.docId = docId;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
