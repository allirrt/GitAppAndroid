package com.zind.pizzalesson;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class GitRecipeAdapter extends RecyclerView.Adapter<GitRecipeAdapter.GitRecipeViewHolder> {
     ArrayList<GitRecipeItem> gitRecipeItems;
     Context context;

    public GitRecipeAdapter(ArrayList<GitRecipeItem> gitRecipeItems, Context context) {
        this.gitRecipeItems = gitRecipeItems;
        this.context = context;
    }

    @NonNull
    @Override
    public GitRecipeViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.git_recipe_item,
               viewGroup, false );
        GitRecipeViewHolder gitRecipeViewHolder = new GitRecipeViewHolder(view);
        return gitRecipeViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull GitRecipeViewHolder viewHolder, int position) {
          GitRecipeItem pizzaRecipeItem = gitRecipeItems.get(position);

          viewHolder.gitImageView.setImageResource(pizzaRecipeItem.getImageResource());
          viewHolder.title.setText(pizzaRecipeItem.getTitle());
          viewHolder.description.setText(pizzaRecipeItem.getDescription());
    }
    @Override
    public int getItemCount() {
        return gitRecipeItems.size();
    }

    class GitRecipeViewHolder extends RecyclerView.ViewHolder implements
            View.OnClickListener {
        public ImageView gitImageView;
        public TextView title;
        public TextView description;

             public GitRecipeViewHolder(@NonNull View itemView) {
             super(itemView);
             itemView.setOnClickListener(this);
             gitImageView = itemView.findViewById(R.id.gitImageView);
             title = itemView.findViewById(R.id.titleTextView);
             description = itemView.findViewById(R.id.descriptionTextView);
                   }


        @Override
        public void onClick(View view) {
            int position  = getAdapterPosition();
            GitRecipeItem gitRecipeItem = gitRecipeItems.get(position);

            Intent intent = new Intent(context, RecipeActivity.class);
           intent.putExtra("imageResource", gitRecipeItem.getImageResource());
           intent.putExtra("title", gitRecipeItem.getTitle());
           intent.putExtra("description", gitRecipeItem.getDescription());
           intent.putExtra("recipe", gitRecipeItem.getRecipe());
           context.startActivity(intent);
        }
    }
}
