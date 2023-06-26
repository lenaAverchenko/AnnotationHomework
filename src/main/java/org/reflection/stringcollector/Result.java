package org.reflection.stringcollector;

//В данном классе должен быть вызван метод printStudentsInfo
public class Result extends AbstractStudent {

    public Result() {
        //
    }

    @StudentAnnotation(prefix = "Student info")
    private void printStudentsInfo(String info) {
        System.out.println(info);
    }
}
