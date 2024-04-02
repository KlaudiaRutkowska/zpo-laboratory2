package exercise2;

public class AdvertisementSender {
    public void sendAdvertisement(Advertisement advertisement, Recipient recipient) {
        SendingMethod sendingMethod = findSendingMethod(advertisement.gedPaidPrice());

        sendingMethod.send(advertisement, recipient);
    }

    private SendingMethod findSendingMethod(double price) {
        if (price > 1000) {
            return new VoiceMessage();
        } else if (price > 500) {
            return new SMS();
        } else {
            return new Email();
        }
    }
}
