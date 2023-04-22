package o0;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public final Object f13497a;

    /* loaded from: classes2.dex */
    public static class a extends AccessibilityNodeProvider {

        /* renamed from: a  reason: collision with root package name */
        public final c f13498a;

        public a(c cVar) {
            this.f13498a = cVar;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
            o0.b a10 = this.f13498a.a(i10);
            if (a10 == null) {
                return null;
            }
            return a10.f13479a;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i10) {
            Objects.requireNonNull(this.f13498a);
            return null;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i10, int i11, Bundle bundle) {
            return this.f13498a.c(i10, i11, bundle);
        }
    }

    /* loaded from: classes2.dex */
    public static class b extends a {
        public b(c cVar) {
            super(cVar);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i10) {
            o0.b b10 = this.f13498a.b(i10);
            if (b10 == null) {
                return null;
            }
            return b10.f13479a;
        }
    }

    /* renamed from: o0.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0229c extends b {
        public C0229c(c cVar) {
            super(cVar);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            Objects.requireNonNull(this.f13498a);
        }
    }

    public c() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f13497a = new C0229c(this);
        } else {
            this.f13497a = new b(this);
        }
    }

    public c(Object obj) {
        this.f13497a = obj;
    }

    public o0.b a(int i10) {
        return null;
    }

    public o0.b b(int i10) {
        return null;
    }

    public boolean c(int i10, int i11, Bundle bundle) {
        return false;
    }
}
