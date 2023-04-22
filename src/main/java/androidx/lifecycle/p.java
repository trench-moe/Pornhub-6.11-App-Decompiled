package androidx.lifecycle;

/* loaded from: classes.dex */
public class p<T> extends LiveData<T> {
    @Override // androidx.lifecycle.LiveData
    public void j(T t2) {
        super.j(t2);
    }

    @Override // androidx.lifecycle.LiveData
    public void l(T t2) {
        LiveData.a("setValue");
        this.f2339g++;
        this.f2337e = t2;
        c(null);
    }
}
