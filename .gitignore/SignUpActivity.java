package paulnyagah.com.mogesi;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class SignUpActivity extends AppCompatActivity {
                  private Button mBtSignUpActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        mBtSignUpActivity = (Button)
                findViewById(R.id.SignUpActivity);

        mBtSignUpActivity.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                new SignUpActivity();
            }
        });}

             private void SignUpActivity(){
        Intent intent = new Intent(this,HomeActivity.class);
        startActivity(intent);

             }}

