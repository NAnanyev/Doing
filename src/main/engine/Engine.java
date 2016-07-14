package main.engine;

import main.abstractPlain.AbstractPlain;
import main.connection.DBConnect;

import java.util.ArrayList;

/**
 * Created by Ananyeu_NA on 13.07.2016.
 */
public class Engine {
    public ArrayList<AbstractPlain> getPlains() {
        return plains;
    }

    public void setPlains(ArrayList<AbstractPlain> plains) {
        this.plains = plains;
    }

    private ArrayList<AbstractPlain> plains = new ArrayList<AbstractPlain>();

    public ArrayList<AbstractPlain> getResults() {
        DBConnect dbConnect = new DBConnect();
        plains = dbConnect.getConnection();
        return plains;
    }

}
