package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import com.app.pornhub.R;
import x1.a;

/* loaded from: classes.dex */
public final class ActivityChildCommentsBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f4368a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f4369b;

    /* renamed from: c  reason: collision with root package name */
    public final EditText f4370c;
    public final ConstraintLayout d;

    /* renamed from: e  reason: collision with root package name */
    public final ConstraintLayout f4371e;

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f4372f;

    /* renamed from: g  reason: collision with root package name */
    public final ProgressBar f4373g;

    /* renamed from: h  reason: collision with root package name */
    public final TextView f4374h;

    /* renamed from: i  reason: collision with root package name */
    public final RecyclerView f4375i;

    /* renamed from: j  reason: collision with root package name */
    public final Toolbar f4376j;

    public ActivityChildCommentsBinding(ConstraintLayout constraintLayout, TextView textView, EditText editText, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, ImageView imageView, ProgressBar progressBar, TextView textView2, Guideline guideline, RecyclerView recyclerView, Toolbar toolbar, TextView textView3) {
        this.f4368a = constraintLayout;
        this.f4369b = textView;
        this.f4370c = editText;
        this.d = constraintLayout2;
        this.f4371e = constraintLayout3;
        this.f4372f = imageView;
        this.f4373g = progressBar;
        this.f4374h = textView2;
        this.f4375i = recyclerView;
        this.f4376j = toolbar;
    }

    public static ActivityChildCommentsBinding bind(View view) {
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
                        i10 = R.id.comment_send;
                        ImageView imageView = (ImageView) b.t(view, R.id.comment_send);
                        if (imageView != null) {
                            i10 = R.id.comment_send_progress_bar;
                            ProgressBar progressBar = (ProgressBar) b.t(view, R.id.comment_send_progress_bar);
                            if (progressBar != null) {
                                i10 = R.id.empty_message;
                                TextView textView2 = (TextView) b.t(view, R.id.empty_message);
                                if (textView2 != null) {
                                    i10 = R.id.guideline;
                                    Guideline guideline = (Guideline) b.t(view, R.id.guideline);
                                    if (guideline != null) {
                                        i10 = R.id.recyclerview;
                                        RecyclerView recyclerView = (RecyclerView) b.t(view, R.id.recyclerview);
                                        if (recyclerView != null) {
                                            i10 = R.id.toolbar;
                                            Toolbar toolbar = (Toolbar) b.t(view, R.id.toolbar);
                                            if (toolbar != null) {
                                                i10 = R.id.toolbar_title;
                                                TextView textView3 = (TextView) b.t(view, R.id.toolbar_title);
                                                if (textView3 != null) {
                                                    return new ActivityChildCommentsBinding((ConstraintLayout) view, textView, editText, constraintLayout, constraintLayout2, imageView, progressBar, textView2, guideline, recyclerView, toolbar, textView3);
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

    public static ActivityChildCommentsBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.activity_child_comments, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4368a;
    }
}
