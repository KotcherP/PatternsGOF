package behavioral.templateMethod;

//https://www.youtube.com/watch?v=ib8HrjOkT-0&list=PLlsMRoVt5sTPgGbinwOVnaF1mxNeLAD7P&index=27

//Шаблонный метод — это поведенческий паттерн проектирования, который определяет скелет алгоритма,
// перекладывая ответственность за некоторые его шаги на подклассы.
// Паттерн позволяет подклассам переопределять шаги алгоритма, не меняя его общей структуры.

public class Client {
    public static void main(String[] args) {
        WebSiteTemplate welcomePage = new WelcomePage();
        WebSiteTemplate newsPage = new NewsPage();

        welcomePage.showPage();

        System.out.println("========================");

        newsPage.showPage();
    }
}
