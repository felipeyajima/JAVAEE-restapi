package br.com.yajima;

public class Person {
    private String name;
    private String lastName;
    private String gender;

    public String getName(){
        return this.name;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getGender(){
        return this.gender;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setGender(String gender){
        this.gender = gender;
    }

}
