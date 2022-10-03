package mainPackage;

import internetToyShop.*;
import mainPackage.WriteToFile;

public class MyClass {
    public static void main(String[] args) {

        System.out.println(" ");

        Box box1 = new Box();
        box1.setMaterial("Бумага");
        box1.setMaterialCost(12);
        box1.setTypeOfBox("Упаковка для кукол");
        System.out.println(box1.toString());

        System.out.println(" ");

        Doll doll = new Doll();
        doll.setToyName("Русалочка");
        doll.setAmountOfMaterial(1);
        doll.setDollType("Барби_collection");
        System.out.println(doll.toString());

        System.out.println(" ");


        Car car = new Car();
        car.setToyName("Кабриолет");
        car.setAmountOfMaterial(2);
        car.setCarpet(false);
        System.out.println(car.toString());

        System.out.println(" ");

        Courier courier = new Courier();
        courier.setName("Альбина");
        courier.setTransportCosts(20);
        courier.setCategory(5);
        courier.setExpert(true);
        courier.setSurname("Краскина");
        System.out.println(courier.toString());

        System.out.println(" ");

        Shop shop = new Shop();
        shop.setSquare(1000);
        shop.setCostOfBuilding(20000);
        shop.setBuildingStrategy("Корпоративная");
        shop.setRevenue(40000);
        shop.setNumberOfWorkers(200);
        System.out.println(shop.toString());

        System.out.println(" ");
        
        WriteToFile writer = new WriteToFile();
        writer.serializeShop(shop);

        System.out.println(" ");

        IPrice price;
        price = box1;
        int disc;
        disc = price.discount(2, 3);
        System.out.println("Разработанная скидка: " + disc);

        System.out.println(" ");

        ToyObject toy;
        toy = car;
        System.out.println("Цена мащинки: " + toy.getToyCost());



    }


}
