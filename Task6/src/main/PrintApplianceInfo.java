package main;

import bean.Appliance;

import java.util.List;

public class PrintApplianceInfo {

    public static void print(Appliance appliance) {
        if(appliance != null) {
            System.out.println(appliance.toString());
        }
        else{
            System.out.println("Null appliance!");
        }

    }
}
