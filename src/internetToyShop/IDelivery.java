package internetToyShop;

public interface IDelivery extends IPrice {
    String address(String a);

    void departmentOfDelivery();
}
