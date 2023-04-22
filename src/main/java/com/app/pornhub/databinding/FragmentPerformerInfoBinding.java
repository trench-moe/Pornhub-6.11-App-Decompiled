package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.app.pornhub.R;
import x1.a;

/* loaded from: classes.dex */
public final class FragmentPerformerInfoBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final NestedScrollView f4625a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f4626b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f4627c;
    public final TextView d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f4628e;

    /* renamed from: f  reason: collision with root package name */
    public final TextView f4629f;

    /* renamed from: g  reason: collision with root package name */
    public final TextView f4630g;

    /* renamed from: h  reason: collision with root package name */
    public final TextView f4631h;

    /* renamed from: i  reason: collision with root package name */
    public final TextView f4632i;

    /* renamed from: j  reason: collision with root package name */
    public final TextView f4633j;

    public FragmentPerformerInfoBinding(NestedScrollView nestedScrollView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13) {
        this.f4625a = nestedScrollView;
        this.f4626b = textView;
        this.f4627c = textView2;
        this.d = textView3;
        this.f4628e = textView4;
        this.f4629f = textView6;
        this.f4630g = textView8;
        this.f4631h = textView10;
        this.f4632i = textView11;
        this.f4633j = textView13;
    }

    public static FragmentPerformerInfoBinding bind(View view) {
        int i10 = R.id.bio;
        TextView textView = (TextView) b.t(view, R.id.bio);
        if (textView != null) {
            i10 = R.id.birthplace;
            TextView textView2 = (TextView) b.t(view, R.id.birthplace);
            if (textView2 != null) {
                i10 = R.id.born;
                TextView textView3 = (TextView) b.t(view, R.id.born);
                if (textView3 != null) {
                    i10 = R.id.height;
                    TextView textView4 = (TextView) b.t(view, R.id.height);
                    if (textView4 != null) {
                        i10 = R.id.last_month;
                        TextView textView5 = (TextView) b.t(view, R.id.last_month);
                        if (textView5 != null) {
                            i10 = R.id.last_month_value;
                            TextView textView6 = (TextView) b.t(view, R.id.last_month_value);
                            if (textView6 != null) {
                                i10 = R.id.monthly_rank;
                                TextView textView7 = (TextView) b.t(view, R.id.monthly_rank);
                                if (textView7 != null) {
                                    i10 = R.id.monthly_rank_value;
                                    TextView textView8 = (TextView) b.t(view, R.id.monthly_rank_value);
                                    if (textView8 != null) {
                                        i10 = R.id.weekly_rank;
                                        TextView textView9 = (TextView) b.t(view, R.id.weekly_rank);
                                        if (textView9 != null) {
                                            i10 = R.id.weekly_rank_value;
                                            TextView textView10 = (TextView) b.t(view, R.id.weekly_rank_value);
                                            if (textView10 != null) {
                                                i10 = R.id.weight;
                                                TextView textView11 = (TextView) b.t(view, R.id.weight);
                                                if (textView11 != null) {
                                                    i10 = R.id.yearly_rank;
                                                    TextView textView12 = (TextView) b.t(view, R.id.yearly_rank);
                                                    if (textView12 != null) {
                                                        i10 = R.id.yearly_rank_value;
                                                        TextView textView13 = (TextView) b.t(view, R.id.yearly_rank_value);
                                                        if (textView13 != null) {
                                                            return new FragmentPerformerInfoBinding((NestedScrollView) view, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13);
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

    public static FragmentPerformerInfoBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_performer_info, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4625a;
    }
}
