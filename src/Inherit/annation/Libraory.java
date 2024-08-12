package Inherit.annation;

import javax.persistence.*;

@Entity
@Table(name = "Registor")
@DiscriminatorColumn(name = "Entry", discriminatorType = DiscriminatorType.STRING)
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Libraory {
    @Id
    private int BlockNo;
    @Column
    private String BlockName;

    public int getBlockNo() {
        return BlockNo;
    }

    public void setBlockNo(int blockNo) {
        BlockNo = blockNo;
    }

    public String getBlockName() {
        return BlockName;
    }

    public void setBlockName(String blockName) {
        BlockName = blockName;
    }
}
