package com.afghanistan.simcards;

import android.animation.*;
import android.app.*;
import android.app.AlertDialog;
import android.content.*;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.net.Uri;
import android.os.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
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
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.*;
import org.json.*;

public class Mtn1pageActivity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private double backmtn = 0;
	private String fontName = "";
	private String typeace = "";
	
	private LinearLayout main12;
	private LinearLayout linear4;
	private LinearLayout linear5;
	private LinearLayout linear6;
	private MaterialCardView linear7;
	private MaterialCardView linear9;
	private MaterialCardView linear11;
	private LinearLayout linear17;
	private ImageView imageview1;
	private TextView text_view_afg1;
	private TextView textview_afg2;
	private LinearLayout linear19;
	private ImageView imageview3;
	private TextView textview_roshan1;
	private TextView textview_roshan2;
	private LinearLayout linear21;
	private ImageView imageview5;
	private TextView textview_salaam1;
	private TextView textview_salaam2;
	private MaterialCardView linear8;
	private MaterialCardView linear10;
	private LinearLayout linear18;
	private ImageView imageview2;
	private TextView textview_eti1;
	private TextView textview_eti2;
	private LinearLayout linear20;
	private ImageView imageview4;
	private TextView textview_mtn1;
	private TextView textview_mtn2;
	
	private TimerTask t;
	private TimerTask timer;
	private AlertDialog.Builder d;
	private Intent mtndatago = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.mtn1page);
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
		main12 = findViewById(R.id.main12);
		linear4 = findViewById(R.id.linear4);
		linear5 = findViewById(R.id.linear5);
		linear6 = findViewById(R.id.linear6);
		linear7 = findViewById(R.id.linear7);
		linear9 = findViewById(R.id.linear9);
		linear11 = findViewById(R.id.linear11);
		linear17 = findViewById(R.id.linear17);
		imageview1 = findViewById(R.id.imageview1);
		text_view_afg1 = findViewById(R.id.text_view_afg1);
		textview_afg2 = findViewById(R.id.textview_afg2);
		linear19 = findViewById(R.id.linear19);
		imageview3 = findViewById(R.id.imageview3);
		textview_roshan1 = findViewById(R.id.textview_roshan1);
		textview_roshan2 = findViewById(R.id.textview_roshan2);
		linear21 = findViewById(R.id.linear21);
		imageview5 = findViewById(R.id.imageview5);
		textview_salaam1 = findViewById(R.id.textview_salaam1);
		textview_salaam2 = findViewById(R.id.textview_salaam2);
		linear8 = findViewById(R.id.linear8);
		linear10 = findViewById(R.id.linear10);
		linear18 = findViewById(R.id.linear18);
		imageview2 = findViewById(R.id.imageview2);
		textview_eti1 = findViewById(R.id.textview_eti1);
		textview_eti2 = findViewById(R.id.textview_eti2);
		linear20 = findViewById(R.id.linear20);
		imageview4 = findViewById(R.id.imageview4);
		textview_mtn1 = findViewById(R.id.textview_mtn1);
		textview_mtn2 = findViewById(R.id.textview_mtn2);
		d = new AlertDialog.Builder(this);
		
		linear7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				mtndatago.setClass(getApplicationContext(), Mtd1Activity.class);
				startActivity(mtndatago);
			}
		});
		
		linear9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				mtndatago.setClass(getApplicationContext(), MtcallActivity.class);
				startActivity(mtndatago);
			}
		});
		
		linear11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				mtndatago.setClass(getApplicationContext(), MtnjnterActivity.class);
				startActivity(mtndatago);
			}
		});
		
		linear8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				mtndatago.setClass(getApplicationContext(), MtmessActivity.class);
				startActivity(mtndatago);
			}
		});
		
		linear10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				mtndatago.setClass(getApplicationContext(), MtnsettActivity.class);
				startActivity(mtndatago);
			}
		});
	}
	
	private void initializeLogic() {
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