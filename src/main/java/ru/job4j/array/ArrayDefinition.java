package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("Размер массива ages = new short[10] равен " + ages.length);
        String[] surnames = new String[100500];
        System.out.println("Размер массива surnames = new String[100500] равен " + surnames.length);
        float[] prices = new float[40];
        System.out.println("Размер массива prices = new float[40] равен " + prices.length);
        System.out.println();
        String[] names = new String[4];
        names[0] = "Ivan Petrov";
        names[1] = "Nikolay Vasin";
        names[2] = "Oksana Ivanova";
        names[3] = "Pavel Medvedev";
        for (int i = 0; i < 4; i++) {
            System.out.println("В ячейке " + i + " массива names имя: " + names[i]);
        }
    }
}
