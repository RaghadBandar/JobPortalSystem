/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobportal;

/**
 *
 * @author PRO
 */
public class CV {
    private String seekerName;
    private int age; 
    private String gender; 
    private String phone; 
    private String qualification; 
    private String major; 
    private double gpa;
    private String address; 
    private String experience; 
    private String seekerEmail; 
    public CV(){}

    public CV(String seekerName, int age, String gender, String phone, String qualification, String major, double gpa, String address, String experience, String seekerEmail) {
        this.seekerName = seekerName;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.qualification = qualification;
        this.major = major;
        this.gpa = gpa;
        this.address = address;
        this.experience = experience;
        this.seekerEmail = seekerEmail;
    }

    public void setSeekerName(String seekerName) {
        this.seekerName = seekerName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public void setSeekerEmail(String seekerEmail) {
        this.seekerEmail = seekerEmail;
    }

    public String getSeekerName() {
        return seekerName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getPhone() {
        return phone;
    }

    public String getQualification() {
        return qualification;
    }

    public String getMajor() {
        return major;
    }

    public double getGpa() {
        return gpa;
    }

    public String getAddress() {
        return address;
    }

    public String getExperience() {
        return experience;
    }

    public String getSeekerEmail() {
        return seekerEmail;
    }
    public void updateProfile(String userID, String password, String seekerEmail,String seekerName,
            String address, int age, String gender, String phone,  String experience, String major,String qualification, double gpa ){
        
    }
}
