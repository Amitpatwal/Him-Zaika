package com.online.himzaika.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ImageView;


import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.online.himzaika.Model.Gallery_Model;

import com.online.himzaika.R;

import java.util.List;

public class Gallery_Adapter extends RecyclerView.Adapter<Gallery_Adapter.MyViewHolder> {


    private Context mContext ;
    private List<Gallery_Model> mData ;

    public Gallery_Adapter(Context mContext, List<Gallery_Model> mData) {
        this.mContext = mContext;
        this.mData = mData;

    }

    @NonNull
    @Override
    public MyViewHolder  onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view  ;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.tab_view,parent,false);

        return new MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {



        holder.menu_image.setImageResource(mData.get(position).getImage());



    }
    @Override
    public int getItemCount() {
        return mData.size();
    }

      static class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView menu_image;
        CardView cardView ;

        MyViewHolder(View itemView) {
            super(itemView);
            menu_image = itemView.findViewById(R.id.gallery_img);
            cardView = itemView.findViewById(R.id.menu_card);


        }


    }


}



