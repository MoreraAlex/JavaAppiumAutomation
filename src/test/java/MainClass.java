public class MainClass {
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
