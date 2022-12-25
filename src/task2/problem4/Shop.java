package task2.problem4;

import java.util.ArrayList;

public class Shop {
    public ArrayList<Computer> computers = new ArrayList<>();

    public Shop(){

    };

    public void addComp(Computer newPC){
        computers.add(newPC);
    }

    public void delComp(Computer delPC){
        int size = computers.size();
        int flag=-1;
        for (int i =0; i<size; i++)
        {
            if(computers.get(i)==delPC)
            {
                flag=i;
            }
        }
        if (flag!=-1)
        {
            for(int i = 0; i<=size-1; i++)
            {
                Computer ok=computers.get(i);
                if (flag!=i)
                {
                    computers.set(i, ok);
                }
                else if(flag==i && flag == size-1)
                {
                    computers.remove(size-1);
                    break;
                }
                else
                {
                    computers.set(i, computers.get(i+1));
                    if (i==size-1)
                    {
                        computers.remove(size-1);
                        break;
                    }
                    else
                    {
                        for(int z=i+1; z< size-1; z++)
                        {
                            computers.set(z, computers.get(z+1));
                        }
                        computers.remove(size-1);
                        break;
                    }
                }
            }
        }
    }

    public Computer findPC(String name, String nameProc, int memory)
    {
        Computer find=null;
        int flag = 0;
        for (int i = 0; i< computers.size(); i++)
        {
            if(computers.get(i).getName().equals(name) && computers.get(i).getNameProc().equals(nameProc) && computers.get(i).getMemory()==memory)
            {
                System.out.println("Компьютер найден! "+ computers.get(i).toString());
                find = computers.get(i);
                flag++;
            }
        }
        if (flag==0)
        {
            System.out.println("Такого компьютера нет.");
        }
        return find;
    }
}
