public class StreamingService extends Service implements PremiumFeature {
    private boolean premium;

    public StreamingService(String name, int id) {
        super(name, id);
        this.premium = false;
    }

    @Override
    public void performService() {
        if (!isActive()) {
            System.out.println(getServiceName() + " is inactive. Cannot stream.");
            return;
        }
        if (premium) {
            System.out.println("Streaming premium content on " + getServiceName());
        } else {
            System.out.println("Streaming standard content on " + getServiceName());
        }
    }

    @Override
    public void upgradeToPremium() {
        premium = true;
        System.out.println(getServiceName() + " upgraded to Premium!");
    }
}
