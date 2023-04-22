package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;

/* loaded from: classes.dex */
public class a extends DependencyNode {

    /* renamed from: m  reason: collision with root package name */
    public int f1304m;

    public a(WidgetRun widgetRun) {
        super(widgetRun);
        if (widgetRun instanceof c) {
            this.f1277e = DependencyNode.Type.HORIZONTAL_DIMENSION;
        } else {
            this.f1277e = DependencyNode.Type.VERTICAL_DIMENSION;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.DependencyNode
    public void c(int i10) {
        if (this.f1282j) {
            return;
        }
        this.f1282j = true;
        this.f1279g = i10;
        for (t.d dVar : this.f1283k) {
            dVar.a(dVar);
        }
    }
}
