package manish.subjectchooser.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import manish.subjectchooser.R;
import manish.subjectchooser.model.ListItem;


/**
 * Created by Lenovo on 31-01-2017.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.MyHolder> {

    private List<ListItem> listData;
    private LayoutInflater layoutInflater;

    public Adapter(List<ListItem> listData, Context context)
    {
        this.layoutInflater=LayoutInflater.from(context);
        this.listData=listData;

    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=layoutInflater.inflate(R.layout.list_item,parent,false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {

        ListItem item=listData.get(position);
        holder.subject.setText(item.getSubjects());
        holder.icon.setImageResource(item.getImgResId());
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder
    {

        private TextView subject;
        private ImageView icon;
        private View container;

        public MyHolder(View itemView) {
            super(itemView);
            subject=(TextView)itemView.findViewById(R.id.lbl_item_text);
            icon=(ImageView)itemView.findViewById(R.id.im_item_icon);
            container=itemView.findViewById(R.id.cont_item_root);
        }
    }
}
