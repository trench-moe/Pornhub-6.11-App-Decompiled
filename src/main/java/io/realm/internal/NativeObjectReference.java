package io.realm.internal;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/* loaded from: classes2.dex */
final class NativeObjectReference extends PhantomReference<g> {

    /* renamed from: f  reason: collision with root package name */
    public static b f10863f = new b(null);

    /* renamed from: a  reason: collision with root package name */
    public final long f10864a;

    /* renamed from: b  reason: collision with root package name */
    public final long f10865b;

    /* renamed from: c  reason: collision with root package name */
    public final f f10866c;
    public NativeObjectReference d;

    /* renamed from: e  reason: collision with root package name */
    public NativeObjectReference f10867e;

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public NativeObjectReference f10868a;

        public b(a aVar) {
        }
    }

    public NativeObjectReference(f fVar, g gVar, ReferenceQueue<? super g> referenceQueue) {
        super(gVar, referenceQueue);
        this.f10864a = gVar.getNativePtr();
        this.f10865b = gVar.getNativeFinalizerPtr();
        this.f10866c = fVar;
        b bVar = f10863f;
        synchronized (bVar) {
            this.d = null;
            NativeObjectReference nativeObjectReference = bVar.f10868a;
            this.f10867e = nativeObjectReference;
            if (nativeObjectReference != null) {
                nativeObjectReference.d = this;
            }
            bVar.f10868a = this;
        }
    }

    private static native void nativeCleanUp(long j10, long j11);

    public void a() {
        synchronized (this.f10866c) {
            nativeCleanUp(this.f10865b, this.f10864a);
        }
        b bVar = f10863f;
        synchronized (bVar) {
            NativeObjectReference nativeObjectReference = this.f10867e;
            NativeObjectReference nativeObjectReference2 = this.d;
            this.f10867e = null;
            this.d = null;
            if (nativeObjectReference2 != null) {
                nativeObjectReference2.f10867e = nativeObjectReference;
            } else {
                bVar.f10868a = nativeObjectReference;
            }
            if (nativeObjectReference != null) {
                nativeObjectReference.d = nativeObjectReference2;
            }
        }
    }
}
