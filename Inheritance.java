class College {
    public void display() {
       System.out.println("Inside College");
    }
 }
 class Floor extends College {
    public void area() {
       System.out.println("Inside 1st Floor");
    }
 }
 class Class extends Floor {
    public void volume() {
       System.out.println("Inside Classroom");
    }
 }
 public class Inheritance {
    public static void main(String[] args) {
       Class cube = new Class();
       cube.display();
       cube.area();
       cube.volume();
    }
 }
