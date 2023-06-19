package homeWork;
//представьте, что вы разрабатываете алгоритм для кофейного аппарата, в котором есть всего 4 кнопки.
// Выбор напитков может быть следующий: эспрессо, американо, капучино, чай. При нажатии кнопки,
// ваш напиток должен приготовиться.
//Попробуйте отобразить в консоли процесс приготовления напитков (вам нужно просто печатать
// сам процесс - "готовится такой-то напиток" + его подпроцессы), исходя из нажатой кнопки
// (1-эспрессо, 2-американо, 3-капучино, 4- чай) через if-else и через switch-case.
//Помимо этого сформируйте и разделите процесс на
// отдельные методы для их переиспользования, т.к. напитки могут быть разделены
// на самостоятельные процессы:
//Эспрессо - неразделимый процесс
//Американо - эспрессо + добавление воды
//Капучино - эспрессо + добавление вспененного молока
//Чай - вода + пакетик чая

import java.util.Scanner;

public class CoffeeMachine {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your choice: 1-Espresso 2-Americano 3-Cappuccino 4-Tea: ");
        int choice = sc.nextInt();

        getChoice(sc.nextInt());

    }

    private static void getChoice(int choice) {
        switch (choice) {
            case 1:
                makeEspresso();
                break;
            case 2:
                makeAmericano();
                break;
            case 3:
                makeCappuccino();
                break;
            case 4:
                makeTea();
                break;
            default:
                System.out.println("Invalid choice");
        }

    }


    private static void makeEspresso() {
        System.out.println("Making espresso");
    }


    private static void makeAmericano() {
        makeEspresso();
        System.out.println("Adding water to espresso");
    }


    private static void makeCappuccino() {
        makeEspresso();
        System.out.println("Frothing milk");
        System.out.println("Adding frothed milk to espresso");
    }


    private static void makeTea() {
        System.out.println("Boiling water");
        System.out.println("Adding tea bag");
    }
}