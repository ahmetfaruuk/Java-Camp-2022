public class CustomerManager {
    BaseDatabaseManager databaseManager;
    public void customers(){
        BaseDatabaseManager[] baseDatabaseManagers= new BaseDatabaseManager[]{new SqlServerDatabaseManager(),new OracleDatabaseManager(), new MysqlDatabaseManager()};
        databaseManager.getData();

    }
}
