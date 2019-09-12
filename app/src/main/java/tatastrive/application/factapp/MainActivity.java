package tatastrive.application.factapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et;
    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        et=findViewById( R.id.editText);
        bt=findViewById( R.id.button );
        bt.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1= String.valueOf( et.getText() );
                int n= Integer.parseInt( s1 );
                int fact=1;
                for(int i=1;i<=n;i++){
                    fact=fact*i;
                }
                Toast.makeText( MainActivity.this, "factorial="+fact, Toast.LENGTH_SHORT ).show();
            }
        } );



    }
}
