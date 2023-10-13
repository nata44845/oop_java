package study_group;

import study_group.service.Service;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();

        service.addStudent("Саша", 18);
        service.addStudent("Маша", 17);
        service.addStudent("Паша", 20);
        service.addStudent("Даша", 19);

        System.out.println(service.getStudentsInfo());
        service.sortByName();
        System.out.println(service.getStudentsInfo());
        service.sortByAge();
        System.out.println(service.getStudentsInfo());
    }
}
