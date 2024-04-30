/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DLRSDARIUS;

/**
 *
 * @author Darius Duke
 */
public class Employee {

    String name;
    String address;
    int age;
    String phoneNumber;
    String position;

    public Employee(String name, String address, int age, String phoneNumber, String position) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.position = position;
    }

    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
      public int age() {
        return age;
    }
      public String getphoneNumber() {
        return phoneNumber;
    }
       public String getposition() {
        return position;
    }
    public void setName(String name) {
        this.name = name;
    } 
     public void setAddress(String address) {
        this.address = address;
    } 
     public void setAge(int age) {
        this.age = age;
    }   
     public void setphoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }    
       public void setposition(String position) {
        this.position = position;
    }
}