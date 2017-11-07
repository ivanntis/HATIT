
package test;

/**
 *
 * @author ivanps
 */
public class Coin {
    
    private Long unitsByType;
    private String denomination;


    public Coin(Long unitsByType, String denomination) {
        this.setUnitsByType(unitsByType);
        this.setDenomination(denomination);        

    }
    
    
    public Long getQuantity(Long amount) {
        return Math.floorDiv(amount,this.getUnitsByType());        
    }

    public Long getUnitsByType() {
        return unitsByType;
    }

    public void setUnitsByType(Long unitsByType) {
        if (unitsByType<=0)
            throw new RuntimeException();
            
         this.unitsByType = unitsByType;        
    }

    public String getDenomination() {
        return denomination;
    }

    public void setDenomination(String denomination) {
        this.denomination = denomination;
    }

    
}
