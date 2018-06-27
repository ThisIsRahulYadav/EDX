package dumyprojects.com.edx.adapterClasses;

import android.app.Activity;
import android.content.Context;
import android.media.session.PlaybackState;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import dumyprojects.com.edx.R;
import dumyprojects.com.edx.helperClasses.DataGetrSetr;
import dumyprojects.com.edx.mainClasses.HomeScreen;

/**
 * Created by lenovo on 6/7/2018.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder > {
ArrayList<DataGetrSetr> arrayList;
Activity activity;
HomeScreen homeScreen;
    ImageView imageView;
    TextView titleView;
    TextView descriptionView;
    public RecyclerViewAdapter( ArrayList<DataGetrSetr> dataList) {
        this.arrayList=dataList;
        this.activity=activity;
        this.homeScreen=homeScreen;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        Log.e("in onCreateViewHolder",null);
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view,parent,false);
        RecyclerViewHolder recyclerViewHolder= new RecyclerViewHolder(view);
        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, final int position) {
    arrayList.get(position).getName();
    arrayList.get(position).getId();

    //imageView=
        Log.e("image view value", String.valueOf(Integer.parseInt(String.valueOf(arrayList.get(position).getId()))));
        Log.e("title view value",arrayList.get(position).getName());
         imageView.setImageResource(Integer.parseInt(String.valueOf(arrayList.get(position).getId())));
         titleView.setText(arrayList.get(position).getName());

    imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             //   Toast.makeText(this,""+arrayList.get(position).getName(),Toast.LENGTH_SHORT).show();
            }
        });

    //Log.e("the value of r",String.valueOf(r));
        //titleView=Integer.parseInt(String.valueOf(arrayList.get(position).getImage()));
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {
        public RecyclerViewHolder(View itemView) {
            super(itemView);
             imageView=itemView.findViewById(R.id.imageViewCard);
             titleView=itemView.findViewById(R.id.titleView);
             descriptionView=itemView.findViewById(R.id.descriptionView);

        }
    }
}
