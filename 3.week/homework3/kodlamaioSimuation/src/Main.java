import business.CategoryManager;
import business.CourseManager;
import business.TeacherManager;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import dataAccess.*;
import entities.Categorys;
import entities.Courses;
import entities.Teachers;




public class Main {
    public static void main(String[] args) throws Exception {
        Teachers teachers1 = new Teachers("Engin","Demiroğ",35,"engindemirog@kodlama.io","Kodlama.io Eğitmeni");
        Logger[] loggers = new Logger[]{new DatabaseLogger(),new FileLogger()};
        TeacherManager teacherManager = new TeacherManager(new HybernateTeacherDao(),loggers);
        teacherManager.addTeacher(teachers1);

        Courses courses1 = new Courses("Yazılım Geliştirici Yetiştirme Kampı - JAVA",10);
        Courses courses2 = new Courses("Yazılım Geliştirici Yetiştirme Kampı - C# Angular",10);
        Courses courses3 = new Courses("Yazılım Geliştirici Yetiştirme Kampı - JavaScript",10);
        Courses courses4 = new Courses("Yazılım Geliştirici Yetiştirme Kampı - Java + REACT",10);
        Courses courses5 = new Courses("Senior Yazılım Geliştirici Yetiştirme Kampı - .NET",10);
        Courses[] course = new Courses[]{courses2,courses3,courses4,courses5};
        CourseManager courseManager = new CourseManager(new HybernateCoursesDao(),loggers, course);
        courseManager.add(courses1);


        Categorys categorys = new Categorys("Programlama");
        CategoryManager categoryManager = new CategoryManager(new HybernateCategoryDao(),loggers);
        categoryManager.addCategory(categorys);



    }
}