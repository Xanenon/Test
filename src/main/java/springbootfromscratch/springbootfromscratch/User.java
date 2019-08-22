package springbootfromscratch.springbootfromscratch;

import javax.persistence.*;
import java.io.Serializable;

class CompositeKey implements Serializable {

    private Integer id;
    private String nachname;

}

@IdClass(CompositeKey.class)
@Entity // This tells Hibernate to make a table out of this class
@Table(name="person") // Ohne der Table Spezifikation werden die Einträge nicht aus der Datenbank ausgelesen
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String vorname;

    @Id
    private String nachname;

    /*
    @Column(name = "Vorname") private String vorname;
    @Column(name = "Nachname")private String nachname;
    */

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }
}
