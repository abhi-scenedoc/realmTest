package com.example.abhishekpatel.testbench;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import io.realm.Realm;

public class MainActivity extends AppCompatActivity {


    public static final String REALM = "Realm";

    private TextView timerText;
    private Button button;

    /**
     * Below test can be kicked off by opening the application
     * Realm.getDefaultInstance() takes around 1000 ms to return the first time it's called
     * Tested on Samsung s8 SM-G950U - Time taken avg from 5 runs = 1050ms
     * Tested on Samsung Tab E SM-T560NU - Time taken avg from 5 runs = 3405ms
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        timerText = (TextView) findViewById(R.id.timer);
        button = (Button) findViewById(R.id.startTest);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                new AsyncTask<Void, Void, Long>() {

                    @Override
                    protected void onPreExecute() {
                        super.onPreExecute();
                        button.setEnabled(false);
                        timerText.setText("Starting Realm.getDefaultInstance()");
                    }

                    @Override
                    protected Long doInBackground(Void... voids) {
                        Log.d(REALM, "getDefaultInstance() start");
                        long startTime = System.currentTimeMillis();
                        Realm realm = Realm.getDefaultInstance();
                        long result = (System.currentTimeMillis() - startTime);
                        Log.d(REALM, "total time = " + result);
                        realm.close();
                        return result;
                    }

                    @Override
                    protected void onPostExecute(Long result) {
                        super.onPostExecute(result);
                        button.setEnabled(true);
                        timerText.setText("finished Realm.getDefaultInstance() -- time taken = " + result + " ms");
                    }
                }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
            }
        });



    }
}
