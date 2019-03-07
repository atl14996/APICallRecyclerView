package com.example.week4day4homework;

import com.example.week4day4homework.model.repository.RepoResponse;
import com.example.week4day4homework.model.repository.UserResponse;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.http.GET;
import retrofit2.http.Query;

import static com.example.week4day4homework.URLConstants.BASE_URL;
import static com.example.week4day4homework.URLConstants.PATH_REPO;
import static com.example.week4day4homework.URLConstants.PATH_USER;
import static com.example.week4day4homework.URLConstants.QUERY_REPO;
import static com.example.week4day4homework.URLConstants.QUERY_USER;

public class RetrofitHelper {

    private Retrofit getRetrofitClient() {

        return new Retrofit.Builder().baseUrl(BASE_URL).build();


    }

    public getRepos getRepoResponse() {

        return getRetrofitClient().create(getRepos.class);

    }

    public Call<RepoResponse[]> getRepos() {

        return (Call<RepoResponse[]>) getRepoResponse().getRepos("1");

    }

    public getUser getUserresponse(){

        return getRetrofitClient().create(getUser.class);
    }

    public Call<UserResponse> getUser() {

        return (Call<UserResponse>) getUserresponse().getUser("");
    }

    public interface getRepos {

        @GET(PATH_REPO)
        Call<RepoResponse[]> getRepos(@Query(QUERY_REPO) String page);
    }

    public interface getUser {

        @GET(PATH_USER)
        Call<UserResponse> getUser(@Query(QUERY_USER) String arg);

    }



}
