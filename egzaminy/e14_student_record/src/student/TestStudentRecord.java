package student;

public class TestStudentRecord {
    public static void main(String[] args) {
        StudentRecord sr = new StudentRecord("Dawid", "1", 3.5);
        StudentRecord sr2 = new StudentRecord("Dawid", "1", 3.0);
        System.out.println(sr.printDetails());
        System.out.println(sr2.printDetails());
        System.out.println(sr.isHonorStudent());
        System.out.println(sr2.isHonorStudent());


    }
}
