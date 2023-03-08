package com.example.a3raya1.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.a3raya1.adapters.FriendListAdapter;
import com.example.a3raya1.objects.FriendsListList;
import com.example.a3raya1.R;

import java.util.ArrayList;

public class Ranking extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ArrayList<FriendsListList> rankingList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ranking);
        ListView listView = findViewById(R.id.list_friends);
        rankingList = setIconAndName();

        FriendListAdapter friendListAdapter = new
                FriendListAdapter(Ranking.this, rankingList);

        listView.setAdapter(friendListAdapter);
        listView.setOnItemClickListener(this);
    }

    private ArrayList<FriendsListList> setIconAndName(){
        rankingList = new ArrayList<>();
        rankingList.add(new FriendsListList(R.drawable.gold_medal,"Hiribiri","1000LP"));
        rankingList.add(new FriendsListList(R.drawable.silver_medal,"Souljieee","999LP"));
        rankingList.add(new FriendsListList(R.drawable.bronze_medal,"Pulpa","900LP"));

        return rankingList;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        FriendsListList list = rankingList.get(position);
    }
}