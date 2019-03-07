package com.example.week4day4homework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.week4day4homework.model.repository.RepoResponse;
import com.example.week4day4homework.model.repository.UserResponse;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SecondActivity extends AppCompatActivity {
ArrayList<RepoData> repoDataArrayList;
RecyclerView recyclerView;
RepoResponse repoResponse;
MyRecyclerViewAdapter myRecyclerViewAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        recyclerView = findViewById(R.id.rvRecyclerViewRepo);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        MyRecyclerViewAdapter myRecyclerViewAdapter = new MyRecyclerViewAdapter(repoDataArrayList);
        recyclerView.setAdapter(myRecyclerViewAdapter);
        RetrofitHelper retrofitHelper = new RetrofitHelper();
        retrofitHelper.getRepos().enqueue(new Callback <RepoResponse[]>() {


            public void onResponse(Call<RepoResponse[]> call, RepoResponse[] response) {
                int i;
                for(i=0; i<=response.length; i++){

                    String owner = response[i].getOwner().getLogin();
                        String name = response[i].getName();
                        String url = response[i].getUrl();
                    int size = response[i].getSize();
                    String pushed = response[i].getPushedAt();

                    repoDataArrayList.add(new RepoData(name, owner, url, size, pushed));
            }


            public void onFailure(Call<RepoResponse[]> call, Throwable t) {

            }
        }
    })
}
}
