package com.kdao.cmpe235_project;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

import com.kdao.cmpe235_project.util.Config;
import com.kdao.cmpe235_project.util.PreferenceData;
import com.kdao.cmpe235_project.data.Role;

public class MainActivity extends AppCompatActivity {

    private static String TAG = "MainActivity";
    private Role role = new Role();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int userRole = PreferenceData.getLoggedInRole(getApplicationContext());
        if (userRole == Config.ADMIN_ROLE) {
            setContentView(R.layout.activity_main_admin);
        } else {
            setContentView(R.layout.activity_main);
        }
    }

    public void navigateToAllTree(View v) {
        Intent launchActivity = new Intent(getApplicationContext(), TreesListActivity.class);
        Log.i(TAG, "Navigate to view all trees available");
        startActivity(launchActivity);
    }

    public void navigateToBarCode(View v) {
        Intent launchActivity = new Intent(getApplicationContext(), BarcodeActivity.class);
        launchActivity.putExtra(Config.VIEW_TREE_WITH_BARCODE, "1");
        Log.i(TAG, "Navigate to Barcode");
        startActivity(launchActivity);
    }

    public void navigateToPhoto(View v) {
        Intent launchActivity = new Intent(getApplicationContext(), CameraActivity.class);
        Log.i(TAG, "Navigate to Camera activity");
        startActivity(launchActivity);
    }

    public void navigateToAudio(View v) {
        Intent launchActivity = new Intent(getApplicationContext(), AudioActivity.class);
        Log.i(TAG, "Navigate to audio activity");
        startActivity(launchActivity);
    }

    public void navigateToCreateTree(View v) {
        Intent launchActivity = new Intent(getApplicationContext(), CreateTreeActivity.class);
        Log.i(TAG, "Navigate to Create tree");
        startActivity(launchActivity);
    }

    public void navigateToCreateSensor(View v) {
        Intent launchActivity = new Intent(getApplicationContext(), CreateSensorActivity.class);
        Log.i(TAG, "Navigate to Create tree");
        startActivity(launchActivity);
    }

    public void navigateToDeployTree(View v) {
        Intent launchActivity = new Intent(getApplicationContext(), DeployTreeListActivity.class);
        Log.i(TAG, "Navigate to deploy tree");
        startActivity(launchActivity);
    }

    public void navigateToStatus(View v) {
        Intent launchActivity = new Intent(getApplicationContext(), SensorsListActivity.class);
        Log.i(TAG, "Navigate to view status");
        startActivity(launchActivity);
    }
}
