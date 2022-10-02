package internetToyShop;

import java.io.Serializable;

public class Shop extends Building implements IStorehouse, Serializable {
    private int numberOfWorkers;
    private float revenue; //выручка
    public Shop()
    {
        super();
        this.numberOfWorkers=100;
        this.revenue=50000;
    }

    public Shop(Shop obj)
    {
        super();
        this.revenue=obj.revenue;
        this.numberOfWorkers=obj.numberOfWorkers;
    }

    public int getNumberOfWorkers() {
        return numberOfWorkers;
    }

    public void setNumberOfWorkers(int numberOfWorkers) {
        this.numberOfWorkers = numberOfWorkers;
    }

    public float getRevenue() {
        return revenue;
    }

    public void setRevenue(float revenue) {
        this.revenue = revenue;
    }

    @Override
    public String address(String a){
        String addr = new String();
        addr = a;
        return addr;
    }

    @Override
    public void departmentOfDelivery()
    {
        System.out.println("Магазин работает с доставкой.");
    }


    @Override
    public void relationToStorehouse()
    {
        System.out.println("Магазин напрямую работает со складом.");
    }

    @Override
    public String toString()
    {
        String str = new String();
        str = super.toString()+ " Количество работающих: " + numberOfWorkers+" Выручка в месяц: " +revenue+" руб. " ;
        return str;
    }
}
