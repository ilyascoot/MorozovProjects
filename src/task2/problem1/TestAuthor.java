package task2.problem1;

public class TestAuthor {
    public static void main(String[] args) {
        Author ilya = new Author("Ilya", "aylidota", 'M');
        System.out.println(ilya.getName());
        System.out.println(ilya.getEmail());
        System.out.println(ilya.getGender());

        ilya.setEmail("aylidota1");
        System.out.println(ilya.toString());
    }
}
