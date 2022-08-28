public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1() {
        //### **Задание 1**
        //
        //Представим, что мы работаем в небольшой компании. Данные сотрудников хранятся в неструктурированном формате, и бухгалтерия попросила написать программу, в которой  можно работать с Ф. И. О. сотрудников.
        //
        //Напишите четыре строки:
        //
        //первая с именем firstName — для хранения имени;
        //
        //вторая с именем middleName — для хранения отчества;
        //
        //третья с именем lastName — для хранения фамилии;
        //
        //четвертая с именем fullName — для хранения Ф. И. О. сотрудника в формате "Фамилия Имя Отчество".
        //
        //Выведите в консоль фразу: “ФИО сотрудника — ….”
        //
        //В качестве данных для задачи используйте “Ivanov Ivan Ivanovich”.
        String firstName = "Ivan";
        String middleName = "Ivanov";
        String lastName = "Ivanovich";
        String fullname = middleName + " " + firstName + " " + lastName;
        System.out.println("ФИО сотрудника — " + fullname);
    }
    public static void task2(){
        //### **Задание 2**
        //
        //Для подачи ежемесячного отчета и ведения документации нашей бухгалтерии нужны    Ф. И. О. сотрудников, полностью написанные заглавными буквами (верхним регистром).
        //
        //Напишите программу, которая изменит написание Ф. И. О. сотрудника с  “Ivanov Ivan Ivanovich” на полностью заглавные буквы.
        //
        //В качестве строки с исходными данными используйте строку fullName.
        //
        //Результат программы выведите в консоль в формате: ”Данные ФИО сотрудника для заполнения отчета — …”
        //toUpperCase()
        String fullname = "Ivanov Ivan Ivanovich";
        String fullNameRight = fullname.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameRight);
    }
    public static void task3(){
        //### **Задание 3**
        //
        //Система, в которой мы работаем, не принимает символ “ё”.
        //
        //Поэтому нам нужно написать программу, которая заменяет символ “ё” на символ “е”.
        //
        //В качестве исходных данных используйте строку fullName и данные в ней “Иванов Семён Семёнович”.
        //
        //Выведите результат программы в консоль в формате: ”Данные ФИО сотрудника — ...”

        String fullName = "Иванов Семён Семёнович";
        System.out.println(fullName.replace('ё','е'));

    }
    public static void lesson(){
        String phone = "982-638 4996+";
        phone = phone.replace("-", "");
        phone = phone.replace(" ", "");
        phone = phone.replace("+", "");
        if (phone.length() == 10) {
            phone = '7' + phone;
        } else if (phone.length() > 11){
            throw new RuntimeException("Телефон слишком длинный");
        } else if (phone.length() < 10){
            throw new RuntimeException("Телефон слишком короткий");
        } else if (phone.length() == 11 && phone.charAt(0) != '7') {
            throw new RuntimeException("Телефон должен начинаться с 7");
        }
        System.out.println("phone = " + phone);
        String expectedPhone = "79826384996";
        if (phone.equals(expectedPhone)) {
            System.out.println("Успех");
        } else {
            System.out.println("Неуспешно");
        }
    }
}
