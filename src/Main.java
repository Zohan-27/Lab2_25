import java.util.Scanner;

class Baseline {
    private String productName;
    private String productDescription;
    private double productPrice;

    public Baseline(String productName, String productDescription, double productPrice) {
        this.productName = productName;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }
}


class Behaviour {
    private String animalName;
    private int animalAge;
    private boolean isCarnivorous;

    public Behaviour(String animalName, int animalAge, boolean isCarnivorous) {
        this.animalName = animalName;
        this.animalAge = animalAge;
        this.isCarnivorous = isCarnivorous;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getAnimalAge() {
        return animalAge;
    }

    public void setAge(int animalAge) {
        this.animalAge = animalAge;
    }

    public boolean isCarnivorous() {
        return isCarnivorous;
    }

    public void setCarnivorous(boolean carnivorous) {
        isCarnivorous = carnivorous;
    }

}


class Blog {
    private String title;
    private String author;
    private int views;

    public Blog(String title, String author, int views) {
        this.title = title;
        this.author = author;
        this.views = views;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continueInput = true;

        while (continueInput) {
            System.out.println("Выберите класс (1 - Baseline, 2 - Behaviour, 3 - Blog, 0 - Выход):");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Введите значения для класса Baseline:");
                    System.out.println("ProductName: ");
                    scanner.nextLine();
                    String productName = scanner.nextLine();
                    System.out.println("ProductDescription: ");
                    String productDescription = scanner.nextLine();
                    System.out.println("ProductPrice: ");
                    double productPrice = scanner.nextDouble();
                    Baseline baseline = new Baseline(productName,productDescription,productPrice);
                    // Вывод содержимого объекта Baseline
                    System.out.println("Содержимое объекта Baseline:");
                    System.out.println("productName " + baseline.getProductName());
                    System.out.println("productDescription: " + baseline.getProductDescription());
                    System.out.println("productPrice: " + baseline.getProductPrice());
                    break;

                case 2:
                    System.out.println("Введите значения для класса Behaviour:");
                    System.out.println("AnimalName: ");
                    scanner.nextLine();
                    String animalName = scanner.nextLine();
                    System.out.println("AnimalAge: ");
                    int animalAge = scanner.nextInt();
                    System.out.println("IsCarnivorous(true or false)");
                    boolean isCarnivorous = scanner.nextBoolean();
                    Behaviour behaviour = new Behaviour(animalName,animalAge,isCarnivorous);
                    // Вывод содержимого объекта Behaviour
                    System.out.println("Содержимое объекта Behaviour:");
                    System.out.println("animalName: " + behaviour.getAnimalName());
                    System.out.println("IsCarnivorous(является ли хищником): " + behaviour.isCarnivorous());
                    System.out.println("AnimalAge: " + behaviour.getAnimalAge());

                    break;

                case 3:
                    System.out.println("Введите значения для класса Blog:");
                    System.out.println("Title: ");
                    scanner.nextLine();
                    String title = scanner.nextLine();
                    System.out.println("Author: ");
                    String author = scanner.nextLine();
                    System.out.println("Views: ");
                    int views = scanner.nextInt();
                    Blog blog = new Blog(title, author, views);
                    // Вывод содержимого объекта Blog
                    System.out.println("Содержимое объекта Blog:");
                    System.out.println("title: " + blog.getTitle());
                    System.out.println("author: " + blog.getAuthor());
                    System.out.println("views: " + blog.getViews());
                    break;

                case 0:
                    continueInput = false;
                    break;

                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
                    break;
            }
        }

        scanner.close();
    }
}
