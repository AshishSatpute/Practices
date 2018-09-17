package com.solutions.planet.world.andriod.practices;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getCanonicalName();
    String[] mobileArray = {"Android","IPhone","WindowsMobile","Blackberry",
            "WebOS","Ubuntu","Windows7","Max OS X"};

    String[] mobileArray2 = {"Android1","IPhone1","WindowsMobile1","Blackberry1",
            "WebOS1","Ubuntu1","Windows71","Max OS X1"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate: ");
        ListView listView = findViewById(R.id.listView);
        CustomAdapter customAdapter= new CustomAdapter();
        listView.setAdapter(customAdapter);


    }

    class CustomAdapter extends BaseAdapter{
        
        public  final String TAG = CustomAdapter.class.getCanonicalName();

        @Override
        public int getCount() {
            Log.i(TAG, "getCount: ");
            return mobileArray.length;
        }

        @Override
        public Object getItem(int position) {
            Log.i(TAG, "getItem: ");
            return null;
        }

        @Override
        public long getItemId(int position) {
            Log.i(TAG, "getItemId: ");
            return 0;
        }


        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            Log.i(TAG, "getView: ");
            convertView = getLayoutInflater().inflate(R.layout.list_layout,null);
            TextView textView1 = convertView.findViewById(R.id.hi);
            TextView textView2 = convertView.findViewById(R.id.hi1);

            textView1.setText(mobileArray[position]);
            textView2.setText(mobileArray2[position]);
            return convertView;
        }
    }
}
