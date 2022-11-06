package main.java.by.tc.task2.dao;

import main.java.by.tc.task2.dao.impl.*;

public final class DAOFactory {

    private static final DAOFactory instance = new DAOFactory();

    private final ApplianceDAO applianceDAO;

    private DAOFactory() {
        this.applianceDAO = new ApplianceDAOImpl();
    }

    public static DAOFactory getInstance() {
        return instance;
    }

    public ApplianceDAO getApplianceDAO() {
        return applianceDAO;
    }
}
