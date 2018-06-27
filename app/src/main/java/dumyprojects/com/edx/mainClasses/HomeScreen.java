package dumyprojects.com.edx.mainClasses;

import android.app.Activity;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import dumyprojects.com.edx.R;
import dumyprojects.com.edx.adapterClasses.RecyclerViewAdapter;
import dumyprojects.com.edx.dataClass.DataClass;
import dumyprojects.com.edx.helperClasses.DataGetrSetr;

public class HomeScreen extends AppCompatActivity {
private RecyclerView.LayoutManager layoutManager;
private static ArrayList<DataGetrSetr> dataList;
RecyclerViewAdapter adapter;
Activity activity;

   /* public HomeScreen(RecyclerView.LayoutManager layoutManager,ArrayList<DataGetrSetr>dataList) {
        this.layoutManager = layoutManager;
        this.dataList=dataList;
    }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        recyclerView();

    }
    public void recyclerView(){
        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        dataList=new ArrayList<>();
        Log.e("value of datalists1", String.valueOf(dataList));
        for(int i = 0 ; i< DataClass.courseName.length;i++){
            dataList.add(new DataGetrSetr(
                    DataClass.courseName[i],
                    DataClass.drawablePics[i],
                    DataClass.id[i],
                    activity

            ));
            Log.e("value of datalists2", String.valueOf(dataList));
        }
        Log.e("value of datalists3", String.valueOf(dataList));
        adapter = new RecyclerViewAdapter(dataList);
        //  adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}
