package dataAccess;
public class HybernateTeacherDao implements TeacherDao {
    @Override
    public void add() {
        System.out.print("Eğitmen Eklendi: Hybernate ");
    }
    @Override
    public void remove() {
        System.out.println("Eğitmen Silindi: Hybernate");
    }
}
