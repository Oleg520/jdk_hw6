package ru.oleg520;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class HomeWork {
    static Random random;
    static Map<Integer, Boolean> statistics;
    static int doorsCount;
    static int attempts;

    public static void main(String[] args) {
        random = new Random();
        statistics = new HashMap<>();
        doorsCount = 3;
        attempts = 1000;

        //играем 1000 раз
        for (int i = 0; i < attempts; i++) {
            round(i);
        }

        //смотрим статистику побед
        int win = 0;
        for (var entry : statistics.entrySet()) {
            if (entry.getValue()) {
                win++;
            }
        }
        System.out.printf("Попыток: %d%nПобед: %d%nПоражений: %d", attempts, win, attempts - win);
    }

    private static void round(int numRound) {
        int success = random.nextInt(doorsCount); //спрятали приз
        int firstChoice = random.nextInt(doorsCount); //первый выбор игрока
        int freeOpenDoor = -1;
        int secondChoice = -1;

        //ведущий открывает одну из двух оставшихся дверей, за которой точно нет приза
        for (int i = 0; i < doorsCount; i++) {
            if (i != success && i != firstChoice) {
                freeOpenDoor = i;
            }
        }

        //игрок меняет свой выбор
        for (int i = 0; i < doorsCount; i++) {
            if (i != freeOpenDoor && i != firstChoice) {
                secondChoice = i;
            }
        }

        //проверяем угадал ли игрок и делаем запись в статистику
        statistics.put(numRound, success == secondChoice);
    }
}
