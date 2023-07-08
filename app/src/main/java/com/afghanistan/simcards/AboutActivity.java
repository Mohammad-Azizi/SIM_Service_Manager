package com.afghanistan.simcards;

import android.animation.*;
import android.app.*;
import android.content.*;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.os.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.airbnb.lottie.*;
import com.facebook.shimmer.*;
import com.google.android.gms.ads.MobileAds;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.card.*;
import com.google.firebase.FirebaseApp;
import com.sdsmdg.tastytoast.*;
import com.shashank.sony.fancytoastlib.*;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import org.json.*;

public class AboutActivity extends AppCompatActivity {
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private String fontname = "";
	private String typeface = "";
	private String package_name = "";
	private String ver = "";
	
	private LinearLayout linear1;
	private ScrollView vscroll2;
	private LinearLayout linear2;
	private LottieAnimationView lottie1;
	private MaterialCardView cardview1;
	private MaterialCardView cardview2;
	private TextView textview1;
	private LinearLayout linear3;
	private TextView textview2;
	private TextView textview5;
	private TextView textview3;
	private LinearLayout linear4;
	private TextView textview6;
	private TextView textview7;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.about);
		initialize(_savedInstanceState);
		FirebaseApp.initializeApp(this);
		MobileAds.initialize(this);
		
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		_app_bar = findViewById(R.id._app_bar);
		_coordinator = findViewById(R.id._coordinator);
		_toolbar = findViewById(R.id._toolbar);
		setSupportActionBar(_toolbar);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setHomeButtonEnabled(true);
		_toolbar.setNavigationOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) {
				onBackPressed();
			}
		});
		linear1 = findViewById(R.id.linear1);
		vscroll2 = findViewById(R.id.vscroll2);
		linear2 = findViewById(R.id.linear2);
		lottie1 = findViewById(R.id.lottie1);
		cardview1 = findViewById(R.id.cardview1);
		cardview2 = findViewById(R.id.cardview2);
		textview1 = findViewById(R.id.textview1);
		linear3 = findViewById(R.id.linear3);
		textview2 = findViewById(R.id.textview2);
		textview5 = findViewById(R.id.textview5);
		textview3 = findViewById(R.id.textview3);
		linear4 = findViewById(R.id.linear4);
		textview6 = findViewById(R.id.textview6);
		textview7 = findViewById(R.id.textview7);
	}
	
	private void initializeLogic() {
		
		package_name = "com.afghanistan.simcards";
		try {
			android.content.pm.PackageInfo pinfo = getPackageManager().getPackageInfo(package_name, android.content.pm.PackageManager.GET_ACTIVITIES);
			ver = pinfo.versionName; }
		catch (Exception e){ showMessage(e.toString()); }
		textview6.setText(ver);
		fontname = "fonts/".concat("all".concat(".ttf"));
		overrideFonts(AboutActivity.this,getWindow().getDecorView()); 
	} 
	private void overrideFonts(final android.content.Context context, final View v) {
		
		try {
				Typeface 
				typeface = Typeface.createFromAsset(getAssets(), fontname);;
				if ((v instanceof ViewGroup)) {
						ViewGroup vg = (ViewGroup) v;
						for (int i = 0;
						i < vg.getChildCount();
						i++) {
								View child = vg.getChildAt(i);
								overrideFonts(context, child);
						}
				}
				else {
						if ((v instanceof TextView)) {
								((TextView) v).setTypeface(typeface);
						}
						else {
								if ((v instanceof EditText )) {
										((EditText) v).setTypeface(typeface);
								}
								else {
										if ((v instanceof Button)) {
												((Button) v).setTypeface(typeface);
										}
								}
						}
				}
		}
		catch(Exception e)
		
		{
			
		};
	}
	
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input) {
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels() {
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels() {
		return getResources().getDisplayMetrics().heightPixels;
	}
}