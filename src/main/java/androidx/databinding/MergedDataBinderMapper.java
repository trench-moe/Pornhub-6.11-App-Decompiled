package androidx.databinding;

import android.util.Log;
import android.view.View;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class MergedDataBinderMapper extends b {

    /* renamed from: a  reason: collision with root package name */
    public Set<Class<? extends b>> f1893a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    public List<b> f1894b = new CopyOnWriteArrayList();

    /* renamed from: c  reason: collision with root package name */
    public List<String> f1895c = new CopyOnWriteArrayList();

    @Override // androidx.databinding.b
    public ViewDataBinding b(c cVar, View view, int i10) {
        for (b bVar : this.f1894b) {
            ViewDataBinding b10 = bVar.b(cVar, view, i10);
            if (b10 != null) {
                return b10;
            }
        }
        if (e()) {
            return b(cVar, view, i10);
        }
        return null;
    }

    @Override // androidx.databinding.b
    public ViewDataBinding c(c cVar, View[] viewArr, int i10) {
        for (b bVar : this.f1894b) {
            ViewDataBinding c10 = bVar.c(cVar, viewArr, i10);
            if (c10 != null) {
                return c10;
            }
        }
        if (e()) {
            return c(cVar, viewArr, i10);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void d(b bVar) {
        if (this.f1893a.add(bVar.getClass())) {
            this.f1894b.add(bVar);
            for (b bVar2 : bVar.a()) {
                d(bVar2);
            }
        }
    }

    public final boolean e() {
        boolean z10 = false;
        for (String str : this.f1895c) {
            try {
                Class<?> cls = Class.forName(str);
                if (b.class.isAssignableFrom(cls)) {
                    d((b) cls.newInstance());
                    this.f1895c.remove(str);
                    z10 = true;
                }
            } catch (ClassNotFoundException unused) {
            } catch (IllegalAccessException e10) {
                Log.e("MergedDataBinderMapper", "unable to add feature mapper for " + str, e10);
            } catch (InstantiationException e11) {
                Log.e("MergedDataBinderMapper", "unable to add feature mapper for " + str, e11);
            }
        }
        return z10;
    }
}
