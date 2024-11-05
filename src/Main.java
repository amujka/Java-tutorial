public class Main {
    public static void main(String[] args) {
        //2.zadatak
        Student student1 = new Student("Alen", "Mujkanovic", "123456789", 3.4);
        Student student2 = student1;
        student1.changeAverageGrade(5.0);
        System.out.println("\nprosjek ocjena studenta 1 poslije promjene " + student1.getAverageGrade());
        System.out.println("prosjek ocjena studenta 2 poslije promjene " + student2.getAverageGrade());

        System.out.println("\nOba studenta imaju istu vrijednost nakon promjene jer student2 'pokazuje' na istu adresu u memoriji kao i student1, jer su oba referentni tipovi");
    }

}
