package edu.cnm.deepdive.dicewareclient;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

public interface DicewareService {

  @GET("diceware")
  Call<String[]> get(@Header ("Authorization") String authorization, @Query("length") int length);

}
