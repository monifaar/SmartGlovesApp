// Generated by view binder compiler. Do not edit!
package com.garda.smartglovesapp1.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import com.garda.smartglovesapp1.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentHomeBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final ImageButton bututBtn;

  @NonNull
  public final CardView cvBpm;

  @NonNull
  public final CardView cvCelcius;

  @NonNull
  public final CardView cvSpo2;

  @NonNull
  public final FrameLayout frameLayout;

  @NonNull
  public final CircleImageView imgProfile;

  @NonNull
  public final TextView nameTxt;

  @NonNull
  public final RelativeLayout parentRelative;

  @NonNull
  public final Button refreshSensor;

  @NonNull
  public final RelativeLayout relativeLayout;

  @NonNull
  public final TextView txtBpm;

  @NonNull
  public final TextView txtSpo2;

  @NonNull
  public final TextView txtSpo22;

  @NonNull
  public final TextView txtSuhu;

  @NonNull
  public final TextView txtSuhu2;

  private FragmentHomeBinding(@NonNull FrameLayout rootView, @NonNull ImageButton bututBtn,
      @NonNull CardView cvBpm, @NonNull CardView cvCelcius, @NonNull CardView cvSpo2,
      @NonNull FrameLayout frameLayout, @NonNull CircleImageView imgProfile,
      @NonNull TextView nameTxt, @NonNull RelativeLayout parentRelative,
      @NonNull Button refreshSensor, @NonNull RelativeLayout relativeLayout,
      @NonNull TextView txtBpm, @NonNull TextView txtSpo2, @NonNull TextView txtSpo22,
      @NonNull TextView txtSuhu, @NonNull TextView txtSuhu2) {
    this.rootView = rootView;
    this.bututBtn = bututBtn;
    this.cvBpm = cvBpm;
    this.cvCelcius = cvCelcius;
    this.cvSpo2 = cvSpo2;
    this.frameLayout = frameLayout;
    this.imgProfile = imgProfile;
    this.nameTxt = nameTxt;
    this.parentRelative = parentRelative;
    this.refreshSensor = refreshSensor;
    this.relativeLayout = relativeLayout;
    this.txtBpm = txtBpm;
    this.txtSpo2 = txtSpo2;
    this.txtSpo22 = txtSpo22;
    this.txtSuhu = txtSuhu;
    this.txtSuhu2 = txtSuhu2;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.butut_btn;
      ImageButton bututBtn = rootView.findViewById(id);
      if (bututBtn == null) {
        break missingId;
      }

      id = R.id.cv_bpm;
      CardView cvBpm = rootView.findViewById(id);
      if (cvBpm == null) {
        break missingId;
      }

      id = R.id.cv_celcius;
      CardView cvCelcius = rootView.findViewById(id);
      if (cvCelcius == null) {
        break missingId;
      }

      id = R.id.cv_spo2;
      CardView cvSpo2 = rootView.findViewById(id);
      if (cvSpo2 == null) {
        break missingId;
      }

      id = R.id.frameLayout;
      FrameLayout frameLayout = rootView.findViewById(id);
      if (frameLayout == null) {
        break missingId;
      }

      id = R.id.img_profile;
      CircleImageView imgProfile = rootView.findViewById(id);
      if (imgProfile == null) {
        break missingId;
      }

      id = R.id.name_txt;
      TextView nameTxt = rootView.findViewById(id);
      if (nameTxt == null) {
        break missingId;
      }

      id = R.id.parentRelative;
      RelativeLayout parentRelative = rootView.findViewById(id);
      if (parentRelative == null) {
        break missingId;
      }

      id = R.id.refreshSensor;
      Button refreshSensor = rootView.findViewById(id);
      if (refreshSensor == null) {
        break missingId;
      }

      id = R.id.relativeLayout;
      RelativeLayout relativeLayout = rootView.findViewById(id);
      if (relativeLayout == null) {
        break missingId;
      }

      id = R.id.txt_bpm;
      TextView txtBpm = rootView.findViewById(id);
      if (txtBpm == null) {
        break missingId;
      }

      id = R.id.txt_spo2;
      TextView txtSpo2 = rootView.findViewById(id);
      if (txtSpo2 == null) {
        break missingId;
      }

      id = R.id.txt_spo22;
      TextView txtSpo22 = rootView.findViewById(id);
      if (txtSpo22 == null) {
        break missingId;
      }

      id = R.id.txt_suhu;
      TextView txtSuhu = rootView.findViewById(id);
      if (txtSuhu == null) {
        break missingId;
      }

      id = R.id.txt_suhu2;
      TextView txtSuhu2 = rootView.findViewById(id);
      if (txtSuhu2 == null) {
        break missingId;
      }

      return new FragmentHomeBinding((FrameLayout) rootView, bututBtn, cvBpm, cvCelcius, cvSpo2,
          frameLayout, imgProfile, nameTxt, parentRelative, refreshSensor, relativeLayout, txtBpm,
          txtSpo2, txtSpo22, txtSuhu, txtSuhu2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
