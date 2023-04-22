package com.google.android.gms.cast.framework.media.widget;

import a9.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.app.pornhub.R;
import com.google.android.gms.internal.cast.zzju;
import f1.a;
import h9.o;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import t9.i;
import t9.k;
import t9.m;
import t9.p;
import t9.q;
import t9.r;
import t9.s;
import t9.t;
import t9.t0;
import t9.u;
import y8.c;
import y8.e;
import y8.f;
import y8.g;
import y8.h;
import y8.j;
import z8.d;

/* loaded from: classes.dex */
public class MiniControllerFragment extends Fragment {
    public static final b L0 = new b("MiniControllerFragment");
    public int A0;
    public int B0;
    public int C0;
    public int D0;
    public int E0;
    public int F0;
    public int G0;
    public int H0;
    public int I0;
    public int J0;
    public y8.b K0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f6835n0;

    /* renamed from: o0  reason: collision with root package name */
    public int f6836o0;

    /* renamed from: p0  reason: collision with root package name */
    public int f6837p0;

    /* renamed from: q0  reason: collision with root package name */
    public TextView f6838q0;

    /* renamed from: r0  reason: collision with root package name */
    public int f6839r0;

    /* renamed from: s0  reason: collision with root package name */
    public int f6840s0;

    /* renamed from: t0  reason: collision with root package name */
    public int f6841t0;

    /* renamed from: u0  reason: collision with root package name */
    public int f6842u0;

    /* renamed from: v0  reason: collision with root package name */
    public int[] f6843v0;
    public ImageView[] w0 = new ImageView[3];

    /* renamed from: x0  reason: collision with root package name */
    public int f6844x0;

    /* renamed from: y0  reason: collision with root package name */
    public int f6845y0;

    /* renamed from: z0  reason: collision with root package name */
    public int f6846z0;

    public final void K0(y8.b bVar, RelativeLayout relativeLayout, int i10, int i11) {
        ImageView imageView = (ImageView) relativeLayout.findViewById(i10);
        int i12 = this.f6843v0[i11];
        if (i12 == R.id.cast_button_type_empty) {
            imageView.setVisibility(4);
        } else if (i12 == R.id.cast_button_type_custom) {
        } else {
            if (i12 == R.id.cast_button_type_play_pause_toggle) {
                int i13 = this.f6845y0;
                int i14 = this.f6846z0;
                int i15 = this.A0;
                if (this.f6844x0 == 1) {
                    i13 = this.B0;
                    i14 = this.C0;
                    i15 = this.D0;
                }
                Drawable a10 = d.a(q(), this.f6842u0, i13);
                Drawable a11 = d.a(q(), this.f6842u0, i14);
                Drawable a12 = d.a(q(), this.f6842u0, i15);
                imageView.setImageDrawable(a11);
                ProgressBar progressBar = new ProgressBar(q());
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(8, i10);
                layoutParams.addRule(6, i10);
                layoutParams.addRule(5, i10);
                layoutParams.addRule(7, i10);
                layoutParams.addRule(15);
                progressBar.setLayoutParams(layoutParams);
                progressBar.setVisibility(8);
                Drawable indeterminateDrawable = progressBar.getIndeterminateDrawable();
                int i16 = this.f6841t0;
                if (i16 != 0 && indeterminateDrawable != null) {
                    indeterminateDrawable.setColorFilter(i16, PorterDuff.Mode.SRC_IN);
                }
                relativeLayout.addView(progressBar);
                o.d("Must be called from the main thread.");
                t0.b(zzju.PAUSE_CONTROLLER);
                imageView.setOnClickListener(new y8.d(bVar));
                bVar.t(imageView, new p(imageView, bVar.f18547c, a10, a11, a12, progressBar, true));
            } else if (i12 == R.id.cast_button_type_skip_previous) {
                imageView.setImageDrawable(d.a(q(), this.f6842u0, this.E0));
                imageView.setContentDescription(E().getString(R.string.cast_skip_prev));
                o.d("Must be called from the main thread.");
                imageView.setOnClickListener(new f(bVar));
                bVar.t(imageView, new t(imageView, 0));
            } else if (i12 == R.id.cast_button_type_skip_next) {
                imageView.setImageDrawable(d.a(q(), this.f6842u0, this.F0));
                imageView.setContentDescription(E().getString(R.string.cast_skip_next));
                o.d("Must be called from the main thread.");
                imageView.setOnClickListener(new e(bVar));
                bVar.t(imageView, new s(imageView, 0));
            } else if (i12 == R.id.cast_button_type_rewind_30_seconds) {
                imageView.setImageDrawable(d.a(q(), this.f6842u0, this.G0));
                imageView.setContentDescription(E().getString(R.string.cast_rewind_30));
                o.d("Must be called from the main thread.");
                imageView.setOnClickListener(new h(bVar, 30000L));
                bVar.t(imageView, new r(imageView, bVar.f18550m));
            } else if (i12 == R.id.cast_button_type_forward_30_seconds) {
                imageView.setImageDrawable(d.a(q(), this.f6842u0, this.H0));
                imageView.setContentDescription(E().getString(R.string.cast_forward_30));
                o.d("Must be called from the main thread.");
                imageView.setOnClickListener(new g(bVar, 30000L));
                bVar.t(imageView, new i(imageView, bVar.f18550m));
            } else if (i12 == R.id.cast_button_type_mute_toggle) {
                imageView.setImageDrawable(d.a(q(), this.f6842u0, this.I0));
                o.d("Must be called from the main thread.");
                imageView.setOnClickListener(new c(bVar));
                bVar.t(imageView, new t9.o(imageView, bVar.f18547c));
            } else if (i12 == R.id.cast_button_type_closed_caption) {
                imageView.setImageDrawable(d.a(q(), this.f6842u0, this.J0));
                o.d("Must be called from the main thread.");
                imageView.setOnClickListener(new j(bVar));
                bVar.t(imageView, new t9.h(imageView, bVar.f18547c));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View W(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        y8.b bVar = new y8.b(n());
        this.K0 = bVar;
        View inflate = layoutInflater.inflate(R.layout.cast_mini_controller, viewGroup);
        inflate.setVisibility(8);
        Objects.requireNonNull(bVar);
        o.d("Must be called from the main thread.");
        bVar.t(inflate, new u(inflate, 8));
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R.id.container_current);
        int i10 = this.f6839r0;
        if (i10 != 0) {
            relativeLayout.setBackgroundResource(i10);
        }
        ImageView imageView = (ImageView) inflate.findViewById(R.id.icon_view);
        TextView textView = (TextView) inflate.findViewById(R.id.title_view);
        if (this.f6836o0 != 0) {
            textView.setTextAppearance(n(), this.f6836o0);
        }
        TextView textView2 = (TextView) inflate.findViewById(R.id.subtitle_view);
        this.f6838q0 = textView2;
        if (this.f6837p0 != 0) {
            textView2.setTextAppearance(n(), this.f6837p0);
        }
        ProgressBar progressBar = (ProgressBar) inflate.findViewById(R.id.progressBar);
        if (this.f6840s0 != 0) {
            ((LayerDrawable) progressBar.getProgressDrawable()).setColorFilter(this.f6840s0, PorterDuff.Mode.SRC_IN);
        }
        o.d("Must be called from the main thread.");
        List singletonList = Collections.singletonList("com.google.android.gms.cast.metadata.TITLE");
        o.d("Must be called from the main thread.");
        bVar.t(textView, new m(textView, singletonList));
        TextView textView3 = this.f6838q0;
        o.d("Must be called from the main thread.");
        bVar.t(textView3, new k(textView3));
        o.d("Must be called from the main thread.");
        bVar.t(progressBar, new q(progressBar, 1000L));
        o.d("Must be called from the main thread.");
        relativeLayout.setOnClickListener(new y8.i(bVar));
        bVar.t(relativeLayout, new k(relativeLayout));
        if (this.f6835n0) {
            w8.b bVar2 = new w8.b(2, E().getDimensionPixelSize(R.dimen.cast_mini_controller_icon_width), E().getDimensionPixelSize(R.dimen.cast_mini_controller_icon_height));
            o.d("Must be called from the main thread.");
            bVar.t(imageView, new t9.j(imageView, bVar.f18547c, bVar2, R.drawable.cast_album_art_placeholder, null));
        } else {
            imageView.setVisibility(8);
        }
        this.w0[0] = (ImageView) relativeLayout.findViewById(R.id.button_0);
        this.w0[1] = (ImageView) relativeLayout.findViewById(R.id.button_1);
        this.w0[2] = (ImageView) relativeLayout.findViewById(R.id.button_2);
        K0(bVar, relativeLayout, R.id.button_0, 0);
        K0(bVar, relativeLayout, R.id.button_1, 1);
        K0(bVar, relativeLayout, R.id.button_2, 2);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void X() {
        y8.b bVar = this.K0;
        if (bVar != null) {
            o.d("Must be called from the main thread.");
            bVar.r();
            bVar.f18549j.clear();
            v8.g gVar = bVar.f18548f;
            if (gVar != null) {
                gVar.e(bVar, v8.d.class);
            }
            this.K0 = null;
        }
        this.U = true;
    }

    @Override // androidx.fragment.app.Fragment
    public void b0(Context context, AttributeSet attributeSet, Bundle bundle) {
        super.b0(context, attributeSet, bundle);
        if (this.f6843v0 == null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.C, R.attr.castMiniControllerStyle, R.style.CastMiniController);
            this.f6835n0 = obtainStyledAttributes.getBoolean(14, true);
            this.f6836o0 = obtainStyledAttributes.getResourceId(19, 0);
            this.f6837p0 = obtainStyledAttributes.getResourceId(18, 0);
            this.f6839r0 = obtainStyledAttributes.getResourceId(0, 0);
            int color = obtainStyledAttributes.getColor(12, 0);
            this.f6840s0 = color;
            this.f6841t0 = obtainStyledAttributes.getColor(8, color);
            this.f6842u0 = obtainStyledAttributes.getResourceId(1, 0);
            this.f6845y0 = obtainStyledAttributes.getResourceId(11, 0);
            this.f6846z0 = obtainStyledAttributes.getResourceId(10, 0);
            this.A0 = obtainStyledAttributes.getResourceId(17, 0);
            this.B0 = obtainStyledAttributes.getResourceId(11, 0);
            this.C0 = obtainStyledAttributes.getResourceId(10, 0);
            this.D0 = obtainStyledAttributes.getResourceId(17, 0);
            this.E0 = obtainStyledAttributes.getResourceId(16, 0);
            this.F0 = obtainStyledAttributes.getResourceId(15, 0);
            this.G0 = obtainStyledAttributes.getResourceId(13, 0);
            this.H0 = obtainStyledAttributes.getResourceId(4, 0);
            this.I0 = obtainStyledAttributes.getResourceId(9, 0);
            this.J0 = obtainStyledAttributes.getResourceId(2, 0);
            int resourceId = obtainStyledAttributes.getResourceId(3, 0);
            if (resourceId != 0) {
                TypedArray obtainTypedArray = context.getResources().obtainTypedArray(resourceId);
                o.a(obtainTypedArray.length() == 3);
                this.f6843v0 = new int[obtainTypedArray.length()];
                for (int i10 = 0; i10 < obtainTypedArray.length(); i10++) {
                    this.f6843v0[i10] = obtainTypedArray.getResourceId(i10, 0);
                }
                obtainTypedArray.recycle();
                if (this.f6835n0) {
                    this.f6843v0[0] = R.id.cast_button_type_empty;
                }
                this.f6844x0 = 0;
                for (int i11 : this.f6843v0) {
                    if (i11 != R.id.cast_button_type_empty) {
                        this.f6844x0++;
                    }
                }
            } else {
                b bVar = L0;
                Log.w(bVar.f254a, bVar.e("Unable to read attribute castControlButtons.", new Object[0]));
                this.f6843v0 = new int[]{R.id.cast_button_type_empty, R.id.cast_button_type_empty, R.id.cast_button_type_empty};
            }
            obtainStyledAttributes.recycle();
        }
        t0.b(zzju.CAF_MINI_CONTROLLER);
    }
}
