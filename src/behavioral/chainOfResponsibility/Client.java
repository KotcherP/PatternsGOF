package behavioral.chainOfResponsibility;

import behavioral.chainOfResponsibility.notifier.EmailNotifier;
import behavioral.chainOfResponsibility.notifier.Notifire;
import behavioral.chainOfResponsibility.notifier.SimpleReportNotifier;
import behavioral.chainOfResponsibility.notifier.SmsNotifier;

//https://www.youtube.com/watch?v=66_0-u8P5DQ&list=PLlsMRoVt5sTPgGbinwOVnaF1mxNeLAD7P&index=18

//Цепочка обязанностей — это поведенческий паттерн проектирования, который позволяет передавать
// запросы последовательно по цепочке обработчиков.
// Каждый последующий обработчик решает, может ли он обработать запрос сам и стоит ли передавать
// запрос дальше по цепи.

public class Client {
    public static void main(String[] args) {
        Notifire reportNotifier = new SimpleReportNotifier(Priority.ROUTINE);
        Notifire emailNotifier = new EmailNotifier(Priority.IMPORTANT);
        Notifire smsNotifier = new SmsNotifier(Priority.ASAP);

        reportNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(smsNotifier);

        reportNotifier.notifierManager("Everything is ok",Priority.ROUTINE);
        reportNotifier.notifierManager("Something went wrong",Priority.IMPORTANT);
        reportNotifier.notifierManager("We have problem",Priority.ASAP);

    }
}
