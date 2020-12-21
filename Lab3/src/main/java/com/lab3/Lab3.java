package com.lab3;

public class Lab3 {
    public static void main(String[] args) {
        TerribleNoise terribleNoise = new TerribleNoise();
        LightCloudOfDust lightCloudOfDust = new LightCloudOfDust();
        Homsa homsa = Homsa.getInstance();
        ScreamOfMisa screamOfMisa = new ScreamOfMisa();
        DarkDarkness darkDarkness = new DarkDarkness();
        SomethingBigAndSoft somethingBigAndSoft = new SomethingBigAndSoft();
        InvisibleEnemy invisibleEnemy = new InvisibleEnemy();
        Rustle rustle = new Rustle();
        Enemy enemy = new Enemy();
        DayLight dayLight = new DayLight();

        terribleNoise.move();
        lightCloudOfDust.move();
        homsa.giveKnife();
        homsa.go();
        screamOfMisa.move();
        darkDarkness.move();
        somethingBigAndSoft.move(homsa);
        homsa.clopEye();
        homsa.cut(invisibleEnemy);
        rustle.move();
        enemy.move();
        homsa.decide();
        homsa.toSee();
        dayLight.move();

        System.out.println("End");
    }
}
//        Ctrl + W              - Умное выделение
//        Ctrl + /	            - Однострочное комментирование / раскомментирование
//        Ctrl + Shift + /	    - Многострочное комментирование / раскомментирование
//        Ctrl + D              - Копировать текущую строку
//        Ctrl + Y              - Удалить текущую строку
//        Ctrl + Shift + J      - Объединение строк
//        Alt + Q               - Контекстная информация
//        Alt + Enter	        - Показать предлагаемое исправление
//        Ctrl + Alt + L	    - Форматирование кода
//        Ctrl + Alt + O	    - Удалить неиспользуемые импорты
//        Ctrl + Alt + I	    - Авто-отступ линии
//        Tab / Shift + Tab     - Отступ / удаление отступа выбранному фрагменту кода
//        Shift + Enter         - Начать с новой строки
/*

        System.out.println(homsa);

        System.out.println(homsa.equals(rustle));
        System.out.println(homsa.equals(homsa));
        System.out.println(homsa.equals(null));
        System.out.println(homsa.hashCode());
        System.out.println(rustle.hashCode());

*/
