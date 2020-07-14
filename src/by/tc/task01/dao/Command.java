package by.tc.task01.dao;

import by.tc.task01.entity.Appliance;

import java.util.Map;

public interface Command {
    public Appliance execute(Map<String,String> params);
}
