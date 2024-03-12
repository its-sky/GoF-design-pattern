package structural_patterns.facade;

public class EmailFacade {

    public static void main(String[] args) {
        EmailSettings emailSettings = new EmailSettings();
        emailSettings.setHost("127.0.0.1");

        EmailSender emailSender = new EmailSender(emailSettings);

        EmailMessage emailMessage = new EmailMessage();
        emailMessage.setFrom("smc");
        emailMessage.setTo("smc2");
        emailMessage.setSubject("듄2");
        emailMessage.setText("듄듄듄");

        emailSender.sendEmail(emailMessage);
    }

}
