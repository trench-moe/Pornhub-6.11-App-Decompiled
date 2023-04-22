package androidx.constraintlayout.core.widgets.analyzer;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class DependencyNode implements t.d {
    public WidgetRun d;

    /* renamed from: f  reason: collision with root package name */
    public int f1278f;

    /* renamed from: g  reason: collision with root package name */
    public int f1279g;

    /* renamed from: a  reason: collision with root package name */
    public t.d f1274a = null;

    /* renamed from: b  reason: collision with root package name */
    public boolean f1275b = false;

    /* renamed from: c  reason: collision with root package name */
    public boolean f1276c = false;

    /* renamed from: e  reason: collision with root package name */
    public Type f1277e = Type.UNKNOWN;

    /* renamed from: h  reason: collision with root package name */
    public int f1280h = 1;

    /* renamed from: i  reason: collision with root package name */
    public a f1281i = null;

    /* renamed from: j  reason: collision with root package name */
    public boolean f1282j = false;

    /* renamed from: k  reason: collision with root package name */
    public List<t.d> f1283k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    public List<DependencyNode> f1284l = new ArrayList();

    /* loaded from: classes.dex */
    public enum Type {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public DependencyNode(WidgetRun widgetRun) {
        this.d = widgetRun;
    }

    @Override // t.d
    public void a(t.d dVar) {
        for (DependencyNode dependencyNode : this.f1284l) {
            if (!dependencyNode.f1282j) {
                return;
            }
        }
        this.f1276c = true;
        t.d dVar2 = this.f1274a;
        if (dVar2 != null) {
            dVar2.a(this);
        }
        if (this.f1275b) {
            this.d.a(this);
            return;
        }
        DependencyNode dependencyNode2 = null;
        int i10 = 0;
        for (DependencyNode dependencyNode3 : this.f1284l) {
            if (!(dependencyNode3 instanceof a)) {
                i10++;
                dependencyNode2 = dependencyNode3;
            }
        }
        if (dependencyNode2 != null && i10 == 1 && dependencyNode2.f1282j) {
            a aVar = this.f1281i;
            if (aVar != null) {
                if (!aVar.f1282j) {
                    return;
                }
                this.f1278f = this.f1280h * aVar.f1279g;
            }
            c(dependencyNode2.f1279g + this.f1278f);
        }
        t.d dVar3 = this.f1274a;
        if (dVar3 != null) {
            dVar3.a(this);
        }
    }

    public void b() {
        this.f1284l.clear();
        this.f1283k.clear();
        this.f1282j = false;
        this.f1279g = 0;
        this.f1276c = false;
        this.f1275b = false;
    }

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

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.d.f1293b.f1253q0);
        sb2.append(":");
        sb2.append(this.f1277e);
        sb2.append("(");
        sb2.append(this.f1282j ? Integer.valueOf(this.f1279g) : "unresolved");
        sb2.append(") <t=");
        sb2.append(this.f1284l.size());
        sb2.append(":d=");
        sb2.append(this.f1283k.size());
        sb2.append(">");
        return sb2.toString();
    }
}
