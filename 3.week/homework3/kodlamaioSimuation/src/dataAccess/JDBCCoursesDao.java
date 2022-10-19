package dataAccess;

import entities.Courses;

public class JDBCCoursesDao implements CourseDao{
    @Override
    public void add(Courses courses){
        System.out.print("Kurs Eklendi: JDBC ");
    }
    @Override
    public void remove(){
        System.out.println("Kurs Silindi: JDBC");
    }
}
