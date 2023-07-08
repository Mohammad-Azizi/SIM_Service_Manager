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

public class MtnsettActivity extends AppCompatActivity {
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private String fontName = "";
	private String typeace = "";
	
	private ScrollView vscroll6;
	private LinearLayout linear189;
	private MaterialCardView cardview1;
	private MaterialCardView cardview6;
	private MaterialCardView cardview7;
	private MaterialCardView cardview2;
	private MaterialCardView cardview5;
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
	private LinearLayout linear227;
	private LinearLayout linear228;
	private LinearLayout linear229;
	private LinearLayout linear230;
	private LinearLayout linear231;
	private LinearLayout linear232;
	private LinearLayout linear233;
	private TextView textview45;
	private TextView textview46;
	private LinearLayout linear234;
	private LinearLayout linear235;
	private MaterialButton materialbutton4;
	private LinearLayout linear236;
	private LinearLayout linear237;
	private LinearLayout linear238;
	private LinearLayout linear239;
	private LinearLayout linear240;
	private LinearLayout linear241;
	private LinearLayout linear242;
	private LinearLayout linear243;
	private TextView textview47;
	private EditText edittext1;
	private TextView textview48;
	private LinearLayout linear244;
	private LinearLayout linear245;
	private MaterialButton materialbutton5;
	private LinearLayout linear246;
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
	private MaterialButton materialbutton6;
	
	private Intent activate = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.mtnsett);
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
		cardview6 = findViewById(R.id.cardview6);
		cardview7 = findViewById(R.id.cardview7);
		cardview2 = findViewById(R.id.cardview2);
		cardview5 = findViewById(R.id.cardview5);
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
		linear227 = findViewById(R.id.linear227);
		linear228 = findViewById(R.id.linear228);
		linear229 = findViewById(R.id.linear229);
		linear230 = findViewById(R.id.linear230);
		linear231 = findViewById(R.id.linear231);
		linear232 = findViewById(R.id.linear232);
		linear233 = findViewById(R.id.linear233);
		textview45 = findViewById(R.id.textview45);
		textview46 = findViewById(R.id.textview46);
		linear234 = findViewById(R.id.linear234);
		linear235 = findViewById(R.id.linear235);
		materialbutton4 = findViewById(R.id.materialbutton4);
		linear236 = findViewById(R.id.linear236);
		linear237 = findViewById(R.id.linear237);
		linear238 = findViewById(R.id.linear238);
		linear239 = findViewById(R.id.linear239);
		linear240 = findViewById(R.id.linear240);
		linear241 = findViewById(R.id.linear241);
		linear242 = findViewById(R.id.linear242);
		linear243 = findViewById(R.id.linear243);
		textview47 = findViewById(R.id.textview47);
		edittext1 = findViewById(R.id.edittext1);
		textview48 = findViewById(R.id.textview48);
		linear244 = findViewById(R.id.linear244);
		linear245 = findViewById(R.id.linear245);
		materialbutton5 = findViewById(R.id.materialbutton5);
		linear246 = findViewById(R.id.linear246);
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
		materialbutton6 = findViewById(R.id.materialbutton6);
		
		materialbutton1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				activate.setAction(Intent.ACTION_DIAL);
				activate.setData(Uri.parse("tel:".concat("*789#".replace("#", Uri.encode("#")))));
				startActivity(activate);
			}
		});
		
		materialbutton4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				activate.setAction(Intent.ACTION_DIAL);
				activate.setData(Uri.parse("tel:".concat("*789*2#".replace("#", Uri.encode("#")))));
				startActivity(activate);
			}
		});
		
		materialbutton5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (!edittext1.getText().toString().equals("")) {
					activate.setAction(Intent.ACTION_VIEW);
					activate.setData(Uri.parse("sms:".concat("404")));
					activate.putExtra("sms_body", edittext1.getText().toString());
					startActivity(activate);
				}
				else {
					edittext1.setError("لطفاً مقدار را وارد کنید");
				}
			}
		});
		
		materialbutton2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (sentmoney2.getText().toString().length() == 10) {
					if (!(sentmoney1.getText().toString().length() == 0)) {
						if (sentmoney1.getText().toString().length() < 4) {
							activate.setAction(Intent.ACTION_DIAL);
							activate.setData(Uri.parse("tel:".concat("*776*2*".concat(sentmoney1.getText().toString().concat("*".concat(sentmoney2.getText().toString().concat("#")))).replace("#", Uri.encode("#")))));
							startActivity(activate);
						}
						else {
							sentmoney1.setError("حداکثر 3 عدد است");
						}
					}
					else {
						sentmoney1.setError("لطفاً مقدار را وارد کنید!");
					}
				}
				else {
					sentmoney2.setError("لطفاً شماره ۱۰ رقمه را وارد کنید!");
				}
			}
		});
		
		materialbutton3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (addcredit.getText().toString().length() == 14) {
					activate.setAction(Intent.ACTION_DIAL);
					activate.setData(Uri.parse("tel:".concat("*788*".concat(addcredit.getText().toString().concat("#")).replace("#", Uri.encode("#")))));
					startActivity(activate);
				}
				else {
					addcredit.setError("لطفاً عدد ۱۴ رقمه را وارد کنید!");
				}
			}
		});
		
		materialbutton6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				activate.setAction(Intent.ACTION_VIEW);
				activate.setData(Uri.parse("sms:".concat("667")));
				activate.putExtra("sms_body", " ");
				startActivity(activate);
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