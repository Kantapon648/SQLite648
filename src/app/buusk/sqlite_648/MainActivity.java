package app.buusk.sqlite_648;

import android.app.Activity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends Activity {
	SQLiteDatabase db;
	private Button btninsert;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//      control648DB control648db = new control648DB(this);
//      control648db.getWritableDatabase();
        
        btninsert = (Button) findViewById(R.id.btninsert);
        btninsert.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getApplicationContext(),AddActivity.class);
				startActivity(intent);
				
			}
		});
        

    }

}
