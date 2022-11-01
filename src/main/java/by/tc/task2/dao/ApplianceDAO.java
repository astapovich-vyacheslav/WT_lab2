package main.java.by.tc.task2.dao;

import main.java.by.tc.task2.entity.criteria.*;
import main.java.by.tc.task2.entity.*;

public interface ApplianceDAO {
	Appliance find(Criteria criteria);
}
