package com.afghanistan.simcards;

import android.animation.*;
import android.app.*;
import android.app.Activity;
import android.content.*;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.*;
import android.graphics.*;
import android.graphics.Typeface;
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
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.airbnb.lottie.*;
import com.facebook.shimmer.*;
import com.google.android.gms.ads.MobileAds;
import com.google.firebase.FirebaseApp;
import com.sdsmdg.tastytoast.*;
import com.shashank.sony.fancytoastlib.*;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import org.json.*;

public class MainActivity extends AppCompatActivity {
	
	private String fontName = "";
	private String typeace = "";
	
	private LinearLayout allback;
	private LinearLayout linear8;
	private LinearLayout cod;
	private LinearLayout tabslinear;
	private LinearLayout linear5;
	private LinearLayout linear1;
	private LinearLayout base;
	private LinearLayout trash;
	private LinearLayout layout1;
	private LinearLayout layout2;
	private LinearLayout layout3;
	private LottieAnimationView lottie1;
	private TextView textview4;
	private TextView textview5;
	private LottieAnimationView lottie2;
	private TextView textview6;
	private TextView textview7;
	private LottieAnimationView lottie3;
	private TextView textview8;
	private TextView textview9;
	private LinearLayout linear9;
	private TextView textview3;
	private LinearLayout dot1;
	private LinearLayout linear14;
	private LinearLayout dot2;
	private LinearLayout linear13;
	private LinearLayout dot3;
	
	private Intent g = new Intent();
	private SharedPreferences splash;
	private SharedPreferences lan;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
		initialize(_savedInstanceState);
		FirebaseApp.initializeApp(this);
		MobileAds.initialize(this);
		
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		allback = findViewById(R.id.allback);
		linear8 = findViewById(R.id.linear8);
		cod = findViewById(R.id.cod);
		tabslinear = findViewById(R.id.tabslinear);
		linear5 = findViewById(R.id.linear5);
		linear1 = findViewById(R.id.linear1);
		base = findViewById(R.id.base);
		trash = findViewById(R.id.trash);
		layout1 = findViewById(R.id.layout1);
		layout2 = findViewById(R.id.layout2);
		layout3 = findViewById(R.id.layout3);
		lottie1 = findViewById(R.id.lottie1);
		textview4 = findViewById(R.id.textview4);
		textview5 = findViewById(R.id.textview5);
		lottie2 = findViewById(R.id.lottie2);
		textview6 = findViewById(R.id.textview6);
		textview7 = findViewById(R.id.textview7);
		lottie3 = findViewById(R.id.lottie3);
		textview8 = findViewById(R.id.textview8);
		textview9 = findViewById(R.id.textview9);
		linear9 = findViewById(R.id.linear9);
		textview3 = findViewById(R.id.textview3);
		dot1 = findViewById(R.id.dot1);
		linear14 = findViewById(R.id.linear14);
		dot2 = findViewById(R.id.dot2);
		linear13 = findViewById(R.id.linear13);
		dot3 = findViewById(R.id.dot3);
		splash = getSharedPreferences("splash", Activity.MODE_PRIVATE);
		lan = getSharedPreferences("lan", Activity.MODE_PRIVATE);
		
		textview3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				splash.edit().putString("s", "done").commit();
				g.setClass(getApplicationContext(), HomeActivity.class);
				startActivity(g);
				finish();
			}
		});
	}
	
	private void initializeLogic() {
		if (lan.getString("lan", "").equals("")) {
			lan.edit().putString("lan", Locale.getDefault().getLanguage()).commit();
		}
		else {
			_setLocale(lan.getString("lan", ""));
		}
		textview3.setVisibility(View.GONE);
		dot1.setLayoutParams(new LinearLayout.LayoutParams(40, 20));
		dot2.setLayoutParams(new LinearLayout.LayoutParams(20, 20));
		dot3.setLayoutParams(new LinearLayout.LayoutParams(20, 20));
		_rippleRoundStroke(dot1, "#232323", "#FFFFFF", 100, 0, "#1877F2");
		_rippleRoundStroke(dot2, "#EEEEEE", "#FFFFFF", 100, 0, "#1877F2");
		_rippleRoundStroke(dot3, "#EEEEEE", "#FFFFFF", 100, 0, "#1877F2");
		_rippleRoundStroke(textview3, "#1877F2", "#16FFFFFF", 20, 0, "#1877F2");
		_viewpager();
		textview8.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/titar.ttf"), 1);
		textview9.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/nilofar.ttf"), 0);
		textview6.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/titar.ttf"), 1);
		textview7.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/nilofar.ttf"), 0);
		textview4.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/titar.ttf"), 1);
		textview5.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/nilofar.ttf"), 0);
		if (splash.getString("s", "").equals("done")) {
			g.setClass(getApplicationContext(), HomeActivity.class);
			startActivity(g);
			finish();
		}
		else {
			
		}
	}
	
	public void _autoTransitionScroll(final View _scroll) {
		android.transition.TransitionManager.beginDelayedTransition((LinearLayout)_scroll, new android.transition.AutoTransition());
	}
	
	
	public void _DARK_ICONS() {
		getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
	}
	
	
	public void _NavStatusBarColor(final String _color1, final String _color2) {
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.LOLLIPOP) {
			Window w = this.getWindow();	w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);	w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
			w.setStatusBarColor(Color.parseColor("#" + _color1.replace("#", "")));	w.setNavigationBarColor(Color.parseColor("#" + _color2.replace("#", "")));
		}
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
	
	
	public void _rippleRoundStroke(final View _view, final String _focus, final String _pressed, final double _round, final double _stroke, final String _strokeclr) {
		android.graphics.drawable.GradientDrawable GG = new android.graphics.drawable.GradientDrawable();
		GG.setColor(Color.parseColor(_focus));
		GG.setCornerRadius((float)_round);
		GG.setStroke((int) _stroke,
		Color.parseColor("#" + _strokeclr.replace("#", "")));
		android.graphics.drawable.RippleDrawable RE = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{ Color.parseColor(_pressed)}), GG, null);
		_view.setBackground(RE);
	}
	
	
	public void _viewpager() {
		viewPager = new androidx.viewpager.widget.ViewPager
		(this);
		
		viewPager.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
		MyPagerAdapter adapter = new MyPagerAdapter();
		viewPager.setAdapter(adapter);
		viewPager.setCurrentItem(0);
		viewPager.addOnPageChangeListener(new androidx.viewpager.widget.ViewPager.OnPageChangeListener() {
			public void onPageSelected(int position) {
				
				if (viewPager.getCurrentItem() == 0) {
					_autoTransitionScroll(linear8);
					dot1.setLayoutParams(new LinearLayout.LayoutParams(40, 20));
					dot2.setLayoutParams(new LinearLayout.LayoutParams(20, 20));
					dot3.setLayoutParams(new LinearLayout.LayoutParams(20, 20));
					_rippleRoundStroke(dot1, "#232323", "#FFFFFF", 100, 0, "#1877F2");
					_rippleRoundStroke(dot2, "#EEEEEE", "#FFFFFF", 100, 0, "#1877F2");
					_rippleRoundStroke(dot3, "#EEEEEE", "#FFFFFF", 100, 0, "#1877F2");
					textview3.setVisibility(View.GONE);
				}
				else {
					if (viewPager.getCurrentItem() == 1) {
						_autoTransitionScroll(linear8);
						dot2.setLayoutParams(new LinearLayout.LayoutParams(40, 20));
						dot1.setLayoutParams(new LinearLayout.LayoutParams(20, 20));
						dot3.setLayoutParams(new LinearLayout.LayoutParams(20, 20));
						_rippleRoundStroke(dot2, "#232323", "#FFFFFF", 100, 0, "#1877F2");
						_rippleRoundStroke(dot1, "#EEEEEE", "#FFFFFF", 100, 0, "#1877F2");
						_rippleRoundStroke(dot3, "#EEEEEE", "#FFFFFF", 100, 0, "#1877F2");
						textview3.setVisibility(View.GONE);
					}
					else {
						if (viewPager.getCurrentItem() == 2) {
							_autoTransitionScroll(linear8);
							dot3.setLayoutParams(new LinearLayout.LayoutParams(40, 20));
							dot2.setLayoutParams(new LinearLayout.LayoutParams(20, 20));
							dot1.setLayoutParams(new LinearLayout.LayoutParams(20, 20));
							_rippleRoundStroke(dot3, "#232323", "#FFFFFF", 100, 0, "#1877F2");
							_rippleRoundStroke(dot2, "#EEEEEE", "#FFFFFF", 100, 0, "#1877F2");
							_rippleRoundStroke(dot1, "#EEEEEE", "#FFFFFF", 100, 0, "#1877F2");
							textview3.setVisibility(View.VISIBLE);
						}
					}
				}
			}
			@Override public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
				
			}
			@Override public void onPageScrollStateChanged(int state) {
				
			}
		});
		
		
		base.addView(viewPager);
		
		tabLayout = new com.google.android.material.tabs.TabLayout
		(this);
		tabLayout.setTabGravity(tabLayout.GRAVITY_FILL);
	}
	
	private class MyPagerAdapter extends androidx.viewpager.widget.PagerAdapter
	 {
		public int getCount() {
			return 3;
		}
		
		@Override public Object instantiateItem(ViewGroup collection, int position) {
			
			LayoutInflater inflater = (LayoutInflater) getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			View v = inflater.inflate(R.layout.empty, null);
			
			LinearLayout container = (LinearLayout) v.findViewById(R.id.linear1);
			
			if (position == 0) {
				ViewGroup parent = (ViewGroup) layout1.getParent();
				if (parent != null) {
					parent.removeView(layout1);
				}container.addView(layout1);
				
			} else if (position == 1) {
				ViewGroup parent = (ViewGroup) layout2.getParent();
				if (parent != null) {
					parent.removeView(layout2);
				}
				container.addView(layout2);
				
				
			} else if (position == 2) {
				ViewGroup parent = (ViewGroup) layout3.getParent();
				if (parent != null) {
					parent.removeView(layout3);
				}
				container.addView(layout3);
			}
			collection.addView(v, 0);
			return v;
		}
		@Override public void destroyItem(ViewGroup collection, int position, Object view) {
			collection.removeView((View) view);
			trash.addView((View) view);
		}
		@Override public boolean isViewFromObject(View arg0, Object arg1) {
			return arg0 == ((View) arg1);}
		@Override public Parcelable saveState() {
			return null;
		}
	}
	androidx.viewpager.widget.ViewPager
	 viewPager;
	com.google.android.material.tabs.TabLayout
	 tabLayout;
	private void foo() {
	}
	
	
	public void _setLocale(final String _lan) {
		Locale myLocale = new Locale(_lan); Resources res = getResources(); DisplayMetrics dm = res.getDisplayMetrics(); Configuration conf = res.getConfiguration(); conf.locale = myLocale; res.updateConfiguration(conf, dm); getBaseContext().getResources().updateConfiguration(conf, getBaseContext().getResources().getDisplayMetrics()); invalidateOptionsMenu(); onConfigurationChanged(conf);//Add this line 
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