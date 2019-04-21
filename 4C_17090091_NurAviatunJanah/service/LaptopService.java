package service;

import java.util.*;
import entity.*;

public class LaptopService {

    private static List<Laptop> data = new LinkedList<Laptop>();

    public void addData(Laptop lp) {
        data.add(lp);
        System.out.println("data telah tersimpan");
    }

    public void updateData(Laptop lp) {
        int index = data.indexOf(lp);
        if(index >= 0) {
            data.set(index, lp);
            System.out.println("data telah berubah");
        }
    }

    public void deleteData(String id) {
        int idx = data.indexOf(new Laptop(id, "", ""));
        if(idx >= 0) {
            data.remove(idx);
            System.out.println("data telah terhapus");
        }
    }

    public void showAllData() {
        int i=1;
        System.out.println("\nData di List :");
        for(Laptop lp : data) {
            System.out.println("data ke-" + i++);
            System.out.println("  ID : " + lp.getId());
            System.out.println("  NAMA : " + lp.getNama());
            System.out.println("  MERK : " + lp.getMerk());
        }
    }

}