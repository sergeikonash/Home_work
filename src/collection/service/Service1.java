package collection.service;

import collection.dto.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Service1 {

    public void run() {
        ArrayList<Student> studentsList = new ArrayList<Student>();
        fillingTheCollection(studentsList);
        ArrayList<Student> sortStudentsList = filterByAge(studentsList);
        sortStudentsList = filterByGrade(sortStudentsList);
        System.out.println(averageAge(sortStudentsList));
//        sortByName(sortStudentsList);
        sortByGrade(sortStudentsList);
        sortByAge(sortStudentsList);
    }

    public ArrayList<Student> fillingTheCollection(ArrayList<Student> list) {
        for (int i = 0; i < 10000; i++) {
            list.add(new Student(i+1));
        }
        return list;
    }

    public ArrayList<Student> filterByAge(ArrayList<Student> list) {
        ArrayList<Student> sortByAgeList = new ArrayList<Student>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getAge() > 11) {
                sortByAgeList.add(list.get(i));
            }
        }
        return sortByAgeList;
    }

    public ArrayList<Student> filterByGrade(ArrayList<Student> list) {
        ArrayList<Student> sortByGradeList = new ArrayList<Student>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getGrade() > 8.0) {
                sortByGradeList.add(list.get(i));
            }
        }
        return sortByGradeList;
    }

    public int averageAge(ArrayList<Student> list) {
        int averageAge = 0;
        for (int i = 0; i < list.size(); i++) {
            averageAge += list.get(i).getAge();
        }
        return averageAge / list.size();
    }

    public void sortByName(ArrayList<Student> list) {
        Collections.sort(list, new Comparator<Student>() {
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        for (int i = 0; i < 10; i++) {
            System.out.println(list.get(i));
        }
    }

    public void sortByGrade(ArrayList<Student> list) {
        Collections.sort(list, new Comparator<Student>() {
            public int compare(Student o1, Student o2) {
                if(o1.getGrade() == o2.getGrade()) {
                    return 0;
                }
                return o1.getGrade() < o2.getGrade() ? -1 : 1;
            }
        });
        for (int i = 0; i < 10; i++) {
            System.out.println(list.get(i));
        }
    }

    public void sortByAge(ArrayList<Student> list) {
        Collections.sort(list, new Comparator<Student>() {
            public int compare(Student o1, Student o2) {
                if(o1.getAge() == o2.getAge()) {
                    return 0;
                }
                return o1.getAge() < o2.getAge() ? -1 : 1;
            }
        });
        for (int i = 0; i < 10; i++) {
            System.out.println(list.get(i));
        }
    }
}
