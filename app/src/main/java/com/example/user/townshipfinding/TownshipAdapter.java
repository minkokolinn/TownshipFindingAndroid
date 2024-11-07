package com.example.user.townshipfinding;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.user.townshipfinding.models.Township;

import java.util.ArrayList;
import java.util.List;

public class TownshipAdapter extends RecyclerView.Adapter<TownshipAdapter.TownshipHolder>{
    Context ctxt;
    List<Township> townships;
    public TownshipAdapter(Context ctxt,List<Township> townships){
        this.ctxt=ctxt;
        this.townships=townships;
    }
    @NonNull
    @Override
    public TownshipHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v=LayoutInflater.from(ctxt).inflate(R.layout.sample_view,parent,false);
        return new TownshipHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull TownshipHolder holder, int position) {
        Township t=townships.get(position);
        holder.tvCityName.setText(t.getLocENGName());
    }

    @Override
    public int getItemCount() {
        return townships.size();
    }

    public class TownshipHolder extends RecyclerView.ViewHolder {
        TextView tvCityName;
        public TownshipHolder(View itemView) {
            super(itemView);
            tvCityName=itemView.findViewById(R.id.tv_city_sv);
        }
    }
}
