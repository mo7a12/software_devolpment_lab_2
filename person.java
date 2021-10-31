
package sheet.lab.pkg2;

/**
 *
 * @author sameeh boshra
 */
public class person {
    public String name;
    public String address;
    public int phone;
    public String email;
    
    
    public person(String n) {
    name = n;
    }
    @Override
    public String toString() {
    return "Person " + name;
    }
}
