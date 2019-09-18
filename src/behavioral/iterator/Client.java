package behavioral.iterator;

//https://www.youtube.com/watch?v=yY6oy8xHLT8&list=PLlsMRoVt5sTPgGbinwOVnaF1mxNeLAD7P&index=21

//Итератор — это поведенческий паттерн проектирования, который
// даёт возможность последовательно обходить элементы составных объектов, не раскрывая их внутреннего представления.
public class Client {
    public static void main(String[] args) {
        String[] skills = {"Java","Spring","Maven"};

        JavaDeveloper javaDeveloper = new JavaDeveloper("Alex",skills);
        Iterator iterator = javaDeveloper.getIterator();
        System.out.println("Developer "+ javaDeveloper.getName());
        System.out.println("Skills: ");

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
