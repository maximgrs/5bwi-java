import at.gru.demo.Capacity;
import at.gru.demo.*;
import java.util.Date;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        SDcard sdCard = new SDcard(Capacity.SIZE_64GB);
        Producer producer = new Producer("Canon", "Berlin");
        Lens lens = new Lens(50, producer);
        Camera camera = new Camera(sdCard, lens, producer, 3.5f, 0.5f, "black");


        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose an option:");
            System.out.println("-------------------");
            System.out.println("1. Take picture");
            System.out.println("2. Show pictures");
            System.out.println("3. Exit");
            System.out.println("-------------------");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    while(true) {
                        System.out.println("Choose resolution: (low, medium, high)");
                        System.out.print("Enter your choice: ");
                        String resolution = scanner.next();

                        System.out.print("Enter name: ");
                        String name = scanner.next();

                        Date date = new Date();

                        camera.takePicture(Resolution.valueOf(resolution), name, date, sdCard);
                        
                        System.out.println("-------------------");
                        System.out.println("1. Show pictures:");
                        System.out.println("2. exit");
                        System.out.println("-------------------");
                    }
                    
                case 2:

                    break;
                case 3:
                    System.exit(0);
                    break;

                default:
                    break;
            }
        }
    }
}
