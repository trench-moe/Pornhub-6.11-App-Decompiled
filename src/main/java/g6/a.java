package g6;

import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import g6.j;
import kotlin.KotlinVersion;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public int f9819a = -1;

    /* renamed from: b  reason: collision with root package name */
    public int f9820b = 0;

    /* renamed from: c  reason: collision with root package name */
    public final ScaleGestureDetector f9821c;
    public VelocityTracker d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f9822e;

    /* renamed from: f  reason: collision with root package name */
    public float f9823f;

    /* renamed from: g  reason: collision with root package name */
    public float f9824g;

    /* renamed from: h  reason: collision with root package name */
    public final float f9825h;

    /* renamed from: i  reason: collision with root package name */
    public final float f9826i;

    /* renamed from: j  reason: collision with root package name */
    public b f9827j;

    /* renamed from: g6.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class ScaleGestureDetector$OnScaleGestureListenerC0140a implements ScaleGestureDetector.OnScaleGestureListener {
        public ScaleGestureDetector$OnScaleGestureListenerC0140a() {
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            if (!Float.isNaN(scaleFactor) && !Float.isInfinite(scaleFactor)) {
                if (scaleFactor >= 0.0f) {
                    ((j.a) a.this.f9827j).a(scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
                }
                return true;
            }
            return false;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        }
    }

    public a(Context context, b bVar) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f9826i = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f9825h = viewConfiguration.getScaledTouchSlop();
        this.f9827j = bVar;
        this.f9821c = new ScaleGestureDetector(context, new ScaleGestureDetector$OnScaleGestureListenerC0140a());
    }

    public final float a(MotionEvent motionEvent) {
        try {
            return motionEvent.getX(this.f9820b);
        } catch (Exception unused) {
            return motionEvent.getX();
        }
    }

    public final float b(MotionEvent motionEvent) {
        try {
            return motionEvent.getY(this.f9820b);
        } catch (Exception unused) {
            return motionEvent.getY();
        }
    }

    public boolean c() {
        return this.f9821c.isInProgress();
    }

    public final boolean d(MotionEvent motionEvent) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int action = motionEvent.getAction() & KotlinVersion.MAX_COMPONENT_VALUE;
        if (action == 0) {
            this.f9819a = motionEvent.getPointerId(0);
            VelocityTracker obtain = VelocityTracker.obtain();
            this.d = obtain;
            if (obtain != null) {
                obtain.addMovement(motionEvent);
            }
            this.f9823f = a(motionEvent);
            this.f9824g = b(motionEvent);
            this.f9822e = false;
        } else if (action == 1) {
            this.f9819a = -1;
            if (this.f9822e && this.d != null) {
                this.f9823f = a(motionEvent);
                this.f9824g = b(motionEvent);
                this.d.addMovement(motionEvent);
                this.d.computeCurrentVelocity(1000);
                float xVelocity = this.d.getXVelocity();
                float yVelocity = this.d.getYVelocity();
                if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.f9826i) {
                    j.a aVar = (j.a) this.f9827j;
                    j jVar = j.this;
                    jVar.O = new j.f(jVar.f9835w.getContext());
                    j jVar2 = j.this;
                    j.f fVar = jVar2.O;
                    int g10 = jVar2.g(jVar2.f9835w);
                    j jVar3 = j.this;
                    int f10 = jVar3.f(jVar3.f9835w);
                    int i15 = (int) (-xVelocity);
                    int i16 = (int) (-yVelocity);
                    RectF c10 = j.this.c();
                    if (c10 != null) {
                        int round = Math.round(-c10.left);
                        float f11 = g10;
                        if (f11 < c10.width()) {
                            i10 = Math.round(c10.width() - f11);
                            i11 = 0;
                        } else {
                            i10 = round;
                            i11 = i10;
                        }
                        int round2 = Math.round(-c10.top);
                        float f12 = f10;
                        if (f12 < c10.height()) {
                            i12 = Math.round(c10.height() - f12);
                            i13 = 0;
                        } else {
                            i12 = round2;
                            i13 = i12;
                        }
                        fVar.f9847f = round;
                        fVar.f9848j = round2;
                        if (round != i10 || round2 != i12) {
                            fVar.f9846c.fling(round, round2, i15, i16, i11, i10, i13, i12, 0, 0);
                        }
                    }
                    j jVar4 = j.this;
                    jVar4.f9835w.post(jVar4.O);
                }
            }
            VelocityTracker velocityTracker = this.d;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.d = null;
            }
        } else if (action == 2) {
            float a10 = a(motionEvent);
            float b10 = b(motionEvent);
            float f13 = a10 - this.f9823f;
            float f14 = b10 - this.f9824g;
            if (!this.f9822e) {
                this.f9822e = Math.sqrt((double) ((f14 * f14) + (f13 * f13))) >= ((double) this.f9825h);
            }
            if (this.f9822e) {
                j.a aVar2 = (j.a) this.f9827j;
                if (!j.this.f9836z.c()) {
                    h hVar = j.this.N;
                    if (hVar != null) {
                        hVar.a(f13, f14);
                    }
                    j.this.C.postTranslate(f13, f14);
                    j.this.a();
                    ViewParent parent = j.this.f9835w.getParent();
                    j jVar5 = j.this;
                    if (jVar5.f9833t && !jVar5.f9836z.c()) {
                        j jVar6 = j.this;
                        if (!jVar6.f9834u) {
                            int i17 = jVar6.P;
                            if ((i17 == 2 || ((i17 == 0 && f13 >= 1.0f) || ((i17 == 1 && f13 <= -1.0f) || (((i14 = jVar6.Q) == 0 && f14 >= 1.0f) || (i14 == 1 && f14 <= -1.0f))))) && parent != null) {
                                parent.requestDisallowInterceptTouchEvent(false);
                            }
                        }
                    }
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                }
                this.f9823f = a10;
                this.f9824g = b10;
                VelocityTracker velocityTracker2 = this.d;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
            }
        } else if (action == 3) {
            this.f9819a = -1;
            VelocityTracker velocityTracker3 = this.d;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.d = null;
            }
        } else if (action == 6) {
            int action2 = (motionEvent.getAction() & 65280) >> 8;
            if (motionEvent.getPointerId(action2) == this.f9819a) {
                int i18 = action2 == 0 ? 1 : 0;
                this.f9819a = motionEvent.getPointerId(i18);
                this.f9823f = motionEvent.getX(i18);
                this.f9824g = motionEvent.getY(i18);
            }
        }
        int i19 = this.f9819a;
        this.f9820b = motionEvent.findPointerIndex(i19 != -1 ? i19 : 0);
        return true;
    }
}
