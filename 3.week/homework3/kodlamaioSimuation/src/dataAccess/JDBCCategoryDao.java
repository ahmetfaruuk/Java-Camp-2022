package dataAccess;

public class JDBCCategoryDao implements CategoryDao{
    @Override
    public void add() {
        System.out.print("JDBC ile kategori eklendi: ");
    }

    @Override
    public void remove() {
        System.out.println("JDBC ile kategori silindi: ");
    }
}
