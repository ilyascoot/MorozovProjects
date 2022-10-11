package task2.problem4;

public class Computer {

    private String name;
    private String nameProc;
    private int memory;

    public Computer(String name, String nameProc, int memory) {
        this.name = name;
        this.nameProc = nameProc;
        this.memory = memory;
    }

    public String getName() {
        return name;
    }

    public String getNameProc() {
        return nameProc;
    }

    public int getMemory() {
        return memory;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNameProc(String nameProc) {
        this.nameProc = nameProc;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String toString() {
        return "Имя компьютера = " + name + "; Имя процессора = " + nameProc + "; Размер памяти = " + memory + ".";
    }
}
