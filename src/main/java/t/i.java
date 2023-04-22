package t;

import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class i {

    /* renamed from: c  reason: collision with root package name */
    public static int f15052c;

    /* renamed from: a  reason: collision with root package name */
    public WidgetRun f15053a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList<WidgetRun> f15054b = new ArrayList<>();

    public i(WidgetRun widgetRun, int i10) {
        this.f15053a = null;
        f15052c++;
        this.f15053a = widgetRun;
    }

    public final long a(DependencyNode dependencyNode, long j10) {
        WidgetRun widgetRun = dependencyNode.d;
        if (widgetRun instanceof androidx.constraintlayout.core.widgets.analyzer.b) {
            return j10;
        }
        int size = dependencyNode.f1283k.size();
        long j11 = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = dependencyNode.f1283k.get(i10);
            if (dVar instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) dVar;
                if (dependencyNode2.d != widgetRun) {
                    j11 = Math.min(j11, a(dependencyNode2, dependencyNode2.f1278f + j10));
                }
            }
        }
        if (dependencyNode == widgetRun.f1299i) {
            long j12 = j10 - widgetRun.j();
            return Math.min(Math.min(j11, a(widgetRun.f1298h, j12)), j12 - widgetRun.f1298h.f1278f);
        }
        return j11;
    }

    public final long b(DependencyNode dependencyNode, long j10) {
        WidgetRun widgetRun = dependencyNode.d;
        if (widgetRun instanceof androidx.constraintlayout.core.widgets.analyzer.b) {
            return j10;
        }
        int size = dependencyNode.f1283k.size();
        long j11 = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = dependencyNode.f1283k.get(i10);
            if (dVar instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) dVar;
                if (dependencyNode2.d != widgetRun) {
                    j11 = Math.max(j11, b(dependencyNode2, dependencyNode2.f1278f + j10));
                }
            }
        }
        if (dependencyNode == widgetRun.f1298h) {
            long j12 = j10 + widgetRun.j();
            j11 = Math.max(Math.max(j11, b(widgetRun.f1299i, j12)), j12 - widgetRun.f1299i.f1278f);
        }
        return j11;
    }
}
