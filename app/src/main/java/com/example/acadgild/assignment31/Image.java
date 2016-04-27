package com.example.acadgild.assignment31;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Objects;

public class Image extends AppCompatActivity {

    ImageView Image;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        Image= (ImageView)findViewById(R.id.Image);
        button= (Button)findViewById(R.id.Button);


        Image.setImageResource(R.drawable.image);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Log.d("Message:", "onClick");
                String text=button.getText().toString();
                Log.d("Message:", "Button text is "+text);

                if (Objects.equals(text, "HIDE"))
                {
                    Log.d("Message:", "IF TRUE");
                    button.setText("SHOW");
                    Image.setVisibility(View.INVISIBLE);
                    Toast.makeText(Image.this,"Image is now Invisible!", Toast.LENGTH_LONG).show();
                }
                else if(Objects.equals(text, "SHOW"))
                {
                    Log.d("Message:", "ELSE");
                    button.setText("HIDE");
                    Image.setVisibility(View.VISIBLE);
                    Toast.makeText(Image.this,"Image is now Visible!", Toast.LENGTH_LONG).show();
                }
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_image, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
