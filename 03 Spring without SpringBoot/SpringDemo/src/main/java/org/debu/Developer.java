package org.debu;


public class Developer {

    private int age;
    private Laptop laptop;

    public Developer(){
        System.out.println("Developer Constructor calling...");
    }
    public Developer(int age) {
        this.age = age;
        System.out.println("Developer Constructor with Parameterized ...");
    }


    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Laptop getLaptop() {
        return laptop;
    }
    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public void build(){
        System.out.println("Building the application...");
        laptop.compile();
    }
}
