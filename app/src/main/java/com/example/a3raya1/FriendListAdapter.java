package com.example.a3raya1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.transition.Hold;

import java.util.ArrayList;

public class FriendListAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<FriendsListList> friendsList;

    public FriendListAdapter(Context context, ArrayList<FriendsListList> friendsList) {
        this.context = context;
        this.friendsList = friendsList;
    }

    @Override
    public int getCount() {
        return friendsList.size();
    }

    @Override
    public Object getItem(int position) {
        return friendsList.get(position);
    }

    @Override
    public long getItemId(int id) {
        return id;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        HolderView holderView;

        if (convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.cardview_friendlist,parent,false);
            holderView = new HolderView(convertView);
            convertView.setTag(holderView);
        } else {
            holderView = (HolderView) convertView.getTag();
        }

        FriendsListList list = friendsList.get(position);
        holderView.iconList.setImageResource(list.getPfpIcon());
        holderView.friendName.setText(list.getFriendName());
        holderView.friendConex.setText(list.getFriendConex());

        return convertView;
    }

    private static class HolderView{
        private final ImageView iconList;
        private final TextView friendName;
        private final TextView friendConex;

        public HolderView(View view){
            iconList = view.findViewById(R.id.pfpFriends);
            friendName = view.findViewById(R.id.nameFriend);
            friendConex = view.findViewById(R.id.conexionFriend);
        }
    }


}
