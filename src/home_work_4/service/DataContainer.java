package home_work_4.service;

import java.util.Arrays;
import java.util.Comparator;

public class DataContainer<T>{
    T[] data;

    public DataContainer(T[] data){
        this.data = data;
    }

    public int add(T item) {
        int i = 0;
        if (item == null) {
            return -1;
        }
        if (data[data.length-1] != null) {
            data = Arrays.copyOf(data, data.length + 1);
        }
        for (i = 0; i < data.length; i++) {
            if (data[i] == null) {
                data[i] = item;
                return i;
            }
        }
        return i;
    }

    public T get(int index) {
        if (index < 0 && index > data.length - 1) {
            return null;
        }
        return data[index];
    }

    T[] getItems() {
        return data;
    }

    public boolean delete(int index) {
        if (index < 1 && index > data.length) {
            return false;
        }
        if (index == 1) {
            data = Arrays.copyOfRange(data, 1,data.length);
            return true;
        } else if (index == data.length) {
            data = Arrays.copyOf(data, data.length - 1);
            return true;
        }
            T[] dataNew1 = Arrays.copyOf(data, index - 1);
            T[] dataNew2 = Arrays.copyOfRange(data, index, data.length);
            data = Arrays.copyOf(data, data.length - 1);
            int count = 0;
            for (int i = 0; i < dataNew1.length; i++) {
                data[i] = dataNew1[i];
                count++;
            }
            for (int j = 0; j < dataNew2.length; j++) {
                data[count] = dataNew2[j];
                count++;
            }
        return true;
    }

    public boolean delete(T item) {
        for (int i = 0; i < data.length; i++) {
            if(data[i].equals(item)) {
                delete(i+1);
                return true;
            }
        }
        return false;
    }

    public void sort(Comparator<T> comparator) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = data.length - 1; j > i; j--) {
                if (comparator.compare(data[j - 1], data[j]) > 0) {
                    T tmp = data[j - 1];
                    data[j - 1] = data[j];
                    data[j] = tmp;
                }
            }
        }

    }

    @Override
    public String toString() {
        if (data[0] == null) {
            return "Пока ничего не добавлено...";
        }
        return "DataContainer" + Arrays.toString(data);
    }
}
