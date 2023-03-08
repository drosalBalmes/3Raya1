package com.example.a3raya1.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.a3raya1.adapters.FriendListAdapter;
import com.example.a3raya1.objects.FriendsListList;
import com.example.a3raya1.R;
import com.example.a3raya1.objects.User;

import java.util.ArrayList;

public class FriendList extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ArrayList<FriendsListList> friendsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friend_list);

        ListView listView = findViewById(R.id.list_friends);
        friendsList = setIconAndName();

        FriendListAdapter friendListAdapter = new
                FriendListAdapter(FriendList.this,friendsList);

        listView.setAdapter(friendListAdapter);
        listView.setOnItemClickListener(this);
    }

    private ArrayList<FriendsListList> setIconAndName(){
        friendsList = new ArrayList<>();
        friendsList.add(new FriendsListList(R.drawable.bobobokebab,"Hiribiri","Ultima Conexion: 33 Años"));
        friendsList.add(new FriendsListList(R.drawable.profile,"Souljieee","Ultima Conexion: 5 Segundos"));
        friendsList.add(new FriendsListList(R.drawable.moneda,"Pulpa","Ultima Conexion: En linea"));

        return friendsList;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        FriendsListList list = friendsList.get(position);
        Intent intent = new Intent(FriendList.this,Profile.class);
        String name = list.getFriendName();
        User user = new User(name,200,100,100,50,30);
        Toast.makeText(FriendList.this, "Amic: " + list.getFriendName(), Toast.LENGTH_SHORT).show();

        intent.putExtra("user",user);
        startActivity(intent);
    }
}