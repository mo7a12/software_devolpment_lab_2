
package sheet.lab.pkg2;

/**
 *
 * @author sameeh boshra
 */
public class staff extends empolyee{
    staff(String n) {
    super(n);
    }
    String title;
    @Override
    public String toString() {
    return "Staff " + name;
    }
}
