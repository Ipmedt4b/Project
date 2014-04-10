package info.androidhive.slidingmenu;

import info.androidhive.slidingmenu.adapter.CustomOnItemSelectedListener;

import java.util.ArrayList;
import java.util.List;

import com.example.myapp.R;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class SeModel extends Fragment {
	
	public SeModel(){}
	
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_semodel, container, false);
         
        return rootView;
    }
	
	public class MyAndroidAppActivity extends Activity {
		 
		  private Spinner spinner1, spinner2;
		  private Button btnSubmit;
		 
		  @Override
		  public void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.fragment_semodel);
		 
			addItemsOnSpinner2();
			addListenerOnButton();
			addListenerOnSpinnerItemSelection();
		  }
		 
		  // add items into spinner dynamically
		  public void addItemsOnSpinner2() {
		 
			
			List<String> list = new ArrayList<String>();
			list.add("list 1");
			list.add("list 2");
			list.add("list 3");
			ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_item, list);
			dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
			
		  }
		 
		  public void addListenerOnSpinnerItemSelection() {
			spinner1 = (Spinner) findViewById(R.id.spinner1);
			spinner1.setOnItemSelectedListener(new CustomOnItemSelectedListener());
		  }
		 
		  // get the selected dropdown list value
		  public void addListenerOnButton() {
		 
			spinner1 = (Spinner) findViewById(R.id.spinner1);
			btnSubmit = (Button) findViewById(R.id.btnSubmit);
		 
			btnSubmit.setOnClickListener(new OnClickListener() {
		 
			  @Override
			  public void onClick(View v) {
		 
			    Toast.makeText(MyAndroidAppActivity.this,
				"OnClickListener : " + 
		                "\nSpinner 1 : "+ String.valueOf(spinner1.getSelectedItem()) + 
		                					Toast.LENGTH_SHORT, 0).show();
			  }
		 
			});
		  }
		}



}
