package business;

import core.logging.Logger;
import dataAccess.JDBCTeacherDao;
import dataAccess.TeacherDao;
import entities.Teachers;

public class TeacherManager {
    private TeacherDao teacherDao;
    private Logger[] loggers;
    public TeacherManager(TeacherDao teacherDao, Logger[] loggers) {
        this.teacherDao = teacherDao;
        this.loggers = loggers;
    }

    public void addTeacher(Teachers teachers) {

        teacherDao.add();
        System.out.println(teachers.getLastName());

        for (Logger logger:loggers) {
            logger.logged(teachers.getLastName());
        }
    }




}
