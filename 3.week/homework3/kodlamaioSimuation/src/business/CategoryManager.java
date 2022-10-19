package business;

import core.logging.Logger;
import dataAccess.CategoryDao;
import entities.Categorys;

public class CategoryManager {
    CategoryDao categoryDao;
    Logger[] loggers;

    public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }


    public void addCategory(Categorys categorys){
        categoryDao.add();
        System.out.println(categorys.getName());
        for (Logger logger: loggers) {
            logger.logged(categorys.getName());
        }
    }
}
