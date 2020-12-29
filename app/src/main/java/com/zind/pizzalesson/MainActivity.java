package com.zind.pizzalesson;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

   private RecyclerView recyclerView;
  private   RecyclerView.Adapter adapter;
  private GridLayoutManager layoutManager;
  private int columnCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        columnCount = getResources().getInteger(R.integer.column_count);
        ArrayList<GitRecipeItem> pizzaRecipeItems = new ArrayList<>();

        pizzaRecipeItems.add(new GitRecipeItem(Utils.GIT_1_VIEW,
                Utils.GIT_1_TITLE, Utils.GIT_1_DESCRIPTION, Utils.GIT_1_RECIPE));
        pizzaRecipeItems.add(new GitRecipeItem(Utils.GIT_2_VIEW,
                Utils.GIT_2_TITLE, Utils.GIT_2_DESCRIPTION, Utils.GIT_2_RECIPE));
        pizzaRecipeItems.add(new GitRecipeItem(Utils.GIT_3_VIEW,
                Utils.GIT_3_TITLE, Utils.GIT_3_DESCRIPTION, Utils.GIT_3_RECIPE));
        pizzaRecipeItems.add(new GitRecipeItem(Utils.GIT_4_VIEW,
                Utils.GIT_4_TITLE, Utils.GIT_4_DESCRIPTION, Utils.GIT_4_RECIPE));
        pizzaRecipeItems.add(new GitRecipeItem(Utils.GIT_5_VIEW,
                Utils.GIT_5_TITLE, Utils.GIT_5_DESCRIPTION, Utils.GIT_5_RECIPE));
        pizzaRecipeItems.add(new GitRecipeItem(Utils.GIT_6_VIEW,
                Utils.GIT_6_TITLE, Utils.GIT_6_DESCRIPTION, Utils.GIT_6_RECIPE));
        pizzaRecipeItems.add(new GitRecipeItem(Utils.GIT_7_VIEW,
                Utils.GIT_7_TITLE, Utils.GIT_7_DESCRIPTION, Utils.GIT_7_RECIPE));
        pizzaRecipeItems.add(new GitRecipeItem(Utils.GIT_8_VIEW,
               Utils.GIT_8_TITLE, Utils.GIT_8_DESCRIPTION, Utils.GIT_8_RECIPE));
       pizzaRecipeItems.add(new GitRecipeItem(Utils.GIT_9_VIEW,
                Utils.GIT_9_TITLE, Utils.GIT_9_DESCRIPTION, Utils.GIT_9_RECIPE));
       pizzaRecipeItems.add(new GitRecipeItem(Utils.GIT_10_VIEW,
                Utils.GIT_10_TITLE, Utils.GIT_10_DESCRIPTION, Utils.GIT_10_RECIPE));
         pizzaRecipeItems.add(new GitRecipeItem(Utils.GIT_11_VIEW,
                Utils.GIT_11_TITLE, Utils.GIT_11_DESCRIPTION, Utils.GIT_11_RECIPE));
         pizzaRecipeItems.add(new GitRecipeItem(Utils.GIT_12_VIEW,
                Utils.GIT_12_TITLE, Utils.GIT_12_DESCRIPTION, Utils.GIT_12_RECIPE));
         pizzaRecipeItems.add(new GitRecipeItem(Utils.GIT_13_VIEW,
                Utils.GIT_13_TITLE, Utils.GIT_13_DESCRIPTION, Utils.GIT_13_RECIPE));
        pizzaRecipeItems.add(new GitRecipeItem(Utils.GIT_14_VIEW,
                Utils.GIT_14_TITLE, Utils.GIT_14_DESCRIPTION, Utils.GIT_14_RECIPE));
        pizzaRecipeItems.add(new GitRecipeItem(Utils.GIT_15_VIEW,
                Utils.GIT_15_TITLE, Utils.GIT_15_DESCRIPTION, Utils.GIT_15_RECIPE));
       pizzaRecipeItems.add(new GitRecipeItem(Utils.GIT_16_VIEW,
                Utils.GIT_16_TITLE, Utils.GIT_16_DESCRIPTION, Utils.GIT_16_RECIPE));
         pizzaRecipeItems.add(new GitRecipeItem(Utils.GIT_17_VIEW,
                Utils.GIT_17_TITLE, Utils.GIT_17_DESCRIPTION, Utils.GIT_17_RECIPE));
        pizzaRecipeItems.add(new GitRecipeItem(Utils.GIT_18_VIEW,
                Utils.GIT_18_TITLE, Utils.GIT_18_DESCRIPTION, Utils.GIT_18_RECIPE));
       pizzaRecipeItems.add(new GitRecipeItem(Utils.GIT_19_VIEW,
                Utils.GIT_19_TITLE, Utils.GIT_19_DESCRIPTION, Utils.GIT_19_RECIPE));
         pizzaRecipeItems.add(new GitRecipeItem(Utils.GIT_20_VIEW,
                Utils.GIT_20_TITLE, Utils.GIT_20_DESCRIPTION, Utils.GIT_20_RECIPE));
        pizzaRecipeItems.add(new GitRecipeItem(Utils.GIT_21_VIEW,
                Utils.GIT_21_TITLE, Utils.GIT_21_DESCRIPTION, Utils.GIT_21_RECIPE));
        pizzaRecipeItems.add(new GitRecipeItem(Utils.GIT_22_VIEW,
                Utils.GIT_22_TITLE, Utils.GIT_22_DESCRIPTION, Utils.GIT_22_RECIPE));
        pizzaRecipeItems.add(new GitRecipeItem(Utils.GIT_23_VIEW,
                Utils.GIT_23_TITLE, Utils.GIT_23_DESCRIPTION, Utils.GIT_23_RECIPE));
        pizzaRecipeItems.add(new GitRecipeItem(Utils.GIT_24_VIEW,
                Utils.GIT_24_TITLE, Utils.GIT_24_DESCRIPTION, Utils.GIT_24_RECIPE));
        pizzaRecipeItems.add(new GitRecipeItem(Utils.GIT_25_VIEW,
                Utils.GIT_25_TITLE, Utils.GIT_25_DESCRIPTION, Utils.GIT_25_RECIPE));
       pizzaRecipeItems.add(new GitRecipeItem(Utils.GIT_26_VIEW,
                Utils.GIT_26_TITLE, Utils.GIT_26_DESCRIPTION, Utils.GIT_26_RECIPE));
       pizzaRecipeItems.add(new GitRecipeItem(Utils.GIT_27_VIEW,
                Utils.GIT_27_TITLE, Utils.GIT_27_DESCRIPTION, Utils.GIT_27_RECIPE));
       pizzaRecipeItems.add(new GitRecipeItem(Utils.GIT_28_VIEW,
                Utils.GIT_28_TITLE, Utils.GIT_28_DESCRIPTION, Utils.GIT_28_RECIPE));


        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        adapter = new GitRecipeAdapter(pizzaRecipeItems, this);
        layoutManager = new GridLayoutManager(this, columnCount);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
    }
}