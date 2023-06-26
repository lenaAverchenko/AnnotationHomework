package org.reflection.stringcollector;

//В данном классе должно быть получено только поле name
//префикс BE

public class StudentBE extends AbstractStudent {

    @StudentAnnotation(prefix = "BE")
    private final String name;

    private final String surname;

    public StudentBE() {
        name = NameUtil.getRandomName();
        surname = NameUtil.getRandomName();
    }
}