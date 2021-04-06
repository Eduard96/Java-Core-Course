package lesson3.test;

import lesson3.model.User;

public class UserTest {

    public static void main(String[] args) {
        User user = new User();
        user.setName("Eduard");
        user.setSurname("Matveev");
        user.setAge(24);
        user.setHeight(180.4f);
        user.setWeight(74.4f);
        user.setGender("m");
        user.setNickname("edo_96");
        user.setCountry("Armenia");
        user.setCity("Yerevan");
        user.setEmail("dev.eduardmatveev@mail.ru");
        user.setPassword(new char[]{'1', '2', '3', '4', '5', '6', '7', '8', '9'});
        user.setRegistrationDate("2021.04.06");

        System.out.println(user.getName() + " " + user.getSurname());
        System.out.println(user.getAge());
        //...
        System.out.println(user);
    }
}
