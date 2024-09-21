public class Main {
    public static void main(String[] args) {
        //Задача 1.
        String fistName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = "Ivanov" + " " + "Ivan" + " " + "Ivanovich";
        System.out.print("Ф. И. О. сотрудника — " + fullName);
        System.out.println();
        System.out.println();

        // Задача 2.
        String fullNameUpperCase = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — "
                + fullNameUpperCase);
        System.out.println();

        //Задача 3.
        fullName = "Иванов Семён Семёнович";
        String fullNamereplace = fullName.replace("ё" , "е");
        System.out.println(fullNamereplace);
        System.out.println();





    }
}