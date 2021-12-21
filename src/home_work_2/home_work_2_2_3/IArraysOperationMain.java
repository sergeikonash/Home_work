package home_work_2.home_work_2_2_3;

import home_work_2.ArraysUtils;

import static home_work_2.ArraysUtils.*;

public class IArraysOperationMain {
    public static void main(String[] args) {

        //Создаю экземпляр каждого из классов и через имя ссылочной переменной обращаюсь к каждому объекту для вызова метода

        DoWhileOperation doWhileOperation = new DoWhileOperation();
        doWhileOperation.task2_2_1(arrayFromConsole());

        WhileOperation whileOperation = new WhileOperation();
        whileOperation.task2_2_1(arrayFromConsole());

        ForOperation forOperation = new ForOperation();
        forOperation.task2_2_1(arrayFromConsole());

        ForEachOperation forEachOperation = new ForEachOperation();
        forEachOperation.task2_2_1(arrayFromConsole());
    }
}
