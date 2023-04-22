package p0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final c f13777a;

    /* loaded from: classes2.dex */
    public static final class a implements c {

        /* renamed from: a  reason: collision with root package name */
        public final InputContentInfo f13778a;

        public a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f13778a = new InputContentInfo(uri, clipDescription, uri2);
        }

        public a(Object obj) {
            this.f13778a = (InputContentInfo) obj;
        }

        @Override // p0.f.c
        public Uri a() {
            return this.f13778a.getContentUri();
        }

        @Override // p0.f.c
        public void b() {
            this.f13778a.requestPermission();
        }

        @Override // p0.f.c
        public Uri c() {
            return this.f13778a.getLinkUri();
        }

        @Override // p0.f.c
        public Object d() {
            return this.f13778a;
        }

        @Override // p0.f.c
        public ClipDescription getDescription() {
            return this.f13778a.getDescription();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements c {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f13779a;

        /* renamed from: b  reason: collision with root package name */
        public final ClipDescription f13780b;

        /* renamed from: c  reason: collision with root package name */
        public final Uri f13781c;

        public b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f13779a = uri;
            this.f13780b = clipDescription;
            this.f13781c = uri2;
        }

        @Override // p0.f.c
        public Uri a() {
            return this.f13779a;
        }

        @Override // p0.f.c
        public void b() {
        }

        @Override // p0.f.c
        public Uri c() {
            return this.f13781c;
        }

        @Override // p0.f.c
        public Object d() {
            return null;
        }

        @Override // p0.f.c
        public ClipDescription getDescription() {
            return this.f13780b;
        }
    }

    /* loaded from: classes2.dex */
    public interface c {
        Uri a();

        void b();

        Uri c();

        Object d();

        ClipDescription getDescription();
    }

    public f(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f13777a = new a(uri, clipDescription, uri2);
        } else {
            this.f13777a = new b(uri, clipDescription, uri2);
        }
    }

    public f(c cVar) {
        this.f13777a = cVar;
    }
}
