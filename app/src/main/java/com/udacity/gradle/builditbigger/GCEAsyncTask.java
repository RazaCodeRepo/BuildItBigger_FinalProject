package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;

import com.example.myandroidlibrary.LibraryActivity;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;
import com.udacity.gradle.builditbigger.backend.myApi.MyApi;

import java.io.IOException;

/**
 * Created by kontrol on 12/3/2017.
 */

public class GCEAsyncTask extends AsyncTask<Void, Void, String> {

    private static MyApi myApiService = null;
    private Context mContext;

    public GCEAsyncTask(Context context){
        mContext = context;
    }

    @Override
    protected String doInBackground(Void... voids) {
        if(myApiService == null){
            MyApi.Builder builder = new MyApi.Builder(AndroidHttp.newCompatibleTransport(), new AndroidJsonFactory(), null)
                    .setRootUrl("http://10.0.2.2:8080/_ah/api");

            myApiService = builder.build();
        }

        try{
            return myApiService.getJoke().execute().getData();
        } catch (IOException e){
            return e.getMessage();
        }


    }

    @Override
    protected void onPostExecute(String s) {
        Intent intent = new Intent(mContext, LibraryActivity.class);
        intent.putExtra("JOKE", s);
        mContext.startActivity(intent);
    }
}
