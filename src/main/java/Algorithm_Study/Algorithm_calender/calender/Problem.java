package Algorithm_Study.Algorithm_calender.calender;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Problem {

    @Id @GeneratedValue
    @Column(name="Problem_id")
    private long id;

    @Column(name="url")
    private String url;

    public void setId(long id) {
        this.id = id;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public long getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }
}
