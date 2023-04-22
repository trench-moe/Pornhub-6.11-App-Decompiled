package o0;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.io.ConstantsKt;
import l.InterfaceC0186;
import o0.d;

/* loaded from: classes2.dex */
public class b {
    public static int d;

    /* renamed from: a  reason: collision with root package name */
    public final AccessibilityNodeInfo f13479a;

    /* renamed from: b  reason: collision with root package name */
    public int f13480b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f13481c = -1;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: e  reason: collision with root package name */
        public static final a f13482e = new a(1, null);

        /* renamed from: f  reason: collision with root package name */
        public static final a f13483f = new a(2, null);

        /* renamed from: g  reason: collision with root package name */
        public static final a f13484g;

        /* renamed from: h  reason: collision with root package name */
        public static final a f13485h;

        /* renamed from: i  reason: collision with root package name */
        public static final a f13486i;

        /* renamed from: j  reason: collision with root package name */
        public static final a f13487j;

        /* renamed from: k  reason: collision with root package name */
        public static final a f13488k;

        /* renamed from: l  reason: collision with root package name */
        public static final a f13489l;

        /* renamed from: m  reason: collision with root package name */
        public static final a f13490m;
        public static final a n;

        /* renamed from: o  reason: collision with root package name */
        public static final a f13491o;

        /* renamed from: a  reason: collision with root package name */
        public final Object f13492a;

        /* renamed from: b  reason: collision with root package name */
        public final int f13493b;

        /* renamed from: c  reason: collision with root package name */
        public final Class<? extends d.a> f13494c;
        public final d d;

        static {
            new a(4, null);
            new a(8, null);
            f13484g = new a(16, null);
            new a(32, null);
            new a(64, null);
            new a(128, null);
            new a(256, null, d.b.class);
            new a(ConstantsKt.MINIMUM_BLOCK_SIZE, null, d.b.class);
            new a(1024, null, d.c.class);
            new a(InterfaceC0186.f43, null, d.c.class);
            f13485h = new a(ConstantsKt.DEFAULT_BLOCK_SIZE, null);
            f13486i = new a(ConstantsKt.DEFAULT_BUFFER_SIZE, null);
            new a(16384, null);
            new a(32768, null);
            new a(65536, null);
            new a(131072, null, d.g.class);
            f13487j = new a(262144, null);
            f13488k = new a(524288, null);
            f13489l = new a(1048576, null);
            new a(2097152, null, d.h.class);
            int i10 = Build.VERSION.SDK_INT;
            new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, 16908342, null, null, null);
            new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, 16908343, null, null, d.e.class);
            f13490m = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, 16908344, null, null, null);
            new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, 16908345, null, null, null);
            n = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, 16908346, null, null, null);
            new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, 16908347, null, null, null);
            new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, 16908358, null, null, null);
            new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, 16908359, null, null, null);
            new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, 16908360, null, null, null);
            new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, 16908361, null, null, null);
            new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, 16908348, null, null, null);
            f13491o = new a(i10 >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, 16908349, null, null, d.f.class);
            new a(i10 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, 16908354, null, null, d.C0230d.class);
            new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, null, null, null);
            new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, 16908357, null, null, null);
            new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, 16908362, null, null, null);
            new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, 16908372, null, null, null);
        }

        public a(int i10, CharSequence charSequence) {
            this(null, i10, null, null, null);
        }

        public a(int i10, CharSequence charSequence, Class<? extends d.a> cls) {
            this(null, i10, null, null, cls);
        }

        public a(Object obj, int i10, CharSequence charSequence, d dVar, Class<? extends d.a> cls) {
            this.f13493b = i10;
            this.d = dVar;
            if (obj == null) {
                this.f13492a = new AccessibilityNodeInfo.AccessibilityAction(i10, charSequence);
            } else {
                this.f13492a = obj;
            }
            this.f13494c = cls;
        }

        public int a() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f13492a).getId();
        }

        public CharSequence b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f13492a).getLabel();
        }

        public boolean equals(Object obj) {
            if (obj != null && (obj instanceof a)) {
                a aVar = (a) obj;
                Object obj2 = this.f13492a;
                return obj2 == null ? aVar.f13492a == null : obj2.equals(aVar.f13492a);
            }
            return false;
        }

        public int hashCode() {
            Object obj = this.f13492a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }
    }

    /* renamed from: o0.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0228b {

        /* renamed from: a  reason: collision with root package name */
        public final Object f13495a;

        public C0228b(Object obj) {
            this.f13495a = obj;
        }

        public static C0228b a(int i10, int i11, boolean z10, int i12) {
            return new C0228b(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, z10, i12));
        }
    }

    /* loaded from: classes2.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final Object f13496a;

        public c(Object obj) {
            this.f13496a = obj;
        }

        public static c a(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
            return new c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z10, z11));
        }
    }

    public b(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f13479a = accessibilityNodeInfo;
    }

    public static String c(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                switch (i10) {
                    case 4:
                        return "ACTION_SELECT";
                    case 8:
                        return "ACTION_CLEAR_SELECTION";
                    case 16:
                        return "ACTION_CLICK";
                    case 32:
                        return "ACTION_LONG_CLICK";
                    case 64:
                        return "ACTION_ACCESSIBILITY_FOCUS";
                    case 128:
                        return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                    case 256:
                        return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                    case ConstantsKt.MINIMUM_BLOCK_SIZE /* 512 */:
                        return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                    case 1024:
                        return "ACTION_NEXT_HTML_ELEMENT";
                    case InterfaceC0186.f43 /* 2048 */:
                        return "ACTION_PREVIOUS_HTML_ELEMENT";
                    case ConstantsKt.DEFAULT_BLOCK_SIZE /* 4096 */:
                        return "ACTION_SCROLL_FORWARD";
                    case ConstantsKt.DEFAULT_BUFFER_SIZE /* 8192 */:
                        return "ACTION_SCROLL_BACKWARD";
                    case 16384:
                        return "ACTION_COPY";
                    case 32768:
                        return "ACTION_PASTE";
                    case 65536:
                        return "ACTION_CUT";
                    case 131072:
                        return "ACTION_SET_SELECTION";
                    case 262144:
                        return "ACTION_EXPAND";
                    case 524288:
                        return "ACTION_COLLAPSE";
                    case 2097152:
                        return "ACTION_SET_TEXT";
                    case 16908354:
                        return "ACTION_MOVE_WINDOW";
                    case 16908372:
                        return "ACTION_IME_ENTER";
                    default:
                        switch (i10) {
                            case 16908342:
                                return "ACTION_SHOW_ON_SCREEN";
                            case 16908343:
                                return "ACTION_SCROLL_TO_POSITION";
                            case 16908344:
                                return "ACTION_SCROLL_UP";
                            case 16908345:
                                return "ACTION_SCROLL_LEFT";
                            case 16908346:
                                return "ACTION_SCROLL_DOWN";
                            case 16908347:
                                return "ACTION_SCROLL_RIGHT";
                            case 16908348:
                                return "ACTION_CONTEXT_CLICK";
                            case 16908349:
                                return "ACTION_SET_PROGRESS";
                            default:
                                switch (i10) {
                                    case 16908356:
                                        return "ACTION_SHOW_TOOLTIP";
                                    case 16908357:
                                        return "ACTION_HIDE_TOOLTIP";
                                    case 16908358:
                                        return "ACTION_PAGE_UP";
                                    case 16908359:
                                        return "ACTION_PAGE_DOWN";
                                    case 16908360:
                                        return "ACTION_PAGE_LEFT";
                                    case 16908361:
                                        return "ACTION_PAGE_RIGHT";
                                    case 16908362:
                                        return "ACTION_PRESS_AND_HOLD";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
            }
            return "ACTION_CLEAR_FOCUS";
        }
        return "ACTION_FOCUS";
    }

    public static ClickableSpan[] f(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    public void a(a aVar) {
        this.f13479a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f13492a);
    }

    public final List<Integer> b(String str) {
        ArrayList<Integer> integerArrayList = this.f13479a.getExtras().getIntegerArrayList(str);
        if (integerArrayList == null) {
            integerArrayList = new ArrayList<>();
            this.f13479a.getExtras().putIntegerArrayList(str, integerArrayList);
        }
        return integerArrayList;
    }

    public int d() {
        return this.f13479a.getActions();
    }

    public CharSequence e() {
        return this.f13479a.getClassName();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof b)) {
            b bVar = (b) obj;
            AccessibilityNodeInfo accessibilityNodeInfo = this.f13479a;
            if (accessibilityNodeInfo == null) {
                if (bVar.f13479a != null) {
                    return false;
                }
            } else if (!accessibilityNodeInfo.equals(bVar.f13479a)) {
                return false;
            }
            return this.f13481c == bVar.f13481c && this.f13480b == bVar.f13480b;
        }
        return false;
    }

    public CharSequence g() {
        return this.f13479a.getContentDescription();
    }

    public Bundle h() {
        return this.f13479a.getExtras();
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f13479a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public CharSequence i() {
        return this.f13479a.getPackageName();
    }

    public CharSequence j() {
        if (!b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty()) {
            List<Integer> b10 = b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            List<Integer> b11 = b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            List<Integer> b12 = b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            List<Integer> b13 = b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SpannableString spannableString = new SpannableString(TextUtils.substring(this.f13479a.getText(), 0, this.f13479a.getText().length()));
            for (int i10 = 0; i10 < b10.size(); i10++) {
                spannableString.setSpan(new o0.a(b13.get(i10).intValue(), this, h().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), b10.get(i10).intValue(), b11.get(i10).intValue(), b12.get(i10).intValue());
            }
            return spannableString;
        }
        return this.f13479a.getText();
    }

    public boolean k() {
        return this.f13479a.isEnabled();
    }

    public boolean l() {
        return this.f13479a.isFocusable();
    }

    public boolean m() {
        return this.f13479a.isFocused();
    }

    public boolean n() {
        return this.f13479a.isSelected();
    }

    public boolean o(a aVar) {
        return this.f13479a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f13492a);
    }

    public final void p(int i10, boolean z10) {
        Bundle h10 = h();
        if (h10 != null) {
            int i11 = h10.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i10);
            if (!z10) {
                i10 = 0;
            }
            h10.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i10 | i11);
        }
    }

    public void q(Object obj) {
        this.f13479a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((C0228b) obj).f13495a);
    }

    public void r(Object obj) {
        this.f13479a.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) ((c) obj).f13496a);
    }

    public void s(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f13479a.setHintText(charSequence);
        } else {
            this.f13479a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    public void t(View view) {
        this.f13480b = -1;
        this.f13479a.setParent(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    public String toString() {
        ?? emptyList;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        Rect rect = new Rect();
        this.f13479a.getBoundsInParent(rect);
        sb2.append("; boundsInParent: " + rect);
        this.f13479a.getBoundsInScreen(rect);
        sb2.append("; boundsInScreen: " + rect);
        sb2.append("; packageName: ");
        sb2.append(i());
        sb2.append("; className: ");
        sb2.append(e());
        sb2.append("; text: ");
        sb2.append(j());
        sb2.append("; contentDescription: ");
        sb2.append(g());
        sb2.append("; viewId: ");
        sb2.append(this.f13479a.getViewIdResourceName());
        sb2.append("; checkable: ");
        sb2.append(this.f13479a.isCheckable());
        sb2.append("; checked: ");
        sb2.append(this.f13479a.isChecked());
        sb2.append("; focusable: ");
        sb2.append(l());
        sb2.append("; focused: ");
        sb2.append(m());
        sb2.append("; selected: ");
        sb2.append(n());
        sb2.append("; clickable: ");
        sb2.append(this.f13479a.isClickable());
        sb2.append("; longClickable: ");
        sb2.append(this.f13479a.isLongClickable());
        sb2.append("; enabled: ");
        sb2.append(k());
        sb2.append("; password: ");
        sb2.append(this.f13479a.isPassword());
        sb2.append("; scrollable: " + this.f13479a.isScrollable());
        sb2.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f13479a.getActionList();
        if (actionList != null) {
            emptyList = new ArrayList();
            int size = actionList.size();
            for (int i10 = 0; i10 < size; i10++) {
                emptyList.add(new a(actionList.get(i10), 0, null, null, null));
            }
        } else {
            emptyList = Collections.emptyList();
        }
        for (int i11 = 0; i11 < emptyList.size(); i11++) {
            a aVar = (a) emptyList.get(i11);
            String c10 = c(aVar.a());
            if (c10.equals("ACTION_UNKNOWN") && aVar.b() != null) {
                c10 = aVar.b().toString();
            }
            sb2.append(c10);
            if (i11 != emptyList.size() - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}
