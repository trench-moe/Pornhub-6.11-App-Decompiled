package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.os.Parcel;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import com.appsflyer.oaid.BuildConfig;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;
import java.util.TreeMap;

/* loaded from: classes.dex */
public class i implements e9.l, w9.a0, ad.b {

    /* renamed from: c  reason: collision with root package name */
    public Object f1017c;

    /* renamed from: f  reason: collision with root package name */
    public Object f1018f;

    public /* synthetic */ i() {
        this.f1018f = new TreeMap(String.CASE_INSENSITIVE_ORDER);
    }

    public /* synthetic */ i(EditText editText) {
        this.f1017c = editText;
        this.f1018f = new z0.a(editText, false);
    }

    public /* synthetic */ i(Object obj, Object obj2) {
        this.f1017c = obj;
        this.f1018f = obj2;
    }

    @Override // e9.l
    public void accept(Object obj, Object obj2) {
        a9.v vVar = new a9.v((ea.h) obj2);
        a9.i iVar = (a9.i) ((a9.y) obj).getService();
        Parcel a12 = iVar.a1();
        t9.v.d(a12, vVar);
        a12.writeStringArray((String[]) this.f1018f);
        iVar.d1(6, a12);
    }

    @Override // ad.e
    public Iterator b() {
        return Collections.unmodifiableSet(((TreeMap) this.f1018f).keySet()).iterator();
    }

    @Override // ad.e
    public byte[] d() {
        return (byte[]) this.f1017c;
    }

    @Override // ad.e
    public boolean e(String str) {
        return ((TreeMap) this.f1018f).containsKey(str);
    }

    @Override // w9.a0
    public h2.h f(w9.o oVar) {
        h2.h a10 = ((h2.h) this.f1017c).a();
        a10.e((String) this.f1018f, oVar);
        return a10;
    }

    @Override // ad.e
    public String g(String str) {
        String str2 = (String) ((TreeMap) this.f1018f).get(str);
        return str2 == null ? BuildConfig.FLAVOR : str2;
    }

    public KeyListener h(KeyListener keyListener) {
        if (!(keyListener instanceof NumberKeyListener)) {
            keyListener = ((z0.a) this.f1018f).f18666a.a(keyListener);
        }
        return keyListener;
    }

    /* JADX WARN: Finally extract failed */
    public void i(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = ((EditText) this.f1017c).getContext().obtainStyledAttributes(attributeSet, b7.k.E, i10, 0);
        try {
            boolean z10 = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z10 = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            l(z10);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public InputConnection j(InputConnection inputConnection, EditorInfo editorInfo) {
        z0.a aVar = (z0.a) this.f1018f;
        Objects.requireNonNull(aVar);
        if (inputConnection == null) {
            return null;
        }
        return aVar.f18666a.b(inputConnection, editorInfo);
    }

    public void k(String str, String str2) {
        ((TreeMap) this.f1018f).put(str, str2);
    }

    public void l(boolean z10) {
        ((z0.a) this.f1018f).f18666a.c(z10);
    }
}
