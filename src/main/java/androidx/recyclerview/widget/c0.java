package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class c0 extends n0.a {
    public final RecyclerView d;

    /* renamed from: e  reason: collision with root package name */
    public final a f2955e;

    /* loaded from: classes.dex */
    public static class a extends n0.a {
        public final c0 d;

        /* renamed from: e  reason: collision with root package name */
        public Map<View, n0.a> f2956e = new WeakHashMap();

        public a(c0 c0Var) {
            this.d = c0Var;
        }

        @Override // n0.a
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            n0.a aVar = this.f2956e.get(view);
            return aVar != null ? aVar.a(view, accessibilityEvent) : this.f13090a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // n0.a
        public o0.c b(View view) {
            n0.a aVar = this.f2956e.get(view);
            return aVar != null ? aVar.b(view) : super.b(view);
        }

        @Override // n0.a
        public void c(View view, AccessibilityEvent accessibilityEvent) {
            n0.a aVar = this.f2956e.get(view);
            if (aVar != null) {
                aVar.c(view, accessibilityEvent);
            } else {
                this.f13090a.onInitializeAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // n0.a
        public void d(View view, o0.b bVar) {
            if (this.d.j() || this.d.d.getLayoutManager() == null) {
                this.f13090a.onInitializeAccessibilityNodeInfo(view, bVar.f13479a);
                return;
            }
            this.d.d.getLayoutManager().d0(view, bVar);
            n0.a aVar = this.f2956e.get(view);
            if (aVar != null) {
                aVar.d(view, bVar);
            } else {
                this.f13090a.onInitializeAccessibilityNodeInfo(view, bVar.f13479a);
            }
        }

        @Override // n0.a
        public void e(View view, AccessibilityEvent accessibilityEvent) {
            n0.a aVar = this.f2956e.get(view);
            if (aVar != null) {
                aVar.e(view, accessibilityEvent);
            } else {
                this.f13090a.onPopulateAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // n0.a
        public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            n0.a aVar = this.f2956e.get(viewGroup);
            return aVar != null ? aVar.f(viewGroup, view, accessibilityEvent) : this.f13090a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // n0.a
        public boolean g(View view, int i10, Bundle bundle) {
            if (this.d.j() || this.d.d.getLayoutManager() == null) {
                return super.g(view, i10, bundle);
            }
            n0.a aVar = this.f2956e.get(view);
            if (aVar != null) {
                if (aVar.g(view, i10, bundle)) {
                    return true;
                }
            } else if (super.g(view, i10, bundle)) {
                return true;
            }
            RecyclerView.r rVar = this.d.d.getLayoutManager().f2822b.f2775f;
            return false;
        }

        @Override // n0.a
        public void h(View view, int i10) {
            n0.a aVar = this.f2956e.get(view);
            if (aVar != null) {
                aVar.h(view, i10);
            } else {
                this.f13090a.sendAccessibilityEvent(view, i10);
            }
        }

        @Override // n0.a
        public void i(View view, AccessibilityEvent accessibilityEvent) {
            n0.a aVar = this.f2956e.get(view);
            if (aVar != null) {
                aVar.i(view, accessibilityEvent);
            } else {
                this.f13090a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            }
        }
    }

    public c0(RecyclerView recyclerView) {
        this.d = recyclerView;
        a aVar = this.f2955e;
        if (aVar != null) {
            this.f2955e = aVar;
        } else {
            this.f2955e = new a(this);
        }
    }

    @Override // n0.a
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f13090a.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || j()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().b0(accessibilityEvent);
        }
    }

    @Override // n0.a
    public void d(View view, o0.b bVar) {
        this.f13090a.onInitializeAccessibilityNodeInfo(view, bVar.f13479a);
        if (j() || this.d.getLayoutManager() == null) {
            return;
        }
        RecyclerView.l layoutManager = this.d.getLayoutManager();
        RecyclerView recyclerView = layoutManager.f2822b;
        layoutManager.c0(recyclerView.f2775f, recyclerView.f2798x0, bVar);
    }

    @Override // n0.a
    public boolean g(View view, int i10, Bundle bundle) {
        if (super.g(view, i10, bundle)) {
            return true;
        }
        if (j() || this.d.getLayoutManager() == null) {
            return false;
        }
        RecyclerView.l layoutManager = this.d.getLayoutManager();
        RecyclerView recyclerView = layoutManager.f2822b;
        return layoutManager.p0(recyclerView.f2775f, recyclerView.f2798x0, i10, bundle);
    }

    public boolean j() {
        return this.d.N();
    }
}
