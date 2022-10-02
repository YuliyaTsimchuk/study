package mainPackage;

import internetToyShop.Shop;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteToFile {

    public void serializeShop(Shop shop) {
        FileOutputStream fout = null;
        ObjectOutputStream oos = null;

        try {

            fout = new FileOutputStream("d:\\javaFiles.txt");
            oos = new ObjectOutputStream(fout);
            oos.writeObject(shop);
            System.out.println("Данные о магазине успешно записаны в файл.");

        } catch (Exception ex) {

            ex.printStackTrace();

        } finally {

            if (fout != null) {
                try {
                    fout.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
