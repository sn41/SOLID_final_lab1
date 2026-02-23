//TIP Задача 4: I (Interface Segregation)
// Проблема: Интерфейс «Умный дом» заставляет простую лампочку уметь открывать двери.
// Задание: Разделите SmartDevice на два маленьких интерфейса:
// Switchable (для света) и
// Lockable (для замков).
interface SmartDevice {
    void turnOn();
    void openDoor(); // Лампочке это не нужно!
}

class LightBulb implements SmartDevice {
    public void turnOn() { /* ок */ }
    public void openDoor() { /* пустота или ошибка */ }
}
