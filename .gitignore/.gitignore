package paulnyagah.com.mogesi;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {
    private Button mBtLogin;
    private Button mBtCreate_account;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mBtLogin = (Button)
                findViewById(R.id.Login);
            mBtLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Login();
            }
        });}
            private void Login(){
        Intent intent= new Intent(this,HomeActivity.class);
        startActivity(intent);
    }

      public void Create_account(View view){
          Intent intent = new Intent(this,SignUpActivity.class);
          startActivity(intent);
      }}

