package internetToyShop;

public class Building implements IMarketing, IAccounting{
    protected String typeOtBuilding;
    protected String address;
    protected int square;
    protected float costOfBuilding;
    protected float buildingWithDiscount;
    protected String buildingStrategy;
    public Building()
    {
        this.address="Казимировская 6";
        this.square=500;
        this.typeOtBuilding="Магазин";
        this.costOfBuilding=400000;
        this.buildingWithDiscount=30000;
        this.buildingStrategy ="Корпоративная";
    }

    public Building(Building obj)
    {
        this.address=obj.address;
        this.square=obj.square;
        this.typeOtBuilding=obj.typeOtBuilding;
        this.costOfBuilding=obj.costOfBuilding;
        this.buildingWithDiscount=obj.buildingWithDiscount;
        this.buildingStrategy=obj.buildingStrategy;
    }

    public String getTypeOtBuilding() {
        return typeOtBuilding;
    }

    public void setTypeOtBuilding(String typeOtBuilding) {
        this.typeOtBuilding = typeOtBuilding;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public float getCostOfBuilding() {
        return costOfBuilding;
    }

    public void setCostOfBuilding(float costOfBuilding) {
        this.costOfBuilding = costOfBuilding;
        setBuildingWithDiscount();
    }

    public float getBuildingWithDiscount() {
        return buildingWithDiscount;
    }

    public void setBuildingWithDiscount(float buildingWithDiscount) {
        this.buildingWithDiscount = buildingWithDiscount;
    }

    public void setBuildingWithDiscount() {
        this.buildingWithDiscount = countPrice();
    }

    public String getBuildingStrategy() {
        return buildingStrategy;
    }

    public void setBuildingStrategy(String buildingStrategy) {
        this.buildingStrategy = buildingStrategy;
    }

    @Override
    public int discount(int a, int b)
    {
        int discount = 0;
        discount = (a + b);
        return discount;
    }

    @Override
    public float countPrice()
    {
        float cCost;
        float d = discount(1, 3);
        cCost = costOfBuilding * (1 - (d / 100));
        int tax = taxes(10, 25);
        cCost = cCost + tax;
        return cCost;
    }

    @Override
    public void typeOfStrategy(String strategy){
        String str = new String();
        str = strategy;
        System.out.println(strategy);
    }

    @Override
    public void relationToMarketing(){
        System.out.println("Каждое здание связано с отделом маркетинга.");
    }

    @Override
    public int taxes(int a, int b)
    {
        int taxes;
        taxes= a+b;
        return taxes;
    }

    @Override
    public void relationToAccounting()
    {
        System.out.println("Здание тесно связано с бухгалтерией.");
    }

    @Override
    public String toString()
    {
        String str = new String();
        str = "Тип здания: " + typeOtBuilding + " Адрес: " + address + " Площадь: " + square + " Цена здания: " + costOfBuilding + " руб. Цена с учетом скидки: " + buildingWithDiscount+" Стратегия развития здания: " +buildingStrategy;
        return str;
    }
}
