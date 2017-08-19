package info.kategwengispert.improvedlist;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import static info.kategwengispert.improvedlist.R.id.imgPhoto;

/**
 * Created by it.admin on 8/19/2017.
 */

public class AnimalAdapter extends RecyclerView.Adapter<AnimalAdapter.AnimalViewHolder{

    List <Animal> animals;



    public AnimalAdapter (List<Animal> animals){
        this.animals=animals;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position){

    }

    @Override
    public int getItemCount(){

    }

    public static class AnimalViewHolder extends RecyclerView.ViewHolder{

        public AnimalViewHolder(View itemView) {
            super(itemView);

            cv = (CardView) itemView.findViewById(R.id.cv);
            tvName = (TextView) itemView.findViewById(R.id.lblName);
            tvAge = (TextView) itemView.findViewById(R.id.lblAge);
            imgPhoto = (ImageView) itemView.findViewById(R.id.imgPhoto);
        }
    }


}
