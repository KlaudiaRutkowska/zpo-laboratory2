package exercise2;

public class VoiceMessage implements SendingMethod {
    @Override
    public void send(Advertisement advertisement, Recipient recipient) {
        String translatedContent = Translator.translate(advertisement.getContent(), recipient.getPreferredLanguage());

        System.out.println("Sending " + translatedContent);
    }
}
