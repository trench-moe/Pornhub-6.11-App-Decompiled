package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import com.app.pornhub.R;
import x1.a;

/* loaded from: classes.dex */
public final class FragmentOfflineVideosBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final FrameLayout f4620a;

    /* renamed from: b  reason: collision with root package name */
    public final LinearLayout f4621b;

    /* renamed from: c  reason: collision with root package name */
    public final ConstraintLayout f4622c;
    public final ConstraintLayout d;

    /* renamed from: e  reason: collision with root package name */
    public final RecyclerView f4623e;

    public FragmentOfflineVideosBinding(FrameLayout frameLayout, LinearLayout linearLayout, ConstraintLayout constraintLayout, Guideline guideline, ImageView imageView, TextView textView, Guideline guideline2, ImageView imageView2, TextView textView2, TextView textView3, ConstraintLayout constraintLayout2, RecyclerView recyclerView) {
        this.f4620a = frameLayout;
        this.f4621b = linearLayout;
        this.f4622c = constraintLayout;
        this.d = constraintLayout2;
        this.f4623e = recyclerView;
    }

    public static FragmentOfflineVideosBinding bind(View view) {
        int i10 = R.id.button_get_premium;
        LinearLayout linearLayout = (LinearLayout) b.t(view, R.id.button_get_premium);
        if (linearLayout != null) {
            i10 = R.id.join_premium_container;
            ConstraintLayout constraintLayout = (ConstraintLayout) b.t(view, R.id.join_premium_container);
            if (constraintLayout != null) {
                i10 = R.id.join_premium_horizontal_middle_guideline;
                Guideline guideline = (Guideline) b.t(view, R.id.join_premium_horizontal_middle_guideline);
                if (guideline != null) {
                    i10 = R.id.join_premium_image;
                    ImageView imageView = (ImageView) b.t(view, R.id.join_premium_image);
                    if (imageView != null) {
                        i10 = R.id.join_premium_text1;
                        TextView textView = (TextView) b.t(view, R.id.join_premium_text1);
                        if (textView != null) {
                            i10 = R.id.no_video_horizontal_middle_guideline;
                            Guideline guideline2 = (Guideline) b.t(view, R.id.no_video_horizontal_middle_guideline);
                            if (guideline2 != null) {
                                i10 = R.id.no_video_image;
                                ImageView imageView2 = (ImageView) b.t(view, R.id.no_video_image);
                                if (imageView2 != null) {
                                    i10 = R.id.no_video_text1;
                                    TextView textView2 = (TextView) b.t(view, R.id.no_video_text1);
                                    if (textView2 != null) {
                                        i10 = R.id.no_video_text2;
                                        TextView textView3 = (TextView) b.t(view, R.id.no_video_text2);
                                        if (textView3 != null) {
                                            i10 = R.id.no_videos_container;
                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) b.t(view, R.id.no_videos_container);
                                            if (constraintLayout2 != null) {
                                                i10 = R.id.recycler_view;
                                                RecyclerView recyclerView = (RecyclerView) b.t(view, R.id.recycler_view);
                                                if (recyclerView != null) {
                                                    return new FragmentOfflineVideosBinding((FrameLayout) view, linearLayout, constraintLayout, guideline, imageView, textView, guideline2, imageView2, textView2, textView3, constraintLayout2, recyclerView);
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

    public static FragmentOfflineVideosBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_offline_videos, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4620a;
    }
}
