package Practice2;

public class DemoApplication {
    public static void main(String[] args) {
        IRepository repository = new MemberRepository();

        System.out.println("--create--");
        repository.create(new Member("su1", 10, "su1@email.com"));
        repository.create(new Member("su2", 20, "su2@email.com"));
        repository.create(new Member("su3", 30, "su3@email.com"));

        System.out.println("\n--read--");
        System.out.println(repository.read());

        System.out.println("\n--delete");
        repository.delete(3);

        System.out.println("\n--update--");
        repository.update(2, new Member("su22", 22, "su22@email.com"));

        System.out.println("\n--read2--");
        System.out.println(repository.read(1));
        System.out.println(repository.read(2));
    }

}
