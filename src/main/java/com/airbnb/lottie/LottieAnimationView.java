package com.airbnb.lottie;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import b2.e;
import b2.f;
import b2.g;
import b2.h;
import b2.i;
import b2.j;
import b2.k;
import b2.l;
import b2.n;
import b2.p;
import b2.t;
import b2.u;
import b2.w;
import com.app.pornhub.R;
import java.io.ByteArrayInputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;

/* loaded from: classes.dex */
public class LottieAnimationView extends AppCompatImageView {
    public static final n<Throwable> M = new a();
    public int A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public RenderMode H;
    public final Set<p> I;
    public int J;
    public t<f> K;
    public f L;

    /* renamed from: m  reason: collision with root package name */
    public final n<f> f4101m;
    public final n<Throwable> n;

    /* renamed from: t  reason: collision with root package name */
    public n<Throwable> f4102t;

    /* renamed from: u  reason: collision with root package name */
    public int f4103u;

    /* renamed from: w  reason: collision with root package name */
    public final l f4104w;
    public boolean y;

    /* renamed from: z  reason: collision with root package name */
    public String f4105z;

    /* loaded from: classes.dex */
    public class a implements n<Throwable> {
        /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
        @Override // b2.n
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(java.lang.Throwable r6) {
            /*
                r5 = this;
                r2 = r5
                java.lang.Throwable r6 = (java.lang.Throwable) r6
                java.lang.String r4 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
                java.lang.ThreadLocal<android.graphics.PathMeasure> r0 = m2.g.f12877a
                r4 = 5
                boolean r0 = r6 instanceof java.net.SocketException
                if (r0 != 0) goto L2f
                boolean r0 = r6 instanceof java.nio.channels.ClosedChannelException
                r4 = 5
                if (r0 != 0) goto L2f
                r4 = 5
                boolean r0 = r6 instanceof java.io.InterruptedIOException
                r4 = 7
                if (r0 != 0) goto L2f
                r4 = 1
                boolean r0 = r6 instanceof java.net.ProtocolException
                if (r0 != 0) goto L2f
                r4 = 5
                boolean r0 = r6 instanceof javax.net.ssl.SSLException
                if (r0 != 0) goto L2f
                boolean r0 = r6 instanceof java.net.UnknownHostException
                r4 = 1
                if (r0 != 0) goto L2f
                boolean r0 = r6 instanceof java.net.UnknownServiceException
                r4 = 6
                if (r0 == 0) goto L2c
                goto L30
            L2c:
                r4 = 0
                r0 = r4
                goto L31
            L2f:
                r4 = 6
            L30:
                r0 = 1
            L31:
                if (r0 == 0) goto L3b
                r4 = 2
                java.lang.String r0 = "Unable to load composition."
                m2.c.b(r0, r6)
                r4 = 1
                return
            L3b:
                r4 = 2
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r4 = 1
                java.lang.String r1 = "Unable to parse composition"
                r0.<init>(r1, r6)
                throw r0
                r4 = 3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.LottieAnimationView.a.a(java.lang.Object):void");
        }
    }

    /* loaded from: classes.dex */
    public class b implements n<f> {
        public b() {
        }

        @Override // b2.n
        public void a(f fVar) {
            LottieAnimationView.this.setComposition(fVar);
        }
    }

    /* loaded from: classes.dex */
    public class c implements n<Throwable> {
        public c() {
        }

        @Override // b2.n
        public void a(Throwable th) {
            Throwable th2 = th;
            LottieAnimationView lottieAnimationView = LottieAnimationView.this;
            int i10 = lottieAnimationView.f4103u;
            if (i10 != 0) {
                lottieAnimationView.setImageResource(i10);
            }
            n<Throwable> nVar = LottieAnimationView.this.f4102t;
            if (nVar == null) {
                n<Throwable> nVar2 = LottieAnimationView.M;
                nVar = LottieAnimationView.M;
            }
            nVar.a(th2);
        }
    }

    /* loaded from: classes.dex */
    public static class d extends View.BaseSavedState {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public String f4108c;

        /* renamed from: f  reason: collision with root package name */
        public int f4109f;

        /* renamed from: j  reason: collision with root package name */
        public float f4110j;

        /* renamed from: m  reason: collision with root package name */
        public boolean f4111m;
        public String n;

        /* renamed from: t  reason: collision with root package name */
        public int f4112t;

        /* renamed from: u  reason: collision with root package name */
        public int f4113u;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            public d createFromParcel(Parcel parcel) {
                return new d(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public d[] newArray(int i10) {
                return new d[i10];
            }
        }

        public d(Parcel parcel, a aVar) {
            super(parcel);
            this.f4108c = parcel.readString();
            this.f4110j = parcel.readFloat();
            this.f4111m = parcel.readInt() == 1;
            this.n = parcel.readString();
            this.f4112t = parcel.readInt();
            this.f4113u = parcel.readInt();
        }

        public d(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f4108c);
            parcel.writeFloat(this.f4110j);
            parcel.writeInt(this.f4111m ? 1 : 0);
            parcel.writeString(this.n);
            parcel.writeInt(this.f4112t);
            parcel.writeInt(this.f4113u);
        }
    }

    public LottieAnimationView(Context context) {
        super(context, null);
        this.f4101m = new b();
        this.n = new c();
        this.f4103u = 0;
        this.f4104w = new l();
        this.B = false;
        this.C = false;
        this.D = false;
        this.E = false;
        this.F = false;
        this.G = true;
        this.H = RenderMode.AUTOMATIC;
        this.I = new HashSet();
        this.J = 0;
        l(null, R.attr.lottieAnimationViewStyle);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4101m = new b();
        this.n = new c();
        this.f4103u = 0;
        this.f4104w = new l();
        this.B = false;
        this.C = false;
        this.D = false;
        this.E = false;
        this.F = false;
        this.G = true;
        this.H = RenderMode.AUTOMATIC;
        this.I = new HashSet();
        this.J = 0;
        l(attributeSet, R.attr.lottieAnimationViewStyle);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f4101m = new b();
        this.n = new c();
        this.f4103u = 0;
        this.f4104w = new l();
        this.B = false;
        this.C = false;
        this.D = false;
        this.E = false;
        this.F = false;
        this.G = true;
        this.H = RenderMode.AUTOMATIC;
        this.I = new HashSet();
        this.J = 0;
        l(attributeSet, i10);
    }

    private void setCompositionTask(t<f> tVar) {
        this.L = null;
        this.f4104w.d();
        j();
        tVar.b(this.f4101m);
        tVar.a(this.n);
        this.K = tVar;
    }

    @Override // android.view.View
    public void buildDrawingCache(boolean z10) {
        this.J++;
        super.buildDrawingCache(z10);
        if (this.J == 1 && getWidth() > 0 && getHeight() > 0 && getLayerType() == 1 && getDrawingCache(z10) == null) {
            setRenderMode(RenderMode.HARDWARE);
        }
        this.J--;
        f1.a.b("buildDrawingCache");
    }

    public f getComposition() {
        return this.L;
    }

    public long getDuration() {
        f fVar = this.L;
        if (fVar != null) {
            return fVar.b();
        }
        return 0L;
    }

    public int getFrame() {
        return (int) this.f4104w.f3480j.f12870t;
    }

    public String getImageAssetsFolder() {
        return this.f4104w.f3485z;
    }

    public float getMaxFrame() {
        return this.f4104w.f();
    }

    public float getMinFrame() {
        return this.f4104w.g();
    }

    public u getPerformanceTracker() {
        f fVar = this.f4104w.f3479f;
        if (fVar != null) {
            return fVar.f3448a;
        }
        return null;
    }

    public float getProgress() {
        return this.f4104w.h();
    }

    public int getRepeatCount() {
        return this.f4104w.i();
    }

    public int getRepeatMode() {
        return this.f4104w.f3480j.getRepeatMode();
    }

    public float getScale() {
        return this.f4104w.f3481m;
    }

    public float getSpeed() {
        return this.f4104w.f3480j.f12868j;
    }

    public void i() {
        this.D = false;
        this.C = false;
        this.B = false;
        l lVar = this.f4104w;
        lVar.f3484w.clear();
        lVar.f3480j.cancel();
        k();
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        l lVar = this.f4104w;
        if (drawable2 == lVar) {
            super.invalidateDrawable(lVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public final void j() {
        t<f> tVar = this.K;
        if (tVar != null) {
            n<f> nVar = this.f4101m;
            synchronized (tVar) {
                tVar.f3544a.remove(nVar);
            }
            t<f> tVar2 = this.K;
            n<Throwable> nVar2 = this.n;
            synchronized (tVar2) {
                tVar2.f3545b.remove(nVar2);
            }
        }
    }

    public final void k() {
        int i10;
        int ordinal = this.H.ordinal();
        int i11 = 2;
        if (ordinal == 0) {
            f fVar = this.L;
            boolean z10 = false;
            if ((fVar == null || !fVar.n || Build.VERSION.SDK_INT >= 28) && ((fVar == null || fVar.f3460o <= 4) && (i10 = Build.VERSION.SDK_INT) != 24 && i10 != 25)) {
                z10 = true;
            }
            i11 = 1;
        } else if (ordinal != 1) {
            i11 = 1;
        }
        if (i11 != getLayerType()) {
            setLayerType(i11, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003f, code lost:
        r0 = r10.getResourceId(10, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0044, code lost:
        if (r0 == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0046, code lost:
        setAnimation(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(android.util.AttributeSet r12, int r13) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.LottieAnimationView.l(android.util.AttributeSet, int):void");
    }

    public boolean m() {
        return this.f4104w.j();
    }

    public void n() {
        this.F = false;
        this.D = false;
        this.C = false;
        this.B = false;
        l lVar = this.f4104w;
        lVar.f3484w.clear();
        lVar.f3480j.k();
        k();
    }

    public void o() {
        if (!isShown()) {
            this.B = true;
            return;
        }
        this.f4104w.k();
        k();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode() && (this.F || this.D)) {
            o();
            this.F = false;
            this.D = false;
        }
        if (Build.VERSION.SDK_INT < 23) {
            onVisibilityChanged(this, getVisibility());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        if (m()) {
            i();
            this.D = true;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        String str = dVar.f4108c;
        this.f4105z = str;
        if (!TextUtils.isEmpty(str)) {
            setAnimation(this.f4105z);
        }
        int i10 = dVar.f4109f;
        this.A = i10;
        if (i10 != 0) {
            setAnimation(i10);
        }
        setProgress(dVar.f4110j);
        if (dVar.f4111m) {
            o();
        }
        this.f4104w.f3485z = dVar.n;
        setRepeatMode(dVar.f4112t);
        setRepeatCount(dVar.f4113u);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        boolean z10;
        d dVar = new d(super.onSaveInstanceState());
        dVar.f4108c = this.f4105z;
        dVar.f4109f = this.A;
        dVar.f4110j = this.f4104w.h();
        if (!this.f4104w.j()) {
            WeakHashMap<View, a0> weakHashMap = x.f13156a;
            if (x.g.b(this) || !this.D) {
                z10 = false;
                dVar.f4111m = z10;
                l lVar = this.f4104w;
                dVar.n = lVar.f3485z;
                dVar.f4112t = lVar.f3480j.getRepeatMode();
                dVar.f4113u = this.f4104w.i();
                return dVar;
            }
        }
        z10 = true;
        dVar.f4111m = z10;
        l lVar2 = this.f4104w;
        dVar.n = lVar2.f3485z;
        dVar.f4112t = lVar2.f3480j.getRepeatMode();
        dVar.f4113u = this.f4104w.i();
        return dVar;
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i10) {
        if (this.y) {
            if (!isShown()) {
                if (m()) {
                    n();
                    this.C = true;
                }
                return;
            }
            if (this.C) {
                if (isShown()) {
                    this.f4104w.l();
                    k();
                } else {
                    this.B = false;
                    this.C = true;
                }
            } else if (this.B) {
                o();
            }
            this.C = false;
            this.B = false;
        }
    }

    public void setAnimation(int i10) {
        t<f> a10;
        t<f> tVar;
        this.A = i10;
        this.f4105z = null;
        if (isInEditMode()) {
            tVar = new t<>(new b2.d(this, i10), true);
        } else {
            if (this.G) {
                Context context = getContext();
                String h10 = g.h(context, i10);
                a10 = g.a(h10, new j(new WeakReference(context), context.getApplicationContext(), i10, h10));
            } else {
                Context context2 = getContext();
                Map<String, t<f>> map = g.f3461a;
                a10 = g.a(null, new j(new WeakReference(context2), context2.getApplicationContext(), i10, null));
            }
            tVar = a10;
        }
        setCompositionTask(tVar);
    }

    public void setAnimation(String str) {
        t<f> a10;
        t<f> tVar;
        this.f4105z = str;
        this.A = 0;
        if (isInEditMode()) {
            tVar = new t<>(new e(this, str), true);
        } else {
            if (this.G) {
                Context context = getContext();
                Map<String, t<f>> map = g.f3461a;
                String l10 = a1.a.l("asset_", str);
                a10 = g.a(l10, new i(context.getApplicationContext(), str, l10));
            } else {
                Context context2 = getContext();
                Map<String, t<f>> map2 = g.f3461a;
                a10 = g.a(null, new i(context2.getApplicationContext(), str, null));
            }
            tVar = a10;
        }
        setCompositionTask(tVar);
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes());
        Map<String, t<f>> map = g.f3461a;
        setCompositionTask(g.a(null, new k(byteArrayInputStream, null)));
    }

    public void setAnimationFromUrl(String str) {
        t<f> a10;
        if (this.G) {
            Context context = getContext();
            Map<String, t<f>> map = g.f3461a;
            String l10 = a1.a.l("url_", str);
            a10 = g.a(l10, new h(context, str, l10));
        } else {
            Context context2 = getContext();
            Map<String, t<f>> map2 = g.f3461a;
            a10 = g.a(null, new h(context2, str, null));
        }
        setCompositionTask(a10);
    }

    public void setApplyingOpacityToLayersEnabled(boolean z10) {
        this.f4104w.H = z10;
    }

    public void setCacheComposition(boolean z10) {
        this.G = z10;
    }

    public void setComposition(f fVar) {
        this.f4104w.setCallback(this);
        this.L = fVar;
        boolean z10 = true;
        this.E = true;
        l lVar = this.f4104w;
        if (lVar.f3479f == fVar) {
            z10 = false;
        } else {
            lVar.J = false;
            lVar.d();
            lVar.f3479f = fVar;
            lVar.c();
            m2.d dVar = lVar.f3480j;
            boolean z11 = dVar.f12873z == null;
            dVar.f12873z = fVar;
            if (z11) {
                dVar.n((int) Math.max(dVar.f12872w, fVar.f3457k), (int) Math.min(dVar.y, fVar.f3458l));
            } else {
                dVar.n((int) fVar.f3457k, (int) fVar.f3458l);
            }
            float f10 = dVar.f12870t;
            dVar.f12870t = 0.0f;
            dVar.l((int) f10);
            dVar.b();
            lVar.v(lVar.f3480j.getAnimatedFraction());
            lVar.f3481m = lVar.f3481m;
            Iterator it = new ArrayList(lVar.f3484w).iterator();
            while (it.hasNext()) {
                l.o oVar = (l.o) it.next();
                if (oVar != null) {
                    oVar.a(fVar);
                }
                it.remove();
            }
            lVar.f3484w.clear();
            fVar.f3448a.f3548a = lVar.F;
            Drawable.Callback callback = lVar.getCallback();
            if (callback instanceof ImageView) {
                ImageView imageView = (ImageView) callback;
                imageView.setImageDrawable(null);
                imageView.setImageDrawable(lVar);
            }
        }
        this.E = false;
        k();
        if (getDrawable() != this.f4104w || z10) {
            if (!z10) {
                boolean m10 = m();
                setImageDrawable(null);
                setImageDrawable(this.f4104w);
                if (m10) {
                    this.f4104w.l();
                }
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            for (p pVar : this.I) {
                pVar.a(fVar);
            }
        }
    }

    public void setFailureListener(n<Throwable> nVar) {
        this.f4102t = nVar;
    }

    public void setFallbackResource(int i10) {
        this.f4103u = i10;
    }

    public void setFontAssetDelegate(b2.a aVar) {
        f2.a aVar2 = this.f4104w.B;
    }

    public void setFrame(int i10) {
        this.f4104w.m(i10);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z10) {
        this.f4104w.f3482t = z10;
    }

    public void setImageAssetDelegate(b2.b bVar) {
        l lVar = this.f4104w;
        lVar.A = bVar;
        f2.b bVar2 = lVar.y;
        if (bVar2 != null) {
            bVar2.f9368c = bVar;
        }
    }

    public void setImageAssetsFolder(String str) {
        this.f4104w.f3485z = str;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        j();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        j();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i10) {
        j();
        super.setImageResource(i10);
    }

    public void setMaxFrame(int i10) {
        this.f4104w.n(i10);
    }

    public void setMaxFrame(String str) {
        this.f4104w.o(str);
    }

    public void setMaxProgress(float f10) {
        this.f4104w.p(f10);
    }

    public void setMinAndMaxFrame(String str) {
        this.f4104w.r(str);
    }

    public void setMinFrame(int i10) {
        this.f4104w.s(i10);
    }

    public void setMinFrame(String str) {
        this.f4104w.t(str);
    }

    public void setMinProgress(float f10) {
        this.f4104w.u(f10);
    }

    public void setOutlineMasksAndMattes(boolean z10) {
        l lVar = this.f4104w;
        if (lVar.G == z10) {
            return;
        }
        lVar.G = z10;
        com.airbnb.lottie.model.layer.b bVar = lVar.D;
        if (bVar != null) {
            bVar.p(z10);
        }
    }

    public void setPerformanceTrackingEnabled(boolean z10) {
        l lVar = this.f4104w;
        lVar.F = z10;
        f fVar = lVar.f3479f;
        if (fVar != null) {
            fVar.f3448a.f3548a = z10;
        }
    }

    public void setProgress(float f10) {
        this.f4104w.v(f10);
    }

    public void setRenderMode(RenderMode renderMode) {
        this.H = renderMode;
        k();
    }

    public void setRepeatCount(int i10) {
        this.f4104w.f3480j.setRepeatCount(i10);
    }

    public void setRepeatMode(int i10) {
        this.f4104w.f3480j.setRepeatMode(i10);
    }

    public void setSafeMode(boolean z10) {
        this.f4104w.f3483u = z10;
    }

    public void setScale(float f10) {
        this.f4104w.f3481m = f10;
        if (getDrawable() == this.f4104w) {
            boolean m10 = m();
            setImageDrawable(null);
            setImageDrawable(this.f4104w);
            if (m10) {
                this.f4104w.l();
            }
        }
    }

    public void setSpeed(float f10) {
        this.f4104w.f3480j.f12868j = f10;
    }

    public void setTextDelegate(w wVar) {
        Objects.requireNonNull(this.f4104w);
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        l lVar;
        if (!this.E && drawable == (lVar = this.f4104w) && lVar.j()) {
            n();
        } else if (!this.E && (drawable instanceof l)) {
            l lVar2 = (l) drawable;
            if (lVar2.j()) {
                lVar2.f3484w.clear();
                lVar2.f3480j.k();
            }
        }
        super.unscheduleDrawable(drawable);
    }
}
