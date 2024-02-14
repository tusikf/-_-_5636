//Проанализировать персонажей "Крестьянин, Разбойник, Снайпер, Колдун, Копейщик, Арбалетчик, Монах".
//Для каждого определит 8 полей данных(здоровье, сила итд) 3-4 поля поведения(методов атаковать, вылечить итд).
//Создать абстрактный класс и иерархию наследников.
//Расположить классы в пакет так, чтобы в основной программе небыло видно их полей.
//В не абстрактных классах переопределить метод toString() так чтобы он возвращал название класса или имя.
//Создать в основной программе по одному обьекту каждого не абстрактного класса и вывести в консоль его имя.
//Формат сдачи:
//Ссылка на гитхаб проект
//Подписать фамилию и номер группы


public class Main {
    public static void main(String[] args) {
        Peasant peasant1 = new Peasant("Peasant1");
        peasant1.print();

        Outlaw outlaw1 = new Outlaw("Outlaw1");
        outlaw1.print();

        outlaw1.Atack(outlaw1,peasant1);
        peasant1.print();

        Sniper sniper1 = new Sniper("Sniper1");

        Spearman spearman1 = new Spearman("Spearman1");

        Crossbowman crossbowman1 = new Crossbowman("Crossbowman1");

        Monk monk1 = new Monk("Monk1");

        Mag mag1 = new Mag("Mag1");

        System.out.println(peasant1);
        System.out.println(outlaw1);
        System.out.println(sniper1);
        System.out.println(spearman1);
        System.out.println(crossbowman1);
        System.out.println(monk1);
        System.out.println(mag1);



        
    }
}
