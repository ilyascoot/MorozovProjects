package task2.problem4;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        String name;
        String nameProc;
        int memory;

        Shop shop = new Shop();
        Scanner in = new Scanner(System.in);

        shop.addComp(new Computer("Windows", "Intel", 512));
        shop.addComp(new Computer("Windows", "Intel", 1024));
        shop.addComp(new Computer("Windows", "AMD", 512));
        shop.addComp(new Computer("Windows", "AMD", 1024));

        System.out.println("В магазине находятся компьютеры: ");
        for(int i=0; i<shop.computers.size();i++)
        {
            System.out.println(shop.computers.get(i).toString());
        }
        Computer find;
        System.out.println("Введите данные компьютера для его поиска и покупки");
        name = in.nextLine();
        nameProc = in.nextLine();
        memory = in.nextInt();
        find = shop.findPC(name,nameProc,memory);
        if (find!=null)
        {
            System.out.println("Вы купили этот ПК, оставшиеся компьютеры в магазине: ");
        }
        shop.delComp(find);
        for(int i=0; i<shop.computers.size();i++)
        {
            System.out.println(shop.computers.get(i).toString());
        }
    }
}
