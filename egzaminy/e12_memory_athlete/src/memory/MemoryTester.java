package memory;

public class MemoryTester {
    public static void main(String[] args) {
        RAMManager m1 = new RAMManager();
        DiskManager d1 = new DiskManager();

        m1.allocateMemory(120);
        d1.allocateMemory(140);
        m1.freeMemory();
        d1.freeMemory();
        System.out.println(MemoryManager.getMemoryType());
    }
}
