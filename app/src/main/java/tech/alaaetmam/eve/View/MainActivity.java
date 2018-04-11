package tech.alaaetmam.eve.View;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import tech.alaaetmam.eve.R;
import tech.alaaetmam.eve.ViewModel.MainActivityVM;
import tech.alaaetmam.eve.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        ActivityMainBinding binding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        MainActivityVM mainActivityVM=new MainActivityVM(this);
        binding.setMainActivityVM(mainActivityVM);



    }
}
