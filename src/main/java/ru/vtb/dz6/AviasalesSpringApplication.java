package ru.vtb.dz6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import ru.vtb.dz6.entity.PremiereEntity;
import ru.vtb.dz6.services.PremiereRepoService;

@EnableTransactionManagement
@SpringBootApplication
public class AviasalesSpringApplication {


    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(AviasalesSpringApplication.class, args);


        PremiereRepoService premiereService = ctx.getBean(PremiereRepoService.class);
        premiereService.deleteAll();
        premiereService.addPremiere(new PremiereEntity("Евгений Онегин", "Опера Петра Чайковский по поэме А.С. Пушкина «Полтава» (1883)", 14, 30));
        premiereService.addPremiere(new PremiereEntity("Трубадур", "Опера Джузеппе Верди в 4 действиях", 15, 50));
        premiereService.addPremiere(new PremiereEntity("Аида", "Опера Джузеппе Верди в 4 действиях", 20, 100));

//
//
//        //Добавили 2-е премьеры
//        premiereService.addPremiere(new PremiereEntity("Аида", "Опера Джузеппе Верди в 4 действиях", 20, 100));
//        premiereService.addPremiere(new PremiereEntity("Трубадур", "Опера Джузеппе Верди в 4 действиях", 15, 50));
//
//        premiereService.printAll();
//        System.out.println("======================================================");
//
//        //Добавлена новая премьера
//        premiereService.addPremiere(new PremiereEntity("Евгений Онегин", "Опера Петра Чайковский по поэме А.С. Пушкина «Полтава» (1883)", 14, 30));
//
//        premiereService.printAll();
//        System.out.println("======================================================");
//
//        //Удалена премьера
//        premiereService.deletePremiere("Аида");
//        premiereService.printAll();
//        System.out.println("======================================================");
//
//        //Куплено 5 билетов на премьеру
//        if (!premiereService.buyTickets("Евгений Онегин", 5)) {
//            System.out.println("Все билеты на премьру \"Евгений Онегин\" выкуплены");
//        }
//
//        premiereService.printAll();
//        System.out.println("======================================================");
    }

}
