package com.docatdoor.docatdoor;


        import android.app.Activity;
        import android.content.Context;
        import android.location.Location;
        import android.location.LocationListener;
        import android.location.LocationManager;
        import android.os.Bundle;
        import android.view.View;
        import android.view.View.OnClickListener;
        import android.widget.Button;
        import android.widget.EditText;

public class CurrentLocn extends Activity
{
    private EditText editTextShowLocation;
    private Button buttonGetLocation;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_previous_records);
    }
}



