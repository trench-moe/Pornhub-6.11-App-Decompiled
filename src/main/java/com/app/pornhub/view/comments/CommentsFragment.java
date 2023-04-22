package com.app.pornhub.view.comments;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.e0;
import androidx.recyclerview.widget.r;
import com.app.pornhub.R;
import com.app.pornhub.data.model.explore.ExploreModel;
import com.app.pornhub.databinding.FragmentVideoDetailsCommentsBinding;
import com.app.pornhub.domain.config.UsersConfig;
import com.app.pornhub.domain.error.OperationException;
import com.app.pornhub.domain.model.comment.CommentsSource;
import com.app.pornhub.domain.model.comment.UserComment;
import com.app.pornhub.domain.model.user.UserMetaData;
import com.app.pornhub.domain.model.user.UserSettings;
import com.app.pornhub.domain.usecase.UseCaseResult;
import com.app.pornhub.view.browser.BrowserActivity;
import com.app.pornhub.view.comments.a;
import com.app.pornhub.view.login.LoginActivity;
import com.app.pornhub.view.login.SignupActivity;
import com.appsflyer.oaid.BuildConfig;
import f3.k;
import f3.o;
import f3.s;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.disposables.CompositeDisposable;
import java.util.List;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import t3.g;
import t3.l;
import x2.h;
import x2.i1;
import x2.z;
import z2.cp;

/* loaded from: classes.dex */
public class CommentsFragment extends Fragment implements cp, a.b {
    public static final /* synthetic */ int M0 = 0;
    public String A0;
    public String B0;
    public FragmentVideoDetailsCommentsBinding C0;
    public CompositeDisposable G0;
    public String H0;
    public CommentsSource I0;
    public com.app.pornhub.view.comments.a J0;
    public PopupWindow K0;

    /* renamed from: n0  reason: collision with root package name */
    public o f4933n0;

    /* renamed from: o0  reason: collision with root package name */
    public UserSettings f4934o0;

    /* renamed from: p0  reason: collision with root package name */
    public s f4935p0;

    /* renamed from: q0  reason: collision with root package name */
    public k f4936q0;

    /* renamed from: r0  reason: collision with root package name */
    public sc.c f4937r0;

    /* renamed from: s0  reason: collision with root package name */
    public e3.b f4938s0;

    /* renamed from: t0  reason: collision with root package name */
    public e3.b f4939t0;

    /* renamed from: u0  reason: collision with root package name */
    public e3.a f4940u0;

    /* renamed from: v0  reason: collision with root package name */
    public e3.a f4941v0;
    public k2.c w0;

    /* renamed from: x0  reason: collision with root package name */
    public SharedPreferences f4942x0;

    /* renamed from: y0  reason: collision with root package name */
    public q3.d f4943y0;

    /* renamed from: z0  reason: collision with root package name */
    public LinearLayoutManager f4944z0;
    public boolean D0 = true;
    public boolean E0 = false;
    public boolean F0 = false;
    public View.OnClickListener L0 = new b();

    /* loaded from: classes.dex */
    public enum CommentsFilter {
        RECENT,
        MOST_POPULAR
    }

    /* loaded from: classes.dex */
    public class a extends r {
    }

    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommentsFragment.this.f4942x0.edit().putString("filter_sel", (String) view.getTag()).apply();
            t3.o.d(CommentsFragment.this.K0);
            CommentsFragment.this.J0.m();
            CommentsFragment.this.K0();
        }
    }

    /* loaded from: classes.dex */
    public class c extends ClickableSpan {

        /* renamed from: c  reason: collision with root package name */
        public Intent f4949c;

        public c(Intent intent) {
            this.f4949c = intent;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            CommentsFragment.this.I0(this.f4949c);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    /* loaded from: classes.dex */
    public class d extends RecyclerView.p {
        public d(a aVar) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public void e(RecyclerView recyclerView, int i10, int i11) {
            CommentsFragment commentsFragment = CommentsFragment.this;
            if (!commentsFragment.E0 && i11 != 0 && commentsFragment.f4944z0.Y0() == CommentsFragment.this.J0.a() - 1) {
                CommentsFragment commentsFragment2 = CommentsFragment.this;
                if (commentsFragment2.D0) {
                    commentsFragment2.K0();
                    CommentsFragment commentsFragment3 = CommentsFragment.this;
                    if (commentsFragment3.I0 != CommentsSource.Video.INSTANCE) {
                        return;
                    }
                    kf.a.f12078a.a("Scrolled load more", new Object[0]);
                    g.o(commentsFragment3.q(), "phapp_video_scroll_to_load_more", commentsFragment3.H0, "comments", Integer.valueOf(commentsFragment3.J0.a()));
                    return;
                }
                if (commentsFragment2.I0 == CommentsSource.Video.INSTANCE) {
                    if (commentsFragment2.F0) {
                        CommentsFragment.this.F0 = true;
                    } else {
                        kf.a.f12078a.a("Scrolled to bottom", new Object[0]);
                        g.o(commentsFragment2.q(), "phapp_video_scroll_to_bottom", commentsFragment2.H0, "comments", Integer.valueOf(commentsFragment2.J0.a()));
                    }
                }
                CommentsFragment.this.F0 = true;
            }
        }
    }

    public static CommentsFragment N0(String str, CommentsSource commentsSource) {
        String str2;
        CommentsFragment commentsFragment = new CommentsFragment();
        Bundle b10 = android.support.v4.media.b.b("key_unit_id", str);
        if (commentsSource instanceof CommentsSource.Video) {
            str2 = "video";
        } else if (!(commentsSource instanceof CommentsSource.Gif)) {
            throw new IllegalArgumentException("Comment source type not supported!");
        } else {
            str2 = ExploreModel.GIF;
        }
        b10.putString("source_type", str2);
        commentsFragment.A0(b10);
        return commentsFragment;
    }

    public void K0() {
        CommentsFilter commentsFilter;
        Single<List<UserComment>> e10;
        CommentsFilter commentsFilter2 = CommentsFilter.MOST_POPULAR;
        this.A0 = null;
        this.C0.f4666k.f4698a.setVisibility(8);
        String string = this.f4942x0.getString("filter_sel", BuildConfig.FLAVOR);
        if (string.equals(I(R.string.comments_recent))) {
            commentsFilter = CommentsFilter.RECENT;
            this.C0.n.setText(R.string.comments_filter_all_recent);
        } else {
            if (string.equals(I(R.string.comments_popular))) {
                this.C0.n.setText(R.string.comments_filter_all_popular);
            } else {
                this.C0.n.setText(R.string.comments_filter_all_popular);
            }
            commentsFilter = commentsFilter2;
        }
        CompositeDisposable compositeDisposable = this.G0;
        sc.c cVar = this.f4937r0;
        String itemId = this.H0;
        int a10 = this.J0.a();
        boolean z10 = commentsFilter == commentsFilter2;
        CommentsSource commentsSource = this.I0;
        Objects.requireNonNull(cVar);
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(commentsSource, "commentsSource");
        if (Intrinsics.areEqual(commentsSource, CommentsSource.Video.INSTANCE)) {
            e10 = ((b3.d) cVar.f14954f).c(itemId, 10, a10, z10);
        } else if (!Intrinsics.areEqual(commentsSource, CommentsSource.Gif.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        } else {
            e10 = ((b3.d) cVar.f14954f).e(itemId, 10, a10, z10);
        }
        Observable startWith = e10.toObservable().map(i1.f17747t).onErrorReturn(z.f17905w).startWith((Observable) UseCaseResult.a.f4910a);
        Intrinsics.checkNotNullExpressionValue(startWith, "source\n            .toOb…th(UseCaseResult.Loading)");
        compositeDisposable.add(startWith.subscribe(new x2.g(this, 7)));
    }

    public final String L0(OperationException operationException) {
        int a10 = operationException.a();
        if (a10 != 70) {
            if (a10 != 10001) {
                if (a10 != 10002) {
                    StringBuilder m10 = a1.a.m("Error: ");
                    m10.append(operationException.getMessage());
                    return m10.toString();
                }
                return I(R.string.error_login_required_to_flag);
            }
            return I(R.string.error_login_required_for_dislike);
        }
        return I(R.string.error_comments_rate_limit);
    }

    public final void M0() {
        UserMetaData a10 = this.f4936q0.a();
        if (a10 != null) {
            if (!a10.getEmailVerificationRequired()) {
                this.C0.f4660e.setVisibility(0);
                this.C0.d.setVisibility(8);
                return;
            }
            this.C0.f4660e.setVisibility(8);
            this.C0.d.setVisibility(0);
            TextView textView = this.C0.f4658b;
            String I = I(R.string.email_verification_required_for_comments);
            String I2 = I(R.string.comments_email_verification_span);
            Intent B = BrowserActivity.B(q(), this.f4943y0.i(), I(R.string.resend_email));
            int indexOf = I.indexOf(I2);
            SpannableString spannableString = new SpannableString(I);
            spannableString.setSpan(new c(B), indexOf, I2.length() + indexOf, 18);
            textView.setText(spannableString, TextView.BufferType.SPANNABLE);
            this.C0.f4658b.setMovementMethod(LinkMovementMethod.getInstance());
            return;
        }
        this.C0.f4660e.setVisibility(8);
        this.C0.d.setVisibility(0);
        TextView textView2 = this.C0.f4658b;
        String upperCase = I(R.string.login).toUpperCase();
        String I3 = I(R.string.signup_cap);
        String format = String.format(I(R.string.auth_req_comments), upperCase, I3);
        SpannableString spannableString2 = new SpannableString(format);
        int indexOf2 = format.indexOf(upperCase);
        int indexOf3 = format.indexOf(I3);
        if (indexOf2 != -1 && indexOf3 != -1) {
            Intent D = SignupActivity.D(q());
            spannableString2.setSpan(new c(LoginActivity.C(q())), indexOf2, upperCase.length() + indexOf2, 18);
            spannableString2.setSpan(new c(D), indexOf3, I3.length() + indexOf3, 18);
        }
        textView2.setText(spannableString2, TextView.BufferType.SPANNABLE);
        this.C0.f4658b.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean O0() {
        /*
            r6 = this;
            r3 = r6
            android.widget.PopupWindow r0 = r3.K0
            r5 = 5
            t3.o r1 = t3.o.f15126a
            r1 = 0
            r5 = 2
            r5 = 1
            r2 = r5
            if (r0 == 0) goto L17
            boolean r0 = r0.isShowing()
            if (r0 != 0) goto L14
            r5 = 1
            goto L17
        L14:
            r5 = 0
            r0 = r5
            goto L19
        L17:
            r5 = 1
            r0 = r5
        L19:
            if (r0 == 0) goto L1c
            return r1
        L1c:
            android.widget.PopupWindow r0 = r3.K0
            r5 = 6
            t3.o.d(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.pornhub.view.comments.CommentsFragment.O0():boolean");
    }

    public void P0() {
        if (this.J0.a() != 0) {
            this.C0.f4665j.setVisibility(8);
            return;
        }
        this.C0.f4665j.setVisibility(0);
        this.C0.f4664i.setText(this.B0);
    }

    public void Q0(String str) {
        this.A0 = str;
        ((ImageView) this.C0.f4666k.f4698a.findViewById(R.id.error_segment_image)).setImageResource(t3.o.g(UsersConfig.isGay(this.f4934o0.getOrientation())));
        this.C0.f4666k.f4698a.setVisibility(0);
        ((TextView) this.C0.f4666k.f4698a.findViewById(R.id.error_txtError)).setText(str);
    }

    @Override // androidx.fragment.app.Fragment
    public void U(Bundle bundle) {
        super.U(bundle);
        this.H0 = this.f2019u.getString("key_unit_id");
        String string = this.f2019u.getString("source_type");
        if (string == null) {
            throw new IllegalArgumentException("Comment source not suplied!");
        }
        if (string.equals("video")) {
            this.I0 = CommentsSource.Video.INSTANCE;
            return;
        }
        if (string.equals(ExploreModel.GIF)) {
            this.I0 = CommentsSource.Gif.INSTANCE;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View W(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FragmentVideoDetailsCommentsBinding bind = FragmentVideoDetailsCommentsBinding.bind(layoutInflater.inflate(R.layout.fragment_video_details_comments, viewGroup, false));
        this.C0 = bind;
        bind.f4661f.setOnClickListener(new x3.a(this, 1));
        this.C0.f4667l.setOnClickListener(new x3.b(this, 1));
        this.f4934o0 = this.f4933n0.a();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(q());
        this.f4944z0 = linearLayoutManager;
        this.C0.f4669o.setLayoutManager(linearLayoutManager);
        RecyclerView.i itemAnimator = this.C0.f4669o.getItemAnimator();
        if (itemAnimator instanceof e0) {
            ((e0) itemAnimator).f2972g = false;
        }
        this.C0.f4669o.h(new d(null));
        Context q10 = q();
        new LinearInterpolator();
        new DecelerateInterpolator();
        q10.getResources().getDisplayMetrics();
        this.C0.f4663h.setVisibility(this.E0 ? 0 : 8);
        this.B0 = I(R.string.no_comment);
        M0();
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        this.G0 = compositeDisposable;
        compositeDisposable.add(this.f4935p0.a(false).subscribe(new h(this, 6)));
        return this.C0.f4657a;
    }

    @Override // androidx.fragment.app.Fragment
    public void Y() {
        this.U = true;
        t3.o.d(this.K0);
        CompositeDisposable compositeDisposable = this.G0;
        if (compositeDisposable != null) {
            compositeDisposable.dispose();
        }
        this.C0 = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void l0(Bundle bundle) {
        this.U = true;
        if (this.J0 == null) {
            UserMetaData a10 = this.f4936q0.a();
            com.app.pornhub.view.comments.a aVar = new com.app.pornhub.view.comments.a(this, this.H0, l.a(a10), (a10 == null || a10.getEmailVerificationRequired()) ? false : true, this.I0);
            this.J0 = aVar;
            this.C0.f4669o.setAdapter(aVar);
            K0();
        } else if (TextUtils.isEmpty(this.A0)) {
            this.C0.f4669o.setAdapter(this.J0);
        } else {
            Q0(this.A0);
        }
        this.G0.add(this.w0.r().subscribe(new x2.a(this, 6)));
    }
}
