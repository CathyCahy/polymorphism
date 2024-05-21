public class ServiceStation {

    public  void check(Service[] transports ) {
        for (Service transport : transports) {
            transport.checkTransport();
        }
    }
}
