package com.bumptech.glide;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import android.widget.ImageView;
import com.bumptech.glide.request.RequestCoordinator;
import com.bumptech.glide.request.SingleRequest;
import d6.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import w5.n;

/* loaded from: classes.dex */
public class f<TranscodeType> extends z5.a<f<TranscodeType>> {
    public final Context Q;
    public final g R;
    public final Class<TranscodeType> S;
    public final d T;
    public h<?, ? super TranscodeType> U;
    public Object V;
    public List<z5.e<TranscodeType>> W;
    public f<TranscodeType> X;
    public f<TranscodeType> Y;
    public boolean Z = true;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f5652a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f5653b0;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f5654a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f5655b;

        static {
            int[] iArr = new int[Priority.values().length];
            f5655b = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5655b[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5655b[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5655b[0] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            f5654a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5654a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f5654a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f5654a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f5654a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f5654a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f5654a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f5654a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    static {
        new z5.f().d(j5.d.f11391b).k(Priority.LOW).p(true);
    }

    @SuppressLint({"CheckResult"})
    public f(b bVar, g gVar, Class<TranscodeType> cls, Context context) {
        z5.f fVar;
        this.R = gVar;
        this.S = cls;
        this.Q = context;
        d dVar = gVar.f5656c.f5621j;
        h<?, ?> hVar = dVar.f5645f.get(cls);
        if (hVar == null) {
            for (Map.Entry<Class<?>, h<?, ?>> entry : dVar.f5645f.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    hVar = (h<?, ? super TranscodeType>) entry.getValue();
                }
            }
        }
        this.U = (h<?, ? super TranscodeType>) (hVar == null ? (h<?, ? super TranscodeType>) d.f5640k : hVar);
        this.T = bVar.f5621j;
        for (z5.e<Object> eVar : gVar.y) {
            u(eVar);
        }
        synchronized (gVar) {
            fVar = gVar.f5663z;
        }
        a(fVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a6.h<android.widget.ImageView, TranscodeType> A(android.widget.ImageView r9) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.f.A(android.widget.ImageView):a6.h");
    }

    public f<TranscodeType> B(z5.e<TranscodeType> eVar) {
        if (this.L) {
            return clone().B(eVar);
        }
        this.W = null;
        return u(eVar);
    }

    public final f<TranscodeType> C(Object obj) {
        if (this.L) {
            return clone().C(obj);
        }
        this.V = obj;
        this.f5652a0 = true;
        l();
        return this;
    }

    public final z5.c D(Object obj, a6.g<TranscodeType> gVar, z5.e<TranscodeType> eVar, z5.a<?> aVar, RequestCoordinator requestCoordinator, h<?, ? super TranscodeType> hVar, Priority priority, int i10, int i11, Executor executor) {
        Context context = this.Q;
        d dVar = this.T;
        Object obj2 = this.V;
        Class<TranscodeType> cls = this.S;
        List<z5.e<TranscodeType>> list = this.W;
        com.bumptech.glide.load.engine.f fVar = dVar.f5646g;
        Objects.requireNonNull(hVar);
        return new SingleRequest(context, dVar, obj, obj2, cls, aVar, i10, i11, priority, gVar, eVar, list, requestCoordinator, fVar, b6.a.f3582b, executor);
    }

    public f<TranscodeType> u(z5.e<TranscodeType> eVar) {
        if (this.L) {
            return clone().u(eVar);
        }
        if (eVar != null) {
            if (this.W == null) {
                this.W = new ArrayList();
            }
            this.W.add(eVar);
        }
        l();
        return this;
    }

    @Override // z5.a
    /* renamed from: v */
    public f<TranscodeType> a(z5.a<?> aVar) {
        Objects.requireNonNull(aVar, "Argument must not be null");
        return (f) super.a(aVar);
    }

    public final z5.c w(Object obj, a6.g<TranscodeType> gVar, z5.e<TranscodeType> eVar, RequestCoordinator requestCoordinator, h<?, ? super TranscodeType> hVar, Priority priority, int i10, int i11, z5.a<?> aVar, Executor executor) {
        com.bumptech.glide.request.a aVar2;
        com.bumptech.glide.request.a aVar3;
        com.bumptech.glide.request.b D;
        int i12;
        int i13;
        int i14;
        int i15;
        if (this.Y != null) {
            com.bumptech.glide.request.a aVar4 = new com.bumptech.glide.request.a(obj, requestCoordinator);
            aVar2 = aVar4;
            aVar3 = aVar4;
        } else {
            aVar2 = null;
            aVar3 = requestCoordinator;
        }
        f<TranscodeType> fVar = this.X;
        if (fVar == null) {
            D = D(obj, gVar, eVar, aVar, aVar3, hVar, priority, i10, i11, executor);
        } else if (this.f5653b0) {
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        } else {
            h<?, ? super TranscodeType> hVar2 = fVar.Z ? hVar : fVar.U;
            Priority y = z5.a.f(fVar.f21785c, 8) ? this.X.f21788m : y(priority);
            f<TranscodeType> fVar2 = this.X;
            int i16 = fVar2.A;
            int i17 = fVar2.f21792z;
            if (l.j(i10, i11)) {
                f<TranscodeType> fVar3 = this.X;
                if (!l.j(fVar3.A, fVar3.f21792z)) {
                    i15 = aVar.A;
                    i14 = aVar.f21792z;
                    com.bumptech.glide.request.b bVar = new com.bumptech.glide.request.b(obj, aVar3);
                    z5.c D2 = D(obj, gVar, eVar, aVar, bVar, hVar, priority, i10, i11, executor);
                    this.f5653b0 = true;
                    f<TranscodeType> fVar4 = this.X;
                    z5.c w10 = fVar4.w(obj, gVar, eVar, bVar, hVar2, y, i15, i14, fVar4, executor);
                    this.f5653b0 = false;
                    bVar.f5925c = D2;
                    bVar.d = w10;
                    D = bVar;
                }
            }
            i14 = i17;
            i15 = i16;
            com.bumptech.glide.request.b bVar2 = new com.bumptech.glide.request.b(obj, aVar3);
            z5.c D22 = D(obj, gVar, eVar, aVar, bVar2, hVar, priority, i10, i11, executor);
            this.f5653b0 = true;
            f<TranscodeType> fVar42 = this.X;
            z5.c w102 = fVar42.w(obj, gVar, eVar, bVar2, hVar2, y, i15, i14, fVar42, executor);
            this.f5653b0 = false;
            bVar2.f5925c = D22;
            bVar2.d = w102;
            D = bVar2;
        }
        if (aVar2 == null) {
            return D;
        }
        f<TranscodeType> fVar5 = this.Y;
        int i18 = fVar5.A;
        int i19 = fVar5.f21792z;
        if (l.j(i10, i11)) {
            f<TranscodeType> fVar6 = this.Y;
            if (!l.j(fVar6.A, fVar6.f21792z)) {
                i13 = aVar.A;
                i12 = aVar.f21792z;
                f<TranscodeType> fVar7 = this.Y;
                z5.c w11 = fVar7.w(obj, gVar, eVar, aVar2, fVar7.U, fVar7.f21788m, i13, i12, fVar7, executor);
                aVar2.f5920c = D;
                aVar2.d = w11;
                return aVar2;
            }
        }
        i12 = i19;
        i13 = i18;
        f<TranscodeType> fVar72 = this.Y;
        z5.c w112 = fVar72.w(obj, gVar, eVar, aVar2, fVar72.U, fVar72.f21788m, i13, i12, fVar72, executor);
        aVar2.f5920c = D;
        aVar2.d = w112;
        return aVar2;
    }

    @Override // z5.a
    /* renamed from: x */
    public f<TranscodeType> clone() {
        f<TranscodeType> fVar = (f) super.clone();
        fVar.U = (h<?, ? super TranscodeType>) fVar.U.a();
        if (fVar.W != null) {
            fVar.W = new ArrayList(fVar.W);
        }
        f<TranscodeType> fVar2 = fVar.X;
        if (fVar2 != null) {
            fVar.X = fVar2.clone();
        }
        f<TranscodeType> fVar3 = fVar.Y;
        if (fVar3 != null) {
            fVar.Y = fVar3.clone();
        }
        return fVar;
    }

    public final Priority y(Priority priority) {
        int ordinal = priority.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            return Priority.IMMEDIATE;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return Priority.NORMAL;
            }
            StringBuilder m10 = a1.a.m("unknown priority: ");
            m10.append(this.f21788m);
            throw new IllegalArgumentException(m10.toString());
        }
        return Priority.HIGH;
    }

    public final <Y extends a6.g<TranscodeType>> Y z(Y y, z5.e<TranscodeType> eVar, z5.a<?> aVar, Executor executor) {
        Objects.requireNonNull(y, "Argument must not be null");
        if (this.f5652a0) {
            z5.c w10 = w(new Object(), y, eVar, null, this.U, aVar.f21788m, aVar.A, aVar.f21792z, aVar, executor);
            z5.c j10 = y.j();
            if (w10.h(j10)) {
                if (!(!aVar.y && j10.k())) {
                    Objects.requireNonNull(j10, "Argument must not be null");
                    if (!j10.isRunning()) {
                        j10.i();
                    }
                    return y;
                }
            }
            this.R.l(y);
            y.h(w10);
            g gVar = this.R;
            synchronized (gVar) {
                gVar.f5660t.f16441c.add(y);
                n nVar = gVar.f5659m;
                nVar.f16415a.add(w10);
                if (nVar.f16417c) {
                    w10.clear();
                    if (Log.isLoggable("RequestTracker", 2)) {
                        Log.v("RequestTracker", "Paused, delaying request");
                    }
                    nVar.f16416b.add(w10);
                } else {
                    w10.i();
                }
            }
            return y;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }
}
