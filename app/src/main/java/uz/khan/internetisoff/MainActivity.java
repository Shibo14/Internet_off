package uz.khan.internetisoff;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Bundle;

import uz.khan.internetisoff.service.NetworkBroadcast;

public class MainActivity extends AppCompatActivity {

    BroadcastReceiver broadcastReceiver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    broadcastReceiver = new NetworkBroadcast();
    registerReceiver(broadcastReceiver,new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION));


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

    unregisterReceiver(broadcastReceiver);
    }
}