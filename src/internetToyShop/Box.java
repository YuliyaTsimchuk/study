package internetToyShop;

public class Box implements IManufacture {
    private String material;
    private String typeOfBox;
    private int materialCost;
    private float boxCost;

    public Box() {
        this.material = "Картон";
        this.materialCost = 10;
        this.typeOfBox = "Универсальная упаковка";
        this.boxCost = 0;
    }

    public Box(Box obj) {
        this.material = obj.material;
        this.materialCost = obj.materialCost;
        this.typeOfBox = obj.typeOfBox;
        this.boxCost = obj.boxCost;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTypeOfBox() {
        return typeOfBox;
    }

    public void setTypeOfBox(String typeOfBox) {
        this.typeOfBox = typeOfBox;

    }

    public int getMaterialCost() {
        return materialCost;
    }

    public void setMaterialCost(int materialCost) {
        this.materialCost = materialCost;
        setBoxCost();
    }

    public void setBoxCost() {
        this.boxCost = countPrice();
    }

    public float getBoxCost() {
        return boxCost;
    }

    public void setBoxCost(float boxCost) {
        this.boxCost = boxCost;
    }


    @Override
    public float countPrice() {
        float cCost;
        float d = discount(1, 3);
        cCost = materialCost * (1 - (d / 100));
        return cCost;
    }

    @Override
    public int discount(int a, int b) {
        int discount = 0;
        discount = a + b;
        return discount;
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
        System.out.println("Тип производства - производство упаковочных коробок.");

    }

    @Override
    public String toString() {
        String str = new String();
        str = "Тип коробки: " + typeOfBox + " Материал: " + material + " Цена за материал: " + materialCost + " руб. Цена упаковки: " + boxCost + " руб. Скидка дня:" + discount(1, 3) + " %";
        return str;
    }

}
