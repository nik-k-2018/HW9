public class Task3 {
    public static void main(String[] args) {
        // Исходная строка с Ф.И.О., содержащая букву "ё"
        String fullName = "Иванов Семён Семёнович";

        // Заменяем все буквы "ё" на "е"
        String correctedName = fullName.replace('ё', 'е');

        // Выводим результат
        System.out.println("Данные Ф. И. О. сотрудника — " + correctedName);
    }
}