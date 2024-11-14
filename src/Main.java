import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Student student1 = new Student("Alen", "Mujkanović", 123456789);
        Student student2 = new Student("Ana", "Anić", 987654321);
        Student student3 = new Student("Pero", "Perić", 543219876);

        Writer out = new FileWriter("students.txt");
        PrintWriter easyOut = new PrintWriter(out);
        easyOut.println(student1);
        easyOut.println(student2);
        easyOut.println(student3);
        easyOut.close();

        int c;
        int charCounter = 0;
        File inputFile = new File("students.txt");
        FileReader in = new FileReader(inputFile);
        while ((c = in.read()) != -1) {
            charCounter++;
        }
        System.out.println("Number of character:" + charCounter);
        in.close();
    }

}
