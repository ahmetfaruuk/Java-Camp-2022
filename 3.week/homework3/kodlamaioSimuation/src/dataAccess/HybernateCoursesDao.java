package dataAccess;

import entities.Courses;

public class HybernateCoursesDao implements CourseDao{
    @Override
    public void add(Courses courses){
        System.out.print("Kurs Eklendi: Hybernate ");
    }
    @Override
    public void remove(){
        System.out.println("Kurs Silindi: Hybernate");
    }
}
