package com.example.crimereporting;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.loader.app.LoaderManager;
import androidx.loader.content.Loader;

import java.util.List;

public class complainActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<List<ViewComplaints>> {

    private View1 adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewcomplaints);
        Intent comp = new Intent();

        startActivity(comp);
    }
        @NonNull
    @Override
    public Loader<List<ViewComplaints>> onCreateLoader(int id, @Nullable Bundle args) {
        return null;
    }

    @Override
    public void onLoadFinished(@NonNull Loader<List<ViewComplaints>> loader, List<ViewComplaints> data) {

    }

    @Override
    public void onLoaderReset(@NonNull Loader<List<ViewComplaints>> loader) {

    }
}
