package com.app.pornhub.view.comments;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.e0;
import c4.b;
import com.app.pornhub.R;
import com.app.pornhub.data.model.explore.ExploreModel;
import com.app.pornhub.databinding.ActivityChildCommentsBinding;
import com.app.pornhub.domain.error.OperationException;
import com.app.pornhub.domain.model.comment.CommentsSource;
import com.app.pornhub.domain.model.comment.UserComment;
import com.app.pornhub.domain.model.user.UserMetaData;
import com.app.pornhub.view.browser.BrowserActivity;
import com.app.pornhub.view.login.LoginActivity;
import com.app.pornhub.view.login.SignupActivity;
import e3.c;
import f3.k;
import f3.s;
import io.reactivex.disposables.CompositeDisposable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import q3.d;
import t3.l;
import v3.b;

/* loaded from: classes.dex */
public class ChildCommentsActivity extends b implements b.InterfaceC0049b {
    public static final /* synthetic */ int Z = 0;
    public k K;
    public s L;
    public e3.b M;
    public e3.b N;
    public e3.a O;
    public e3.a P;
    public c Q;
    public e3.a R;
    public d S;
    public ActivityChildCommentsBinding T;
    public c4.b U;
    public CompositeDisposable V;
    public String W;
    public String X;
    public CommentsSource Y;

    /* loaded from: classes.dex */
    public enum Type {
        REPLY,
        SCROLL_TOP,
        SCROLL_BOTTOM
    }

    /* loaded from: classes.dex */
    public class a extends ClickableSpan {

        /* renamed from: c  reason: collision with root package name */
        public Intent f4931c;

        public a(Intent intent) {
            this.f4931c = intent;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            ChildCommentsActivity.this.startActivity(this.f4931c);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    public final String C(OperationException operationException) {
        int a10 = operationException.a();
        if (a10 != 70) {
            if (a10 != 10001) {
                if (a10 != 10002) {
                    StringBuilder m10 = a1.a.m("Error: ");
                    m10.append(operationException.getMessage());
                    return m10.toString();
                }
                return getString(R.string.error_login_required_to_flag);
            }
            return getString(R.string.error_login_required_for_dislike);
        }
        return getString(R.string.error_comments_rate_limit);
    }

    public final void D() {
        UserMetaData a10 = this.K.a();
        if (a10 != null) {
            if (!a10.getEmailVerificationRequired()) {
                this.T.f4371e.setVisibility(0);
                this.T.d.setVisibility(8);
                return;
            }
            this.T.f4371e.setVisibility(8);
            this.T.d.setVisibility(0);
            TextView textView = this.T.f4369b;
            String string = getString(R.string.email_verification_required_for_comments);
            String string2 = getString(R.string.comments_email_verification_span);
            Intent B = BrowserActivity.B(this, this.S.i(), getString(R.string.resend_email));
            int indexOf = string.indexOf(string2);
            SpannableString spannableString = new SpannableString(string);
            spannableString.setSpan(new a(B), indexOf, string2.length() + indexOf, 18);
            textView.setText(spannableString, TextView.BufferType.SPANNABLE);
            this.T.f4369b.setMovementMethod(LinkMovementMethod.getInstance());
            return;
        }
        this.T.f4371e.setVisibility(8);
        this.T.d.setVisibility(0);
        TextView textView2 = this.T.f4369b;
        String upperCase = getString(R.string.login).toUpperCase();
        String string3 = getString(R.string.signup_cap);
        String format = String.format(getString(R.string.auth_req_comments), upperCase, string3);
        SpannableString spannableString2 = new SpannableString(format);
        int indexOf2 = format.indexOf(upperCase);
        int indexOf3 = format.indexOf(string3);
        if (indexOf2 != -1 && indexOf3 != -1) {
            Intent D = SignupActivity.D(this);
            spannableString2.setSpan(new a(LoginActivity.C(this)), indexOf2, upperCase.length() + indexOf2, 18);
            spannableString2.setSpan(new a(D), indexOf3, string3.length() + indexOf3, 18);
        }
        textView2.setText(spannableString2, TextView.BufferType.SPANNABLE);
        this.T.f4369b.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // v3.b, y4.a
    public void i() {
    }

    @Override // y4.b, androidx.fragment.app.o, androidx.core.mh.ComponentActivity, b0.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActivityChildCommentsBinding inflate = ActivityChildCommentsBinding.inflate(getLayoutInflater());
        this.T = inflate;
        inflate.f4372f.setOnClickListener(new u3.b(this, 1));
        setContentView(this.T.f4368a);
        ((TextView) this.T.f4376j.findViewById(R.id.toolbar_title)).setText(R.string.replies);
        A(this.T.f4376j);
        y().m(true);
        y().n(false);
        this.T.f4375i.setLayoutManager(new LinearLayoutManager(1, false));
        ((e0) this.T.f4375i.getItemAnimator()).f2972g = false;
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        this.V = compositeDisposable;
        compositeDisposable.add(this.L.a(false).subscribe(new x2.c(this, 8)));
        this.W = getIntent().getStringExtra("unit_id");
        String parentId = getIntent().getStringExtra("parent_id");
        this.X = parentId;
        c cVar = this.Q;
        String itemId = this.W;
        Objects.requireNonNull(cVar);
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(parentId, "parentId");
        List<UserComment> j10 = cVar.f9037a.j(itemId, parentId);
        String stringExtra = getIntent().getStringExtra("source");
        if (stringExtra == null) {
            throw new IllegalArgumentException("Comment source not suplied!");
        }
        if (stringExtra.equals("video")) {
            this.Y = CommentsSource.Video.INSTANCE;
        } else if (stringExtra.equals(ExploreModel.GIF)) {
            this.Y = CommentsSource.Gif.INSTANCE;
        }
        c4.b bVar = new c4.b(this, l.a(this.K.a()));
        this.U = bVar;
        Objects.requireNonNull(bVar);
        ArrayList arrayList = new ArrayList();
        for (UserComment userComment : j10) {
            arrayList.add(new b.c(userComment));
        }
        int size = bVar.d.size();
        bVar.d.addAll(arrayList);
        bVar.f2802a.e(size, arrayList.size());
        this.T.f4375i.setAdapter(this.U);
        if (this.U.a() == 0) {
            this.T.f4375i.setVisibility(4);
            this.T.f4374h.setVisibility(0);
        }
        int ordinal = ((Type) getIntent().getSerializableExtra("view_type")).ordinal();
        if (ordinal == 0) {
            this.T.f4370c.requestFocus();
            ((InputMethodManager) getSystemService("input_method")).showSoftInput(this.T.f4370c, 1);
        } else if (ordinal == 1) {
            this.T.f4375i.g0(0);
        } else if (ordinal == 2) {
            this.T.f4375i.g0(this.U.a() - 1);
        }
        D();
    }

    @Override // y4.b, e.g, androidx.fragment.app.o, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.V.dispose();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
