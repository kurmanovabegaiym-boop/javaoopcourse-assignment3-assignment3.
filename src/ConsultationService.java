public class ConsultationService extends Service implements Billable {
    public ConsultationService(String name, int id) {
        super(name, id);
    }

    @Override
    public void performService() {
        if (!isActive()) {
            System.out.println(getServiceName() + " is inactive. Cannot start consultation.");
            return;
        }
        System.out.println("Conducting online consultation via " + getServiceName());
    }

    @Override
    public void generateBill() {
        System.out.println("Generating consultation bill for " + getServiceName());
    }
}
