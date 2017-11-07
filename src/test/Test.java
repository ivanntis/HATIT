
package test;

/**
 *
 * @author ivanps
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ChangeMachine machine = new ChangeMachine();
        System.out.print(machine.getChange(2534L));
    }

}
