package khalfan.abe.updateApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor @Entity
public class Staff {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer staffId;
    public String fname;
    public String mname;
    public String lname;
    public String address;
}
