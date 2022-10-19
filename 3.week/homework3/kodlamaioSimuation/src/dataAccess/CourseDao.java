package dataAccess;

import entities.Courses;

public interface CourseDao {
    void add(Courses courses);
    void remove();
}
