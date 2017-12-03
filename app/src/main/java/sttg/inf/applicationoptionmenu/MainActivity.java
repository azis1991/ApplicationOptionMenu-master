package sttg.inf.applicationoptionmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_utama, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.action_settings){
            Toast.makeText(getApplicationContext(), "Anda menekan tombol Setting pada Option Menu", Toast.LENGTH_SHORT).show();
        }
        else if(item.getItemId()==R.id.action_logout){
            Toast.makeText(getApplicationContext(), "Anda menekan tombol Logout pada Option Menu", Toast.LENGTH_SHORT).show();
        }
        else if(item.getItemId()==R.id.action_search){
            Toast.makeText(getApplicationContext(), "Anda menekan tombol Search pada Option Menu", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
