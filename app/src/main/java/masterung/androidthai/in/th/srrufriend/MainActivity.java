package masterung.androidthai.in.th.srrufriend;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import masterung.androidthai.in.th.srrufriend.fragment.MaigFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Add Fragment to Activity
        if (savedInstanceState == null) {

            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.contentMaintFragment, new MaigFragment())
                    .commit();

        }




    } // main Method

}  //main class
