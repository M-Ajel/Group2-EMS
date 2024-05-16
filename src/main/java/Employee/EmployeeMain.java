/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Employee;

/**
 *
 * @author Darius Duke
 */
public class EmployeeMain {

    public static void main(String[] args) {
        
        Employee person = new Employee("Kenneth", "Binan", 21, "+63-7-2277-4567", "Staff");

        System.out.println("Name: " + person.name);
        System.out.println("Address: " + person.address);
        System.out.println("Age: " + person.age);
        System.out.println("Phone Number: " + person.phoneNumber);
        System.out.println("Position: " + person.position);
        
    }
}