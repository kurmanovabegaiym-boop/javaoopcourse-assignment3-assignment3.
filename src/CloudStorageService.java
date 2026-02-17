public class CloudStorageService extends Service implements PremiumFeature, Billable {
    private boolean premium;

    public CloudStorageService(String name, int id) {
        super(name, id);
        premium = false;
    }

    @Override
    public void performService() {
        if (!isActive()) {
            System.out.println(getServiceName() + " is inactive. Cannot access storage.");
            return;
        }
        System.out.println("Accessing cloud storage: " + getServiceName());
        if (premium) {
            System.out.println("Premium storage features available.");
        }
    }

    @Override
    public void upgradeToPremium() {
        premium = true;
        System.out.println(getServiceName() + " storage upgraded to Premium!");
    }

    @Override
    public void generateBill() {
        System.out.println("Generating bill for " + getServiceName());
    }
}
