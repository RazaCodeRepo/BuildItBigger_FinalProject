package com.udacity.gradle.builditbigger;

import android.os.AsyncTask;
import com.udacity.gradle.builditbigger.backend.myApi.MyApi;

/**
 * Created by kontrol on 12/3/2017.
 */

public class GCEAsyncTask extends AsyncTask<Void, Void, String> {

    private static MyApi myApiService = null;

    @Override
    protected String doInBackground(Void... voids) {
        return null;
    }
}
