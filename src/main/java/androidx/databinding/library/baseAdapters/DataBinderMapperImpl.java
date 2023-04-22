package androidx.databinding.library.baseAdapters;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.b;
import androidx.databinding.c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class DataBinderMapperImpl extends b {

    /* renamed from: a  reason: collision with root package name */
    public static final SparseIntArray f1909a = new SparseIntArray(0);

    @Override // androidx.databinding.b
    public List<b> a() {
        return new ArrayList(0);
    }

    @Override // androidx.databinding.b
    public ViewDataBinding b(c cVar, View view, int i10) {
        if (f1909a.get(i10) > 0 && view.getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // androidx.databinding.b
    public ViewDataBinding c(c cVar, View[] viewArr, int i10) {
        if (viewArr != null) {
            if (viewArr.length != 0) {
                if (f1909a.get(i10) > 0) {
                    if (viewArr[0].getTag() == null) {
                        throw new RuntimeException("view must have a tag");
                    }
                }
            }
            return null;
        }
        return null;
    }
}
