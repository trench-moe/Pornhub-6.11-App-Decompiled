package n0;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.app.pornhub.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import n0.x;
import o0.b;

/* loaded from: classes.dex */
public class a {

    /* renamed from: c  reason: collision with root package name */
    public static final View.AccessibilityDelegate f13089c = new View.AccessibilityDelegate();

    /* renamed from: a  reason: collision with root package name */
    public final View.AccessibilityDelegate f13090a;

    /* renamed from: b  reason: collision with root package name */
    public final View.AccessibilityDelegate f13091b;

    /* renamed from: n0.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0216a extends View.AccessibilityDelegate {

        /* renamed from: a  reason: collision with root package name */
        public final a f13092a;

        public C0216a(a aVar) {
            this.f13092a = aVar;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f13092a.a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            o0.c b10 = this.f13092a.b(view);
            if (b10 != null) {
                return (AccessibilityNodeProvider) b10.f13497a;
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f13092a.c(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            Object tag;
            Object obj;
            int i10;
            o0.b bVar = new o0.b(accessibilityNodeInfo);
            WeakHashMap<View, a0> weakHashMap = x.f13156a;
            int i11 = Build.VERSION.SDK_INT;
            Object obj2 = null;
            if (i11 >= 28) {
                tag = Boolean.valueOf(x.m.d(view));
            } else {
                tag = view.getTag(R.id.tag_screen_reader_focusable);
                if (!Boolean.class.isInstance(tag)) {
                    tag = null;
                }
            }
            Boolean bool = (Boolean) tag;
            boolean z10 = bool != null && bool.booleanValue();
            if (i11 >= 28) {
                accessibilityNodeInfo.setScreenReaderFocusable(z10);
            } else {
                bVar.p(1, z10);
            }
            if (i11 >= 28) {
                obj = Boolean.valueOf(x.m.c(view));
            } else {
                Object tag2 = view.getTag(R.id.tag_accessibility_heading);
                obj = Boolean.class.isInstance(tag2) ? tag2 : null;
            }
            Boolean bool2 = (Boolean) obj;
            boolean z11 = bool2 != null && bool2.booleanValue();
            if (i11 >= 28) {
                accessibilityNodeInfo.setHeading(z11);
            } else {
                bVar.p(2, z11);
            }
            CharSequence i12 = x.i(view);
            if (i11 >= 28) {
                accessibilityNodeInfo.setPaneTitle(i12);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", i12);
            }
            if (i11 >= 30) {
                obj2 = x.o.a(view);
            } else {
                Object tag3 = view.getTag(R.id.tag_state_description);
                if (CharSequence.class.isInstance(tag3)) {
                    obj2 = tag3;
                }
            }
            CharSequence charSequence = (CharSequence) obj2;
            if (i11 >= 30) {
                accessibilityNodeInfo.setStateDescription(charSequence);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
            }
            this.f13092a.d(view, bVar);
            CharSequence text = accessibilityNodeInfo.getText();
            if (i11 < 26) {
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
                SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
                if (sparseArray != null) {
                    ArrayList arrayList = new ArrayList();
                    for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                        if (((WeakReference) sparseArray.valueAt(i13)).get() == null) {
                            arrayList.add(Integer.valueOf(i13));
                        }
                    }
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        sparseArray.remove(((Integer) arrayList.get(i14)).intValue());
                    }
                }
                ClickableSpan[] f10 = o0.b.f(text);
                if (f10 != null && f10.length > 0) {
                    bVar.h().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.accessibility_action_clickable_span);
                    SparseArray sparseArray2 = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
                    if (sparseArray2 == null) {
                        sparseArray2 = new SparseArray();
                        view.setTag(R.id.tag_accessibility_clickable_spans, sparseArray2);
                    }
                    for (int i15 = 0; i15 < f10.length; i15++) {
                        ClickableSpan clickableSpan = f10[i15];
                        int i16 = 0;
                        while (true) {
                            if (i16 >= sparseArray2.size()) {
                                i10 = o0.b.d;
                                o0.b.d = i10 + 1;
                                break;
                            } else if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i16)).get())) {
                                i10 = sparseArray2.keyAt(i16);
                                break;
                            } else {
                                i16++;
                            }
                        }
                        sparseArray2.put(i10, new WeakReference(f10[i15]));
                        ClickableSpan clickableSpan2 = f10[i15];
                        Spanned spanned = (Spanned) text;
                        bVar.b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                        bVar.b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                        bVar.b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                        bVar.b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i10));
                    }
                }
            }
            List list = (List) view.getTag(R.id.tag_accessibility_actions);
            if (list == null) {
                list = Collections.emptyList();
            }
            for (int i17 = 0; i17 < list.size(); i17++) {
                bVar.a((b.a) list.get(i17));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f13092a.e(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f13092a.f(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            return this.f13092a.g(view, i10, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i10) {
            this.f13092a.h(view, i10);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f13092a.i(view, accessibilityEvent);
        }
    }

    public a() {
        this.f13090a = f13089c;
        this.f13091b = new C0216a(this);
    }

    public a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f13090a = accessibilityDelegate;
        this.f13091b = new C0216a(this);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f13090a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public o0.c b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f13090a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new o0.c(accessibilityNodeProvider);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f13090a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, o0.b bVar) {
        this.f13090a.onInitializeAccessibilityNodeInfo(view, bVar.f13479a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.f13090a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f13090a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean g(android.view.View r13, int r14, android.os.Bundle r15) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.a.g(android.view.View, int, android.os.Bundle):boolean");
    }

    public void h(View view, int i10) {
        this.f13090a.sendAccessibilityEvent(view, i10);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.f13090a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
