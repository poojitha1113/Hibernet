package Inherit.onetoOneMapping;

public class Register {
    private int Eid;
    private String Ename;
    private String Eadr;
    private double MobileNumber;
    public int getEid()
    {
        return Eid;
    }
    public void setEid(int id)
    {
        this.Eid=id;
    }
    public String getEname()
    {
        return Ename;
    }
    public void setEname(String Ename)
    {
        this.Ename=Ename;
    }

    public String getEadr() {
        return Eadr;
    }

    public void setEadr(String eadr) {
        Eadr = eadr;
    }

    public double getMobileNumber() {
        return MobileNumber;
    }

    public void setMobileNumber(double mobileNumber) {
        MobileNumber = mobileNumber;
    }

    @Override
    public String toString() {
        return "Register{" +
                "Eid=" + Eid +
                ", Ename='" + Ename + '\'' +
                ", Eadr='" + Eadr + '\'' +
                ", MobileNumber=" + MobileNumber +
                '}';
    }
}
