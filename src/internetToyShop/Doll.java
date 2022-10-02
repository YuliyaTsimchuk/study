package internetToyShop;

public class Doll extends ToyObject {
    private static int dollNum = 0;
    private int dollId;
    private String dollType;

    public Doll() {
        super();
        generateMaterialCost();
        generateToyMaterial();
        dollNum++;
        dollId = dollNum;
        dollType = new String();
    }

    public Doll(Doll doll) {
        super();
        this.dollType = doll.dollType;
        this.dollId = doll.dollId;
    }

    @Override
    protected void generateToyMaterial() {
        toyMaterial = "Резина";
    }

    @Override
    protected void generateMaterialCost() {
        materialCost = 10;
    }

    public void setDollType(String dollType) {
        this.dollType = dollType;
    }

    public String getDollType() {
        return dollType;
    }

    @Override
    public String toString() {
        String str = new String();
        str = super.toString() + " Тип куклы: " + dollType + " Id куклы: " + dollId;
        return str;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (this == obj)
            return true;
        if (obj instanceof Doll) {
            Doll doll1 = (Doll) obj;
            return this.toyCost == doll1.toyCost && this.toyMaterial.equals(doll1.toyMaterial) && this.dollId == doll1.dollId && this.dollType.equals(doll1.dollType) && this.amountOfMaterial == doll1.amountOfMaterial && this.toyName.equals(doll1.toyName) && this.materialCost == doll1.materialCost;

        } else
            return false;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + (this.dollType != null ? this.dollType.hashCode() : 0);
        hash = 31 * hash + this.dollId;
        return hash;
    }


}
