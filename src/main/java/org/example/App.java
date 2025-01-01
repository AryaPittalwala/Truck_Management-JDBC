package org.example;


import java.util.List;

public class App
{
    public static void main( String[] args )
    {
        TruckService ts = new TruckService();
        Truck t1 = new Truck("TATA","2019",1000,"Rajesh");
        Truck t2 = new Truck("VOLVO","2023",1000,"Akash");
        Truck t3 = new Truck("EICHER","2021",1000,"Harshit");
        System.out.println("adding the trucks");
        ts.addTruck(t1);
        ts.addTruck(t2);
        ts.addTruck(t3);
//        System.out.println("truck by id");
//        Truck tt=ts.getTruckByID(2);
//
//        tt.setDriver_name("Arya");
//        ts.updateTruck(tt);
//        System.out.println("updated data: "+ts.getTruckByID(2));
//
//        System.out.println("get  all trucks");
//        List<Truck> allTrucks = ts.getAllTrucks();
//        for(Truck t11 : allTrucks){
//            System.out.println(t11);
//        }
//
//
//        System.out.println("deleting data");
//        ts.deleteTruck(1);
//        System.out.println("after all operations");
//        allTrucks =ts.getAllTrucks();
//        System.out.println(allTrucks);


    }
}
