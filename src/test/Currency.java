
package test;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ivanps
 */
public class Currency {
    private String nameUnit;
    private String country;
    private static Currency instance;
    private Map<Integer,Coin> wallet= new HashMap<>();
    
    private Currency(){
        this.nameUnit = "cents";
        this.country = "USA";
        this.buildWallet();
    }
    
    public static Currency getCurrency(){
        if(instance == null){
            
            instance = new Currency();
        }
        return instance;
        
    }

    public String getNameUnit() {
        return nameUnit;
    }

    public void setNameUnit(String nameUnit) {
        this.nameUnit = nameUnit;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
    private void buildWallet(){
        
        wallet.put(1, new Coin(100L,"Dollar"));
        wallet.put(2, new Coin(25L,"Quarter"));
        wallet.put(3, new Coin(10L,"Dime"));
        wallet.put(4, new Coin(5L,"Nickel"));
        wallet.put(5, new Coin(1L,"Cent"));

    }
    
    public Coin getCoin(int weidth){        
        return this.wallet.get(weidth);
    }
    
    
    
}
