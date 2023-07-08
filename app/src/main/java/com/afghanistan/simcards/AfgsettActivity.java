package com.afghanistan.simcards;

import android.animation.*;
import android.app.*;
import android.content.*;
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
import android.widget.EditText;
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
import com.facebook.shimmer.*;
import com.google.android.gms.ads.MobileAds;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.button.*;
import com.google.android.material.card.*;
import com.google.firebase.FirebaseApp;
import com.sdsmdg.tastytoast.*;
import com.shashank.sony.fancytoastlib.*;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import org.json.*;

public class AfgsettActivity extends AppCompatActivity {
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private String fontName = "";
	private String typeace = "";
	
	private ScrollView vscroll6;
	private LinearLayout linear189;
	private MaterialCardView cardview1;
	private MaterialCardView cardview2;
	private MaterialCardView cardview5;
	private MaterialCardView cardview13;
	private MaterialCardView cardview3;
	private MaterialCardView cardview4;
	private LinearLayout linear158;
	private LinearLayout linear159;
	private LinearLayout linear160;
	private LinearLayout linear167;
	private LinearLayout linear161;
	private LinearLayout linear162;
	private LinearLayout linear163;
	private TextView textview23;
	private TextView textview24;
	private LinearLayout linear164;
	private LinearLayout linear165;
	private MaterialButton materialbutton1;
	private LinearLayout linear166;
	private LinearLayout linear168;
	private LinearLayout linear169;
	private LinearLayout linear170;
	private LinearLayout linear171;
	private LinearLayout linear172;
	private LinearLayout linear173;
	private LinearLayout linear174;
	private TextView textview25;
	private TextView textview26;
	private EditText sentmoney1;
	private TextView textview27;
	private EditText sentmoney2;
	private TextView textview28;
	private LinearLayout linear175;
	private LinearLayout linear176;
	private MaterialButton materialbutton2;
	private LinearLayout linear177;
	private LinearLayout linear178;
	private LinearLayout linear179;
	private LinearLayout linear180;
	private LinearLayout linear181;
	private LinearLayout linear182;
	private LinearLayout linear184;
	private TextView textview29;
	private TextView textview31;
	private TextView textview30;
	private LinearLayout linear288;
	private LinearLayout linear289;
	private LinearLayout linear290;
	private LinearLayout linear291;
	private LinearLayout linear292;
	private LinearLayout linear293;
	private LinearLayout linear294;
	private TextView textview63;
	private TextView textview64;
	private LinearLayout linear295;
	private LinearLayout linear296;
	private MaterialButton materialbutton9;
	private LinearLayout linear297;
	private LinearLayout linear210;
	private LinearLayout linear211;
	private LinearLayout linear212;
	private LinearLayout linear213;
	private LinearLayout linear214;
	private LinearLayout linear215;
	private LinearLayout linear216;
	private TextView textview39;
	private TextView textview40;
	private EditText addcredit;
	private TextView textview42;
	private LinearLayout linear217;
	private LinearLayout linear218;
	private MaterialButton materialbutton3;
	private LinearLayout linear219;
	private LinearLayout linear220;
	private LinearLayout linear221;
	private LinearLayout linear222;
	private LinearLayout linear223;
	private LinearLayout linear224;
	private LinearLayout linear226;
	private TextView textview43;
	private TextView textview44;
	
	private Intent activate = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.afgsett);
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
		vscroll6 = findViewById(R.id.vscroll6);
		linear189 = findViewById(R.id.linear189);
		cardview1 = findViewById(R.id.cardview1);
		cardview2 = findViewById(R.id.cardview2);
		cardview5 = findViewById(R.id.cardview5);
		cardview13 = findViewById(R.id.cardview13);
		cardview3 = findViewById(R.id.cardview3);
		cardview4 = findViewById(R.id.cardview4);
		linear158 = findViewById(R.id.linear158);
		linear159 = findViewById(R.id.linear159);
		linear160 = findViewById(R.id.linear160);
		linear167 = findViewById(R.id.linear167);
		linear161 = findViewById(R.id.linear161);
		linear162 = findViewById(R.id.linear162);
		linear163 = findViewById(R.id.linear163);
		textview23 = findViewById(R.id.textview23);
		textview24 = findViewById(R.id.textview24);
		linear164 = findViewById(R.id.linear164);
		linear165 = findViewById(R.id.linear165);
		materialbutton1 = findViewById(R.id.materialbutton1);
		linear166 = findViewById(R.id.linear166);
		linear168 = findViewById(R.id.linear168);
		linear169 = findViewById(R.id.linear169);
		linear170 = findViewById(R.id.linear170);
		linear171 = findViewById(R.id.linear171);
		linear172 = findViewById(R.id.linear172);
		linear173 = findViewById(R.id.linear173);
		linear174 = findViewById(R.id.linear174);
		textview25 = findViewById(R.id.textview25);
		textview26 = findViewById(R.id.textview26);
		sentmoney1 = findViewById(R.id.sentmoney1);
		textview27 = findViewById(R.id.textview27);
		sentmoney2 = findViewById(R.id.sentmoney2);
		textview28 = findViewById(R.id.textview28);
		linear175 = findViewById(R.id.linear175);
		linear176 = findViewById(R.id.linear176);
		materialbutton2 = findViewById(R.id.materialbutton2);
		linear177 = findViewById(R.id.linear177);
		linear178 = findViewById(R.id.linear178);
		linear179 = findViewById(R.id.linear179);
		linear180 = findViewById(R.id.linear180);
		linear181 = findViewById(R.id.linear181);
		linear182 = findViewById(R.id.linear182);
		linear184 = findViewById(R.id.linear184);
		textview29 = findViewById(R.id.textview29);
		textview31 = findViewById(R.id.textview31);
		textview30 = findViewById(R.id.textview30);
		linear288 = findViewById(R.id.linear288);
		linear289 = findViewById(R.id.linear289);
		linear290 = findViewById(R.id.linear290);
		linear291 = findViewById(R.id.linear291);
		linear292 = findViewById(R.id.linear292);
		linear293 = findViewById(R.id.linear293);
		linear294 = findViewById(R.id.linear294);
		textview63 = findViewById(R.id.textview63);
		textview64 = findViewById(R.id.textview64);
		linear295 = findViewById(R.id.linear295);
		linear296 = findViewById(R.id.linear296);
		materialbutton9 = findViewById(R.id.materialbutton9);
		linear297 = findViewById(R.id.linear297);
		linear210 = findViewById(R.id.linear210);
		linear211 = findViewById(R.id.linear211);
		linear212 = findViewById(R.id.linear212);
		linear213 = findViewById(R.id.linear213);
		linear214 = findViewById(R.id.linear214);
		linear215 = findViewById(R.id.linear215);
		linear216 = findViewById(R.id.linear216);
		textview39 = findViewById(R.id.textview39);
		textview40 = findViewById(R.id.textview40);
		addcredit = findViewById(R.id.addcredit);
		textview42 = findViewById(R.id.textview42);
		linear217 = findViewById(R.id.linear217);
		linear218 = findViewById(R.id.linear218);
		materialbutton3 = findViewById(R.id.materialbutton3);
		linear219 = findViewById(R.id.linear219);
		linear220 = findViewById(R.id.linear220);
		linear221 = findViewById(R.id.linear221);
		linear222 = findViewById(R.id.linear222);
		linear223 = findViewById(R.id.linear223);
		linear224 = findViewById(R.id.linear224);
		linear226 = findViewById(R.id.linear226);
		textview43 = findViewById(R.id.textview43);
		textview44 = findViewById(R.id.textview44);
		
		materialbutton1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				activate.setAction(Intent.ACTION_DIAL);
				activate.setData(Uri.parse("tel:".concat("*123#".replace("#", Uri.encode("#")))));
				startActivity(activate);
			}
		});
		
		materialbutton2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (sentmoney1.getText().toString().length() == 10) {
					if (!(sentmoney2.getText().toString().length() == 0)) {
						if (sentmoney2.getText().toString().length() < 4) {
							activate.setAction(Intent.ACTION_DIAL);
							activate.setData(Uri.parse("tel:".concat("*444*1*".concat(sentmoney1.getText().toString().concat("*".concat(sentmoney2.getText().toString().concat("#")))).replace("#", Uri.encode("#")))));
							startActivity(activate);
						}
						else {
							sentmoney2.setError("حداکثر 3 عدد است");
						}
					}
					else {
						sentmoney2.setError("لطفاً مقدار را وارد کنید!");
					}
				}
				else {
					sentmoney1.setError("لطفاً شماره ۱۰ رقمه را وارد کنید!");
				}
			}
		});
		
		materialbutton9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				activate.setAction(Intent.ACTION_DIAL);
				activate.setData(Uri.parse("tel:".concat("*707#".replace("#", Uri.encode("#")))));
				startActivity(activate);
			}
		});
		
		materialbutton3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (addcredit.getText().toString().length() == 14) {
					activate.setAction(Intent.ACTION_DIAL);
					activate.setData(Uri.parse("tel:".concat("*124*".concat(addcredit.getText().toString().concat("#")).replace("#", Uri.encode("#")))));
					startActivity(activate);
				}
				else {
					addcredit.setError("لطفاً عدد ۱۴ رقمه را وارد کنید!");
				}
			}
		});
	}
	
	private void initializeLogic() {
		_changeActivityFont("titar");
	}
	
	public void _changeActivityFont(final String _fontname) {
		fontName = "fonts/".concat(_fontname.concat(".ttf"));
		overrideFonts(this,getWindow().getDecorView()); 
	} 
	private void overrideFonts(final android.content.Context context, final View v) {
		
		try {
			Typeface 
			typeace = Typeface.createFromAsset(getAssets(), fontName);;
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
					((TextView) v).setTypeface(typeace);
				}
				else {
					if ((v instanceof EditText )) {
						((EditText) v).setTypeface(typeace);
					}
					else {
						if ((v instanceof Button)) {
							((Button) v).setTypeface(typeace);
						}
					}
				}
			}
		}
		catch(Exception e)
		
		{
			SketchwareUtil.showMessage(getApplicationContext(), "Error Loading Font");
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