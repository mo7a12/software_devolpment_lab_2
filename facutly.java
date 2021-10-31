
package sheet.lab.pkg2;

/**
 *
 * @author sameeh boshra
 */
public class facutly extends empolyee{
    facutly(String n) {
    super(n);
    }
    String officeHours, rank;

    @Override
    public String toString() {
    return "Faculty " + name;
    }
}
