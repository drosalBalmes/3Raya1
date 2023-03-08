package com.example.a3raya1.adapters;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.a3raya1.objects.ListElement;
import com.example.a3raya1.R;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {
    private List<ListElement> mData;
    private LayoutInflater mInflater;
    private Context context;

    public ListAdapter(List<ListElement> mData, Context context) {
        this.mInflater = LayoutInflater.from(context);
        this.mData = mData;
        this.context = context;
    }

    @Override
    public int getItemCount(){return mData.size();}

    @Override
    public ListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = mInflater.inflate(R.layout.cardview_historial,null);
        return new ListAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ListAdapter.ViewHolder holder, final int position){
        holder.bindData(mData.get(position));
    }

    public void setItems(List<ListElement> items){mData = items;}

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView iconImage;
        TextView name,winLose;

        ViewHolder(View itemView) {
            super(itemView);
            iconImage = itemView.findViewById(R.id.camera);
            name = itemView.findViewById(R.id.namevsname);
            winLose = itemView.findViewById(R.id.winLose);
        }

        void bindData(final ListElement item){
            name.setText(item.getName());
            if (item.getWinLose().equals("Win")){
                winLose.setTextColor(Color.rgb(0,255,0));
            } else{
                winLose.setTextColor(Color.rgb(255,0,0));
            }
            winLose.setText(item.getWinLose());
        }

    }


}
