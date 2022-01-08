/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emerging_cw;

/**
 *
 * @author Subriti
 */
public class MemberInfo {
    
    private String name;
    private int age;
    private String specialization;
    private String username;
    private String password;
    
    MemberInfo( String name, int age,String specialization,String username,String password){ 
        this.name= name;
        this.age=age;
        this.specialization=specialization;
        this.username=username;
        this.password=password;   
    }
    
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getSpecialization() {
        return this.specialization;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }
}
