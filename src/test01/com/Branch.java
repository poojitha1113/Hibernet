package test01.com;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Branch")
public class Branch {
    @Id
    private int Branch_Code;
    @Column
    private String Bank_Name;
    @Column
    private String Address;

    public int getBranch_Code() {
        return Branch_Code;
    }

    public void setBranch_Code(int branch_Code) {
        Branch_Code = branch_Code;
    }

    public String getBank_Name() {
        return Bank_Name;
    }

    public void setBank_Name(String bank_Name) {
        Bank_Name = bank_Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
