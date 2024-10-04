import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите тип документа: 1 - Отчет, 2 - Резюме, 3 - Письмо, 4 - Счет-фактура");
        int choice = scanner.nextInt();

        DocumentCreator creator = null;


        switch (choice) {
            case 1:
                creator = new ReportCreator();
                break;
            case 2:
                creator = new ResumeCreator();
                break;
            case 3:
                creator = new LetterCreator();
                break;
            case 4:
                creator = new InvoiceCreator();
                break;
            default:
                System.out.println("Неверный выбор!");
                return;
        }


        Document document = creator.createDocument();
        document.open();
    }
}