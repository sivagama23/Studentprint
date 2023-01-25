/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package printstudentdetails;

/** Array of objects - java example : printing studentdetails
 *   project - share to github : colloboration tool , tracking changes keep history - version control software
 * char[] reverse = new char[word.length()]; - reverse of word 
 * print 3 students details are name, age store in array then prints -- array of objects
 * @author Sivagama
 */
public class PrintStudentDetails {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // used for user interaction printing , input
       
       Student[] list = new Student[3]; // array of objects declaration
       //create students 3
       Student s1 = new Student();
       s1.setName("peter");
       s1.setAge(20);
       list[0] = s1; // stored object in array
       System.out.println(list[0].getName() + list[0].getAge());
    }

}
