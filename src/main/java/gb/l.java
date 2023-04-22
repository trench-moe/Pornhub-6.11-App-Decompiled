package gb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.app.pornhub.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final Context f9915a;

    /* renamed from: b  reason: collision with root package name */
    public final TextInputLayout f9916b;

    /* renamed from: c  reason: collision with root package name */
    public LinearLayout f9917c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public FrameLayout f9918e;

    /* renamed from: f  reason: collision with root package name */
    public Animator f9919f;

    /* renamed from: g  reason: collision with root package name */
    public final float f9920g;

    /* renamed from: h  reason: collision with root package name */
    public int f9921h;

    /* renamed from: i  reason: collision with root package name */
    public int f9922i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f9923j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f9924k;

    /* renamed from: l  reason: collision with root package name */
    public TextView f9925l;

    /* renamed from: m  reason: collision with root package name */
    public CharSequence f9926m;
    public int n;

    /* renamed from: o  reason: collision with root package name */
    public ColorStateList f9927o;

    /* renamed from: p  reason: collision with root package name */
    public CharSequence f9928p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f9929q;

    /* renamed from: r  reason: collision with root package name */
    public TextView f9930r;

    /* renamed from: s  reason: collision with root package name */
    public int f9931s;

    /* renamed from: t  reason: collision with root package name */
    public ColorStateList f9932t;

    /* renamed from: u  reason: collision with root package name */
    public Typeface f9933u;

    /* loaded from: classes2.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f9934a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ TextView f9935b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ int f9936c;
        public final /* synthetic */ TextView d;

        public a(int i10, TextView textView, int i11, TextView textView2) {
            this.f9934a = i10;
            this.f9935b = textView;
            this.f9936c = i11;
            this.d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            TextView textView;
            l lVar = l.this;
            lVar.f9921h = this.f9934a;
            lVar.f9919f = null;
            TextView textView2 = this.f9935b;
            if (textView2 != null) {
                textView2.setVisibility(4);
                if (this.f9936c == 1 && (textView = l.this.f9925l) != null) {
                    textView.setText((CharSequence) null);
                }
            }
            TextView textView3 = this.d;
            if (textView3 != null) {
                textView3.setTranslationY(0.0f);
                this.d.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public l(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f9915a = context;
        this.f9916b = textInputLayout;
        this.f9920g = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(android.widget.TextView r9, int r10) {
        /*
            r8 = this;
            android.widget.LinearLayout r0 = r8.f9917c
            java.lang.String r7 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            r1 = 0
            r5 = -2
            r2 = r5
            if (r0 != 0) goto L51
            r7 = 5
            android.widget.FrameLayout r0 = r8.f9918e
            r6 = 4
            if (r0 != 0) goto L51
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            android.content.Context r3 = r8.f9915a
            r6 = 6
            r0.<init>(r3)
            r8.f9917c = r0
            r0.setOrientation(r1)
            r7 = 4
            com.google.android.material.textfield.TextInputLayout r0 = r8.f9916b
            r7 = 7
            android.widget.LinearLayout r3 = r8.f9917c
            r7 = 3
            r4 = -1
            r7 = 2
            r0.addView(r3, r4, r2)
            r7 = 3
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            r7 = 1
            android.content.Context r3 = r8.f9915a
            r0.<init>(r3)
            r8.f9918e = r0
            r7 = 4
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r3 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r1, r2, r3)
            android.widget.LinearLayout r3 = r8.f9917c
            r7 = 1
            android.widget.FrameLayout r4 = r8.f9918e
            r3.addView(r4, r0)
            r6 = 4
            com.google.android.material.textfield.TextInputLayout r0 = r8.f9916b
            android.widget.EditText r0 = r0.getEditText()
            if (r0 == 0) goto L51
            r7 = 6
            r8.b()
            r7 = 6
        L51:
            r6 = 2
            r5 = 1
            r0 = r5
            if (r10 == 0) goto L5d
            if (r10 != r0) goto L5a
            r6 = 7
            goto L5d
        L5a:
            r10 = 0
            r6 = 1
            goto L5f
        L5d:
            r5 = 1
            r10 = r5
        L5f:
            if (r10 == 0) goto L6e
            r6 = 7
            android.widget.FrameLayout r10 = r8.f9918e
            r10.setVisibility(r1)
            r7 = 4
            android.widget.FrameLayout r10 = r8.f9918e
            r10.addView(r9)
            goto L79
        L6e:
            android.widget.LinearLayout$LayoutParams r10 = new android.widget.LinearLayout$LayoutParams
            r6 = 3
            r10.<init>(r2, r2)
            android.widget.LinearLayout r2 = r8.f9917c
            r2.addView(r9, r10)
        L79:
            android.widget.LinearLayout r9 = r8.f9917c
            r9.setVisibility(r1)
            r7 = 7
            int r9 = r8.d
            int r9 = r9 + r0
            r6 = 4
            r8.d = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gb.l.a(android.widget.TextView, int):void");
    }

    public void b() {
        if ((this.f9917c == null || this.f9916b.getEditText() == null) ? false : true) {
            EditText editText = this.f9916b.getEditText();
            boolean f10 = za.c.f(this.f9915a);
            LinearLayout linearLayout = this.f9917c;
            WeakHashMap<View, a0> weakHashMap = x.f13156a;
            x.e.k(linearLayout, h(f10, R.dimen.material_helper_text_font_1_3_padding_horizontal, x.e.f(editText)), h(f10, R.dimen.material_helper_text_font_1_3_padding_top, this.f9915a.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top)), h(f10, R.dimen.material_helper_text_font_1_3_padding_horizontal, x.e.e(editText)), 0);
        }
    }

    public void c() {
        Animator animator = this.f9919f;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void d(List<Animator> list, boolean z10, TextView textView, int i10, int i11, int i12) {
        if (textView == null || !z10) {
            return;
        }
        if (i10 == i12 || i10 == i11) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, i12 == i10 ? 1.0f : 0.0f);
            ofFloat.setDuration(167L);
            ofFloat.setInterpolator(ga.a.f9886a);
            list.add(ofFloat);
            if (i12 == i10) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, -this.f9920g, 0.0f);
                ofFloat2.setDuration(217L);
                ofFloat2.setInterpolator(ga.a.d);
                list.add(ofFloat2);
            }
        }
    }

    public boolean e() {
        return (this.f9922i != 1 || this.f9925l == null || TextUtils.isEmpty(this.f9923j)) ? false : true;
    }

    public final TextView f(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                return null;
            }
            return this.f9930r;
        }
        return this.f9925l;
    }

    public int g() {
        TextView textView = this.f9925l;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public final int h(boolean z10, int i10, int i11) {
        return z10 ? this.f9915a.getResources().getDimensionPixelSize(i10) : i11;
    }

    public void i() {
        this.f9923j = null;
        c();
        if (this.f9921h == 1) {
            if (this.f9929q && !TextUtils.isEmpty(this.f9928p)) {
                this.f9922i = 2;
                l(this.f9921h, this.f9922i, k(this.f9925l, null));
            }
            this.f9922i = 0;
        }
        l(this.f9921h, this.f9922i, k(this.f9925l, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void j(android.widget.TextView r7, int r8) {
        /*
            r6 = this;
            r2 = r6
            android.widget.LinearLayout r0 = r2.f9917c
            if (r0 != 0) goto L6
            return
        L6:
            r5 = 1
            r1 = r5
            if (r8 == 0) goto L10
            if (r8 != r1) goto Ld
            goto L11
        Ld:
            r4 = 0
            r8 = r4
            goto L12
        L10:
            r5 = 1
        L11:
            r8 = 1
        L12:
            if (r8 == 0) goto L20
            r5 = 2
            android.widget.FrameLayout r8 = r2.f9918e
            r4 = 4
            if (r8 == 0) goto L20
            r4 = 7
            r8.removeView(r7)
            r4 = 2
            goto L23
        L20:
            r0.removeView(r7)
        L23:
            int r7 = r2.d
            int r7 = r7 - r1
            r2.d = r7
            android.widget.LinearLayout r8 = r2.f9917c
            if (r7 != 0) goto L34
            r4 = 5
            r5 = 8
            r7 = r5
            r8.setVisibility(r7)
            r4 = 3
        L34:
            r4 = 6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gb.l.j(android.widget.TextView, int):void");
    }

    public final boolean k(TextView textView, CharSequence charSequence) {
        TextInputLayout textInputLayout = this.f9916b;
        WeakHashMap<View, a0> weakHashMap = x.f13156a;
        return x.g.c(textInputLayout) && this.f9916b.isEnabled() && !(this.f9922i == this.f9921h && textView != null && TextUtils.equals(textView.getText(), charSequence));
    }

    public final void l(int i10, int i11, boolean z10) {
        TextView f10;
        TextView f11;
        if (i10 == i11) {
            return;
        }
        if (z10) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f9919f = animatorSet;
            ArrayList arrayList = new ArrayList();
            d(arrayList, this.f9929q, this.f9930r, 2, i10, i11);
            d(arrayList, this.f9924k, this.f9925l, 1, i10, i11);
            a0.b.S(animatorSet, arrayList);
            animatorSet.addListener(new a(i11, f(i10), i10, f(i11)));
            animatorSet.start();
        } else if (i10 != i11) {
            if (i11 != 0 && (f11 = f(i11)) != null) {
                f11.setVisibility(0);
                f11.setAlpha(1.0f);
            }
            if (i10 != 0 && (f10 = f(i10)) != null) {
                f10.setVisibility(4);
                if (i10 == 1) {
                    f10.setText((CharSequence) null);
                }
            }
            this.f9921h = i11;
        }
        this.f9916b.y();
        this.f9916b.A(z10, false);
        this.f9916b.H();
    }
}
