package Inherit.annation;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("dvd")
public class DVD  extends  Libraory{
@Column
    private int serioalNo;
@Column
    private String Name;

    public int getSerioalNo() {
        return serioalNo;
    }

    public void setSerioalNo(int serioalNo) {
        this.serioalNo = serioalNo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
