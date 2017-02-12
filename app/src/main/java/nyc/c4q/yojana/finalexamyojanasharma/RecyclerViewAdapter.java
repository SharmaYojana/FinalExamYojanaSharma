package nyc.c4q.yojana.finalexamyojanasharma;

import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by yojanasharma on 2/12/17.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {

    ArrayList<String> arrayList = new ArrayList<>();

    public RecyclerViewAdapter(ArrayList<String> arraylist) {
        this.arrayList = arrayList;

    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.nav_row_list, parent, false);
        RecyclerViewHolder viewHolder = new RecyclerViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        holder.imageView.setImageDrawable(Drawable.createFromPath(arrayList.get(position)));


    }


    @Override
    public int getItemCount() {
        return arrayList.size();
    }

}
