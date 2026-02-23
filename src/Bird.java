//TIP Задача 3: L (Liskov Substitution)
// Проблема: У нас есть базовый класс «Птица».
// Мы создаем наследника «Страус», но страусы не летают.

// Задание: Перестройте иерархию.
// Выделите интерфейс Flyable или создайте промежуточный класс FlyingBird.
// Программа не должна падать, если мы заменим Bird на Ostrich.

class Bird {
    public void fly() { System.out.println("Лечу!"); }
}

class Ostrich extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Я не умею летать!");
    }
}
