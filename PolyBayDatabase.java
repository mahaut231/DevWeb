package database;

import java.sql.SQLException;

public class PolyBayDatabase extends MySQLDatabase {

    public PolyBayDatabase() throws SQLException{

        super("localHost", 3306, "poly_bay", "root", "");

    }

}
