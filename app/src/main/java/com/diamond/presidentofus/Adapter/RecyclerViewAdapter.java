package com.diamond.presidentofus.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.diamond.presidentofus.Model.President;
import com.diamond.presidentofus.R;
import com.diamond.presidentofus.activities.PresidentDetail;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {
   private Context mContext;
   private List<President> mData;

    public RecyclerViewAdapter(Context mContext, List<President> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view ;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.president,parent,false);
       return new MyViewHolder(view,mContext,mData);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        President pres = mData.get(position);
        holder.name.setText(pres.getName());
        holder.image.setImageResource(pres.getImage());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView name;
        CircleImageView image;
        CardView cardView;
        Context context;
        List<President> list;

        public MyViewHolder(@NonNull View itemView, Context context, List<President> list) {
            super(itemView);
            name = itemView.findViewById(R.id.name) ;
            image = itemView.findViewById(R.id.image);
            cardView = itemView.findViewById(R.id.card);
            this.context = context;
            this.list = list;
            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(context, PresidentDetail.class);
            President model;
            model = list.get(getAdapterPosition());
            intent.putExtra("image", model.getImage());
            intent.putExtra("name", model.getName());
            intent.putExtra("detail", model.getDescription());
            context.startActivity(intent);

        }
    }
}
