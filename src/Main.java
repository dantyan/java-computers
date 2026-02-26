import models.Laptop;
import models.Product;
import services.LaptopService;
import services.ProductService;
import services.impl.ProductServiceImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
       // connect_batch();

        //printProducts();

        printLaptops();


    }

    private static void printLaptops() {
        LaptopService laptopService = LaptopService.INSTANCE;
        List<Laptop> laptops = laptopService.findAllLaptops();

        for (Laptop laptop : laptops){
            System.out.println(laptop);
        }
    }

    private static void printProducts() {
        ProductService productService = ProductService.INSTANCE;
        List<Product> products = productService.findAllProducts();

        for (Product product: products){
            System.out.println(product);
        }
    }

    private static void connect_batch() {

    }

    private static void connect() {
        String url = "jdbc:sqlite:C:\\Users\\NB-3\\Documents\\databases\\computers.db";

        Connection conn = null;
        try{
            conn = DriverManager.getConnection(url);

            String ddl = "create table if not exists product(\n" +
                    "\tmaker text not null,\n" +
                    "\tmodel text primary key,\n" +
                    "\ttype text not null\n" +
                    ");";

            String ddl1 = "create table if not exists laptop (\n" +
                    "\tcode integer primary key,\n" +
                    "\tmodel text not null,\n" +
                    "\tspeed integer not null check (speed > 0),\n" +
                    "\tram integer not null,\n" +
                    "\thd real not null,\n" +
                    "\tprice real,\n" +
                    "\tscreen integer not null,\n" +
                    "\tforeign key(model) REFERENCES product(model)\n" +
                    ");";

            Statement statement = conn.createStatement();

            statement.execute(ddl);
            statement.execute(ddl1);

            statement.close();
            conn.close();

            System.out.println("success");

        }catch (SQLException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }


}