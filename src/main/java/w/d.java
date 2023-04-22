package w;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes2.dex */
public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public int f16226a = -1;

    /* renamed from: b  reason: collision with root package name */
    public int f16227b = -1;

    /* renamed from: c  reason: collision with root package name */
    public String f16228c = null;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public HashMap<String, ConstraintAttribute> f16229e;

    public abstract void a(HashMap<String, v.d> hashMap);

    @Override // 
    /* renamed from: b */
    public abstract d clone();

    public d c(d dVar) {
        this.f16226a = dVar.f16226a;
        this.f16227b = dVar.f16227b;
        this.f16228c = dVar.f16228c;
        this.d = dVar.d;
        this.f16229e = dVar.f16229e;
        return this;
    }

    public abstract void d(HashSet<String> hashSet);

    public abstract void e(Context context, AttributeSet attributeSet);

    public void f(HashMap<String, Integer> hashMap) {
    }

    public float g(Object obj) {
        return obj instanceof Float ? ((Float) obj).floatValue() : Float.parseFloat(obj.toString());
    }

    public int h(Object obj) {
        return obj instanceof Integer ? ((Integer) obj).intValue() : Integer.parseInt(obj.toString());
    }
}
