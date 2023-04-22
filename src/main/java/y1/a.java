package y1;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public final DataSetObservable f18384a = new DataSetObservable();

    /* renamed from: b  reason: collision with root package name */
    public DataSetObserver f18385b;

    public void c(ViewGroup viewGroup, int i10, Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public void d(ViewGroup viewGroup) {
    }

    public abstract int e();

    public CharSequence f(int i10) {
        return null;
    }

    public Object g(ViewGroup viewGroup, int i10) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    public abstract boolean h(View view, Object obj);

    public void i(Parcelable parcelable, ClassLoader classLoader) {
    }

    public Parcelable j() {
        return null;
    }

    public void k(ViewGroup viewGroup, int i10, Object obj) {
    }

    public void l(ViewGroup viewGroup) {
    }
}
