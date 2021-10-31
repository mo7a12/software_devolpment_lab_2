
package sheet.lab.pkg2;

/**
 *
 * @author sameeh boshra
 */
public class student extends person {

    student(String n) {
    super(n);
    }

    enum Status {
                 freshman, 
                 sophomore,
                 junior,
                 senior
    }

    Status classStatus;

    @Override
    public String toString() {
    return "Student " + name;
    
    }
    
}
