package dataAccess;

public class HybernateCategoryDao implements CategoryDao{
    @Override
    public void add() {
        System.out.print("Hybernate ile kategori eklendi: ");
    }

    @Override
    public void remove() {
        System.out.println("Hybernate ile kategori silindi: ");
    }
}
