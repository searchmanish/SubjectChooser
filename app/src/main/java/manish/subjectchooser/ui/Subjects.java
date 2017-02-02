package manish.subjectchooser.ui;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

import manish.subjectchooser.R;
import manish.subjectchooser.adapter.Adapter;
import manish.subjectchooser.model.ListItem;
import manish.subjectchooser.model.MyData;

public class Subjects extends AppCompatActivity implements Adapter.ItemClickCallBack {
    private RecyclerView recView;
    private Adapter adapter;

    public static final String BUNDLE_EXTRAS="BUNDLE_EXTRAS";
    public  static final String EXTRA_ATT="EXTRA_ATT";

    private ArrayList listData;
    //private Button b;
//Button is used for checking it on Fragment
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subjects);

        listData=(ArrayList)MyData.getListData();

        recView= (RecyclerView) findViewById(R.id.rec_view);

        recView.setLayoutManager(new LinearLayoutManager(this));

        //adapter=new Adapter(MyData.getListData(),this);//used previously for getting static data
       adapter=new Adapter(MyData.getListData(),this);
        recView.setAdapter(adapter);

        adapter.setItemClickCallBack(this);


     /*   b=(Button)findViewById(R.id.b);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment subject=new Subject();
                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment,subject);
                fragmentTransaction.commit();

            }
        });
             */
    }

    @Override
    public void onItemClick(int p) {
        ListItem item =(ListItem)listData.get(p);

        Intent i=new Intent(this,Details.class);
        Bundle extras=new Bundle();
        extras.putString(EXTRA_ATT,item.getSubjects());

        i.putExtra(BUNDLE_EXTRAS,extras);
        startActivity(i);

    }

    @Override
    public void onIconClick(int p) {

    }
}
