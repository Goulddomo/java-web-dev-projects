package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    //    public static void main(String[] args) {
//
//    }
    private Date lastUpdated;

    public Menu(Date d, ArrayList<MenuItem> i) {
        this.lastUpdated = d;
        int items = 1;
    }

    public void setLastUpdated(Date lastUpdated) {
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }
}
