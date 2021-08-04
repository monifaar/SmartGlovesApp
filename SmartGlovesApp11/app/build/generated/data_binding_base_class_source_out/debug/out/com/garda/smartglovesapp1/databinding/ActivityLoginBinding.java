// Generated by view binder compiler. Do not edit!
package com.garda.smartglovesapp1.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.garda.smartglovesapp1.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLoginBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView btnReg;

  @NonNull
  public final Button buttonSignin;

  @NonNull
  public final EditText email;

  @NonNull
  public final ImageView icGlove;

  @NonNull
  public final EditText password;

  @NonNull
  public final ProgressBar progressBar;

  private ActivityLoginBinding(@NonNull LinearLayout rootView, @NonNull TextView btnReg,
      @NonNull Button buttonSignin, @NonNull EditText email, @NonNull ImageView icGlove,
      @NonNull EditText password, @NonNull ProgressBar progressBar) {
    this.rootView = rootView;
    this.btnReg = btnReg;
    this.buttonSignin = buttonSignin;
    this.email = email;
    this.icGlove = icGlove;
    this.password = password;
    this.progressBar = progressBar;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_reg;
      TextView btnReg = rootView.findViewById(id);
      if (btnReg == null) {
        break missingId;
      }

      id = R.id.button_signin;
      Button buttonSignin = rootView.findViewById(id);
      if (buttonSignin == null) {
        break missingId;
      }

      id = R.id.email;
      EditText email = rootView.findViewById(id);
      if (email == null) {
        break missingId;
      }

      id = R.id.ic_glove;
      ImageView icGlove = rootView.findViewById(id);
      if (icGlove == null) {
        break missingId;
      }

      id = R.id.password;
      EditText password = rootView.findViewById(id);
      if (password == null) {
        break missingId;
      }

      id = R.id.progressBar;
      ProgressBar progressBar = rootView.findViewById(id);
      if (progressBar == null) {
        break missingId;
      }

      return new ActivityLoginBinding((LinearLayout) rootView, btnReg, buttonSignin, email, icGlove,
          password, progressBar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
