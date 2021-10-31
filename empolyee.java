
package sheet.lab.pkg2;

/**
 *
 * @author sameeh boshra
 */
public class empolyee extends person {
    empolyee(String n) {
    super(n);
    }

    String office,
           hireDate;
    double salary;
    @Override
    public String toString() {
    return "Employee " + name;
    }    
}
