package androidx.viewpager2.widget;

import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

/* loaded from: classes.dex */
public final class a extends ViewPager2.g {

    /* renamed from: a  reason: collision with root package name */
    public final List<ViewPager2.g> f3362a;

    public a(int i10) {
        this.f3362a = new ArrayList(i10);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public void a(int i10) {
        try {
            for (ViewPager2.g gVar : this.f3362a) {
                gVar.a(i10);
            }
        } catch (ConcurrentModificationException e10) {
            d(e10);
            throw null;
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public void b(int i10, float f10, int i11) {
        try {
            for (ViewPager2.g gVar : this.f3362a) {
                gVar.b(i10, f10, i11);
            }
        } catch (ConcurrentModificationException e10) {
            d(e10);
            throw null;
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public void c(int i10) {
        try {
            for (ViewPager2.g gVar : this.f3362a) {
                gVar.c(i10);
            }
        } catch (ConcurrentModificationException e10) {
            d(e10);
            throw null;
        }
    }

    public final void d(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }
}
