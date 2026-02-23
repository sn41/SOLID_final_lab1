//TIP Задача 5: D (Dependency Inversion)
// Проблема: Высокоуровневая кнопка жестко привязана к конкретной лампе.
// Мы не можем использовать эту кнопку для включения вентилятора.

// Задание: Сделайте так, чтобы Button зависела от интерфейса SwitchableDevice.
// Тогда кнопка сможет включать любой объект, реализующий этот интерфейс.
class ConcreteLamp {
    public void shine() { System.out.println("Свет горит"); }
}

class Button {
    private ConcreteLamp lamp = new ConcreteLamp(); // Жесткая привязка

    public void poll() {
        lamp.shine();
    }
}
