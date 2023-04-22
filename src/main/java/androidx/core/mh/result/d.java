package androidx.core.mh.result;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public Random f1861a = new Random();

    /* renamed from: b  reason: collision with root package name */
    public final Map<Integer, String> f1862b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, Integer> f1863c = new HashMap();
    public final Map<String, c> d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<String> f1864e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    public final transient Map<String, b<?>> f1865f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    public final Map<String, Object> f1866g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    public final Bundle f1867h = new Bundle();

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* loaded from: classes.dex */
    public class a<I> extends androidx.core.mh.result.c<I> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f1868a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f1869b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ c.a f1870c;

        public a(String str, int i10, c.a aVar) {
            this.f1868a = str;
            this.f1869b = i10;
            this.f1870c = aVar;
        }

        @Override // androidx.core.mh.result.c
        public void b() {
            d.this.c(this.f1868a);
        }
    }

    /* loaded from: classes.dex */
    public static class b<O> {

        /* renamed from: a  reason: collision with root package name */
        public final androidx.core.mh.result.b<O> f1871a;

        /* renamed from: b  reason: collision with root package name */
        public final c.a<?, O> f1872b;

        public b(androidx.core.mh.result.b<O> bVar, c.a<?, O> aVar) {
            this.f1871a = bVar;
            this.f1872b = aVar;
        }
    }

    /* loaded from: classes.dex */
    public static class c {
    }

    public final boolean a(int i10, int i11, Intent intent) {
        androidx.core.mh.result.b<?> bVar;
        String str = this.f1862b.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        this.f1864e.remove(str);
        b<?> bVar2 = this.f1865f.get(str);
        if (bVar2 == null || (bVar = bVar2.f1871a) == null) {
            this.f1866g.remove(str);
            this.f1867h.putParcelable(str, new androidx.core.mh.result.a(i11, intent));
        } else {
            bVar.a(bVar2.f1872b.c(i11, intent));
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <I, O> androidx.core.mh.result.c<I> b(String str, c.a<I, O> aVar, androidx.core.mh.result.b<O> bVar) {
        int i10;
        Integer num = this.f1863c.get(str);
        if (num != null) {
            i10 = num.intValue();
        } else {
            int nextInt = this.f1861a.nextInt(2147418112);
            while (true) {
                i10 = nextInt + 65536;
                if (!this.f1862b.containsKey(Integer.valueOf(i10))) {
                    break;
                }
                nextInt = this.f1861a.nextInt(2147418112);
            }
            this.f1862b.put(Integer.valueOf(i10), str);
            this.f1863c.put(str, Integer.valueOf(i10));
        }
        this.f1865f.put(str, new b<>(bVar, aVar));
        if (this.f1866g.containsKey(str)) {
            Object obj = this.f1866g.get(str);
            this.f1866g.remove(str);
            bVar.a(obj);
        }
        androidx.core.mh.result.a aVar2 = (androidx.core.mh.result.a) this.f1867h.getParcelable(str);
        if (aVar2 != null) {
            this.f1867h.remove(str);
            bVar.a(aVar.c(aVar2.f1859c, aVar2.f1860f));
        }
        return new a(str, i10, aVar);
    }

    public final void c(String str) {
        Integer remove;
        if (!this.f1864e.contains(str) && (remove = this.f1863c.remove(str)) != null) {
            this.f1862b.remove(remove);
        }
        this.f1865f.remove(str);
        if (this.f1866g.containsKey(str)) {
            StringBuilder p10 = a1.a.p("Dropping pending result for request ", str, ": ");
            p10.append(this.f1866g.get(str));
            Log.w("ActivityResultRegistry", p10.toString());
            this.f1866g.remove(str);
        }
        if (this.f1867h.containsKey(str)) {
            StringBuilder p11 = a1.a.p("Dropping pending result for request ", str, ": ");
            p11.append(this.f1867h.getParcelable(str));
            Log.w("ActivityResultRegistry", p11.toString());
            this.f1867h.remove(str);
        }
        if (this.d.get(str) != null) {
            throw null;
        }
    }
}
