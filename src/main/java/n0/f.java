package n0;

import android.os.Build;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import com.app.pornhub.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;
import n0.x;

/* loaded from: classes2.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f13141a;

    /* renamed from: b  reason: collision with root package name */
    public static Method f13142b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f13143c;
    public static Field d;

    /* loaded from: classes.dex */
    public interface a {
        boolean m(KeyEvent keyEvent);
    }

    public static boolean a(View view, KeyEvent keyEvent) {
        int indexOfKey;
        WeakHashMap<View, a0> weakHashMap = x.f13156a;
        boolean z10 = true;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList<WeakReference<View>> arrayList = x.s.d;
            x.s sVar = (x.s) view.getTag(R.id.tag_unhandled_key_event_manager);
            if (sVar == null) {
                sVar = new x.s();
                view.setTag(R.id.tag_unhandled_key_event_manager, sVar);
            }
            WeakReference<KeyEvent> weakReference = sVar.f13172c;
            if (weakReference == null || weakReference.get() != keyEvent) {
                sVar.f13172c = new WeakReference<>(keyEvent);
                WeakReference<View> weakReference2 = null;
                if (sVar.f13171b == null) {
                    sVar.f13171b = new SparseArray<>();
                }
                SparseArray<WeakReference<View>> sparseArray = sVar.f13171b;
                if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference2 = sparseArray.valueAt(indexOfKey);
                    sparseArray.removeAt(indexOfKey);
                }
                if (weakReference2 == null) {
                    weakReference2 = sparseArray.get(keyEvent.getKeyCode());
                }
                if (weakReference2 != null) {
                    View view2 = weakReference2.get();
                    if (view2 != null && x.g.b(view2)) {
                        sVar.b(view2, keyEvent);
                        return z10;
                    }
                    return z10;
                }
            }
        }
        z10 = false;
        return z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0112, code lost:
        if (r10.m(r13) != false) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean b(n0.f.a r10, android.view.View r11, android.view.Window.Callback r12, android.view.KeyEvent r13) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.f.b(n0.f$a, android.view.View, android.view.Window$Callback, android.view.KeyEvent):boolean");
    }
}
