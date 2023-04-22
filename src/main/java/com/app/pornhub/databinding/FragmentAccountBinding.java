package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.app.pornhub.R;
import com.google.android.material.switchmaterial.SwitchMaterial;
import x1.a;

/* loaded from: classes.dex */
public final class FragmentAccountBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final FrameLayout f4533a;

    /* renamed from: b  reason: collision with root package name */
    public final ConstraintLayout f4534b;

    /* renamed from: c  reason: collision with root package name */
    public final SwitchMaterial f4535c;
    public final SwitchMaterial d;

    /* renamed from: e  reason: collision with root package name */
    public final Button f4536e;

    /* renamed from: f  reason: collision with root package name */
    public final Button f4537f;

    /* renamed from: g  reason: collision with root package name */
    public final Button f4538g;

    /* renamed from: h  reason: collision with root package name */
    public final Button f4539h;

    /* renamed from: i  reason: collision with root package name */
    public final Button f4540i;

    /* renamed from: j  reason: collision with root package name */
    public final Button f4541j;

    /* renamed from: k  reason: collision with root package name */
    public final Button f4542k;

    /* renamed from: l  reason: collision with root package name */
    public final Group f4543l;

    /* renamed from: m  reason: collision with root package name */
    public final Group f4544m;
    public final ImageButton n;

    /* renamed from: o  reason: collision with root package name */
    public final SwitchMaterial f4545o;

    /* renamed from: p  reason: collision with root package name */
    public final ImageButton f4546p;

    /* renamed from: q  reason: collision with root package name */
    public final Toolbar f4547q;

    /* renamed from: r  reason: collision with root package name */
    public final ImageView f4548r;

    /* renamed from: s  reason: collision with root package name */
    public final TextView f4549s;

    /* renamed from: t  reason: collision with root package name */
    public final View f4550t;

    /* renamed from: u  reason: collision with root package name */
    public final SwitchMaterial f4551u;

    public FragmentAccountBinding(FrameLayout frameLayout, ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, SwitchMaterial switchMaterial, TextView textView4, TextView textView5, TextView textView6, SwitchMaterial switchMaterial2, View view, Button button, Button button2, Button button3, Button button4, Button button5, Button button6, Button button7, Group group, Group group2, ImageButton imageButton, TextView textView7, TextView textView8, TextView textView9, TextView textView10, SwitchMaterial switchMaterial3, View view2, TextView textView11, ImageButton imageButton2, TextView textView12, Toolbar toolbar, ImageView imageView, TextView textView13, View view3, TextView textView14, TextView textView15, TextView textView16, TextView textView17, SwitchMaterial switchMaterial4) {
        this.f4533a = frameLayout;
        this.f4534b = constraintLayout;
        this.f4535c = switchMaterial;
        this.d = switchMaterial2;
        this.f4536e = button;
        this.f4537f = button2;
        this.f4538g = button3;
        this.f4539h = button4;
        this.f4540i = button5;
        this.f4541j = button6;
        this.f4542k = button7;
        this.f4543l = group;
        this.f4544m = group2;
        this.n = imageButton;
        this.f4545o = switchMaterial3;
        this.f4546p = imageButton2;
        this.f4547q = toolbar;
        this.f4548r = imageView;
        this.f4549s = textView13;
        this.f4550t = view3;
        this.f4551u = switchMaterial4;
    }

    public static FragmentAccountBinding bind(View view) {
        int i10 = R.id.accountContentBlock;
        ConstraintLayout constraintLayout = (ConstraintLayout) b.t(view, R.id.accountContentBlock);
        if (constraintLayout != null) {
            i10 = R.id.auto_play_label;
            TextView textView = (TextView) b.t(view, R.id.auto_play_label);
            if (textView != null) {
                i10 = R.id.auto_play_label_off;
                TextView textView2 = (TextView) b.t(view, R.id.auto_play_label_off);
                if (textView2 != null) {
                    i10 = R.id.auto_play_label_on;
                    TextView textView3 = (TextView) b.t(view, R.id.auto_play_label_on);
                    if (textView3 != null) {
                        i10 = R.id.auto_play_switch;
                        SwitchMaterial switchMaterial = (SwitchMaterial) b.t(view, R.id.auto_play_switch);
                        if (switchMaterial != null) {
                            i10 = R.id.auto_rotate_label;
                            TextView textView4 = (TextView) b.t(view, R.id.auto_rotate_label);
                            if (textView4 != null) {
                                i10 = R.id.auto_rotate_label_off;
                                TextView textView5 = (TextView) b.t(view, R.id.auto_rotate_label_off);
                                if (textView5 != null) {
                                    i10 = R.id.auto_rotate_label_on;
                                    TextView textView6 = (TextView) b.t(view, R.id.auto_rotate_label_on);
                                    if (textView6 != null) {
                                        i10 = R.id.auto_rotate_switch;
                                        SwitchMaterial switchMaterial2 = (SwitchMaterial) b.t(view, R.id.auto_rotate_switch);
                                        if (switchMaterial2 != null) {
                                            i10 = R.id.bottom_margin_view;
                                            View t2 = b.t(view, R.id.bottom_margin_view);
                                            if (t2 != null) {
                                                i10 = R.id.button_offline_videos_signed_in;
                                                Button button = (Button) b.t(view, R.id.button_offline_videos_signed_in);
                                                if (button != null) {
                                                    i10 = R.id.button_offline_videos_signed_out;
                                                    Button button2 = (Button) b.t(view, R.id.button_offline_videos_signed_out);
                                                    if (button2 != null) {
                                                        i10 = R.id.button_settings;
                                                        Button button3 = (Button) b.t(view, R.id.button_settings);
                                                        if (button3 != null) {
                                                            i10 = R.id.button_sign_out;
                                                            Button button4 = (Button) b.t(view, R.id.button_sign_out);
                                                            if (button4 != null) {
                                                                i10 = R.id.button_upgrade_to_premium_signed_in;
                                                                Button button5 = (Button) b.t(view, R.id.button_upgrade_to_premium_signed_in);
                                                                if (button5 != null) {
                                                                    i10 = R.id.button_upgrade_to_premium_signed_out;
                                                                    Button button6 = (Button) b.t(view, R.id.button_upgrade_to_premium_signed_out);
                                                                    if (button6 != null) {
                                                                        i10 = R.id.button_watch_history;
                                                                        Button button7 = (Button) b.t(view, R.id.button_watch_history);
                                                                        if (button7 != null) {
                                                                            i10 = R.id.group_signed_in;
                                                                            Group group = (Group) b.t(view, R.id.group_signed_in);
                                                                            if (group != null) {
                                                                                i10 = R.id.group_signed_out;
                                                                                Group group2 = (Group) b.t(view, R.id.group_signed_out);
                                                                                if (group2 != null) {
                                                                                    i10 = R.id.login_button;
                                                                                    ImageButton imageButton = (ImageButton) b.t(view, R.id.login_button);
                                                                                    if (imageButton != null) {
                                                                                        i10 = R.id.login_label;
                                                                                        TextView textView7 = (TextView) b.t(view, R.id.login_label);
                                                                                        if (textView7 != null) {
                                                                                            i10 = R.id.orientation_gay;
                                                                                            TextView textView8 = (TextView) b.t(view, R.id.orientation_gay);
                                                                                            if (textView8 != null) {
                                                                                                i10 = R.id.orientation_label;
                                                                                                TextView textView9 = (TextView) b.t(view, R.id.orientation_label);
                                                                                                if (textView9 != null) {
                                                                                                    i10 = R.id.orientation_straight;
                                                                                                    TextView textView10 = (TextView) b.t(view, R.id.orientation_straight);
                                                                                                    if (textView10 != null) {
                                                                                                        i10 = R.id.orientation_switch;
                                                                                                        SwitchMaterial switchMaterial3 = (SwitchMaterial) b.t(view, R.id.orientation_switch);
                                                                                                        if (switchMaterial3 != null) {
                                                                                                            i10 = R.id.preferences_background;
                                                                                                            View t8 = b.t(view, R.id.preferences_background);
                                                                                                            if (t8 != null) {
                                                                                                                i10 = R.id.preferences_title_label;
                                                                                                                TextView textView11 = (TextView) b.t(view, R.id.preferences_title_label);
                                                                                                                if (textView11 != null) {
                                                                                                                    i10 = R.id.signup_button;
                                                                                                                    ImageButton imageButton2 = (ImageButton) b.t(view, R.id.signup_button);
                                                                                                                    if (imageButton2 != null) {
                                                                                                                        i10 = R.id.signup_label;
                                                                                                                        TextView textView12 = (TextView) b.t(view, R.id.signup_label);
                                                                                                                        if (textView12 != null) {
                                                                                                                            i10 = R.id.toolbar;
                                                                                                                            Toolbar toolbar = (Toolbar) b.t(view, R.id.toolbar);
                                                                                                                            if (toolbar != null) {
                                                                                                                                i10 = R.id.user_avatar;
                                                                                                                                ImageView imageView = (ImageView) b.t(view, R.id.user_avatar);
                                                                                                                                if (imageView != null) {
                                                                                                                                    i10 = R.id.user_name;
                                                                                                                                    TextView textView13 = (TextView) b.t(view, R.id.user_name);
                                                                                                                                    if (textView13 != null) {
                                                                                                                                        i10 = R.id.user_section_background;
                                                                                                                                        View t10 = b.t(view, R.id.user_section_background);
                                                                                                                                        if (t10 != null) {
                                                                                                                                            i10 = R.id.view_my_profile_label;
                                                                                                                                            TextView textView14 = (TextView) b.t(view, R.id.view_my_profile_label);
                                                                                                                                            if (textView14 != null) {
                                                                                                                                                i10 = R.id.vpn_connection_label;
                                                                                                                                                TextView textView15 = (TextView) b.t(view, R.id.vpn_connection_label);
                                                                                                                                                if (textView15 != null) {
                                                                                                                                                    i10 = R.id.vpn_label_off;
                                                                                                                                                    TextView textView16 = (TextView) b.t(view, R.id.vpn_label_off);
                                                                                                                                                    if (textView16 != null) {
                                                                                                                                                        i10 = R.id.vpn_label_on;
                                                                                                                                                        TextView textView17 = (TextView) b.t(view, R.id.vpn_label_on);
                                                                                                                                                        if (textView17 != null) {
                                                                                                                                                            i10 = R.id.vpn_switch;
                                                                                                                                                            SwitchMaterial switchMaterial4 = (SwitchMaterial) b.t(view, R.id.vpn_switch);
                                                                                                                                                            if (switchMaterial4 != null) {
                                                                                                                                                                return new FragmentAccountBinding((FrameLayout) view, constraintLayout, textView, textView2, textView3, switchMaterial, textView4, textView5, textView6, switchMaterial2, t2, button, button2, button3, button4, button5, button6, button7, group, group2, imageButton, textView7, textView8, textView9, textView10, switchMaterial3, t8, textView11, imageButton2, textView12, toolbar, imageView, textView13, t10, textView14, textView15, textView16, textView17, switchMaterial4);
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

    public static FragmentAccountBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_account, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4533a;
    }
}
