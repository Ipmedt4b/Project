package info.androidhive.slidingmenu;

import com.example.myapp.R;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Sustainability extends Fragment {
	
	public Sustainability(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_semodel, container, false);
         
        return rootView;
    }
}
