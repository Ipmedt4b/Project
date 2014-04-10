package info.androidhive.slidingmenu;

import com.example.myapp.R;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Quiz extends Fragment {
	
	public Quiz(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_quiz, container, false);
         
        return rootView;
    }
}
