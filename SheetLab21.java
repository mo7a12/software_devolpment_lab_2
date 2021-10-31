
package sheet.lab.pkg2;

/**
 *
 * @author sameeh boshra
 */
public class SheetLab2 {

  
    public static void main(String[] args) {
    person person =new person((" Boshra Samaan ")),
    student  =new student(" Sameeh Boshra "),
    empolyee  =new empolyee((" Sameh Boshra ")),
    facutly  = new facutly("computer and information "),
    staff  =new staff("team of fci"),
    people[] = { person, student, empolyee, facutly, staff };
    for (person p : people)
    System.out.println(p);
    }
    
}
