
package test;

/**
 *
 * @author ivanps
 */
public class ChangeMachine {
    private Currency currency;

    public ChangeMachine() {
        currency = Currency.getCurrency();
        
    }
    
    public String getChange(Long amount){
        return recCalculate(amount,"",1);
    }
    
    private String recCalculate(Long amount, String result, int cicle){
        if(amount<=0)
            return result;
        Coin coin= currency.getCoin(cicle);
        Long tmpAmount = coin.getQuantity(amount);
        return  recCalculate(amount-(tmpAmount*coin.getUnitsByType()), 
                            ((result.isEmpty())?"":(result+ ", "))+ tmpAmount + " " +coin.getDenomination(),
                            cicle+1);
        
    }
    
}
