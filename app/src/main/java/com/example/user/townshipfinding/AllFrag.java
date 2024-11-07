package com.example.user.townshipfinding;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.user.townshipfinding.models.City;
import com.example.user.townshipfinding.models.Township;
import com.example.user.townshipfinding.models.WebApi;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class AllFrag extends Fragment {

    RecyclerView RvAf;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.all_frag,null);
        RvAf=v.findViewById(R.id.rv_af);
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        RvAf.setLayoutManager(new LinearLayoutManager(getContext()));
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl("http://zln.webstarterz.com/tztest/locationapi.php")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        WebApi api=retrofit.create(WebApi.class);
        api.getCity("tztest").enqueue(new Callback<City>() {
            @Override
            public void onResponse(Call<City> call, Response<City> response) {
                if (response.isSuccessful())
                {
                    List<Township> townshipList=response.body().getData().getTownship();
                    TownshipAdapter adapter=new TownshipAdapter(getContext(),townshipList);
                    RvAf.setAdapter(adapter);
                }
                else
                {
                    Toast.makeText(getActivity(), "Response is not successful", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<City> call, Throwable t) {
                Toast.makeText(getActivity(), t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
