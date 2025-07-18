public class Task1 {
    public static void main(String[] args) {
        // Объявляем переменные для хранения имени, отчества и фамилии
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";

        // Создаем строку с полным именем
        String fullName = lastName + " " + firstName + " " + middleName;

        // Выводим результат в консоль
        System.out.println("Ф. И. О. сотрудника — " + fullName);
    }
}