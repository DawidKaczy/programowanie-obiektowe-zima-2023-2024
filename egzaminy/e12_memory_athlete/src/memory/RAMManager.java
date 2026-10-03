package memory;

import java.sql.SQLOutput;

public class RAMManager implements MemoryManager {
    @Override
    public void allocateMemory(int size) {
        System.out.println("Allocating RAM Memory " + size);
    }
}
