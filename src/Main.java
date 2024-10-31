public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Alen", "Mujkanovic");
        Student student2 = new Student("Pero", "Peric", 25, "male");
        Student student3 = new Student();

        System.out.println(student1.getFirstName() + " " + student1.getLastName());
        student2.setAge(30);
        student3.setFirstName("Ana");
        student3.setLastName("Anaic");


    }

}
