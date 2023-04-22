package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.app.pornhub.R;
import x1.a;

/* loaded from: classes.dex */
public final class FragmentOfflineVideosPremiumExpiredBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f4624a;

    public FragmentOfflineVideosPremiumExpiredBinding(ConstraintLayout constraintLayout, LinearLayout linearLayout, Guideline guideline, ImageView imageView, TextView textView, TextView textView2, TextView textView3) {
        this.f4624a = constraintLayout;
    }

    public static FragmentOfflineVideosPremiumExpiredBinding bind(View view) {
        int i10 = R.id.button_get_premium;
        LinearLayout linearLayout = (LinearLayout) b.t(view, R.id.button_get_premium);
        if (linearLayout != null) {
            i10 = R.id.join_premium_horizontal_middle_guideline;
            Guideline guideline = (Guideline) b.t(view, R.id.join_premium_horizontal_middle_guideline);
            if (guideline != null) {
                i10 = R.id.join_premium_image;
                ImageView imageView = (ImageView) b.t(view, R.id.join_premium_image);
                if (imageView != null) {
                    i10 = R.id.join_premium_text1;
                    TextView textView = (TextView) b.t(view, R.id.join_premium_text1);
                    if (textView != null) {
                        i10 = R.id.label_or;
                        TextView textView2 = (TextView) b.t(view, R.id.label_or);
                        if (textView2 != null) {
                            i10 = R.id.login;
                            TextView textView3 = (TextView) b.t(view, R.id.login);
                            if (textView3 != null) {
                                return new FragmentOfflineVideosPremiumExpiredBinding((ConstraintLayout) view, linearLayout, guideline, imageView, textView, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentOfflineVideosPremiumExpiredBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_offline_videos_premium_expired, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4624a;
    }
}
