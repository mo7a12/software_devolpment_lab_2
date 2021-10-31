
package lab22;
import java.util.Scanner;
/**
 *
 * @author sameeh boshra
 */
public class Lab22 {
    private int studentId;
    private String studentName, studentAddress, collegeName;
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter Student's Id:");
    int studentId=scan.nextInt();
    scan.nextLine();
    System.out.println("Enter Student's Name:");
    String studentName=scan.nextLine();   
    System.out.println("Enter Student's address:");
    String studentAddress=scan.nextLine();   
       while(true)
       {
        System.out.println("Whether the student is from NIT(Yes/No):");
        String answer=scan.nextLine();
        if(answer.equalsIgnoreCase("y"))
            {
              Lab22 stu = new Lab22(studentId, studentName, studentAddress);
              System.out.println("Student id:"+stu.getStudentId());
              System.out.println("Student name:"+stu.getStudentName());
              System.out.println("Address:"+stu.getStudentAddress());
              System.out.println("College name:"+stu.getCollegeName());
              break;
            }   
            else if(answer.equalsIgnoreCase("n"))
            {       
              System.out.println("Enter the college name:");
              String collegename=scan.nextLine();       
              Lab22 stu = new Lab22(studentId, studentName, studentAddress, collegename);  
              System.out.println("Student id:"+stu.getStudentId());
              System.out.println("Student name:"+stu.getStudentName());
              System.out.println("Address:"+stu.getStudentAddress());
              System.out.println("College name:"+stu.getCollegeName());
              break;
            }       
            else
            {
              System.out.println("Wrong Input");
            }
       }
    }
    public Lab22(int studentId, String studentName, String studentAddress)
    {
      this.studentAddress=studentAddress;
      this.studentName=studentName;
      this.studentId=studentId;
      this.collegeName="FCI";
    }
    public Lab22(int studentId, String studentName, String studentAddress, String collegeName)
    {
      this(studentId, studentName, studentAddress);//invoking a constructor
      this.collegeName=collegeName;
    }
    public int getStudentId()
    {
      return this.studentId;
    }
    public String getStudentName()
    {
      return this.studentName;
    } 
    public String getStudentAddress()
    {
      return this.studentAddress;
    }    
    public String getCollegeName()
    {
      return this.collegeName;
    }
}
    

