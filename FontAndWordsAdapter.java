package com.example.eyesontheprize;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

public class FontAndWordsAdapter extends RecyclerView.Adapter<FontAndWordsAdapter.ViewHolder> {
    private int[] imageIds;
    private FontAndWordsAdapter.Listener listener;

    interface Listener{
        void onClick(int position);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private CardView cardView;

        public ViewHolder(CardView v){
            super(v);
            cardView = v;
        }
    }

    public FontAndWordsAdapter(int[] imageIds) {
        this.imageIds = imageIds;
    }

    public int getItemCount(){
        return imageIds.length;
    }
    public void setListener(FontAndWordsAdapter.Listener listener){
        this.listener = listener;
    }

    @NonNull
    @Override
    public FontAndWordsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CardView cv = (CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.card_font, parent, false);
        return new FontAndWordsAdapter.ViewHolder(cv);
    }

    public void onBindViewHolder(FontAndWordsAdapter.ViewHolder holder, final int position){
        CardView cardView = holder.cardView;
        ImageView imageView = (ImageView) cardView.findViewById(R.id.info_image);
        Drawable drawable = ContextCompat.getDrawable(cardView.getContext(), imageIds[position]);
        imageView.setImageDrawable(drawable);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(listener != null){
                    listener.onClick(position);
                }
            }
        });
    }
}
