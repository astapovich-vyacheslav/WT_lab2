package main.java.by.tc.task2.entity;


import java.util.List;

public class Appliance {
    String name;
    List<String> info;
    public Appliance(String name){
        this.name = name;
    }
    public Appliance(List<String> list){
        this.info = list;
    }
    public Appliance(String name, List<String> info)
    {
        this.name = name;
        this.info = info;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Appliance:\n");
        sb.append("\t").append(name).append(";\n");
        return sb.toString();
    }
}
