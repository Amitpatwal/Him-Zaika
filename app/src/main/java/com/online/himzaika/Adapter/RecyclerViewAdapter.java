package com.online.himzaika.Adapter;

import android.content.Context;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;

import androidx.cardview.widget.CardView;


import androidx.recyclerview.widget.RecyclerView;

import com.online.himzaika.Model.Menu_model;

import com.online.himzaika.R;
import com.online.himzaika.open;

import java.util.List;

public class RecyclerViewAdapter extends  RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>  {

    private Context mContext ;
    private List<Menu_model> mData ;

    public RecyclerViewAdapter(Context mContext, List<Menu_model> mData) {
        this.mContext = mContext;
        this.mData = mData;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view  ;
        LayoutInflater mInflater = LayoutInflater.from(parent.getContext());
        view = mInflater.inflate(R.layout.menu_view,parent,false);

        return new MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {

        holder.menu_title.setText(mData.get(position).getTitle());
        holder.menu_image.setImageResource(mData.get(position).getImage());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (position == 0) {
                    Intent i = new Intent(mContext, open.class);
                    String[] urls = new String[1];
                    urls[0] = "https://himzaika.in/product-category/veg/";
                    i.putExtra("links", urls[0]);
                    i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    mContext.startActivity(i);


                }
                if (position == 1) {

                    Intent i = new Intent(mContext, open.class);
                    String[] urls = new String[1];
                    urls[0] = "https://himzaika.in/product-category/starters/non-veg/";
                    i.putExtra("links", urls[0]);
                    i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    mContext.startActivity(i);

                }
                if (position == 2) {

                    Intent i = new Intent(mContext, open.class);
                    String[] urls = new String[1];
                    urls[0] = "https://himzaika.in/product-category/veg-chinese/";
                    i.putExtra("links", urls[0]);
                    i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    mContext.startActivity(i);

                }
                if (position == 3) {


                    Intent i = new Intent(mContext, open.class);
                    String[] urls = new String[1];
                    urls[0] = "https://himzaika.in/product-category/starters/non-veg-chinese/";
                    i.putExtra("links", urls[0]);
                    i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    mContext.startActivity(i);

                }
                if (position == 4) {

                    Intent i = new Intent(mContext, open.class);
                    String[] urls = new String[1];
                    urls[0] = "https://himzaika.in/product-category/veg-curry//";
                    i.putExtra("links", urls[0]);
                    i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    mContext.startActivity(i);

                }
                if (position == 5) {


                    Intent i = new Intent(mContext, open.class);
                    String[] urls = new String[1];
                    urls[0] = "https://himzaika.in/product-category/veg-curry/main-course-veg-curry/non-veg-curry/";
                    i.putExtra("links", urls[0]);
                    i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    mContext.startActivity(i);

                }
                if (position == 6) {


                    Intent i = new Intent(mContext, open.class);
                    String[] urls = new String[1];
                    urls[0] = "https://himzaika.in/product-category/handi-special-biryani/";
                    i.putExtra("links", urls[0]);
                    i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    mContext.startActivity(i);
                }
                if (position == 7) {


                    Intent i = new Intent(mContext, open.class);
                    String[] urls = new String[1];
                    urls[0] = "https://himzaika.in/product-category/breads/";
                    i.putExtra("links", urls[0]);
                    i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    mContext.startActivity(i);

                }
                if (position == 8) {

                    Intent i = new Intent(mContext, open.class);
                    String[] urls = new String[1];
                    urls[0] = "https://himzaika.in/product-category/rice-biryani";
                    i.putExtra("links", urls[0]);
                    i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    mContext.startActivity(i);

                }
                if (position == 9) {


                    Intent i = new Intent(mContext, open.class);
                    String[] urls = new String[1];
                    urls[0] = "https://himzaika.in/product-category/rice-value-combo/";
                    i.putExtra("links", urls[0]);
                    i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    mContext.startActivity(i);

                }
                if (position == 10) {


                    Intent i = new Intent(mContext, open.class);
                    String[] urls = new String[1];
                    urls[0] = "https://himzaika.in/product-category/rice-noodles//";
                    i.putExtra("links", urls[0]);
                    i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    mContext.startActivity(i);

                }
                if (position == 11) {


                    Intent i = new Intent(mContext, open.class);
                    String[] urls = new String[1];
                    urls[0] = "https://himzaika.in/product-category/salad-papad/";
                    i.putExtra("links", urls[0]);
                    i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    mContext.startActivity(i);

                }
                if (position == 12) {


                    Intent i = new Intent(mContext, open.class);
                    String[] urls = new String[1];
                    urls[0] = "https://himzaika.in/product-category/fast-food/";
                    i.putExtra("links", urls[0]);
                    i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    mContext.startActivity(i);

                }
                if (position == 13) {

                    Intent i = new Intent(mContext, open.class);
                    String[] urls = new String[1];
                    urls[0] = "https://himzaika.in/product-category/desserts/";
                    i.putExtra("links", urls[0]);
                    i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    mContext.startActivity(i);

                }
                if (position == 14) {


                    Intent i = new Intent(mContext, open.class);
                    String[] urls = new String[1];
                    urls[0] = "https://himzaika.in/product-category/momos/";
                    i.putExtra("links", urls[0]);
                    i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    mContext.startActivity(i);
                }
                if (position == 15) {


                    Intent i = new Intent(mContext, open.class);
                    String[] urls = new String[1];
                    urls[0] = "https://himzaika.in/product-category/soups/";
                    i.putExtra("links", urls[0]);
                    i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    mContext.startActivity(i);
                }
                if (position == 16) {


                    Intent i = new Intent(mContext, open.class);
                    String[] urls = new String[1];
                    urls[0] = "https://himzaika.in/product-category/wraps-rolls/";
                    i.putExtra("links", urls[0]);
                    i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    mContext.startActivity(i);
                }

            } });



    }
    @Override
    public int getItemCount() {
        return mData.size();
    }

     static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView menu_title;
        ImageView menu_image;
        CardView cardView ;

         MyViewHolder(View itemView) {
            super(itemView);

            menu_title = itemView.findViewById(R.id.title);
            menu_image = itemView.findViewById(R.id.menu_img);
            cardView = itemView.findViewById(R.id.menu_card);


        }


    }



}



