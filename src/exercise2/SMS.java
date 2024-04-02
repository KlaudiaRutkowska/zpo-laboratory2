package exercise2;

public class SMS implements SendingMethod {
    @Override
    public void send(Advertisement advertisement, Recipient recipient) {
        String translatedContent = Translator.translate(advertisement.getContent(), recipient.getPreferredLanguage());

        System.out.println("Sending " + translatedContent);
    }
}
