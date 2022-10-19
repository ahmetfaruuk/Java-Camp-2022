package business;

import core.logging.Logger;
import dataAccess.CourseDao;
import dataAccess.JDBCCoursesDao;
import entities.Courses;


import java.util.Objects;


public class CourseManager {
    private CourseDao courseDao;
    private Logger[] loggers;
    private Courses[] course;

    public CourseManager(CourseDao courseDao,Logger[] loggers,Courses[] course) {
        this.courseDao = courseDao;
        this.loggers = loggers;
        this.course = course;
    }


    public void add(Courses courses) throws Exception {
        if (courses.getPrice()<0){
            throw new Exception("Kurs Fiyatı 0'dan küçük olamaz.");
        }
        for (Courses course : course){
            if (course.getName()==courses.getName()){
                throw new Exception("Kurs adları aynı.");
            }
        }

        courseDao.add(courses);
        System.out.println(courses.getName());
        for (Logger logger:loggers) {
            logger.logged(courses.getName());
        }
    }
}
