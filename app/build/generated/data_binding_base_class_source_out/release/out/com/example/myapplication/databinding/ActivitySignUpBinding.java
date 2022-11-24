// Generated by view binder compiler. Do not edit!
package com.example.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySignUpBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button btnSignupUp;

  @NonNull
  public final EditText edtEmailUp;

  @NonNull
  public final EditText edtNameUp;

  @NonNull
  public final EditText edtPassUp;

  private ActivitySignUpBinding(@NonNull LinearLayout rootView, @NonNull Button btnSignupUp,
      @NonNull EditText edtEmailUp, @NonNull EditText edtNameUp, @NonNull EditText edtPassUp) {
    this.rootView = rootView;
    this.btnSignupUp = btnSignupUp;
    this.edtEmailUp = edtEmailUp;
    this.edtNameUp = edtNameUp;
    this.edtPassUp = edtPassUp;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySignUpBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySignUpBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_sign_up, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySignUpBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_signup_up;
      Button btnSignupUp = ViewBindings.findChildViewById(rootView, id);
      if (btnSignupUp == null) {
        break missingId;
      }

      id = R.id.edt_email_up;
      EditText edtEmailUp = ViewBindings.findChildViewById(rootView, id);
      if (edtEmailUp == null) {
        break missingId;
      }

      id = R.id.edt_name_up;
      EditText edtNameUp = ViewBindings.findChildViewById(rootView, id);
      if (edtNameUp == null) {
        break missingId;
      }

      id = R.id.edt_pass_up;
      EditText edtPassUp = ViewBindings.findChildViewById(rootView, id);
      if (edtPassUp == null) {
        break missingId;
      }

      return new ActivitySignUpBinding((LinearLayout) rootView, btnSignupUp, edtEmailUp, edtNameUp,
          edtPassUp);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
