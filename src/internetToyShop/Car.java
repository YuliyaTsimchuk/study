package internetToyShop;

public class Car extends ToyObject {
    private static int carNum = 0;
    private int carId;
    private boolean isCarpet;

    public Car() {
        super();
        generateMaterialCost();
        generateToyMaterial();
        carNum++;
        carId = carNum;
        isCarpet = false;
    }

    public boolean isCarpet() {
        return isCarpet;
    }

    public void setCarpet(boolean carpet) {
        isCarpet = carpet;
    }

    @Override
    protected void generateToyMaterial() {
        toyMaterial = "Пластмасса";
    }

    @Override
    protected void generateMaterialCost() {
        materialCost = 15;
    }

    @Override
    public String toString() {
        String str = new String();
        String str1 = "в наличии", str2 = "отсутствует";
        if (isCarpet == true) {
            str = super.toString() + " Крыша у машинки: " + str1;
        } else {
            str = super.toString() + " Крыша у машинки: " + str2;
        }
        return str;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (this == obj)
            return true;
        if (obj instanceof Car) {
            Car car1 = (Car) obj;
            return this.toyCost == car1.toyCost && this.toyMaterial.equals(car1.toyMaterial) && this.carId == car1.carId && this.isCarpet == car1.isCarpet && this.amountOfMaterial == car1.amountOfMaterial && this.toyName.equals(car1.toyName) && this.materialCost == car1.materialCost;

        } else
            return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + (this.isCarpet ? 1 : 0);
        hash = 29 * hash + this.carId;
        return hash;
        
    }


}
