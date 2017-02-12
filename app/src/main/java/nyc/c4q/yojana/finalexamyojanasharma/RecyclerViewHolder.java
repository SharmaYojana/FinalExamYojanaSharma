package nyc.c4q.yojana.finalexamyojanasharma;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by yojanasharma on 2/12/17.
 */

public class RecyclerViewHolder extends RecyclerView.ViewHolder {

    ImageView imageView;

    public RecyclerViewHolder(View view) {
        super(view);
        imageView = (ImageView) view.findViewById(R.id.imagview_profile);


    }
}
