// Generated by view binder compiler. Do not edit!
package com.afghanistan.simcards.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.afghanistan.simcards.R;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class SalinterBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final AppBarLayout AppBar;

  @NonNull
  public final CoordinatorLayout Coordinator;

  @NonNull
  public final Toolbar Toolbar;

  @NonNull
  public final LinearLayout linear1;

  @NonNull
  public final ScrollView vscroll1;

  private SalinterBinding(@NonNull CoordinatorLayout rootView, @NonNull AppBarLayout AppBar,
      @NonNull CoordinatorLayout Coordinator, @NonNull Toolbar Toolbar,
      @NonNull LinearLayout linear1, @NonNull ScrollView vscroll1) {
    this.rootView = rootView;
    this.AppBar = AppBar;
    this.Coordinator = Coordinator;
    this.Toolbar = Toolbar;
    this.linear1 = linear1;
    this.vscroll1 = vscroll1;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static SalinterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static SalinterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.salinter, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static SalinterBinding bind(@NonNull View rootView) {
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

      id = R.id.linear1;
      LinearLayout linear1 = ViewBindings.findChildViewById(rootView, id);
      if (linear1 == null) {
        break missingId;
      }

      id = R.id.vscroll1;
      ScrollView vscroll1 = ViewBindings.findChildViewById(rootView, id);
      if (vscroll1 == null) {
        break missingId;
      }

      return new SalinterBinding((CoordinatorLayout) rootView, AppBar, Coordinator, Toolbar,
          linear1, vscroll1);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
