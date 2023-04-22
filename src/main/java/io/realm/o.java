package io.realm;

import io.realm.exceptions.RealmException;
import io.realm.internal.OsSharedRealm;
import io.realm.internal.RealmNotifier;
import io.realm.p;

/* loaded from: classes2.dex */
public class o implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ s f10987c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ p.a f10988f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ boolean f10989j;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ p.a.b f10990m;
    public final /* synthetic */ RealmNotifier n;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ p.a.InterfaceC0158a f10991t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ p f10992u;

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ OsSharedRealm.a f10993c;

        /* renamed from: io.realm.o$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class RunnableC0157a implements Runnable {
            public RunnableC0157a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                o.this.f10990m.onSuccess();
            }
        }

        public a(OsSharedRealm.a aVar) {
            this.f10993c = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (o.this.f10992u.k()) {
                o.this.f10990m.onSuccess();
            } else if (o.this.f10992u.n.getVersionID().compareTo(this.f10993c) < 0) {
                o.this.f10992u.n.realmNotifier.addTransactionCallback(new RunnableC0157a());
            } else {
                o.this.f10990m.onSuccess();
            }
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Throwable f10996c;

        public b(Throwable th) {
            this.f10996c = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            p.a.InterfaceC0158a interfaceC0158a = o.this.f10991t;
            if (interfaceC0158a == null) {
                throw new RealmException("Async transaction failed", this.f10996c);
            }
            interfaceC0158a.onError(this.f10996c);
        }
    }

    public o(p pVar, s sVar, p.a aVar, boolean z10, p.a.b bVar, RealmNotifier realmNotifier, p.a.InterfaceC0158a interfaceC0158a) {
        this.f10992u = pVar;
        this.f10987c = sVar;
        this.f10988f = aVar;
        this.f10989j = z10;
        this.f10990m = bVar;
        this.n = realmNotifier;
        this.f10991t = interfaceC0158a;
    }

    @Override // java.lang.Runnable
    public void run() {
        OsSharedRealm.a aVar;
        if (Thread.currentThread().isInterrupted()) {
            return;
        }
        s sVar = this.f10987c;
        if (sVar == null) {
            throw new IllegalArgumentException("A non-null RealmConfiguration must be provided");
        }
        p pVar = (p) RealmCache.c(sVar, p.class);
        pVar.a();
        Throwable th = null;
        try {
            ((s3.b) this.f10988f).a(pVar);
        } catch (Throwable th2) {
            try {
                if (pVar.n()) {
                    pVar.c();
                }
                pVar.close();
                aVar = null;
                th = th2;
            } finally {
            }
        }
        if (Thread.currentThread().isInterrupted()) {
            try {
                if (pVar.n()) {
                    pVar.c();
                }
                return;
            } finally {
            }
        }
        pVar.f();
        aVar = pVar.n.getVersionID();
        try {
            if (pVar.n()) {
                pVar.c();
            }
            if (!this.f10989j) {
                if (th != null) {
                    throw new RealmException("Async transaction failed", th);
                }
            } else if (aVar != null && this.f10990m != null) {
                this.n.post(new a(aVar));
            } else if (th != null) {
                this.n.post(new b(th));
            }
        } finally {
        }
    }
}
