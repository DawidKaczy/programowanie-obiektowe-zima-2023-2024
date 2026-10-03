package memory;

public class MemoryTester {
    public static void main(String[] args) {
        RAMManager rm1 = new RAMManager();
        DiskManager dm1 = new DiskManager();
        rm1.allocateMemory(1024);
        rm1.freeMemory();
        System.out.println(MemoryManager.getMemoryType());


    }
}
