package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TruckService {

    public void addTruck(Truck truck) {
        try {
            String sql = "insert into truck(name,model,capacity,driver_name) into values(?,?,?,?)";
            Connection connection = ConnectionDetails.getConnection();
            PreparedStatement p = connection.prepareStatement(sql);
            p.setString(1, truck.getName());
            p.setString(2, truck.getModel());
            p.setInt(3, truck.getCapacity());
            p.setString(4, truck.getDriver_name());

            int update = p.executeUpdate();
            System.out.println("DATA INSERTED :" + update);
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    public Truck getTruckByID(int id) {
        String sql = "select * from truck where id=?";
        Truck truck = new Truck();
        try {

            Connection connection = ConnectionDetails.getConnection();
            PreparedStatement p = connection.prepareStatement(sql);
            p.setInt(1, id);
            ResultSet rs = p.executeQuery();
            if (rs.next()) {
                truck.setId(rs.getInt("id"));
                truck.setName(rs.getString("name"));
                truck.setModel(rs.getString("model"));
                truck.setCapacity(rs.getInt("capacity"));
                truck.setDriver_name(rs.getString("driver_name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return truck;
    }

    public void updateTruck(Truck truck) {
        try {
            String sql = "update truck set name=? model=? capacity=? driver_name=? where id=?";
            Connection connection = ConnectionDetails.getConnection();
            PreparedStatement p = connection.prepareStatement(sql);
            p.setString(1, truck.getName());
            p.setString(2, truck.getModel());
            p.setInt(3, truck.getCapacity());
            p.setString(4, truck.getDriver_name());
            p.setInt(5, truck.getId());

            int update = p.executeUpdate();
            System.out.println("ROWS UPDATED: " + update);


        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    public List<Truck> getAllTrucks() {
        String sql = "select * from truck";
        List<Truck> trucks = new ArrayList<>();
        try {
            Connection connection = ConnectionDetails.getConnection();
            Statement s = connection.createStatement();
            ResultSet rs = s.executeQuery(sql);

            while (rs.next()) {
                Truck truck = new Truck();
                truck.setId(rs.getInt("id"));
                truck.setName(rs.getString("name"));
                truck.setModel(rs.getString("model"));
                truck.setCapacity(rs.getInt("capacity"));
                truck.setDriver_name(rs.getString("driver_name"));
                trucks.add(truck);

            }


        } catch (Exception e) {
            e.getStackTrace();
        }
        return trucks;
    }

    public void deleteTruck(int id) {
        String sql = "select * from truck where id=?";
        try {
            Connection connection = ConnectionDetails.getConnection();
            PreparedStatement p = connection.prepareStatement(sql);
            p.setInt(1,id);
            int delete = p.executeUpdate();
            System.out.println("DATA DELETED: "+delete);

        } catch (Exception e) {
            e.getStackTrace();
        }
    }

}
