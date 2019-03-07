package com.example.week4day4homework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.week4day4homework.model.repository.RepoResponse;
import com.example.week4day4homework.model.repository.UserResponse;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;




public class MainActivity extends AppCompatActivity {
UserData userdata;
TextView userName;
ImageView avatar;
TextView tvnumRepos;
TextView joinedDate;
Button btnStartNewActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userName = findViewById(R.id.TVUserName);
        avatar = findViewById(R.id.imgAvatar);
        tvnumRepos = findViewById(R.id.tvNumRepos);
        joinedDate = findViewById(R.id.tvJoinedDate);
        btnStartNewActivity = findViewById(R.id.btnStartSecondActivity);
RetrofitHelper retrofitHelper = new RetrofitHelper();
retrofitHelper.getUser().enqueue(new Callback<UserResponse>() {
    @Override
    public void onResponse(Call<UserResponse> call, Response<UserResponse> response) {
        String name = response.body().getLogin();
        String avatarURL = response.body().getAvatarUrl();
        int numRepos = response.body().getPublicRepos();
        String date = response.body().getCreatedAt();

        userdata = new UserData(name, avatarURL, numRepos, date);

        userName.setText(userdata.getUsername());
        joinedDate.setText(userdata.getJoinedDate());
        tvnumRepos.setText(String.valueOf(userdata.getNumRepos()));
        Glide.with(getApplicationContext()).load(userdata.getAvatarURL()).into(avatar);


    }

    @Override
    public void onFailure(Call<UserResponse> call, Throwable t) {

    }
});

    }


    public void onClick(View view) {

        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);

    }
}
