// Generated by view binder compiler. Do not edit!
package com.afghanistan.simcards.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.afghanistan.simcards.R;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class SallcallBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final AppBarLayout AppBar;

  @NonNull
  public final CoordinatorLayout Coordinator;

  @NonNull
  public final Toolbar Toolbar;

  @NonNull
  public final LinearLayout base;

  @NonNull
  public final LinearLayout layout1;

  @NonNull
  public final LinearLayout layout2;

  @NonNull
  public final LinearLayout layout3;

  @NonNull
  public final LinearLayout layout4;

  @NonNull
  public final LinearLayout layout5;

  @NonNull
  public final LinearLayout linear1;

  @NonNull
  public final LinearLayout linear4;

  @NonNull
  public final LinearLayout linear482;

  @NonNull
  public final LinearLayout linear483;

  @NonNull
  public final LinearLayout linear484;

  @NonNull
  public final LinearLayout linear485;

  @NonNull
  public final RecyclerView recyclerview1;

  @NonNull
  public final RecyclerView recyclerview2;

  @NonNull
  public final RecyclerView recyclerview3;

  @NonNull
  public final RecyclerView recyclerview4;

  @NonNull
  public final RecyclerView recyclerview5;

  @NonNull
  public final LinearLayout tablayout;

  @NonNull
  public final LinearLayout trash;

  private SallcallBinding(@NonNull CoordinatorLayout rootView, @NonNull AppBarLayout AppBar,
      @NonNull CoordinatorLayout Coordinator, @NonNull Toolbar Toolbar, @NonNull LinearLayout base,
      @NonNull LinearLayout layout1, @NonNull LinearLayout layout2, @NonNull LinearLayout layout3,
      @NonNull LinearLayout layout4, @NonNull LinearLayout layout5, @NonNull LinearLayout linear1,
      @NonNull LinearLayout linear4, @NonNull LinearLayout linear482,
      @NonNull LinearLayout linear483, @NonNull LinearLayout linear484,
      @NonNull LinearLayout linear485, @NonNull RecyclerView recyclerview1,
      @NonNull RecyclerView recyclerview2, @NonNull RecyclerView recyclerview3,
      @NonNull RecyclerView recyclerview4, @NonNull RecyclerView recyclerview5,
      @NonNull LinearLayout tablayout, @NonNull LinearLayout trash) {
    this.rootView = rootView;
    this.AppBar = AppBar;
    this.Coordinator = Coordinator;
    this.Toolbar = Toolbar;
    this.base = base;
    this.layout1 = layout1;
    this.layout2 = layout2;
    this.layout3 = layout3;
    this.layout4 = layout4;
    this.layout5 = layout5;
    this.linear1 = linear1;
    this.linear4 = linear4;
    this.linear482 = linear482;
    this.linear483 = linear483;
    this.linear484 = linear484;
    this.linear485 = linear485;
    this.recyclerview1 = recyclerview1;
    this.recyclerview2 = recyclerview2;
    this.recyclerview3 = recyclerview3;
    this.recyclerview4 = recyclerview4;
    this.recyclerview5 = recyclerview5;
    this.tablayout = tablayout;
    this.trash = trash;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static SallcallBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static SallcallBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.sallcall, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static SallcallBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id._app_bar;
      AppBarLayout AppBar = ViewBindings.findChildViewById(rootView, id);
      if (AppBar == null) {
        break missingId;
      }

      CoordinatorLayout Coordinator = (CoordinatorLayout) rootView;

      id = R.id._toolbar;
      Toolbar Toolbar = ViewBindings.findChildViewById(rootView, id);
      if (Toolbar == null) {
        break missingId;
      }

      id = R.id.base;
      LinearLayout base = ViewBindings.findChildViewById(rootView, id);
      if (base == null) {
        break missingId;
      }

      id = R.id.layout1;
      LinearLayout layout1 = ViewBindings.findChildViewById(rootView, id);
      if (layout1 == null) {
        break missingId;
      }

      id = R.id.layout2;
      LinearLayout layout2 = ViewBindings.findChildViewById(rootView, id);
      if (layout2 == null) {
        break missingId;
      }

      id = R.id.layout3;
      LinearLayout layout3 = ViewBindings.findChildViewById(rootView, id);
      if (layout3 == null) {
        break missingId;
      }

      id = R.id.layout4;
      LinearLayout layout4 = ViewBindings.findChildViewById(rootView, id);
      if (layout4 == null) {
        break missingId;
      }

      id = R.id.layout5;
      LinearLayout layout5 = ViewBindings.findChildViewById(rootView, id);
      if (layout5 == null) {
        break missingId;
      }

      id = R.id.linear1;
      LinearLayout linear1 = ViewBindings.findChildViewById(rootView, id);
      if (linear1 == null) {
        break missingId;
      }

      id = R.id.linear4;
      LinearLayout linear4 = ViewBindings.findChildViewById(rootView, id);
      if (linear4 == null) {
        break missingId;
      }

      id = R.id.linear482;
      LinearLayout linear482 = ViewBindings.findChildViewById(rootView, id);
      if (linear482 == null) {
        break missingId;
      }

      id = R.id.linear483;
      LinearLayout linear483 = ViewBindings.findChildViewById(rootView, id);
      if (linear483 == null) {
        break missingId;
      }

      id = R.id.linear484;
      LinearLayout linear484 = ViewBindings.findChildViewById(rootView, id);
      if (linear484 == null) {
        break missingId;
      }

      id = R.id.linear485;
      LinearLayout linear485 = ViewBindings.findChildViewById(rootView, id);
      if (linear485 == null) {
        break missingId;
      }

      id = R.id.recyclerview1;
      RecyclerView recyclerview1 = ViewBindings.findChildViewById(rootView, id);
      if (recyclerview1 == null) {
        break missingId;
      }

      id = R.id.recyclerview2;
      RecyclerView recyclerview2 = ViewBindings.findChildViewById(rootView, id);
      if (recyclerview2 == null) {
        break missingId;
      }

      id = R.id.recyclerview3;
      RecyclerView recyclerview3 = ViewBindings.findChildViewById(rootView, id);
      if (recyclerview3 == null) {
        break missingId;
      }

      id = R.id.recyclerview4;
      RecyclerView recyclerview4 = ViewBindings.findChildViewById(rootView, id);
      if (recyclerview4 == null) {
        break missingId;
      }

      id = R.id.recyclerview5;
      RecyclerView recyclerview5 = ViewBindings.findChildViewById(rootView, id);
      if (recyclerview5 == null) {
        break missingId;
      }

      id = R.id.tablayout;
      LinearLayout tablayout = ViewBindings.findChildViewById(rootView, id);
      if (tablayout == null) {
        break missingId;
      }

      id = R.id.trash;
      LinearLayout trash = ViewBindings.findChildViewById(rootView, id);
      if (trash == null) {
        break missingId;
      }

      return new SallcallBinding((CoordinatorLayout) rootView, AppBar, Coordinator, Toolbar, base,
          layout1, layout2, layout3, layout4, layout5, linear1, linear4, linear482, linear483,
          linear484, linear485, recyclerview1, recyclerview2, recyclerview3, recyclerview4,
          recyclerview5, tablayout, trash);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
