package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import com.app.pornhub.R;
import x1.a;

/* loaded from: classes.dex */
public final class FragmentVideoDetailsCommentsBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f4657a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f4658b;

    /* renamed from: c  reason: collision with root package name */
    public final EditText f4659c;
    public final ConstraintLayout d;

    /* renamed from: e  reason: collision with root package name */
    public final ConstraintLayout f4660e;

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f4661f;

    /* renamed from: g  reason: collision with root package name */
    public final ProgressBar f4662g;

    /* renamed from: h  reason: collision with root package name */
    public final FrameLayout f4663h;

    /* renamed from: i  reason: collision with root package name */
    public final TextView f4664i;

    /* renamed from: j  reason: collision with root package name */
    public final FrameLayout f4665j;

    /* renamed from: k  reason: collision with root package name */
    public final IncludeErrorBinding f4666k;

    /* renamed from: l  reason: collision with root package name */
    public final ImageView f4667l;

    /* renamed from: m  reason: collision with root package name */
    public final TextView f4668m;
    public final TextView n;

    /* renamed from: o  reason: collision with root package name */
    public final RecyclerView f4669o;

    public FragmentVideoDetailsCommentsBinding(ConstraintLayout constraintLayout, TextView textView, EditText editText, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, Guideline guideline, ImageView imageView, ProgressBar progressBar, ConstraintLayout constraintLayout4, FrameLayout frameLayout, FrameLayout frameLayout2, TextView textView2, FrameLayout frameLayout3, IncludeErrorBinding includeErrorBinding, ImageView imageView2, TextView textView3, TextView textView4, RecyclerView recyclerView, ConstraintLayout constraintLayout5) {
        this.f4657a = constraintLayout;
        this.f4658b = textView;
        this.f4659c = editText;
        this.d = constraintLayout2;
        this.f4660e = constraintLayout3;
        this.f4661f = imageView;
        this.f4662g = progressBar;
        this.f4663h = frameLayout;
        this.f4664i = textView2;
        this.f4665j = frameLayout3;
        this.f4666k = includeErrorBinding;
        this.f4667l = imageView2;
        this.f4668m = textView3;
        this.n = textView4;
        this.f4669o = recyclerView;
    }

    public static FragmentVideoDetailsCommentsBinding bind(View view) {
        int i10 = R.id.action_required_message;
        TextView textView = (TextView) b.t(view, R.id.action_required_message);
        if (textView != null) {
            i10 = R.id.comment_input;
            EditText editText = (EditText) b.t(view, R.id.comment_input);
            if (editText != null) {
                i10 = R.id.comment_input_action_required_container;
                ConstraintLayout constraintLayout = (ConstraintLayout) b.t(view, R.id.comment_input_action_required_container);
                if (constraintLayout != null) {
                    i10 = R.id.comment_input_container;
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) b.t(view, R.id.comment_input_container);
                    if (constraintLayout2 != null) {
                        i10 = R.id.comment_input_delimiter_guideline;
                        Guideline guideline = (Guideline) b.t(view, R.id.comment_input_delimiter_guideline);
                        if (guideline != null) {
                            i10 = R.id.comment_send;
                            ImageView imageView = (ImageView) b.t(view, R.id.comment_send);
                            if (imageView != null) {
                                i10 = R.id.comment_send_progress_bar;
                                ProgressBar progressBar = (ProgressBar) b.t(view, R.id.comment_send_progress_bar);
                                if (progressBar != null) {
                                    i10 = R.id.comments_header;
                                    ConstraintLayout constraintLayout3 = (ConstraintLayout) b.t(view, R.id.comments_header);
                                    if (constraintLayout3 != null) {
                                        i10 = R.id.container_loading;
                                        FrameLayout frameLayout = (FrameLayout) b.t(view, R.id.container_loading);
                                        if (frameLayout != null) {
                                            i10 = R.id.container_main_content;
                                            FrameLayout frameLayout2 = (FrameLayout) b.t(view, R.id.container_main_content);
                                            if (frameLayout2 != null) {
                                                i10 = R.id.empty_content_msg;
                                                TextView textView2 = (TextView) b.t(view, R.id.empty_content_msg);
                                                if (textView2 != null) {
                                                    i10 = R.id.empty_content_msg_container;
                                                    FrameLayout frameLayout3 = (FrameLayout) b.t(view, R.id.empty_content_msg_container);
                                                    if (frameLayout3 != null) {
                                                        i10 = R.id.errorView;
                                                        View t2 = b.t(view, R.id.errorView);
                                                        if (t2 != null) {
                                                            IncludeErrorBinding bind = IncludeErrorBinding.bind(t2);
                                                            i10 = R.id.filter_icon;
                                                            ImageView imageView2 = (ImageView) b.t(view, R.id.filter_icon);
                                                            if (imageView2 != null) {
                                                                i10 = R.id.filter_text_count;
                                                                TextView textView3 = (TextView) b.t(view, R.id.filter_text_count);
                                                                if (textView3 != null) {
                                                                    i10 = R.id.filter_text_title;
                                                                    TextView textView4 = (TextView) b.t(view, R.id.filter_text_title);
                                                                    if (textView4 != null) {
                                                                        i10 = R.id.recyclerview;
                                                                        RecyclerView recyclerView = (RecyclerView) b.t(view, R.id.recyclerview);
                                                                        if (recyclerView != null) {
                                                                            ConstraintLayout constraintLayout4 = (ConstraintLayout) view;
                                                                            return new FragmentVideoDetailsCommentsBinding(constraintLayout4, textView, editText, constraintLayout, constraintLayout2, guideline, imageView, progressBar, constraintLayout3, frameLayout, frameLayout2, textView2, frameLayout3, bind, imageView2, textView3, textView4, recyclerView, constraintLayout4);
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

    public static FragmentVideoDetailsCommentsBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_video_details_comments, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4657a;
    }
}
