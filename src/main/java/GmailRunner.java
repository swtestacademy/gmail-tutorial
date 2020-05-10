public class GmailRunner {

    public static void main(String[] args) {

        GmailService service = new GmailService();
        System.out.println("Total count of emails is :"+service.getTotalCountOfMails());

        boolean exist = service.isMailExist("Coolblue invoice");
        System.out.println("Mail 'Security Alert' title exist or not: " + exist);

        exist = service.isMailExist("BLABLA");
        System.out.println("Mail 'Security Alert' title exist or not: " + exist);
    }
}
