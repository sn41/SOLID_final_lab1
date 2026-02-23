
//TIP Задача 2: O (Open/Closed)
// Проблема: Чтобы добавить новый способ оплаты,
// нам нужно лезть внутрь метода processPayment и
// добавлять новый if или case.
// ПЛОХО: Класс закрыт для расширения без модификации своего кода.

// Задание: Создайте интерфейс PaymentMethod и
// реализуйте его в классах CreditCardPayment и PayPalPayment.
// Метод processPayment должен принимать интерфейс.
class PaymentService {
    public void processPayment(String type) {
        if (type.equals("CreditCard")) {
            // логика карты
        } else if (type.equals("PayPal")) {
            // логика PayPal
        }
        // Что если завтра добавим Криптовалюту? Снова править этот класс?
    }
}
