package com.example.a3raya1;

import android.widget.ImageView;

public class ListElement {
    public String name;
    public String winLose;

    public ListElement(String name, String winLose) {
        this.name = name;
        this.winLose = winLose;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWinLose() {
        return winLose;
    }

    public void setWinLose(String winLose) {
        this.winLose = winLose;
    }
}
