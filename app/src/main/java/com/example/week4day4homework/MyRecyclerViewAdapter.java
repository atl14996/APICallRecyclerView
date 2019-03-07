package com.example.week4day4homework;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.ViewHolder> {

ArrayList<RepoData> repoData;


public MyRecyclerViewAdapter(ArrayList<RepoData> repoDataArrayList) {

    this.repoData = repoDataArrayList;

}
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.repo_item, viewGroup,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyRecyclerViewAdapter.ViewHolder viewHolder, int i) {
RepoData currentRepo = repoData.get(i);
viewHolder.tvRepoName.setText(currentRepo.getName());
viewHolder.tvRepoOwnerName.setText(currentRepo.getOwner());
viewHolder.tvRepoURL.setText(currentRepo.getUrl());
viewHolder.tvRepoSize.setText(currentRepo.getSize() + "kb");
viewHolder.tvDateRepoPushed.setText(currentRepo.getPushed());
    }

    @Override
    public int getItemCount() {
        return repoData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
TextView tvRepoName;
TextView tvRepoOwnerName;
TextView tvRepoURL;
TextView tvRepoSize;
TextView tvDateRepoPushed;



        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvRepoName = itemView.findViewById(R.id.tvProjectName);
            tvRepoOwnerName = itemView.findViewById(R.id.tvOwnerName);
            tvRepoURL = itemView.findViewById(R.id.tvURL);
            tvRepoSize = itemView.findViewById(R.id.tvSize);
            tvDateRepoPushed = itemView.findViewById(R.id.tvDatePushed);
        }
    }
}
