package internetToyShop;

public interface ITransport extends IManufacture, IDelivery {
    String typeOfTransport(String a);
}
