package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import database.PolyBayDatabase;
import models.Product;

public class ProductsDAO {

    public ProductsDAO(){
    
    }

    public ArrayList<Product> findAll() throws SQLException{
        
        PolyBayDatabase test = new PolyBayDatabase();
        ArrayList<Product> produit = new ArrayList<Product>();
        ResultSet results = test.prepareStatement("SELECT * FROM product ORDER BY name ASC").executeQuery();
        while(results.next()){
            final int id = results.getInt("id");
            final String name = results.getString("name");
            final String owner = results.getString("owner");
            final float bid = results.getFloat("bid");

            Product temp = new Product(id, name, owner, bid);
            produit.add(temp);
        }

        return produit;

    }

}
