import java.io.PrintWriter;

//TIP Задача 1: S (Single Responsibility)
// Проблема: Класс ReportManager делает слишком много:
// считает данные,
// форматирует их в строку и
// записывает в файл.
// ПЛОХО: Если изменится формат файла или логика расчетов, придется править один и тот же класс.

// Задание: Разделите этот класс на три: Calculator, ReportFormatter и FileSaver.
class ReportManager {
    public void processReport() {
        // 1. Расчет данных
        double data = 500.0 * 1.2;
        // 2. Форматирование
        String report = "Отчет: " + data;
        // 3. Сохранение
        try (PrintWriter out = new PrintWriter("report.txt")) {
            out.println(report);
        } catch (Exception e) { e.printStackTrace(); }
    }
}