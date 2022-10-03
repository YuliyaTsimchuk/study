package internetToyShop;

public class Courier extends Worker implements ITransport, IStorehouse {
    private String transport;
    private boolean isExpert;
    private int transportCosts;
    private float transportWithCompany;

    public Courier() {
        super();
        this.transport = typeOfTransport("Велосипед");
        this.isExpert = true;
        this.transportCosts = 10;
        this.transportWithCompany = 0;
    }

    public Courier(Courier obj) {
        super();
        this.isExpert = obj.isExpert;
        this.transport = obj.transport;
        this.transportCosts = obj.transportCosts;
        this.transportWithCompany = obj.transportWithCompany;
    }

    @Override
    protected void generateSalary() {
        this.salary = this.category * 200;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public boolean isExpert() {
        return isExpert;
    }

    public void setExpert(boolean expert) {
        isExpert = expert;
        generateSalary();
    }

    public int getTransportCosts() {
        return transportCosts;
    }

    public void setTransportCosts(int transportCosts) {
        this.transportCosts = transportCosts;
        setTransportWithCompany();
    }

    public float getTransportWithCompany() {
        return transportWithCompany;
    }

    public void setTransportWithCompany(float transportWithCompany) {
        this.transportWithCompany = transportWithCompany;
    }

    public void setTransportWithCompany() {
        this.transportWithCompany = countPrice();
    }

    @Override
    public void departmentOfDelivery() {
        System.out.println("Работает курьер, закрепленный за участком.");
    }


    @Override
    public String toString() {
        String str = new String();
        String str1 = "подтверждена", str2 = "стажер ";
        if (isExpert == true) {
            str = super.toString() + " Затраты на проезд: " + transportCosts + " руб. Затраты на проезд с учетом вычета компании: " + transportWithCompany + " руб. Экспертность курьера: " + str1 + " Транспорт: " + transport;
        } else {
            str = super.toString() + " Затраты на проезд: " + transportCosts + " руб. Затраты на проезд с учетом вычета компании: " + transportWithCompany + " руб. Экспертность курьера: " + str2 + " Транспорт: " + transport;
        }
        return str;
    }

    @Override
    public float countPrice() {
        float cCost;
        float d = discount(1, 3);
        cCost = transportCosts * (1 - (d / 100));
        int tax = taxes(1, 2);
        cCost = cCost - tax;
        return cCost;
    }

    @Override
    public int discount(int a, int b) {
        int discount = 0;
        discount = (a + b);
        return discount;
    }


    public int whatQuality(int a, int b) {
        if (a <= 5 && b <= 5) {
            int quality = 0;
            quality = a + b;
            return quality;
        } else {
            return 0;
        }
    }

    public void typeOfManufacture() {
        System.out.println("Доставка.");
    }

    @Override
    public String typeOfTransport(String a) {
        String addr = new String();
        addr = a;
        return addr;
    }

    @Override
    public void relationToStorehouse()
    {
        System.out.println("Курьер забирает заказы со склада.");
    }

    @Override
    public void typeOfStrategy(String strategy){
        String str = new String();
        str = strategy;
        System.out.println(strategy);
    }

    @Override
    public void relationToMarketing()
    {
        System.out.println("Курьер не связан с отделом маркетинга.");
    }

    @Override
    public int taxes(int a, int b)
    {
        int taxes;
        taxes= a*b;
        return taxes;
    }

    @Override
    public void relationToAccounting()
    {
        System.out.println("Курьер напрямую зависит от отдела бухгалтерии.");
    }


}
