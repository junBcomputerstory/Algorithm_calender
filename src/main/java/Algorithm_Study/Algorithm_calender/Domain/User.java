package Algorithm_Study.Algorithm_calender.Domain;


import jakarta.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long User_id;

    @Column(name="User_name")
    private String name;

    public void setUser_id(Long user_id) {
        User_id = user_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getUser_id() {
        return User_id;
    }

    public String getName() {
        return name;
    }
}
