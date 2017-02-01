package manish.subjectchooser.ui;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import manish.subjectchooser.R;
import manish.subjectchooser.adapter.Adapter;
import manish.subjectchooser.model.MyData;

/**
 * A simple {@link Fragment} subclass.
 */
public class Subject extends Fragment {
    private RecyclerView recView;
    private Adapter adapter;


    public Subject() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         View v =inflater.inflate(R.layout.fragment_subject, container, false);
        recView= (RecyclerView)v.findViewById(R.id.rec_view1);

        recView.setLayoutManager(new LinearLayoutManager(getContext()));

        adapter=new Adapter(MyData.getListData(),getContext());
        recView.setAdapter(adapter);
        return v;
    }

}
