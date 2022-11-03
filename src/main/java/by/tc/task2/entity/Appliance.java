package main.java.by.tc.task2.entity;



public class Appliance {
    String name;
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Appliance:\n");
        sb.append("\t").append(name).append(";\n");
        return sb.toString();
    }


    public Appliance(String name){
        this.name = name;
    }
}
