package tech.alaaetmam.eve.ViewModel;

import android.content.Context;
import android.content.Intent;
import android.databinding.BaseObservable;
import android.view.View;

import tech.alaaetmam.eve.View.HomeVisit;
import tech.alaaetmam.eve.View.ShowMap;

/**
 * Created by acer on 11/04/18.
 */

public class MainActivityVM extends BaseObservable {
    private Context context;

    public MainActivityVM(Context context){
        this.context=context;
    }


    public void showMapClick(View v){
        onShowMapClick();
    }
    public void homeVisitClick(View v){
        onHomeVisitClick();
    }

    public void onShowMapClick(){
        Intent intent = new Intent(context.getApplicationContext(), ShowMap.class);
        context.startActivity(intent);

    }
    public void onHomeVisitClick(){
        Intent intent = new Intent(context.getApplicationContext(), HomeVisit.class);
        context.startActivity(intent);

    }
}
