package androidx.constraintlayout.widget;

import android.util.SparseIntArray;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public HashMap<Integer, HashSet<WeakReference<a>>> f1777a;

    /* loaded from: classes.dex */
    public interface a {
    }

    public b() {
        new SparseIntArray();
        this.f1777a = new HashMap<>();
    }

    public void a(int i10, a aVar) {
        HashSet<WeakReference<a>> hashSet = this.f1777a.get(Integer.valueOf(i10));
        if (hashSet == null) {
            hashSet = new HashSet<>();
            this.f1777a.put(Integer.valueOf(i10), hashSet);
        }
        hashSet.add(new WeakReference<>(aVar));
    }
}
