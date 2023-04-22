package androidx.constraintlayout.motion.widget;

import android.view.View;
import androidx.constraintlayout.motion.widget.c;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public final MotionLayout f1524a;

    /* renamed from: c  reason: collision with root package name */
    public HashSet<View> f1526c;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<c.a> f1527e;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList<c> f1525b = new ArrayList<>();
    public String d = "ViewTransitionController";

    /* renamed from: f  reason: collision with root package name */
    public ArrayList<c.a> f1528f = new ArrayList<>();

    /* loaded from: classes.dex */
    public class a implements b.a {
        public a(d dVar, c cVar, int i10, boolean z10, int i11) {
        }
    }

    public d(MotionLayout motionLayout) {
        this.f1524a = motionLayout;
    }

    public final void a(c cVar, boolean z10) {
        ConstraintLayout.getSharedValues().a(cVar.f1511u, new a(this, cVar, cVar.f1511u, z10, cVar.f1510t));
    }
}
