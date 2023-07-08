package com.afghanistan.simcards;

import android.animation.*;
import android.app.*;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.*;
import android.content.DialogInterface;
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
import android.view.View;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.facebook.shimmer.*;
import com.google.android.gms.ads.MobileAds;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.card.*;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.GenericTypeIndicator;
import com.google.firebase.database.ValueEventListener;
import com.sdsmdg.tastytoast.*;
import com.shashank.sony.fancytoastlib.*;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.*;
import org.json.*;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAdLoadCallback;

public class HomeActivity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	private FirebaseDatabase _firebase = FirebaseDatabase.getInstance();
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private DrawerLayout _drawer;
	private String share = "";
	private String url = "";
	private boolean boolean3 = false;
	private boolean boolean4 = false;
	private boolean boolean5 = false;
	private boolean boolean1 = false;
	private boolean boolean2 = false;
	private double drawercontrol = 0;
	private String fontname = "";
	private String typeface = "";
	private String up_version = "";
	private String package_name = "";
	private String ver = "";
	private String fontName = "";
	private String typeace = "";
	private AdManagerInterstitialAd AdManagerInterstitialAd;
	private AdManagerInterstitialAd mAdManagerInterstitialAd;
	
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
	private MaterialCardView linear16;
	private LinearLayout linear18;
	private ImageView imageview2;
	private TextView textview_eti1;
	private TextView textview_eti2;
	private LinearLayout linear20;
	private ImageView imageview4;
	private TextView textview_mtn1;
	private TextView textview_mtn2;
	private LinearLayout linear22;
	private ImageView imageview10;
	private TextView textview_earn1;
	private TextView textview_earn2;
	private LinearLayout _drawer_linear1;
	private LinearLayout _drawer_linear4;
	private LinearLayout _drawer_linear3;
	private LinearLayout _drawer_linear2;
	private LinearLayout _drawer_linear_exit;
	private ImageView _drawer_imageview1;
	private LinearLayout _drawer_linear5;
	private ImageView _drawer_close;
	private TextView _drawer_textview8;
	private LinearLayout _drawer_linear_home;
	private LinearLayout _drawer_linear_language;
	private LinearLayout _drawer_linear_share;
	private LinearLayout _drawer_linear_aboutapp;
	private LinearLayout _drawer_linear_about;
	private LinearLayout _drawer_linear_support;
	private LinearLayout _drawer_linear_rate;
	private LinearLayout _drawer_linear_other;
	private ImageView _drawer_home_img;
	private TextView _drawer_textview1;
	private ImageView _drawer_language_img;
	private TextView _drawer_textview9;
	private ImageView _drawer_share_img;
	private TextView _drawer_textview10;
	private ImageView _drawer_aboutapp_img;
	private TextView _drawer_textview2;
	private ImageView _drawer_about_img;
	private TextView _drawer_textview3;
	private ImageView _drawer_support_img;
	private TextView _drawer_textview4;
	private ImageView _drawer_rate_img;
	private TextView _drawer_textview6;
	private ImageView _drawer_other_img;
	private TextView _drawer_textview5;
	private ImageView _drawer_exit_img;
	private TextView _drawer_textview7;
	
	private TimerTask timer;
	private TimerTask t;
	private AlertDialog.Builder d;
	private Intent afggo = new Intent();
	private Intent eteggo = new Intent();
	private Intent roshanggo = new Intent();
	private Intent mtnggo = new Intent();
	private Intent salaamggo = new Intent();
	private Intent youtoube = new Intent();
	private Intent website = new Intent();
	private AlertDialog.Builder dia;
	private Intent warning = new Intent();
	private Intent earnmoneygo = new Intent();
	private Intent i = new Intent();
	private SharedPreferences rate;
	private TimerTask rate_time;
	private SharedPreferences appmode;
	private RequestNetwork net;
	private RequestNetwork.RequestListener _net_request_listener;
	private SharedPreferences targetc;
	private DatabaseReference update = _firebase.getReference("update");
	private ChildEventListener _update_child_listener;
	private Intent link = new Intent();
	private AlertDialog.Builder language;
	private SharedPreferences lan;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
        
        AdManagerInterstitialAd.load(this, "/21849154601,22903394311/Ad.Plus-APP-Interstitial", 
            new AdManagerAdRequest.Builder().build(),
            new AdManagerInterstitialAdLoadCallback() {
                @Override
                public void onAdLoaded(@NonNull AdManagerInterstitialAd interstitialAd) {
                    mAdManagerInterstitialAd = interstitialAd;
                    
                    //Toast.makeText(HomeActivity.this,"ad loaded", Toast.LENGTH_LONG).show();
                    // Ad has loaded, display the ad
        
                }

                @Override
                public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                   // Toast.makeText(HomeActivity.this, loadAdError.toString(), Toast.LENGTH_LONG).show();

                    mAdManagerInterstitialAd = null;
                }
            });
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.home);
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
		_drawer = findViewById(R.id._drawer);
		ActionBarDrawerToggle _toggle = new ActionBarDrawerToggle(HomeActivity.this, _drawer, _toolbar, R.string.app_name, R.string.app_name);
		_drawer.addDrawerListener(_toggle);
		_toggle.syncState();
		
		LinearLayout _nav_view = findViewById(R.id._nav_view);
		
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
		linear16 = findViewById(R.id.linear16);
		linear18 = findViewById(R.id.linear18);
		imageview2 = findViewById(R.id.imageview2);
		textview_eti1 = findViewById(R.id.textview_eti1);
		textview_eti2 = findViewById(R.id.textview_eti2);
		linear20 = findViewById(R.id.linear20);
		imageview4 = findViewById(R.id.imageview4);
		textview_mtn1 = findViewById(R.id.textview_mtn1);
		textview_mtn2 = findViewById(R.id.textview_mtn2);
		linear22 = findViewById(R.id.linear22);
		imageview10 = findViewById(R.id.imageview10);
		textview_earn1 = findViewById(R.id.textview_earn1);
		textview_earn2 = findViewById(R.id.textview_earn2);
		_drawer_linear1 = _nav_view.findViewById(R.id.linear1);
		_drawer_linear4 = _nav_view.findViewById(R.id.linear4);
		_drawer_linear3 = _nav_view.findViewById(R.id.linear3);
		_drawer_linear2 = _nav_view.findViewById(R.id.linear2);
		_drawer_linear_exit = _nav_view.findViewById(R.id.linear_exit);
		_drawer_imageview1 = _nav_view.findViewById(R.id.imageview1);
		_drawer_linear5 = _nav_view.findViewById(R.id.linear5);
		_drawer_close = _nav_view.findViewById(R.id.close);
		_drawer_textview8 = _nav_view.findViewById(R.id.textview8);
		_drawer_linear_home = _nav_view.findViewById(R.id.linear_home);
		_drawer_linear_language = _nav_view.findViewById(R.id.linear_language);
		_drawer_linear_share = _nav_view.findViewById(R.id.linear_share);
		_drawer_linear_aboutapp = _nav_view.findViewById(R.id.linear_aboutapp);
		_drawer_linear_about = _nav_view.findViewById(R.id.linear_about);
		_drawer_linear_support = _nav_view.findViewById(R.id.linear_support);
		_drawer_linear_rate = _nav_view.findViewById(R.id.linear_rate);
		_drawer_linear_other = _nav_view.findViewById(R.id.linear_other);
		_drawer_home_img = _nav_view.findViewById(R.id.home_img);
		_drawer_textview1 = _nav_view.findViewById(R.id.textview1);
		_drawer_language_img = _nav_view.findViewById(R.id.language_img);
		_drawer_textview9 = _nav_view.findViewById(R.id.textview9);
		_drawer_share_img = _nav_view.findViewById(R.id.share_img);
		_drawer_textview10 = _nav_view.findViewById(R.id.textview10);
		_drawer_aboutapp_img = _nav_view.findViewById(R.id.aboutapp_img);
		_drawer_textview2 = _nav_view.findViewById(R.id.textview2);
		_drawer_about_img = _nav_view.findViewById(R.id.about_img);
		_drawer_textview3 = _nav_view.findViewById(R.id.textview3);
		_drawer_support_img = _nav_view.findViewById(R.id.support_img);
		_drawer_textview4 = _nav_view.findViewById(R.id.textview4);
		_drawer_rate_img = _nav_view.findViewById(R.id.rate_img);
		_drawer_textview6 = _nav_view.findViewById(R.id.textview6);
		_drawer_other_img = _nav_view.findViewById(R.id.other_img);
		_drawer_textview5 = _nav_view.findViewById(R.id.textview5);
		_drawer_exit_img = _nav_view.findViewById(R.id.exit_img);
		_drawer_textview7 = _nav_view.findViewById(R.id.textview7);
		d = new AlertDialog.Builder(this);
		dia = new AlertDialog.Builder(this);
		rate = getSharedPreferences("rate", Activity.MODE_PRIVATE);
		appmode = getSharedPreferences("appmode", Activity.MODE_PRIVATE);
		net = new RequestNetwork(this);
		targetc = getSharedPreferences("targetc", Activity.MODE_PRIVATE);
		language = new AlertDialog.Builder(this);
		lan = getSharedPreferences("lan", Activity.MODE_PRIVATE);
        
        
        
       
        
        
        
        
        
		
		main12.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (_drawer.isDrawerOpen(GravityCompat.START)) {
					_drawer.closeDrawer(GravityCompat.START);
				}
			}
		});
		
		linear7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				afggo.setClass(getApplicationContext(), Afghan1pageActivity.class);
				startActivity(afggo);
				    if (mAdManagerInterstitialAd != null) {
					            mAdManagerInterstitialAd.show(HomeActivity.this);
					                        mAdManagerInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
						
						
						  @Override
						  public void onAdDismissedFullScreenContent() {
							    // Called when ad is dismissed.
							    // Set the ad reference to null so you don't show the ad a second time.
							    
							                    
							            
							    mAdManagerInterstitialAd = null;
							  }
						
						  @Override
						  public void onAdFailedToShowFullScreenContent(AdError adError) {
							       
							    // Called when ad fails to show.
							                    
							          
							    mAdManagerInterstitialAd = null;
							  }
						
						  @Override
						  public void onAdImpression() {
							    // Called when an impression is recorded for an ad.
							    
							                    
							        
							  }
						
						  @Override
						  public void onAdShowedFullScreenContent() {
							    // Called when ad is shown.
							    
							                    
							         
							  }
					});
				}
			}
		});
		
		linear9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				roshanggo.setClass(getApplicationContext(), Roshan1pageActivity.class);
				startActivity(roshanggo);
				    if (mAdManagerInterstitialAd != null) {
					            mAdManagerInterstitialAd.show(HomeActivity.this);
					                        mAdManagerInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
						
						
						  @Override
						  public void onAdDismissedFullScreenContent() {
							    // Called when ad is dismissed.
							    // Set the ad reference to null so you don't show the ad a second time.
							    
							                    
							            
							    mAdManagerInterstitialAd = null;
							  }
						
						  @Override
						  public void onAdFailedToShowFullScreenContent(AdError adError) {
							       
							    // Called when ad fails to show.
							                    
							          
							    mAdManagerInterstitialAd = null;
							  }
						
						  @Override
						  public void onAdImpression() {
							    // Called when an impression is recorded for an ad.
							    
							                    
							        
							  }
						
						  @Override
						  public void onAdShowedFullScreenContent() {
							    // Called when ad is shown.
							    
							                    
							         
							  }
					});
				}
			}
		});
		
		linear11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				salaamggo.setClass(getApplicationContext(), Salaam1pageActivity.class);
				startActivity(salaamggo);
				    if (mAdManagerInterstitialAd != null) {
					            mAdManagerInterstitialAd.show(HomeActivity.this);
					                        mAdManagerInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
						
						
						  @Override
						  public void onAdDismissedFullScreenContent() {
							    // Called when ad is dismissed.
							    // Set the ad reference to null so you don't show the ad a second time.
							    
							                    
							            
							    mAdManagerInterstitialAd = null;
							  }
						
						  @Override
						  public void onAdFailedToShowFullScreenContent(AdError adError) {
							       
							    // Called when ad fails to show.
							                    
							          
							    mAdManagerInterstitialAd = null;
							  }
						
						  @Override
						  public void onAdImpression() {
							    // Called when an impression is recorded for an ad.
							    
							                    
							        
							  }
						
						  @Override
						  public void onAdShowedFullScreenContent() {
							    // Called when ad is shown.
							    
							                    
							         
							  }
					});
				}
			}
		});
		
		linear8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				eteggo.setClass(getApplicationContext(), Etisalat1pageActivity.class);
				startActivity(eteggo);
				    if (mAdManagerInterstitialAd != null) {
					            mAdManagerInterstitialAd.show(HomeActivity.this);
					                        mAdManagerInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
						
						
						  @Override
						  public void onAdDismissedFullScreenContent() {
							    // Called when ad is dismissed.
							    // Set the ad reference to null so you don't show the ad a second time.
							    
							                    
							            
							    mAdManagerInterstitialAd = null;
							  }
						
						  @Override
						  public void onAdFailedToShowFullScreenContent(AdError adError) {
							       
							    // Called when ad fails to show.
							                    
							          
							    mAdManagerInterstitialAd = null;
							  }
						
						  @Override
						  public void onAdImpression() {
							    // Called when an impression is recorded for an ad.
							    
							                    
							        
							  }
						
						  @Override
						  public void onAdShowedFullScreenContent() {
							    // Called when ad is shown.
							    
							                    
							         
							  }
					});
				}
			}
		});
		
		linear10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				mtnggo.setClass(getApplicationContext(), Mtn1pageActivity.class);
				startActivity(mtnggo);
				    if (mAdManagerInterstitialAd != null) {
					            mAdManagerInterstitialAd.show(HomeActivity.this);
					                        mAdManagerInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
						
						
						  @Override
						  public void onAdDismissedFullScreenContent() {
							    // Called when ad is dismissed.
							    // Set the ad reference to null so you don't show the ad a second time.
							    
							                    
							            
							    mAdManagerInterstitialAd = null;
							  }
						
						  @Override
						  public void onAdFailedToShowFullScreenContent(AdError adError) {
							       
							    // Called when ad fails to show.
							                    
							          
							    mAdManagerInterstitialAd = null;
							  }
						
						  @Override
						  public void onAdImpression() {
							    // Called when an impression is recorded for an ad.
							    
							                    
							        
							  }
						
						  @Override
						  public void onAdShowedFullScreenContent() {
							    // Called when ad is shown.
							    
							                    
							         
							  }
					});
				}
			}
		});
		
		linear16.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				net.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "", _net_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					i.setClass(getApplicationContext(), BundleActivity.class);
					startActivity(i);
				}
				else {
					TastyToast.makeText(getApplicationContext(), "خطا در اتصال انترنت!", TastyToast.LENGTH_LONG, TastyToast.ERROR);
				}
			}
		});
		
		_net_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				
			}
			
			@Override
			public void onErrorResponse(String _param1, String _param2) {
				final String _tag = _param1;
				final String _message = _param2;
				
			}
		};
		
		_update_child_listener = new ChildEventListener() {
			@Override
			public void onChildAdded(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				if (_childKey.equals("app_update")) {
					up_version = _childValue.get("version").toString();
					if (ver.equals(up_version)) {
						
					}
					else {
						if (_childValue.get("cancel").toString().equals("yes")) {
							final AlertDialog update = new AlertDialog.Builder(HomeActivity.this).create();
							LayoutInflater inflater = getLayoutInflater();
							
							View convertView = (View) inflater.inflate(R.layout.update, null);
							update.setView(convertView);
							
							update.requestWindowFeature(Window.FEATURE_NO_TITLE);  update.getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(Color.TRANSPARENT));
							
							
							LinearLayout i_bg = (LinearLayout) convertView.findViewById(R.id.linear_bg);
							
							LinearLayout i_div = (LinearLayout) convertView.findViewById(R.id.linear_div);
							
							Button i_ok = (Button) convertView.findViewById(R.id.okay_button);
							
							Button i_cancel = (Button) convertView.findViewById(R.id.cancel_button);
							
							com.airbnb.lottie.LottieAnimationView lottei = (com.airbnb.lottie.LottieAnimationView) convertView.findViewById(R.id.lottie);
							
							TextView i_title = (TextView) convertView.findViewById(R.id.txt_title);
							
							TextView i_msg = (TextView) convertView.findViewById(R.id.txt_msg);
							
							
							i_msg.setText(_childValue.get("update_info").toString());
							update.setCancelable(false);
							i_ok.setOnClickListener(new View.OnClickListener(){
								    public void onClick(View v){
									link.setAction(Intent.ACTION_VIEW);
									link.setData(Uri.parse(_childValue.get("link").toString()));
									startActivity(link);
									update.dismiss();
								}});
							i_cancel.setOnClickListener(new View.OnClickListener(){
								    public void onClick(View v){
									update.dismiss();
								}});
							update.show();
						}
						else {
							final AlertDialog update = new AlertDialog.Builder(HomeActivity.this).create();
							LayoutInflater inflater = getLayoutInflater();
							
							View convertView = (View) inflater.inflate(R.layout.update, null);
							update.setView(convertView);
							
							update.requestWindowFeature(Window.FEATURE_NO_TITLE);  update.getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(Color.TRANSPARENT));
							
							
							LinearLayout i_bg = (LinearLayout) convertView.findViewById(R.id.linear_bg);
							
							LinearLayout i_div = (LinearLayout) convertView.findViewById(R.id.linear_div);
							
							Button i_ok = (Button) convertView.findViewById(R.id.okay_button);
							
							Button i_cancel = (Button) convertView.findViewById(R.id.cancel_button);
							
							com.airbnb.lottie.LottieAnimationView lottei = (com.airbnb.lottie.LottieAnimationView) convertView.findViewById(R.id.lottie);
							
							TextView i_title = (TextView) convertView.findViewById(R.id.txt_title);
							
							TextView i_msg = (TextView) convertView.findViewById(R.id.txt_msg);
							
							
							i_msg.setText(_childValue.get("update_info").toString());
							update.setCancelable(false);
							i_cancel.setVisibility(View.GONE);
							i_div.setVisibility(View.GONE);
							i_ok.setOnClickListener(new View.OnClickListener(){
								    public void onClick(View v){
									update.dismiss();
									link.setAction(Intent.ACTION_VIEW);
									link.setData(Uri.parse(_childValue.get("link").toString()));
									startActivity(link);
								}});
							i_cancel.setOnClickListener(new View.OnClickListener(){
								    public void onClick(View v){
									
									link.setAction(Intent.ACTION_VIEW);
									link.setData(Uri.parse(_childValue.get("link").toString()));
									startActivity(link);
								}});
							update.show();
						}
					}
				}
				else {
					
				}
			}
			
			@Override
			public void onChildChanged(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				if (_childKey.equals("app_update")) {
					up_version = _childValue.get("version").toString();
					if (ver.equals(up_version)) {
						
					}
					else {
						if (_childValue.get("cancel").toString().equals("yes")) {
							final AlertDialog update = new AlertDialog.Builder(HomeActivity.this).create();
							LayoutInflater inflater = getLayoutInflater();
							
							View convertView = (View) inflater.inflate(R.layout.update, null);
							update.setView(convertView);
							
							update.requestWindowFeature(Window.FEATURE_NO_TITLE);  update.getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(Color.TRANSPARENT));
							
							
							LinearLayout i_bg = (LinearLayout) convertView.findViewById(R.id.linear_bg);
							
							LinearLayout i_div = (LinearLayout) convertView.findViewById(R.id.linear_div);
							
							Button i_ok = (Button) convertView.findViewById(R.id.okay_button);
							
							Button i_cancel = (Button) convertView.findViewById(R.id.cancel_button);
							
							com.airbnb.lottie.LottieAnimationView lottei = (com.airbnb.lottie.LottieAnimationView) convertView.findViewById(R.id.lottie);
							
							TextView i_title = (TextView) convertView.findViewById(R.id.txt_title);
							
							TextView i_msg = (TextView) convertView.findViewById(R.id.txt_msg);
							
							
							i_msg.setText(_childValue.get("update_info").toString());
							update.setCancelable(false);
							i_ok.setOnClickListener(new View.OnClickListener(){
								    public void onClick(View v){
									link.setAction(Intent.ACTION_VIEW);
									link.setData(Uri.parse(_childValue.get("link").toString()));
									startActivity(link);
									update.dismiss();
								}});
							i_cancel.setOnClickListener(new View.OnClickListener(){
								    public void onClick(View v){
									update.dismiss();
								}});
							update.show();
						}
						else {
							final AlertDialog update = new AlertDialog.Builder(HomeActivity.this).create();
							LayoutInflater inflater = getLayoutInflater();
							
							View convertView = (View) inflater.inflate(R.layout.update, null);
							update.setView(convertView);
							
							update.requestWindowFeature(Window.FEATURE_NO_TITLE);  update.getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(Color.TRANSPARENT));
							
							
							LinearLayout i_bg = (LinearLayout) convertView.findViewById(R.id.linear_bg);
							
							LinearLayout i_div = (LinearLayout) convertView.findViewById(R.id.linear_div);
							
							Button i_ok = (Button) convertView.findViewById(R.id.okay_button);
							
							Button i_cancel = (Button) convertView.findViewById(R.id.cancel_button);
							
							com.airbnb.lottie.LottieAnimationView lottei = (com.airbnb.lottie.LottieAnimationView) convertView.findViewById(R.id.lottie);
							
							TextView i_title = (TextView) convertView.findViewById(R.id.txt_title);
							
							TextView i_msg = (TextView) convertView.findViewById(R.id.txt_msg);
							
							
							i_msg.setText(_childValue.get("update_info").toString());
							update.setCancelable(false);
							i_cancel.setVisibility(View.GONE);
							i_div.setVisibility(View.GONE);
							i_ok.setOnClickListener(new View.OnClickListener(){
								    public void onClick(View v){
									update.dismiss();
									link.setAction(Intent.ACTION_VIEW);
									link.setData(Uri.parse(_childValue.get("link").toString()));
									startActivity(link);
								}});
							i_cancel.setOnClickListener(new View.OnClickListener(){
								    public void onClick(View v){
									
									link.setAction(Intent.ACTION_VIEW);
									link.setData(Uri.parse(_childValue.get("link").toString()));
									startActivity(link);
								}});
							update.show();
						}
					}
				}
				else {
					
				}
			}
			
			@Override
			public void onChildMoved(DataSnapshot _param1, String _param2) {
				
			}
			
			@Override
			public void onChildRemoved(DataSnapshot _param1) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onCancelled(DatabaseError _param1) {
				final int _errorCode = _param1.getCode();
				final String _errorMessage = _param1.getMessage();
				
			}
		};
		update.addChildEventListener(_update_child_listener);
		
		_drawer_linear_exit.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				finishAffinity();
			}
		});
		
		_drawer_close.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_drawer.closeDrawer(GravityCompat.START);
			}
		});
		
		_drawer_linear_home.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_drawer.closeDrawer(GravityCompat.START);
			}
		});
		
		_drawer_linear_language.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (lan.getString("lan", "").equals("fa")) {
					language.setTitle("زبان");
					language.setMessage("تغییر زبان برنامه");
					language.setPositiveButton("English", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							lan.edit().putString("lan", "en").commit();
							_setLocale("en");
							recreate();
						}
					});
					language.setNegativeButton("فارسی", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							lan.edit().putString("lan", "fa").commit();
							_setLocale("fa");
							recreate();
							_drawer.closeDrawer(GravityCompat.START);
						}
					});
					language.create().show();
				}
				else {
					language.setTitle("Language");
					language.setMessage("Select app language ");
					language.setPositiveButton("English", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							lan.edit().putString("lan", "en").commit();
							_setLocale("en");
							recreate();
							_drawer.closeDrawer(GravityCompat.START);
						}
					});
					language.setNegativeButton("فارسی", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							lan.edit().putString("lan", "fa").commit();
							_setLocale("fa");
							recreate();
						}
					});
					language.create().show();
				}
			}
		});
		
		_drawer_linear_share.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				share = "if you want to activate or deactivate any bundle of Afghanistan Sim cards then download this amazing application 👇👇👇 \nhttps://play.google.com/store/apps/details?id=com.afghanistan.simcards";
				Intent i = new Intent(android.content.Intent.ACTION_SEND);i.setType("text/plain"); i.putExtra(android.content.Intent.EXTRA_TEXT,share); startActivity(Intent.createChooser(i,"share using"));
			}
		});
		
		_drawer_linear_aboutapp.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				earnmoneygo.setClass(getApplicationContext(), AboutActivity.class);
				startActivity(earnmoneygo);
			}
		});
		
		_drawer_linear_about.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				link.setAction(Intent.ACTION_VIEW);
				link.setData(Uri.parse("https://youtube.com/@MohammadAzizi"));
				startActivity(link);
			}
		});
		
		_drawer_linear_support.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				link.setAction(Intent.ACTION_VIEW);
				link.setData(Uri.parse("https://t.me/AFG_Simcards"));
				startActivity(link);
			}
		});
		
		_drawer_linear_rate.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_rate_();
			}
		});
		
		_drawer_linear_other.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				link.setAction(Intent.ACTION_VIEW);
				link.setData(Uri.parse("https://play.google.com/store/apps/developer?id=Mohammad+Azizi"));
				startActivity(link);
			}
		});
	}
	
	private void initializeLogic() {
		_Drawer_Ui();
		package_name = "com.afghanistan.simcards";
		try {
			android.content.pm.PackageInfo pinfo = getPackageManager().getPackageInfo(package_name, android.content.pm.PackageManager.GET_ACTIVITIES);
			ver = pinfo.versionName; }
		catch (Exception e){ showMessage(e.toString()); }
		if (getApplicationContext().getPackageName().equals("com.afghanistan.simcards")) {
				 
		}
		else {
				TastyToast.makeText(getApplicationContext(), "برنامه دست کاری شده!!", TastyToast.LENGTH_LONG, TastyToast.ERROR);
			finishAffinity();
		}
		if (rate.getString("ratee", "").equals("")) {
			rate.edit().putString("ratee", "ready1").commit();
            
           // View customView = getLayoutInflater().inflate(R.layout.reset_customdialog, null);
            

            MaterialAlertDialogBuilder builder = new MaterialAlertDialogBuilder(HomeActivity.this)
                    .setTitle("گروه تلگرام")
                    .setIcon(R.drawable.telegram)
                    .setMessage("لطفاً در گروه تلگرام ما عضو شوید")
                    
                    .setPositiveButton("عضو شدن", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                
            link.setAction(Intent.ACTION_VIEW);
				link.setData(Uri.parse("https://t.me/AFG_Simcards"));
				startActivity(link);
            
                        }
                    })
                    .setNegativeButton("نه خیر", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            // Cancel button clicked
                        }
                    });

            builder.show();
            
		}
		else {
			if (rate.getString("ratee", "").equals("ready1")) {
				_rate_();
				rate.edit().putString("ratee", "done1").commit();
			}
			else {
				
			}
		}
	}
	
	
	@Override
	public void onBackPressed() {
		if (_drawer.isDrawerOpen(GravityCompat.START)) {
			_drawer.closeDrawer(GravityCompat.START);
		} else {
			super.onBackPressed();
		}
	}
	public void _exit(final View _view, final String _focus, final String _pressed, final double _round, final double _stroke, final String _strokeclr) {
		android.graphics.drawable.GradientDrawable GG = new android.graphics.drawable.GradientDrawable();
		GG.setColor(Color.parseColor(_focus));
		
		
		
		GG.setCornerRadii(new float[] { 0, 0, 100, 100, 100, 100, 0, 0 }); //LeftTop, //RightTop, //RightBottom, //LeftBottom,
		
		
		
		GG.setStroke((int) _stroke,
		Color.parseColor("#" + _strokeclr.replace("#", "")));
		android.graphics.drawable.RippleDrawable RE = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{ Color.parseColor(_pressed)}), GG, null);
		_view.setBackground(RE);
	}
	
	
	public void _RippleEffects(final String _color, final View _view) {
		android.content.res.ColorStateList clr = new android.content.res.ColorStateList(new int[][]{new int[]{}},new int[]{Color.parseColor(_color)});
		android.graphics.drawable.RippleDrawable ripdr = new android.graphics.drawable.RippleDrawable(clr, null, null);
		_view.setBackground(ripdr);
	}
	
	
	public void _ICC(final ImageView _img, final String _c1, final String _c2) {
		_img.setImageTintList(new android.content.res.ColorStateList(new int[][] {{-android.R.attr.state_pressed},{android.R.attr.state_pressed}},new int[]{Color.parseColor(_c1), Color.parseColor(_c2)}));
	}
	
	
	public void _RadiusGradient4(final View _view, final String _color1, final String _color2, final double _lt, final double _rt, final double _rb, final double _lb, final double _border, final String _color3) {
		int[] colors = { Color.parseColor(_color1), Color.parseColor(_color2) }; android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, colors);
		gd.setCornerRadii(new float[]{(int)_lt,(int)_lt,(int)_rt,(int)_rt,(int)_rb,(int)_rb,(int)_lb,(int)_lb});
		gd.setStroke((int) _border, Color.parseColor(_color3));
		_view.setBackground(gd);
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
	
	
	public void _Drawer_Ui() {
		final LinearLayout _nav_view = (LinearLayout) findViewById(R.id._nav_view); _nav_view.setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(Color.TRANSPARENT));
		_RadiusGradient4(_drawer_linear1, "#ffffff", "#ffffff", 0, 100, 100, 0, 0, "#ffffff");
		//close
		_ICC(_drawer_close, "#FF344955", "#757575");
		_RippleEffects("#e0e0e0", _drawer_close);
		//Home
		_ICC(_drawer_home_img, "#ffffff", "#FFF9AA33");
		_RippleEffects("#e0e0e0", _drawer_home_img);
		_rippleRoundStroke(_drawer_linear_home, "#FF344955", "#FFF9AA33", 15, 0, "#ffffff");
		//About app
		_ICC(_drawer_aboutapp_img, "#FF4A6572", "#FFF9AA33");
		_RippleEffects("#e0e0e0", _drawer_aboutapp_img);
		_rippleRoundStroke(_drawer_linear_aboutapp, "#f5f5f5", "#FFF9AA33", 15, 0, "#ffffff");
		//About us
		_ICC(_drawer_about_img, "#FF4A6572", "#FFF9AA33");
		_RippleEffects("#e0e0e0", _drawer_about_img);
		_rippleRoundStroke(_drawer_linear_about, "#f5f5f5", "#FFF9AA33", 15, 0, "#ffffff");
		//Dontate
		_ICC(_drawer_support_img, "#FF4A6572", "#FFF9AA33");
		_RippleEffects("#e0e0e0", _drawer_support_img);
		_rippleRoundStroke(_drawer_linear_support, "#f5f5f5", "#FFF9AA33", 15, 0, "#ffffff");
		//Other
		_ICC(_drawer_other_img, "#FF4A6572", "#FFF9AA33");
		_RippleEffects("#e0e0e0", _drawer_other_img);
		_rippleRoundStroke(_drawer_linear_other, "#f5f5f5", "#FFF9AA33", 15, 0, "#ffffff");
		//Rate
		_ICC(_drawer_rate_img, "#FF4A6572", "#FFF9AA33");
		_RippleEffects("#e0e0e0", _drawer_rate_img);
		_rippleRoundStroke(_drawer_linear_rate, "#f5f5f5", "#FFF9AA33", 15, 0, "#ffffff");
		//Exit
		_ICC(_drawer_exit_img, "#CBD0DA", "#FFF9AA33");
		_RippleEffects("#e0e0e0", _drawer_exit_img);
		_exit(_drawer_linear_exit, "#FF344955", "#FFF9AA33", 0, 0, "#ffffff");
		//share
		_ICC(_drawer_share_img, "#FF4A6572", "#FFF9AA33");
		_RippleEffects("#e0e0e0", _drawer_share_img);
		_rippleRoundStroke(_drawer_linear_share, "#f5f5f5", "#FFF9AA33", 15, 0, "#ffffff");
		//language 
		_ICC(_drawer_language_img, "#FF4A6572", "#FFF9AA33");
		_RippleEffects("#e0e0e0", _drawer_language_img);
		_rippleRoundStroke(_drawer_linear_language, "#f5f5f5", "#FFF9AA33", 15, 0, "#ffffff");
	}
	
	
	public void _rate_() {
		if (lan.getString("lan", "").equals("fa")) {
			final AlertDialog dialog1 = new AlertDialog.Builder(HomeActivity.this).create();
			LayoutInflater dialog1LI = getLayoutInflater();
			View dialog1CV = (View) dialog1LI.inflate(R.layout.cust, null);
			dialog1.setView(dialog1CV);
			final ImageView im1 = (ImageView)
			dialog1CV.findViewById(R.id.im1);
			final ImageView im2 = (ImageView)
			dialog1CV.findViewById(R.id.im2);
			final ImageView im3 = (ImageView)
			dialog1CV.findViewById(R.id.im3);
			final ImageView im4 = (ImageView)
			dialog1CV.findViewById(R.id.im4);
			final EditText edit = (EditText)
			dialog1CV.findViewById(R.id.edit);
			final ImageView im5 = (ImageView)
			dialog1CV.findViewById(R.id.im5);
			final TextView text_info = (TextView)
			dialog1CV.findViewById(R.id.text_info);
			final Button mbutton = (Button)
			dialog1CV.findViewById(R.id.mbutton);
			dialog1.setCancelable(true);
			dialog1.show();
			edit.setVisibility(View.GONE);
			text_info.setText("نظرات شما به ما کمک می کند تا بهتر عمل کنیم");
			mbutton.setEnabled(false);
			mbutton.setText("تایید");
			edit.setHint("لطفاً نظرات خود را بنویسید!");
			im1.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View _view) {
							text_info.setText("اوه! این تجربه ی نبود که ما منتظرش بودیم... لطفاً در مورد چیزی که میتوانیم بهبود ببخشیم برای ما بگویید؟");
							text_info.setTextColor(0xFF000000);
							im1.setImageResource(R.drawable.ba9);
							im2.setImageResource(R.drawable.baf);
							im3.setImageResource(R.drawable.bag);
							im4.setImageResource(R.drawable.bah);
							im5.setImageResource(R.drawable.bai);
							boolean1 = true;
							boolean2 = false;
							boolean3 = false;
							boolean4 = false;
							boolean5 = false;
							edit.setVisibility(View.VISIBLE);
							mbutton.setEnabled(true);
					}
			});
			im2.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View _view) {
							text_info.setText("اوه! میتوانید در مورد چیز که میتوانیم بهبود بخشیم بیشتر برای ما بگویید؟");
							im1.setImageResource(R.drawable.ba_);
							im2.setImageResource(R.drawable.ba_);
							im3.setImageResource(R.drawable.bag);
							im4.setImageResource(R.drawable.bah);
							im5.setImageResource(R.drawable.bai);
							boolean1 = false;
							boolean2 = true;
							boolean3 = false;
							boolean4 = false;
							boolean5 = false;
							edit.setVisibility(View.VISIBLE);
							mbutton.setEnabled(true);
					}
			});
			im3.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View _view) {
							text_info.setText("از اینکه نظر خود را عنوان کردید متشکرم ، آیا چیز خاصی وجود دارد که فکر می کنید می توانیم بهبود بخشیم ؟");
							im1.setImageResource(R.drawable.baa);
							im2.setImageResource(R.drawable.baa);
							im3.setImageResource(R.drawable.baa);
							im4.setImageResource(R.drawable.bah);
							im5.setImageResource(R.drawable.bai);
							boolean1 = false;
							boolean2 = false;
							boolean3 = true;
							boolean4 = false;
							boolean5 = false;
							edit.setVisibility(View.VISIBLE);
							mbutton.setEnabled(true);
					}
			});
			im4.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View _view) {
							text_info.setText("متشکریم ! نظر شما موجب پیشرفت و اصلاح ما می شود . می خواهید به ما امتیاز 5 بدهید ؟");
							im1.setImageResource(R.drawable.bab);
							im2.setImageResource(R.drawable.bab);
							im3.setImageResource(R.drawable.bab);
							im4.setImageResource(R.drawable.bab);
							im5.setImageResource(R.drawable.bai);
							boolean1 = false;
							boolean2 = false;
							boolean3 = false;
							boolean4 = true;
							boolean5 = false;
							mbutton.setEnabled(true);
							edit.setVisibility(View.GONE);
					}
			});
			im5.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View _view) {
							text_info.setText("متشکریم ! نظر فوق العاده شما باعث شد روز خوبی داشته باشیم ! لطفا در پلی استور به ما امتیاز بدهید .");
							im1.setImageResource(R.drawable.bac);
							im2.setImageResource(R.drawable.bac);
							im3.setImageResource(R.drawable.bac);
							im4.setImageResource(R.drawable.bac);
							im5.setImageResource(R.drawable.bac);
							boolean1 = false;
							boolean2 = false;
							boolean3 = false;
							boolean4 = false;
							boolean5 = true;
							mbutton.setEnabled(true);
							edit.setVisibility(View.GONE);
					}
			});
			mbutton.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View _view) {
							if (boolean1) {
									dialog1.dismiss();
									if (edit.getText().toString().equals("")) {
											TastyToast.makeText(getApplicationContext(), "شما هیچ کلمه را وارد نه کرده اید!", TastyToast.LENGTH_LONG, TastyToast.INFO);
									}
									else {
											Intent intent = new Intent(Intent.ACTION_SENDTO); intent.setData(Uri.parse("mailto:")); intent.putExtra(Intent.EXTRA_EMAIL , new String[] { "app.issues12@gmail.com" }); intent.putExtra(Intent.EXTRA_SUBJECT, "AFG Simcards");
											intent.putExtra(Intent.EXTRA_TEXT, edit.getText().toString()); startActivity(Intent.createChooser(intent, "Email via..."));
									}
							}
							else {
									if (boolean2) {
											dialog1.dismiss();
											if (edit.getText().toString().equals("")) {
													TastyToast.makeText(getApplicationContext(), "شما هیچ کلمه را وارد نه کرده اید!", TastyToast.LENGTH_LONG, TastyToast.INFO);
											}
											else {
													Intent intent = new Intent(Intent.ACTION_SENDTO); intent.setData(Uri.parse("mailto:")); intent.putExtra(Intent.EXTRA_EMAIL , new String[] { "app.issues12@gmail.com" }); intent.putExtra(Intent.EXTRA_SUBJECT, "AFG Simcards");
													intent.putExtra(Intent.EXTRA_TEXT, edit.getText().toString()); startActivity(Intent.createChooser(intent, "Email via..."));
											}
									}
									else {
											if (boolean3) {
													dialog1.dismiss();
													if (edit.getText().toString().equals("")) {
															TastyToast.makeText(getApplicationContext(), "شما هیچ کلمه را وارد نه کرده اید!", TastyToast.LENGTH_LONG, TastyToast.INFO);
													}
													else {
															Intent intent = new Intent(Intent.ACTION_SENDTO); intent.setData(Uri.parse("mailto:")); intent.putExtra(Intent.EXTRA_EMAIL , new String[] { "app.issues12@gmail.com" }); intent.putExtra(Intent.EXTRA_SUBJECT, "AFG Simcards");
															intent.putExtra(Intent.EXTRA_TEXT, edit.getText().toString()); startActivity(Intent.createChooser(intent, "Email via..."));
													}
											}
											else {
													if (boolean4) {
															dialog1.dismiss();
															TastyToast.makeText(getApplicationContext(), "تشکر از حمایت شما!", TastyToast.LENGTH_LONG, TastyToast.SUCCESS);
													}
													else {
															if (boolean5) {
																	website.setAction(Intent.ACTION_VIEW);
																	website.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.afghanistan.simcards"));
																	startActivity(website);
																	dialog1.dismiss();
															}
															else {
																	
															}
													}
											}
									}
							}
					}
			});
		}
		else {
			final AlertDialog dialog1 = new AlertDialog.Builder(HomeActivity.this).create();
			LayoutInflater dialog1LI = getLayoutInflater();
			View dialog1CV = (View) dialog1LI.inflate(R.layout.cust, null);
			dialog1.setView(dialog1CV);
			final ImageView im1 = (ImageView)
			dialog1CV.findViewById(R.id.im1);
			final ImageView im2 = (ImageView)
			dialog1CV.findViewById(R.id.im2);
			final ImageView im3 = (ImageView)
			dialog1CV.findViewById(R.id.im3);
			final ImageView im4 = (ImageView)
			dialog1CV.findViewById(R.id.im4);
			final EditText edit = (EditText)
			dialog1CV.findViewById(R.id.edit);
			final ImageView im5 = (ImageView)
			dialog1CV.findViewById(R.id.im5);
			final TextView text_info = (TextView)
			dialog1CV.findViewById(R.id.text_info);
			final Button mbutton = (Button)
			dialog1CV.findViewById(R.id.mbutton);
			dialog1.setCancelable(true);
			dialog1.show();
			edit.setVisibility(View.GONE);
			text_info.setText("Your feedback help us to do better");
			mbutton.setEnabled(false);
			mbutton.setText("OK");
			edit.setHint("Please write your feedback!");
			im1.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View _view) {
							text_info.setText("Oh!  This was not the experience we were expecting... Please tell us about something we can improve?");
							text_info.setTextColor(0xFF000000);
							im1.setImageResource(R.drawable.ba9);
							im2.setImageResource(R.drawable.baf);
							im3.setImageResource(R.drawable.bag);
							im4.setImageResource(R.drawable.bah);
							im5.setImageResource(R.drawable.bai);
							boolean1 = true;
							boolean2 = false;
							boolean3 = false;
							boolean4 = false;
							boolean5 = false;
							edit.setVisibility(View.VISIBLE);
							mbutton.setEnabled(true);
					}
			});
			im2.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View _view) {
							text_info.setText("Oh!  Can you tell us more about what we can improve?");
							im1.setImageResource(R.drawable.ba_);
							im2.setImageResource(R.drawable.ba_);
							im3.setImageResource(R.drawable.bag);
							im4.setImageResource(R.drawable.bah);
							im5.setImageResource(R.drawable.bai);
							boolean1 = false;
							boolean2 = true;
							boolean3 = false;
							boolean4 = false;
							boolean5 = false;
							edit.setVisibility(View.VISIBLE);
							mbutton.setEnabled(true);
					}
			});
			im3.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View _view) {
							text_info.setText("Thanks for your feedback, is there anything in particular you think we can improve?");
							im1.setImageResource(R.drawable.baa);
							im2.setImageResource(R.drawable.baa);
							im3.setImageResource(R.drawable.baa);
							im4.setImageResource(R.drawable.bah);
							im5.setImageResource(R.drawable.bai);
							boolean1 = false;
							boolean2 = false;
							boolean3 = true;
							boolean4 = false;
							boolean5 = false;
							edit.setVisibility(View.VISIBLE);
							mbutton.setEnabled(true);
					}
			});
			im4.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View _view) {
							text_info.setText("Thank you!  Your opinion will make us improve .  Do you want to give us 5 star?");
							im1.setImageResource(R.drawable.bab);
							im2.setImageResource(R.drawable.bab);
							im3.setImageResource(R.drawable.bab);
							im4.setImageResource(R.drawable.bab);
							im5.setImageResource(R.drawable.bai);
							boolean1 = false;
							boolean2 = false;
							boolean3 = false;
							boolean4 = true;
							boolean5 = false;
							mbutton.setEnabled(true);
							edit.setVisibility(View.GONE);
					}
			});
			im5.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View _view) {
							text_info.setText("Thank you!  Your wonderful feedback made us have a good day!  Please rate us on Play Store .");
							im1.setImageResource(R.drawable.bac);
							im2.setImageResource(R.drawable.bac);
							im3.setImageResource(R.drawable.bac);
							im4.setImageResource(R.drawable.bac);
							im5.setImageResource(R.drawable.bac);
							boolean1 = false;
							boolean2 = false;
							boolean3 = false;
							boolean4 = false;
							boolean5 = true;
							mbutton.setEnabled(true);
							edit.setVisibility(View.GONE);
					}
			});
			mbutton.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View _view) {
							if (boolean1) {
									dialog1.dismiss();
									if (edit.getText().toString().equals("")) {
											TastyToast.makeText(getApplicationContext(), "you haven't entered anything!", TastyToast.LENGTH_LONG, TastyToast.INFO);
									}
									else {
											Intent intent = new Intent(Intent.ACTION_SENDTO); intent.setData(Uri.parse("mailto:")); intent.putExtra(Intent.EXTRA_EMAIL , new String[] { "app.issues12@gmail.com" }); intent.putExtra(Intent.EXTRA_SUBJECT, "AFG Simcards");
											intent.putExtra(Intent.EXTRA_TEXT, edit.getText().toString()); startActivity(Intent.createChooser(intent, "Email via..."));
									}
							}
							else {
									if (boolean2) {
											dialog1.dismiss();
											if (edit.getText().toString().equals("")) {
													TastyToast.makeText(getApplicationContext(), "you haven't entered anything !", TastyToast.LENGTH_LONG, TastyToast.INFO);
											}
											else {
													Intent intent = new Intent(Intent.ACTION_SENDTO); intent.setData(Uri.parse("mailto:")); intent.putExtra(Intent.EXTRA_EMAIL , new String[] { "app.issues12@gmail.com" }); intent.putExtra(Intent.EXTRA_SUBJECT, "AFG Simcards");
													intent.putExtra(Intent.EXTRA_TEXT, edit.getText().toString()); startActivity(Intent.createChooser(intent, "Email via..."));
											}
									}
									else {
											if (boolean3) {
													dialog1.dismiss();
													if (edit.getText().toString().equals("")) {
															TastyToast.makeText(getApplicationContext(), "you haven't entered anything !", TastyToast.LENGTH_LONG, TastyToast.INFO);
													}
													else {
															Intent intent = new Intent(Intent.ACTION_SENDTO); intent.setData(Uri.parse("mailto:")); intent.putExtra(Intent.EXTRA_EMAIL , new String[] { "app.issues12@gmail.com" }); intent.putExtra(Intent.EXTRA_SUBJECT, "AFG Simcards");
															intent.putExtra(Intent.EXTRA_TEXT, edit.getText().toString()); startActivity(Intent.createChooser(intent, "Email via..."));
													}
											}
											else {
													if (boolean4) {
															dialog1.dismiss();
															TastyToast.makeText(getApplicationContext(),"Thank you🌷!", TastyToast.LENGTH_LONG, TastyToast.SUCCESS);
													}
													else {
															if (boolean5) {
																	website.setAction(Intent.ACTION_VIEW);
																	website.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.afghanistan.simcards"));
																	startActivity(website);
																	dialog1.dismiss();
															}
															else {
																	
															}
													}
											}
									}
							}
					}
			});
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
	
	
	public void _setLocale(final String _lan) {
		Locale locale = new Locale(_lan);
		            Configuration config = getResources().getConfiguration();
		            config.setLocale(locale);
		            getResources().updateConfiguration(config, getResources().getDisplayMetrics());
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