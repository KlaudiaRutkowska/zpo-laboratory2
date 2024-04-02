package exercise2;

public class MainAd {
    public static void main(String[] args) {
        Advertisement advertisement = new Advertisement();
        Recipient recipient = new Recipient();

        AdvertisementSender advertisementSender = new AdvertisementSender();
        advertisementSender.sendAdvertisement(advertisement, recipient);
    }
}
