package io.yagus.retrofit;

import com.google.gson.JsonArray;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GitHubService {

    @GET("users/{user}/repos")
    Call<List<Repo>> listRepos(@Path("user") String user);

    // Rxjava 적용 버전
    @GET("users/{user}/repos")
    Observable<List<Repo>> oblistRepos(@Path("user") String user);
}
