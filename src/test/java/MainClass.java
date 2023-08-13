public class MainClass {
    //Тест 3: Приватная строка и геттер для строки
    private String class_string = "hello, world";
    public String getClassString(){
        return class_string;
    }


    //Тест 2: Создал приватное поле класса и публичный метод возвращающий переменную
    private int class_number = 20;
    public int getClassNumber(){
        return class_number;
    }


    //Объявил static тк в данном случае создание объекта класса показалось излишним
    public static int getLocalNumber(){
        return 14;
    }


}
