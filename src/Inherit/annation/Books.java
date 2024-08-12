package Inherit.annation;

import javax.persistence.*;
@Entity
@DiscriminatorValue("lib")
public class Books extends Libraory {
    @Column
    public int edition;
    @Column
    public String name;
    @Column
    public String Authour;

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAuthour() {
        return Authour;
    }

    public void setAuthour(String authour) {
        Authour = authour;
    }
}
