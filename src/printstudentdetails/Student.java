/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package printstudentdetails;

/** model class 
 * define an entity Student - attributes name , sid, age et , functions / methods etc 
 * encapsulation principle - object oriented design principles - private variables then generate getters and setters
 * local rep code in laptop: to github remote rep
 * Local rep configuration : 1. initialize version 2. .gitconfig file, 3. .gitignore
 * netbeans code - working tree code - saved to local rep - commit;
 * @author kumar
 */
public class Student 
{
    private String name;
    private int age;
    private int sid;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the sid
     */
    public int getSid() {
        return sid;
    }

    /**
     * @param sid the sid to set
     */
    public void setSid(int sid) {
        this.sid = sid;
    }
}
