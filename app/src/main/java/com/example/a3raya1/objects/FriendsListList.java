package com.example.a3raya1.objects;

public class FriendsListList {

    private Integer pfpIcon;
    private String friendName;
    private String friendConex;

    public FriendsListList(Integer pfpIcon, String friendName, String friendConex) {
        this.pfpIcon = pfpIcon;
        this.friendName = friendName;
        this.friendConex = friendConex;
    }

    public Integer getPfpIcon() {
        return pfpIcon;
    }

    public void setPfpIcon(Integer pfpIcon) {
        this.pfpIcon = pfpIcon;
    }

    public String getFriendName() {
        return friendName;
    }

    public void setFriendName(String friendName) {
        this.friendName = friendName;
    }

    public String getFriendConex() {
        return friendConex;
    }

    public void setFriendConex(String friendConex) {
        this.friendConex = friendConex;
    }
}
