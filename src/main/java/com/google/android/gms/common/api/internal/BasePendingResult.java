package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import d9.c;
import d9.d;
import d9.e;
import d9.f;
import d9.g;
import e9.d1;
import e9.e1;
import e9.s0;
import h9.i;
import h9.o;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

@KeepName
/* loaded from: classes.dex */
public abstract class BasePendingResult<R extends f> extends d<R> {
    public static final ThreadLocal<Boolean> zaa = new d1();
    @KeepName
    private e1 mResultGuardian;
    public final a<R> zab;
    public final WeakReference<c> zac;
    private final Object zae;
    private final CountDownLatch zaf;
    private final ArrayList<d.a> zag;
    private g<? super R> zah;
    private final AtomicReference<s0> zai;
    private R zaj;
    private Status zak;
    private volatile boolean zal;
    private boolean zam;
    private boolean zan;
    private i zao;
    private boolean zaq;

    /* loaded from: classes.dex */
    public static class a<R extends f> extends s9.f {
        public a(Looper looper) {
            super(looper);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                Pair pair = (Pair) message.obj;
                g gVar = (g) pair.first;
                f fVar = (f) pair.second;
                try {
                    gVar.a(fVar);
                } catch (RuntimeException e10) {
                    BasePendingResult.zal(fVar);
                    throw e10;
                }
            } else if (i10 == 2) {
                ((BasePendingResult) message.obj).forceFailureUnlessReady(Status.f6857w);
            } else {
                StringBuilder sb2 = new StringBuilder(45);
                sb2.append("Don't know how to handle message: ");
                sb2.append(i10);
                Log.wtf("BasePendingResult", sb2.toString(), new Exception());
            }
        }
    }

    @Deprecated
    public BasePendingResult() {
        this.zae = new Object();
        this.zaf = new CountDownLatch(1);
        this.zag = new ArrayList<>();
        this.zai = new AtomicReference<>();
        this.zaq = false;
        this.zab = new a<>(Looper.getMainLooper());
        this.zac = new WeakReference<>(null);
    }

    public BasePendingResult(c cVar) {
        this.zae = new Object();
        this.zaf = new CountDownLatch(1);
        this.zag = new ArrayList<>();
        this.zai = new AtomicReference<>();
        this.zaq = false;
        this.zab = new a<>(cVar != null ? cVar.b() : Looper.getMainLooper());
        this.zac = new WeakReference<>(cVar);
    }

    private final R zaa() {
        R r10;
        synchronized (this.zae) {
            o.k(!this.zal, "Result has already been consumed.");
            o.k(isReady(), "Result is not ready.");
            r10 = this.zaj;
            this.zaj = null;
            this.zah = null;
            this.zal = true;
        }
        if (this.zai.getAndSet(null) == null) {
            Objects.requireNonNull(r10, "null reference");
            return r10;
        }
        Objects.requireNonNull(null);
        throw null;
    }

    private final void zab(R r10) {
        this.zaj = r10;
        this.zak = r10.V();
        this.zao = null;
        this.zaf.countDown();
        if (this.zam) {
            this.zah = null;
        } else {
            g<? super R> gVar = this.zah;
            if (gVar != null) {
                this.zab.removeMessages(2);
                a<R> aVar = this.zab;
                R zaa2 = zaa();
                Objects.requireNonNull(aVar);
                aVar.sendMessage(aVar.obtainMessage(1, new Pair(gVar, zaa2)));
            } else if (this.zaj instanceof e) {
                this.mResultGuardian = new e1(this);
            }
        }
        ArrayList<d.a> arrayList = this.zag;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.get(i10).a(this.zak);
        }
        this.zag.clear();
    }

    public static void zal(f fVar) {
        if (fVar instanceof e) {
            try {
                ((e) fVar).a();
            } catch (RuntimeException e10) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(fVar)), e10);
            }
        }
    }

    public final void addStatusListener(d.a aVar) {
        o.b(aVar != null, "Callback cannot be null.");
        synchronized (this.zae) {
            if (isReady()) {
                aVar.a(this.zak);
            } else {
                this.zag.add(aVar);
            }
        }
    }

    @Override // d9.d
    public final R await(long j10, TimeUnit timeUnit) {
        if (j10 > 0) {
            o.g("await must not be called on the UI thread when time is greater than zero.");
        }
        o.k(!this.zal, "Result has already been consumed.");
        try {
            if (!this.zaf.await(j10, timeUnit)) {
                forceFailureUnlessReady(Status.f6857w);
            }
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.f6856u);
        }
        o.k(isReady(), "Result is not ready.");
        return zaa();
    }

    @Override // d9.d
    public void cancel() {
        synchronized (this.zae) {
            if (!this.zam && !this.zal) {
                i iVar = this.zao;
                if (iVar != null) {
                    try {
                        iVar.cancel();
                    } catch (RemoteException unused) {
                    }
                }
                zal(this.zaj);
                this.zam = true;
                zab(createFailedResult(Status.y));
            }
        }
    }

    public abstract R createFailedResult(Status status);

    @Deprecated
    public final void forceFailureUnlessReady(Status status) {
        synchronized (this.zae) {
            if (!isReady()) {
                setResult(createFailedResult(status));
                this.zan = true;
            }
        }
    }

    public final boolean isCanceled() {
        boolean z10;
        synchronized (this.zae) {
            z10 = this.zam;
        }
        return z10;
    }

    public final boolean isReady() {
        return this.zaf.getCount() == 0;
    }

    public final void setResult(R r10) {
        synchronized (this.zae) {
            if (this.zan || this.zam) {
                zal(r10);
                return;
            }
            isReady();
            o.k(!isReady(), "Results have already been set");
            o.k(!this.zal, "Result has already been consumed");
            zab(r10);
        }
    }

    @Override // d9.d
    public final void setResultCallback(g<? super R> gVar) {
        synchronized (this.zae) {
            if (gVar == null) {
                this.zah = null;
                return;
            }
            o.k(!this.zal, "Result has already been consumed.");
            if (isCanceled()) {
                return;
            }
            if (isReady()) {
                a<R> aVar = this.zab;
                R zaa2 = zaa();
                Objects.requireNonNull(aVar);
                aVar.sendMessage(aVar.obtainMessage(1, new Pair(gVar, zaa2)));
            } else {
                this.zah = gVar;
            }
        }
    }

    public final void zak() {
        boolean z10 = true;
        if (!this.zaq && !zaa.get().booleanValue()) {
            z10 = false;
        }
        this.zaq = z10;
    }
}
