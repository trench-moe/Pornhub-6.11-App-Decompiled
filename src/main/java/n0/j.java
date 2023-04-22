package n0;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* loaded from: classes2.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    public ViewParent f13145a;

    /* renamed from: b  reason: collision with root package name */
    public ViewParent f13146b;

    /* renamed from: c  reason: collision with root package name */
    public final View f13147c;
    public boolean d;

    /* renamed from: e  reason: collision with root package name */
    public int[] f13148e;

    public j(View view) {
        this.f13147c = view;
    }

    public boolean a(float f10, float f11, boolean z10) {
        ViewParent h10;
        if (this.d && (h10 = h(0)) != null) {
            try {
                return h10.onNestedFling(this.f13147c, f10, f11, z10);
            } catch (AbstractMethodError e10) {
                Log.e("ViewParentCompat", "ViewParent " + h10 + " does not implement interface method onNestedFling", e10);
            }
        }
        return false;
    }

    public boolean b(float f10, float f11) {
        ViewParent h10;
        if (this.d && (h10 = h(0)) != null) {
            try {
                return h10.onNestedPreFling(this.f13147c, f10, f11);
            } catch (AbstractMethodError e10) {
                Log.e("ViewParentCompat", "ViewParent " + h10 + " does not implement interface method onNestedPreFling", e10);
            }
        }
        return false;
    }

    public boolean c(int i10, int i11, int[] iArr, int[] iArr2) {
        return d(i10, i11, iArr, iArr2, 0);
    }

    public boolean d(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        int i13;
        int i14;
        int[] iArr3;
        if (this.d) {
            ViewParent h10 = h(i12);
            if (h10 == null) {
                return false;
            }
            if (i10 != 0 || i11 != 0) {
                if (iArr2 != null) {
                    this.f13147c.getLocationInWindow(iArr2);
                    i13 = iArr2[0];
                    i14 = iArr2[1];
                } else {
                    i13 = 0;
                    i14 = 0;
                }
                if (iArr == null) {
                    if (this.f13148e == null) {
                        this.f13148e = new int[2];
                    }
                    iArr3 = this.f13148e;
                } else {
                    iArr3 = iArr;
                }
                iArr3[0] = 0;
                iArr3[1] = 0;
                View view = this.f13147c;
                if (h10 instanceof k) {
                    ((k) h10).o(view, i10, i11, iArr3, i12);
                } else if (i12 == 0) {
                    try {
                        h10.onNestedPreScroll(view, i10, i11, iArr3);
                    } catch (AbstractMethodError e10) {
                        Log.e("ViewParentCompat", "ViewParent " + h10 + " does not implement interface method onNestedPreScroll", e10);
                    }
                }
                if (iArr2 != null) {
                    this.f13147c.getLocationInWindow(iArr2);
                    iArr2[0] = iArr2[0] - i13;
                    iArr2[1] = iArr2[1] - i14;
                }
                if (iArr3[0] != 0 || iArr3[1] != 0) {
                    return true;
                }
            } else if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
        }
        return false;
    }

    public void e(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        g(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    public boolean f(int i10, int i11, int i12, int i13, int[] iArr) {
        return g(i10, i11, i12, i13, iArr, 0, null);
    }

    public final boolean g(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        ViewParent h10;
        int i15;
        int i16;
        int[] iArr3;
        if (!this.d || (h10 = h(i14)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f13147c.getLocationInWindow(iArr);
            i15 = iArr[0];
            i16 = iArr[1];
        } else {
            i15 = 0;
            i16 = 0;
        }
        if (iArr2 == null) {
            if (this.f13148e == null) {
                this.f13148e = new int[2];
            }
            int[] iArr4 = this.f13148e;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        View view = this.f13147c;
        if (h10 instanceof l) {
            ((l) h10).j(view, i10, i11, i12, i13, i14, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i12;
            iArr3[1] = iArr3[1] + i13;
            if (h10 instanceof k) {
                ((k) h10).k(view, i10, i11, i12, i13, i14);
            } else if (i14 == 0) {
                try {
                    h10.onNestedScroll(view, i10, i11, i12, i13);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewParentCompat", "ViewParent " + h10 + " does not implement interface method onNestedScroll", e10);
                }
            }
        }
        if (iArr != null) {
            this.f13147c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i15;
            iArr[1] = iArr[1] - i16;
        }
        return true;
    }

    public final ViewParent h(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                return null;
            }
            return this.f13146b;
        }
        return this.f13145a;
    }

    public boolean i() {
        return j(0);
    }

    public boolean j(int i10) {
        return h(i10) != null;
    }

    public boolean k(int i10, int i11) {
        boolean onStartNestedScroll;
        if (h(i11) != null) {
            return true;
        }
        if (this.d) {
            View view = this.f13147c;
            for (ViewParent parent = this.f13147c.getParent(); parent != null; parent = parent.getParent()) {
                View view2 = this.f13147c;
                boolean z10 = parent instanceof k;
                if (z10) {
                    onStartNestedScroll = ((k) parent).l(view, view2, i10, i11);
                } else {
                    if (i11 == 0) {
                        try {
                            onStartNestedScroll = parent.onStartNestedScroll(view, view2, i10);
                        } catch (AbstractMethodError e10) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e10);
                        }
                    }
                    onStartNestedScroll = false;
                }
                if (onStartNestedScroll) {
                    if (i11 == 0) {
                        this.f13145a = parent;
                    } else if (i11 == 1) {
                        this.f13146b = parent;
                    }
                    View view3 = this.f13147c;
                    if (z10) {
                        ((k) parent).m(view, view3, i10, i11);
                    } else if (i11 == 0) {
                        try {
                            parent.onNestedScrollAccepted(view, view3, i10);
                        } catch (AbstractMethodError e11) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e11);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view = parent;
                }
            }
        }
        return false;
    }

    public void l(int i10) {
        ViewParent h10 = h(i10);
        if (h10 != null) {
            View view = this.f13147c;
            if (h10 instanceof k) {
                ((k) h10).n(view, i10);
            } else if (i10 == 0) {
                try {
                    h10.onStopNestedScroll(view);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewParentCompat", "ViewParent " + h10 + " does not implement interface method onStopNestedScroll", e10);
                }
            }
            if (i10 == 0) {
                this.f13145a = null;
            } else if (i10 != 1) {
            } else {
                this.f13146b = null;
            }
        }
    }
}
