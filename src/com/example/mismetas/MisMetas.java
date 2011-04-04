package com.example.mismetas;

import android.app.Activity;
import android.os.Bundle;
import android.widget.AutoCompleteTextView;
import android.widget.ArrayAdapter;

public class MisMetas extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        AutoCompleteTextView textView = (AutoCompleteTextView) findViewById(R.id.txtBusquedaAuto);
        String[] arrMetas = getResources().getStringArray(R.array.metas_array);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_item, arrMetas);
        textView.setAdapter(adapter);
    }
}