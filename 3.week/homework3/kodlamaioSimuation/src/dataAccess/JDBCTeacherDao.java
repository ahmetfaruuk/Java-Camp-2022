package dataAccess;

public class JDBCTeacherDao implements TeacherDao {
    @Override
    public void add(){
        System.out.print("Eğitmen Eklendi: JDBC ");
    }
    @Override
    public void remove(){
        System.out.println("Eğitmen Silindi: JDBC");
    }

}
