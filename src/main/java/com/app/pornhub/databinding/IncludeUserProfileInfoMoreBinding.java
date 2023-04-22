package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.app.pornhub.R;
import x1.a;

/* loaded from: classes.dex */
public final class IncludeUserProfileInfoMoreBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final RelativeLayout f4705a;

    public IncludeUserProfileInfoMoreBinding(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, ImageView imageView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13) {
        this.f4705a = relativeLayout;
    }

    public static IncludeUserProfileInfoMoreBinding bind(View view) {
        RelativeLayout relativeLayout = (RelativeLayout) view;
        int i10 = R.id.imageViewVerified;
        ImageView imageView = (ImageView) b.t(view, R.id.imageViewVerified);
        if (imageView != null) {
            i10 = R.id.user_info_age;
            TextView textView = (TextView) b.t(view, R.id.user_info_age);
            if (textView != null) {
                i10 = R.id.user_info_gender;
                TextView textView2 = (TextView) b.t(view, R.id.user_info_gender);
                if (textView2 != null) {
                    i10 = R.id.user_info_interestedin;
                    TextView textView3 = (TextView) b.t(view, R.id.user_info_interestedin);
                    if (textView3 != null) {
                        i10 = R.id.user_info_label_age;
                        TextView textView4 = (TextView) b.t(view, R.id.user_info_label_age);
                        if (textView4 != null) {
                            i10 = R.id.user_info_label_gender;
                            TextView textView5 = (TextView) b.t(view, R.id.user_info_label_gender);
                            if (textView5 != null) {
                                i10 = R.id.user_info_label_interestedin;
                                TextView textView6 = (TextView) b.t(view, R.id.user_info_label_interestedin);
                                if (textView6 != null) {
                                    i10 = R.id.user_info_label_moreinfo;
                                    TextView textView7 = (TextView) b.t(view, R.id.user_info_label_moreinfo);
                                    if (textView7 != null) {
                                        i10 = R.id.user_info_label_name;
                                        TextView textView8 = (TextView) b.t(view, R.id.user_info_label_name);
                                        if (textView8 != null) {
                                            i10 = R.id.user_info_label_profileviewcount;
                                            TextView textView9 = (TextView) b.t(view, R.id.user_info_label_profileviewcount);
                                            if (textView9 != null) {
                                                i10 = R.id.user_info_label_relationshipstatus;
                                                TextView textView10 = (TextView) b.t(view, R.id.user_info_label_relationshipstatus);
                                                if (textView10 != null) {
                                                    i10 = R.id.user_info_name;
                                                    TextView textView11 = (TextView) b.t(view, R.id.user_info_name);
                                                    if (textView11 != null) {
                                                        i10 = R.id.user_info_profileviewcount;
                                                        TextView textView12 = (TextView) b.t(view, R.id.user_info_profileviewcount);
                                                        if (textView12 != null) {
                                                            i10 = R.id.user_info_relationshipstatus;
                                                            TextView textView13 = (TextView) b.t(view, R.id.user_info_relationshipstatus);
                                                            if (textView13 != null) {
                                                                return new IncludeUserProfileInfoMoreBinding(relativeLayout, relativeLayout, imageView, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static IncludeUserProfileInfoMoreBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.include_user_profile_info_more, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4705a;
    }
}
