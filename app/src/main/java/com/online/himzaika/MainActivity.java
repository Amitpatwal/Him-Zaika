package com.online.himzaika;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.online.himzaika.Adapter.Gallery_Adapter;
import com.online.himzaika.Adapter.RecyclerViewAdapter;
import com.online.himzaika.Model.Gallery_Model;
import com.online.himzaika.Model.Menu_model;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity   {
    List<Menu_model> lstBook;
    List<Gallery_Model> Gallery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lstBook = new ArrayList<>();
        Gallery = new ArrayList<>();

        // adding menu item in array list


        lstBook.add(new Menu_model("Veg", R.drawable.veg));
        lstBook.add(new Menu_model("Non Veg", R.drawable.nonveg));
        lstBook.add(new Menu_model("Chineese Veg", R.drawable.chineese_veg));
        lstBook.add(new Menu_model("Chineese Non Veg", R.drawable.chineese_veg));
        lstBook.add(new Menu_model("Veg Curry", R.drawable.veg_curry));
        lstBook.add(new Menu_model("Non-Veg Curry", R.drawable.non_vegcurry));
        lstBook.add(new Menu_model("Handi Biryani", R.drawable.handi_biryani));
        lstBook.add(new Menu_model("Breads", R.drawable.bread_pic));
        lstBook.add(new Menu_model("Rice & Biryani", R.drawable.rice_veg));
        lstBook.add(new Menu_model("Rice Value Combo", R.drawable.rice_veg));
        lstBook.add(new Menu_model("Rice & Noodles", R.drawable.rice_noodles));
        lstBook.add(new Menu_model("Salad & Papad", R.drawable.dahi_salad));
        lstBook.add(new Menu_model("Fast Food", R.drawable.fast_food));
        lstBook.add(new Menu_model("Desserts", R.drawable.desserts));
        lstBook.add(new Menu_model("Momos", R.drawable.momos));
        lstBook.add(new Menu_model("Soups", R.drawable.soup));
        lstBook.add(new Menu_model("Wraps & Rolls", R.drawable.rice_veg));








        // adding gallery in array list

        Gallery.add(new Gallery_Model( R.drawable.a));
        Gallery.add(new Gallery_Model(R.drawable.b));
        Gallery.add(new Gallery_Model( R.drawable.c));
        Gallery.add(new Gallery_Model( R.drawable.d));
        Gallery.add(new Gallery_Model( R.drawable.e));
        Gallery.add(new Gallery_Model(R.drawable.f));
        Gallery.add(new Gallery_Model( R.drawable.g));

        Gallery.add(new Gallery_Model(R.drawable.h));
        Gallery.add(new Gallery_Model(R.drawable.i));
        Gallery.add(new Gallery_Model( R.drawable.j));
        Gallery.add(new Gallery_Model( R.drawable.k));
        Gallery.add(new Gallery_Model( R.drawable.l));
        Gallery.add(new Gallery_Model( R.drawable.m));
        Gallery.add(new Gallery_Model( R.drawable.n));
        Gallery.add(new Gallery_Model(R.drawable.o));
        Gallery.add(new Gallery_Model( R.drawable.p));


        RecyclerView myrv = findViewById(R.id.recyclerView1);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this, lstBook);
        myrv.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        myrv.setAdapter(myAdapter);

        RecyclerView gallery = findViewById(R.id.recyclerView2);
        Gallery_Adapter gall = new Gallery_Adapter(this, Gallery);
        gallery.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        gallery.setAdapter(gall);
    }


    public void contact(View view) {

        Fragment fragment = new veg();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_veg, fragment);
        transaction.addToBackStack(null);
        transaction.commit();

    }

    public void home(View view) {
        Intent i = new Intent(MainActivity.this, MainActivity.class);
        startActivity(i);
    }


    public void menu(View view) {

        Intent i=new Intent(MainActivity.this,open.class);
        startActivity(i);

    }
}




