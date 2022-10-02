package internetToyShop;

public abstract class ToyObject implements IManufacture {
    protected String toyName;
    protected float toyCost;
    protected String toyMaterial;
    protected int materialCost;
    protected int amountOfMaterial;

    abstract protected void generateToyMaterial();

    abstract protected void generateMaterialCost();

    public ToyObject() {
        toyName = new String("");
        toyCost = 0;
        toyMaterial = new String("");
        materialCost = 0;
        amountOfMaterial = 0;
    }

    public ToyObject(ToyObject obj) {
        this.toyName = obj.toyName;
        this.amountOfMaterial = obj.amountOfMaterial;
        this.materialCost = obj.materialCost;
        this.toyMaterial = obj.toyMaterial;
        this.toyCost = obj.toyCost;
    }

    public String getToyName() {
        return toyName;
    }

    public void setToyName(String toyName) {
        this.toyName = toyName;
    }

    public int getAmountOfMaterial() {
        return amountOfMaterial;
    }

    public void setAmountOfMaterial(int amountOfMaterial) {
        this.amountOfMaterial = amountOfMaterial;
        setToyCost();
    }

    public float getToyCost() {
        return toyCost;
    }

    public void setToyCost(int toyCost) {
        this.toyCost = toyCost;
    }

    public void setToyCost() {
        this.toyCost = countPrice();
    }

    public int highQuality(int a, int b)
    {
        int quality = whatQuality(2,5);
        quality= quality*(1-((a+b)/10));
        return quality;
    }

    @Override
    public float countPrice() {
        float cCost;
        float d = discount(1, 3);
        cCost = materialCost * amountOfMaterial * (1 - (d / 100));
        return cCost;
    }

    @Override
    public int discount(int a, int b) {
        int discount = 0;
        discount = (a + b);
        return discount;
    }

    @Override
    public String toString() {
        String str = new String();
        str = "Название: " + toyName + " Цена: " + toyCost + " руб. Материал: " + toyMaterial + " Цена за материал: " + materialCost + " руб. Количество материала: " + amountOfMaterial + " Скидка дня:" + discount(1, 3) + " %";
        return str;
    }

    @Override
    public int whatQuality(int a, int b) {
        if (a <= 5 && b <= 5) {
            int quality = 0;
            quality = a + b;
            return quality;
        } else {
            return 0;
        }
    }

    @Override
    public void typeOfManufacture() {
        System.out.println("Производство игрушек.");

    }

}
