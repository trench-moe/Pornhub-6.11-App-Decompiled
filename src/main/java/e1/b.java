package e1;

import androidx.lifecycle.a0;
import androidx.lifecycle.k;
import androidx.lifecycle.p;
import androidx.lifecycle.q;
import androidx.lifecycle.x;
import androidx.lifecycle.z;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Objects;
import p.h;

/* loaded from: classes.dex */
public class b extends e1.a {

    /* renamed from: a  reason: collision with root package name */
    public final k f8991a;

    /* renamed from: b  reason: collision with root package name */
    public final C0124b f8992b;

    /* loaded from: classes.dex */
    public static class a<D> extends p<D> {
        @Override // androidx.lifecycle.LiveData
        public void h() {
            throw null;
        }

        @Override // androidx.lifecycle.LiveData
        public void i() {
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public void k(q<? super D> qVar) {
            super.k(qVar);
        }

        @Override // androidx.lifecycle.p, androidx.lifecycle.LiveData
        public void l(D d) {
            super.l(d);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append("LoaderInfo{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" #");
            sb2.append(0);
            sb2.append(" : ");
            t3.a.d(null, sb2);
            sb2.append("}}");
            return sb2.toString();
        }
    }

    /* renamed from: e1.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0124b extends x {
        public static final z.b d = new a();

        /* renamed from: c  reason: collision with root package name */
        public h<a> f8993c = new h<>();

        /* renamed from: e1.b$b$a */
        /* loaded from: classes.dex */
        public static class a implements z.b {
            @Override // androidx.lifecycle.z.b
            public <T extends x> T a(Class<T> cls) {
                return new C0124b();
            }
        }

        @Override // androidx.lifecycle.x
        public void a() {
            if (this.f8993c.j() > 0) {
                Objects.requireNonNull(this.f8993c.k(0));
                throw null;
            }
            h<a> hVar = this.f8993c;
            int i10 = hVar.f13772m;
            Object[] objArr = hVar.f13771j;
            for (int i11 = 0; i11 < i10; i11++) {
                objArr[i11] = null;
            }
            hVar.f13772m = 0;
            hVar.f13769c = false;
        }
    }

    public b(k kVar, a0 a0Var) {
        this.f8991a = kVar;
        this.f8992b = (C0124b) new z(a0Var, C0124b.d).a(C0124b.class);
    }

    @Override // e1.a
    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        C0124b c0124b = this.f8992b;
        if (c0124b.f8993c.j() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            if (c0124b.f8993c.j() <= 0) {
                return;
            }
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(c0124b.f8993c.g(0));
            printWriter.print(": ");
            printWriter.println(c0124b.f8993c.k(0).toString());
            printWriter.print(str2);
            printWriter.print("mId=");
            printWriter.print(0);
            printWriter.print(" mArgs=");
            printWriter.println((Object) null);
            printWriter.print(str2);
            printWriter.print("mLoader=");
            printWriter.println((Object) null);
            throw null;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("LoaderManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        t3.a.d(this.f8991a, sb2);
        sb2.append("}}");
        return sb2.toString();
    }
}
