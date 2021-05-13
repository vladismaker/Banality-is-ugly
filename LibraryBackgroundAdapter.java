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

public class LibraryBackgroundAdapter extends RecyclerView.Adapter<LibraryBackgroundAdapter.ViewHolder> {
    private String[] captions;
    private int[] imageIds;
    private LibraryBackgroundAdapter.Listener listener;

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

    public LibraryBackgroundAdapter(String[] captions, int[] imageIds) {
        this.captions = captions;
        this.imageIds = imageIds;
    }

    public int getItemCount(){
        return captions.length;
    }
    public void setListener(LibraryBackgroundAdapter.Listener listener){
        this.listener = listener;
    }

    @NonNull
    @Override
    public LibraryBackgroundAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CardView cv = (CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.card_library_background, parent, false);
        return new LibraryBackgroundAdapter.ViewHolder(cv);
    }

    public void onBindViewHolder(ViewHolder holder, final int position){
        CardView cardView = holder.cardView;
        ImageView imageView = (ImageView) cardView.findViewById(R.id.info_image);
        Drawable drawable = ContextCompat.getDrawable(cardView.getContext(), imageIds[position]);
        imageView.setImageDrawable(drawable);
        imageView.setContentDescription(captions[position]);
        TextView textView = (TextView) cardView.findViewById(R.id.info_text);
        textView.setText(captions[position]);

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
