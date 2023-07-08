package com.afghanistan.simcards;

import android.animation.*;
import android.app.*;
import android.app.Activity;
import android.content.*;
import android.content.Intent;
import android.content.SharedPreferences;
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
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.LinearLayout;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.*;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.facebook.shimmer.*;
import com.google.android.gms.ads.MobileAds;
import com.google.android.material.appbar.AppBarLayout;
import com.google.firebase.FirebaseApp;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sdsmdg.tastytoast.*;
import com.shashank.sony.fancytoastlib.*;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.*;
import org.json.*;

public class MtmessActivity extends AppCompatActivity {
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private double viewPager_position = 0;
	private String rjson = "";
	private String fontName = "";
	private String typeace = "";
	private String hp = "";
	private String dp = "";
	private String wp = "";
	private String mp = "";
	private String np = "";
	private String sp = "";
	private String fp = "";
	private String h = "";
	private String d = "";
	private String w = "";
	private String m = "";
	private String f = "";
	private String n = "";
	private String s = "";
	
	private ArrayList<HashMap<String, Object>> listmap = new ArrayList<>();
	
	private LinearLayout tablayout;
	private LinearLayout base;
	private LinearLayout trash;
	private LinearLayout linear4;
	private LinearLayout layout2;
	private LinearLayout layout3;
	private LinearLayout layout4;
	private LinearLayout layout1;
	private LinearLayout layout5;
	private LinearLayout linear437;
	private RecyclerView recyclerview2;
	private LinearLayout linear438;
	private RecyclerView recyclerview3;
	private LinearLayout linear439;
	private RecyclerView recyclerview4;
	private LinearLayout linear1;
	private RecyclerView recyclerview1;
	private LinearLayout linear440;
	private RecyclerView recyclerview5;
	
	private Intent activate = new Intent();
	private SharedPreferences lan;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.mtmess);
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
		tablayout = findViewById(R.id.tablayout);
		base = findViewById(R.id.base);
		trash = findViewById(R.id.trash);
		linear4 = findViewById(R.id.linear4);
		layout2 = findViewById(R.id.layout2);
		layout3 = findViewById(R.id.layout3);
		layout4 = findViewById(R.id.layout4);
		layout1 = findViewById(R.id.layout1);
		layout5 = findViewById(R.id.layout5);
		linear437 = findViewById(R.id.linear437);
		recyclerview2 = findViewById(R.id.recyclerview2);
		linear438 = findViewById(R.id.linear438);
		recyclerview3 = findViewById(R.id.recyclerview3);
		linear439 = findViewById(R.id.linear439);
		recyclerview4 = findViewById(R.id.recyclerview4);
		linear1 = findViewById(R.id.linear1);
		recyclerview1 = findViewById(R.id.recyclerview1);
		linear440 = findViewById(R.id.linear440);
		recyclerview5 = findViewById(R.id.recyclerview5);
		lan = getSharedPreferences("lan", Activity.MODE_PRIVATE);
	}
	
	private void initializeLogic() {
		_foraddvars();
	}
	
	public void _viewPager() {
		viewPager = new androidx.viewpager.widget.ViewPager(this);
		viewPager.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
		
		MyPagerAdapter adapter = new MyPagerAdapter();
		viewPager.setAdapter(adapter);
		viewPager.setCurrentItem(0);
		base.addView(viewPager);
		
		viewPager.addOnPageChangeListener(new androidx.viewpager.widget.ViewPager.OnPageChangeListener() {
				public void onPageSelected(int position) {
						viewPager_position = position;
				}
				@Override public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
						
				}
				@Override public void onPageScrollStateChanged(int state) {
						
				}
		});
		
		tabLayout = new com.google.android.material.tabs.TabLayout(this);
		tabLayout.setTabGravity(tabLayout.GRAVITY_FILL);
		tabLayout.setSelectedTabIndicatorColor(Color.parseColor("#FFFFFF"));
		tabLayout.setTabTextColors(Color.parseColor("#E0E0E0"), Color.parseColor("#FFFFFF"));
		tabLayout.setTabRippleColor(new android.content.res.ColorStateList(new int[][]{new int[]{android.R.attr.state_pressed}}, 
		
		new int[] {0xFFFFFFFF}));
		tabLayout.setTabMode(com.google.android.material.tabs.TabLayout.MODE_FIXED);
		tabLayout.setupWithViewPager(viewPager);
		
		tablayout.addView(tabLayout);
		
	}
	private class MyPagerAdapter extends androidx.viewpager.widget.PagerAdapter {
			public int getCount() {
					return 5;
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
							try {
										               InputStream inputStream = getAssets().open(dp);
										               int size = inputStream.available();
										               byte[] buffer = new byte[size];
										               inputStream.read(buffer);
										               rjson = new String(buffer);
										            } catch (IOException e) {
										               e.printStackTrace();
										            }
							listmap = new Gson().fromJson(rjson, new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
							recyclerview1.setAdapter(new Recyclerview1Adapter(listmap));
							recyclerview1.setLayoutManager(new LinearLayoutManager(MtmessActivity.this));
					} else if (position == 1) {
							ViewGroup parent = (ViewGroup) layout2.getParent();
							if (parent != null) {
									parent.removeView(layout2);
							}
							container.addView(layout2);
							try {
										               InputStream inputStream = getAssets().open(wp);
										               int size = inputStream.available();
										               byte[] buffer = new byte[size];
										               inputStream.read(buffer);
										               rjson = new String(buffer);
										            } catch (IOException e) {
										               e.printStackTrace();
										            }
							listmap = new Gson().fromJson(rjson, new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
							recyclerview2.setAdapter(new Recyclerview2Adapter(listmap));
							recyclerview2.setLayoutManager(new LinearLayoutManager(MtmessActivity.this));
							
					} else if (position == 2) {
							ViewGroup parent = (ViewGroup) layout3.getParent();
							if (parent != null) {
									parent.removeView(layout3);
							}
							container.addView(layout3);
							try {
										               InputStream inputStream = getAssets().open(mp);
										               int size = inputStream.available();
										               byte[] buffer = new byte[size];
										               inputStream.read(buffer);
										               rjson = new String(buffer);
										            } catch (IOException e) {
										               e.printStackTrace();
										            }
							listmap = new Gson().fromJson(rjson, new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
							recyclerview3.setAdapter(new Recyclerview3Adapter(listmap));
							recyclerview3.setLayoutManager(new LinearLayoutManager(MtmessActivity.this));
					} else if (position == 3) {
							ViewGroup parent = (ViewGroup) layout4.getParent();
							if (parent != null) {
									parent.removeView(layout4);
							}
							container.addView(layout4);
							
					} else if (position == 4) {
							ViewGroup parent = (ViewGroup) layout5.getParent();
							if (parent != null) {
									parent.removeView(layout5);
							}
							container.addView(layout5);
							
					}
					collection.addView(v, 0);
					return v;
			}
			@Override public void destroyItem(ViewGroup collection, int position, Object view) {
					collection.removeView((View) view);
					trash.addView((View) view);
			}
			@Override public CharSequence getPageTitle(int position) {
					switch (position) {
							case 0:
							return d;
							case 1:
							return w;
							case 2:
							return m;
							case 3:
							return n;
							case 4:
							return s;
							default:
							return null;
					}
			}
			@Override public boolean isViewFromObject(View arg0, Object arg1) {
					return arg0 == ((View) arg1);}
			@Override public Parcelable saveState() {
					return null;
			}
	}
	androidx.viewpager.widget.ViewPager viewPager;
	com.google.android.material.tabs.TabLayout tabLayout;
	private void foo() {
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
	
	
	public void _foraddvars() {
		if (lan.getString("lan", "").equals("fa")) {
			dp = "DPMmtn.json";
			wp = "WPMmtn.json";
			mp = "MPMmtn.json";
			d = "روزانه";
			w = "هفته وار";
			m = "ماه وار";
			n = "شبانه";
			s = "متفرقه";
			
			            try {
				               InputStream inputStream = getAssets().open("DPMmtn.json");
				               int size = inputStream.available();
				               byte[] buffer = new byte[size];
				               inputStream.read(buffer);
				               rjson = new String(buffer);
				            } catch (IOException e) {
				               e.printStackTrace();
				            }
		}
		else {
			dp = "trans/DPMmtn.json";
			wp = "trans/WPMmtn.json";
			mp = "trans/MPMmtn.json";
			d = "Daily";
			w = "Weekly";
			m = "Monthly";
			n = "Nightly";
			s = "other";
			
			            try {
				               InputStream inputStream = getAssets().open("trans/DPMmtn.json");
				               int size = inputStream.available();
				               byte[] buffer = new byte[size];
				               inputStream.read(buffer);
				               rjson = new String(buffer);
				            } catch (IOException e) {
				               e.printStackTrace();
				            }
		}
		listmap = new Gson().fromJson(rjson, new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
		recyclerview1.setAdapter(new Recyclerview1Adapter(listmap));
		recyclerview1.setLayoutManager(new LinearLayoutManager(this));
		_viewPager();
		_changeActivityFont("titar");
	}
	
	public class Recyclerview2Adapter extends RecyclerView.Adapter<Recyclerview2Adapter.ViewHolder> {
		
		ArrayList<HashMap<String, Object>> _data;
		
		public Recyclerview2Adapter(ArrayList<HashMap<String, Object>> _arr) {
			_data = _arr;
		}
		
		@Override
		public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
			LayoutInflater _inflater = getLayoutInflater();
			View _v = _inflater.inflate(R.layout.forpackage, null);
			RecyclerView.LayoutParams _lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
			_v.setLayoutParams(_lp);
			return new ViewHolder(_v);
		}
		
		@Override
		public void onBindViewHolder(ViewHolder _holder, final int _position) {
			View _view = _holder.itemView;
			
			final LinearLayout linear157 = _view.findViewById(R.id.linear157);
			final com.google.android.material.card.MaterialCardView cardview6 = _view.findViewById(R.id.cardview6);
			final LinearLayout linear148 = _view.findViewById(R.id.linear148);
			final LinearLayout linear149 = _view.findViewById(R.id.linear149);
			final LinearLayout linear150 = _view.findViewById(R.id.linear150);
			final TextView price = _view.findViewById(R.id.price);
			final TextView info = _view.findViewById(R.id.info);
			final LinearLayout linear151 = _view.findViewById(R.id.linear151);
			final LinearLayout linear154 = _view.findViewById(R.id.linear154);
			final LinearLayout linear153 = _view.findViewById(R.id.linear153);
			final TextView title = _view.findViewById(R.id.title);
			final com.google.android.material.button.MaterialButton buttonA = _view.findViewById(R.id.buttonA);
			final LinearLayout linear155 = _view.findViewById(R.id.linear155);
			final com.google.android.material.button.MaterialButton buttonD = _view.findViewById(R.id.buttonD);
			
			title.setText(_data.get((int)_position).get("title").toString());
			price.setText(_data.get((int)_position).get("price").toString());
			info.setText(_data.get((int)_position).get("info").toString());
			buttonA.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View _view) {
					activate.setAction(Intent.ACTION_VIEW);
					activate.setData(Uri.parse("sms:".concat("676")));
					activate.putExtra("sms_body", _data.get((int)_position).get("buttonA").toString());
					startActivity(activate);
				}
			});
			buttonD.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View _view) {
					activate.setAction(Intent.ACTION_VIEW);
					activate.setData(Uri.parse("sms:".concat("676")));
					activate.putExtra("sms_body", _data.get((int)_position).get("buttonD").toString());
					startActivity(activate);
				}
			});
		}
		
		@Override
		public int getItemCount() {
			return _data.size();
		}
		
		public class ViewHolder extends RecyclerView.ViewHolder {
			public ViewHolder(View v) {
				super(v);
			}
		}
	}
	
	public class Recyclerview3Adapter extends RecyclerView.Adapter<Recyclerview3Adapter.ViewHolder> {
		
		ArrayList<HashMap<String, Object>> _data;
		
		public Recyclerview3Adapter(ArrayList<HashMap<String, Object>> _arr) {
			_data = _arr;
		}
		
		@Override
		public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
			LayoutInflater _inflater = getLayoutInflater();
			View _v = _inflater.inflate(R.layout.forpackage, null);
			RecyclerView.LayoutParams _lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
			_v.setLayoutParams(_lp);
			return new ViewHolder(_v);
		}
		
		@Override
		public void onBindViewHolder(ViewHolder _holder, final int _position) {
			View _view = _holder.itemView;
			
			final LinearLayout linear157 = _view.findViewById(R.id.linear157);
			final com.google.android.material.card.MaterialCardView cardview6 = _view.findViewById(R.id.cardview6);
			final LinearLayout linear148 = _view.findViewById(R.id.linear148);
			final LinearLayout linear149 = _view.findViewById(R.id.linear149);
			final LinearLayout linear150 = _view.findViewById(R.id.linear150);
			final TextView price = _view.findViewById(R.id.price);
			final TextView info = _view.findViewById(R.id.info);
			final LinearLayout linear151 = _view.findViewById(R.id.linear151);
			final LinearLayout linear154 = _view.findViewById(R.id.linear154);
			final LinearLayout linear153 = _view.findViewById(R.id.linear153);
			final TextView title = _view.findViewById(R.id.title);
			final com.google.android.material.button.MaterialButton buttonA = _view.findViewById(R.id.buttonA);
			final LinearLayout linear155 = _view.findViewById(R.id.linear155);
			final com.google.android.material.button.MaterialButton buttonD = _view.findViewById(R.id.buttonD);
			
			title.setText(_data.get((int)_position).get("title").toString());
			price.setText(_data.get((int)_position).get("price").toString());
			info.setText(_data.get((int)_position).get("info").toString());
			buttonA.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View _view) {
					activate.setAction(Intent.ACTION_VIEW);
					activate.setData(Uri.parse("sms:".concat("676")));
					activate.putExtra("sms_body", _data.get((int)_position).get("buttonA").toString());
					startActivity(activate);
				}
			});
			buttonD.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View _view) {
					activate.setAction(Intent.ACTION_VIEW);
					activate.setData(Uri.parse("sms:".concat("676")));
					activate.putExtra("sms_body", _data.get((int)_position).get("buttonD").toString());
					startActivity(activate);
				}
			});
		}
		
		@Override
		public int getItemCount() {
			return _data.size();
		}
		
		public class ViewHolder extends RecyclerView.ViewHolder {
			public ViewHolder(View v) {
				super(v);
			}
		}
	}
	
	public class Recyclerview4Adapter extends RecyclerView.Adapter<Recyclerview4Adapter.ViewHolder> {
		
		ArrayList<HashMap<String, Object>> _data;
		
		public Recyclerview4Adapter(ArrayList<HashMap<String, Object>> _arr) {
			_data = _arr;
		}
		
		@Override
		public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
			LayoutInflater _inflater = getLayoutInflater();
			View _v = _inflater.inflate(R.layout.forpackage, null);
			RecyclerView.LayoutParams _lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
			_v.setLayoutParams(_lp);
			return new ViewHolder(_v);
		}
		
		@Override
		public void onBindViewHolder(ViewHolder _holder, final int _position) {
			View _view = _holder.itemView;
			
			final LinearLayout linear157 = _view.findViewById(R.id.linear157);
			final com.google.android.material.card.MaterialCardView cardview6 = _view.findViewById(R.id.cardview6);
			final LinearLayout linear148 = _view.findViewById(R.id.linear148);
			final LinearLayout linear149 = _view.findViewById(R.id.linear149);
			final LinearLayout linear150 = _view.findViewById(R.id.linear150);
			final TextView price = _view.findViewById(R.id.price);
			final TextView info = _view.findViewById(R.id.info);
			final LinearLayout linear151 = _view.findViewById(R.id.linear151);
			final LinearLayout linear154 = _view.findViewById(R.id.linear154);
			final LinearLayout linear153 = _view.findViewById(R.id.linear153);
			final TextView title = _view.findViewById(R.id.title);
			final com.google.android.material.button.MaterialButton buttonA = _view.findViewById(R.id.buttonA);
			final LinearLayout linear155 = _view.findViewById(R.id.linear155);
			final com.google.android.material.button.MaterialButton buttonD = _view.findViewById(R.id.buttonD);
		}
		
		@Override
		public int getItemCount() {
			return _data.size();
		}
		
		public class ViewHolder extends RecyclerView.ViewHolder {
			public ViewHolder(View v) {
				super(v);
			}
		}
	}
	
	public class Recyclerview1Adapter extends RecyclerView.Adapter<Recyclerview1Adapter.ViewHolder> {
		
		ArrayList<HashMap<String, Object>> _data;
		
		public Recyclerview1Adapter(ArrayList<HashMap<String, Object>> _arr) {
			_data = _arr;
		}
		
		@Override
		public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
			LayoutInflater _inflater = getLayoutInflater();
			View _v = _inflater.inflate(R.layout.forpackage, null);
			RecyclerView.LayoutParams _lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
			_v.setLayoutParams(_lp);
			return new ViewHolder(_v);
		}
		
		@Override
		public void onBindViewHolder(ViewHolder _holder, final int _position) {
			View _view = _holder.itemView;
			
			final LinearLayout linear157 = _view.findViewById(R.id.linear157);
			final com.google.android.material.card.MaterialCardView cardview6 = _view.findViewById(R.id.cardview6);
			final LinearLayout linear148 = _view.findViewById(R.id.linear148);
			final LinearLayout linear149 = _view.findViewById(R.id.linear149);
			final LinearLayout linear150 = _view.findViewById(R.id.linear150);
			final TextView price = _view.findViewById(R.id.price);
			final TextView info = _view.findViewById(R.id.info);
			final LinearLayout linear151 = _view.findViewById(R.id.linear151);
			final LinearLayout linear154 = _view.findViewById(R.id.linear154);
			final LinearLayout linear153 = _view.findViewById(R.id.linear153);
			final TextView title = _view.findViewById(R.id.title);
			final com.google.android.material.button.MaterialButton buttonA = _view.findViewById(R.id.buttonA);
			final LinearLayout linear155 = _view.findViewById(R.id.linear155);
			final com.google.android.material.button.MaterialButton buttonD = _view.findViewById(R.id.buttonD);
			
			title.setText(_data.get((int)_position).get("title").toString());
			price.setText(_data.get((int)_position).get("price").toString());
			info.setText(_data.get((int)_position).get("info").toString());
			buttonA.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View _view) {
					activate.setAction(Intent.ACTION_VIEW);
					activate.setData(Uri.parse("sms:".concat("676")));
					activate.putExtra("sms_body", _data.get((int)_position).get("buttonA").toString());
					startActivity(activate);
				}
			});
			buttonD.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View _view) {
					activate.setAction(Intent.ACTION_VIEW);
					activate.setData(Uri.parse("sms:".concat("676")));
					activate.putExtra("sms_body", _data.get((int)_position).get("buttonD").toString());
					startActivity(activate);
				}
			});
		}
		
		@Override
		public int getItemCount() {
			return _data.size();
		}
		
		public class ViewHolder extends RecyclerView.ViewHolder {
			public ViewHolder(View v) {
				super(v);
			}
		}
	}
	
	public class Recyclerview5Adapter extends RecyclerView.Adapter<Recyclerview5Adapter.ViewHolder> {
		
		ArrayList<HashMap<String, Object>> _data;
		
		public Recyclerview5Adapter(ArrayList<HashMap<String, Object>> _arr) {
			_data = _arr;
		}
		
		@Override
		public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
			LayoutInflater _inflater = getLayoutInflater();
			View _v = _inflater.inflate(R.layout.forpackage, null);
			RecyclerView.LayoutParams _lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
			_v.setLayoutParams(_lp);
			return new ViewHolder(_v);
		}
		
		@Override
		public void onBindViewHolder(ViewHolder _holder, final int _position) {
			View _view = _holder.itemView;
			
			final LinearLayout linear157 = _view.findViewById(R.id.linear157);
			final com.google.android.material.card.MaterialCardView cardview6 = _view.findViewById(R.id.cardview6);
			final LinearLayout linear148 = _view.findViewById(R.id.linear148);
			final LinearLayout linear149 = _view.findViewById(R.id.linear149);
			final LinearLayout linear150 = _view.findViewById(R.id.linear150);
			final TextView price = _view.findViewById(R.id.price);
			final TextView info = _view.findViewById(R.id.info);
			final LinearLayout linear151 = _view.findViewById(R.id.linear151);
			final LinearLayout linear154 = _view.findViewById(R.id.linear154);
			final LinearLayout linear153 = _view.findViewById(R.id.linear153);
			final TextView title = _view.findViewById(R.id.title);
			final com.google.android.material.button.MaterialButton buttonA = _view.findViewById(R.id.buttonA);
			final LinearLayout linear155 = _view.findViewById(R.id.linear155);
			final com.google.android.material.button.MaterialButton buttonD = _view.findViewById(R.id.buttonD);
		}
		
		@Override
		public int getItemCount() {
			return _data.size();
		}
		
		public class ViewHolder extends RecyclerView.ViewHolder {
			public ViewHolder(View v) {
				super(v);
			}
		}
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